package com.linbit.linstor.core.apicallhandler.controller.autoplacer;

import com.linbit.ImplementationError;
import com.linbit.linstor.api.interfaces.AutoSelectFilterApi;
import com.linbit.linstor.core.objects.ResourceDefinition;
import com.linbit.linstor.core.objects.StorPool;
import com.linbit.linstor.logging.ErrorReporter;
import com.linbit.linstor.security.AccessDeniedException;

import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

@Singleton
public class Autoplacer
{
    private final StorPoolFilter filter;
    private final StrategyHandler strategyHandler;
    private final PreSelector preSelector;
    private final Selector selector;
    private final ErrorReporter errorReporter;

    @Inject
    public Autoplacer(
        StorPoolFilter filterRef,
        StrategyHandler strategyHandlerRef,
        PreSelector preSelectorRef,
        Selector selectorRef,
        ErrorReporter errorReporterRef
    )
    {
        filter = filterRef;
        strategyHandler = strategyHandlerRef;
        preSelector = preSelectorRef;
        selector = selectorRef;
        errorReporter = errorReporterRef;
    }

    public Optional<Set<StorPool>> autoPlace(
        AutoSelectFilterApi selectFilter,
        @Nullable ResourceDefinition rscDfnRef,
        long rscSize
    )
    {
        Set<StorPool> selection = null;
        try
        {
            long start = System.currentTimeMillis();
            ArrayList<StorPool> availableStorPools = filter.listAvailableStorPools();

            // 1: filter storage pools
            long startFilter = System.currentTimeMillis();
            ArrayList<StorPool> filteredStorPools = filter.filter(
                selectFilter,
                availableStorPools,
                rscDfnRef,
                rscSize
            );
            errorReporter.logTrace(
                "Autoplacer.Filter: Finished in %dms. %s StorPools remaining",
                System.currentTimeMillis() - startFilter,
                filteredStorPools.size()
            );

            // 2: rate each storage pool with different weighted strategies
            long startRating = System.currentTimeMillis();
            Collection<StorPoolWithScore> storPoolsWithScoreList = strategyHandler.rate(filteredStorPools);
            errorReporter.logTrace(
                "Autoplacer.Strategy: Finished in %dms.",
                System.currentTimeMillis() - startRating
            );

            // 3: allow the user to re-sort / filter storage pools as they see fit
            long startPreselect = System.currentTimeMillis();
            Collection<StorPoolWithScore> preselection = preSelector.preselect(
                rscDfnRef,
                storPoolsWithScoreList
            );
            errorReporter.logTrace(
                "Autoplacer.Preselector: Finished in %dms.",
                System.currentTimeMillis() - startPreselect
            );

            // 4: actual selection of storage pools
            long startSelection = System.currentTimeMillis();
            Set<StorPoolWithScore> selectionWithScores = selector.select(
                selectFilter,
                rscDfnRef,
                preselection
            );
            errorReporter.logTrace(
                "Autoplacer.Selection: Finished in %dms.",
                System.currentTimeMillis() - startSelection
            );

            boolean foundCandidate = selectionWithScores != null;
            if (foundCandidate)
            {
                selection = new TreeSet<>();
                for (StorPoolWithScore spWithScore : selectionWithScores)
                {
                    selection.add(spWithScore.storPool);
                }
            }
            errorReporter.logTrace(
                "Autoplacer: Finished in %dms %s candidate",
                System.currentTimeMillis() - start,
                foundCandidate ? "with" : "without"
            );
        }
        catch (AccessDeniedException exc)
        {
            throw new ImplementationError(exc);
        }
        return Optional.ofNullable(selection);
    }

    static class StorPoolWithScore implements Comparable<StorPoolWithScore>
    {
        StorPool storPool;
        double score;

        public StorPoolWithScore(StorPool storPoolRef, double scoreRef)
        {
            super();
            storPool = storPoolRef;
            score = scoreRef;
        }

        @Override
        public int compareTo(StorPoolWithScore sp2)
        {
            // highest to lowest
            int cmp = Double.compare(sp2.score, score);
            if (cmp == 0)
            {
                cmp = storPool.compareTo(sp2.storPool); // by name (nodename first)
            }
            return cmp;
        }

        @Override
        public int hashCode()
        {
            final int prime = 31;
            int result = 1;
            long temp;
            temp = Double.doubleToLongBits(score);
            result = prime * result + (int) (temp ^ (temp >>> 32));
            result = prime * result + ((storPool == null) ? 0 : storPool.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj)
        {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            StorPoolWithScore other = (StorPoolWithScore) obj;
            if (Double.doubleToLongBits(score) != Double.doubleToLongBits(other.score))
                return false;
            if (storPool == null)
            {
                if (other.storPool != null)
                    return false;
            }
            else
                if (!storPool.equals(other.storPool))
                    return false;
            return true;
        }

        @Override
        public String toString()
        {
            return "StorPoolWithScore [storPool=" + storPool + ", score=" + score + "]";
        }
    }
}

