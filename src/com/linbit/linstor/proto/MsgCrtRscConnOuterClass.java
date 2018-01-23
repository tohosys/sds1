// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/MsgCrtRscConn.proto

package com.linbit.linstor.proto;

public final class MsgCrtRscConnOuterClass {
  private MsgCrtRscConnOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgCrtRscConnOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.linbit.linstor.proto.MsgCrtRscConn)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .com.linbit.linstor.proto.RscConn rsc_conn = 1;</code>
     */
    boolean hasRscConn();
    /**
     * <code>required .com.linbit.linstor.proto.RscConn rsc_conn = 1;</code>
     */
    com.linbit.linstor.proto.RscConnOuterClass.RscConn getRscConn();
    /**
     * <code>required .com.linbit.linstor.proto.RscConn rsc_conn = 1;</code>
     */
    com.linbit.linstor.proto.RscConnOuterClass.RscConnOrBuilder getRscConnOrBuilder();
  }
  /**
   * <pre>
   * linstor - Create resource connection
   * </pre>
   *
   * Protobuf type {@code com.linbit.linstor.proto.MsgCrtRscConn}
   */
  public  static final class MsgCrtRscConn extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.linbit.linstor.proto.MsgCrtRscConn)
      MsgCrtRscConnOrBuilder {
    // Use MsgCrtRscConn.newBuilder() to construct.
    private MsgCrtRscConn(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgCrtRscConn() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgCrtRscConn(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.linbit.linstor.proto.RscConnOuterClass.RscConn.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = rscConn_.toBuilder();
              }
              rscConn_ = input.readMessage(com.linbit.linstor.proto.RscConnOuterClass.RscConn.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(rscConn_);
                rscConn_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.linbit.linstor.proto.MsgCrtRscConnOuterClass.internal_static_com_linbit_linstor_proto_MsgCrtRscConn_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.linbit.linstor.proto.MsgCrtRscConnOuterClass.internal_static_com_linbit_linstor_proto_MsgCrtRscConn_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn.class, com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn.Builder.class);
    }

    private int bitField0_;
    public static final int RSC_CONN_FIELD_NUMBER = 1;
    private com.linbit.linstor.proto.RscConnOuterClass.RscConn rscConn_;
    /**
     * <code>required .com.linbit.linstor.proto.RscConn rsc_conn = 1;</code>
     */
    public boolean hasRscConn() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .com.linbit.linstor.proto.RscConn rsc_conn = 1;</code>
     */
    public com.linbit.linstor.proto.RscConnOuterClass.RscConn getRscConn() {
      return rscConn_ == null ? com.linbit.linstor.proto.RscConnOuterClass.RscConn.getDefaultInstance() : rscConn_;
    }
    /**
     * <code>required .com.linbit.linstor.proto.RscConn rsc_conn = 1;</code>
     */
    public com.linbit.linstor.proto.RscConnOuterClass.RscConnOrBuilder getRscConnOrBuilder() {
      return rscConn_ == null ? com.linbit.linstor.proto.RscConnOuterClass.RscConn.getDefaultInstance() : rscConn_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasRscConn()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getRscConn().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getRscConn());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getRscConn());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn)) {
        return super.equals(obj);
      }
      com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn other = (com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn) obj;

      boolean result = true;
      result = result && (hasRscConn() == other.hasRscConn());
      if (hasRscConn()) {
        result = result && getRscConn()
            .equals(other.getRscConn());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasRscConn()) {
        hash = (37 * hash) + RSC_CONN_FIELD_NUMBER;
        hash = (53 * hash) + getRscConn().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * linstor - Create resource connection
     * </pre>
     *
     * Protobuf type {@code com.linbit.linstor.proto.MsgCrtRscConn}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.linbit.linstor.proto.MsgCrtRscConn)
        com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConnOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.linbit.linstor.proto.MsgCrtRscConnOuterClass.internal_static_com_linbit_linstor_proto_MsgCrtRscConn_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.linbit.linstor.proto.MsgCrtRscConnOuterClass.internal_static_com_linbit_linstor_proto_MsgCrtRscConn_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn.class, com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn.Builder.class);
      }

      // Construct using com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getRscConnFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        if (rscConnBuilder_ == null) {
          rscConn_ = null;
        } else {
          rscConnBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.linbit.linstor.proto.MsgCrtRscConnOuterClass.internal_static_com_linbit_linstor_proto_MsgCrtRscConn_descriptor;
      }

      public com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn getDefaultInstanceForType() {
        return com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn.getDefaultInstance();
      }

      public com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn build() {
        com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn buildPartial() {
        com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn result = new com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (rscConnBuilder_ == null) {
          result.rscConn_ = rscConn_;
        } else {
          result.rscConn_ = rscConnBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn) {
          return mergeFrom((com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn other) {
        if (other == com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn.getDefaultInstance()) return this;
        if (other.hasRscConn()) {
          mergeRscConn(other.getRscConn());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasRscConn()) {
          return false;
        }
        if (!getRscConn().isInitialized()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.linbit.linstor.proto.RscConnOuterClass.RscConn rscConn_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.linbit.linstor.proto.RscConnOuterClass.RscConn, com.linbit.linstor.proto.RscConnOuterClass.RscConn.Builder, com.linbit.linstor.proto.RscConnOuterClass.RscConnOrBuilder> rscConnBuilder_;
      /**
       * <code>required .com.linbit.linstor.proto.RscConn rsc_conn = 1;</code>
       */
      public boolean hasRscConn() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .com.linbit.linstor.proto.RscConn rsc_conn = 1;</code>
       */
      public com.linbit.linstor.proto.RscConnOuterClass.RscConn getRscConn() {
        if (rscConnBuilder_ == null) {
          return rscConn_ == null ? com.linbit.linstor.proto.RscConnOuterClass.RscConn.getDefaultInstance() : rscConn_;
        } else {
          return rscConnBuilder_.getMessage();
        }
      }
      /**
       * <code>required .com.linbit.linstor.proto.RscConn rsc_conn = 1;</code>
       */
      public Builder setRscConn(com.linbit.linstor.proto.RscConnOuterClass.RscConn value) {
        if (rscConnBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          rscConn_ = value;
          onChanged();
        } else {
          rscConnBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .com.linbit.linstor.proto.RscConn rsc_conn = 1;</code>
       */
      public Builder setRscConn(
          com.linbit.linstor.proto.RscConnOuterClass.RscConn.Builder builderForValue) {
        if (rscConnBuilder_ == null) {
          rscConn_ = builderForValue.build();
          onChanged();
        } else {
          rscConnBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .com.linbit.linstor.proto.RscConn rsc_conn = 1;</code>
       */
      public Builder mergeRscConn(com.linbit.linstor.proto.RscConnOuterClass.RscConn value) {
        if (rscConnBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              rscConn_ != null &&
              rscConn_ != com.linbit.linstor.proto.RscConnOuterClass.RscConn.getDefaultInstance()) {
            rscConn_ =
              com.linbit.linstor.proto.RscConnOuterClass.RscConn.newBuilder(rscConn_).mergeFrom(value).buildPartial();
          } else {
            rscConn_ = value;
          }
          onChanged();
        } else {
          rscConnBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .com.linbit.linstor.proto.RscConn rsc_conn = 1;</code>
       */
      public Builder clearRscConn() {
        if (rscConnBuilder_ == null) {
          rscConn_ = null;
          onChanged();
        } else {
          rscConnBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .com.linbit.linstor.proto.RscConn rsc_conn = 1;</code>
       */
      public com.linbit.linstor.proto.RscConnOuterClass.RscConn.Builder getRscConnBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getRscConnFieldBuilder().getBuilder();
      }
      /**
       * <code>required .com.linbit.linstor.proto.RscConn rsc_conn = 1;</code>
       */
      public com.linbit.linstor.proto.RscConnOuterClass.RscConnOrBuilder getRscConnOrBuilder() {
        if (rscConnBuilder_ != null) {
          return rscConnBuilder_.getMessageOrBuilder();
        } else {
          return rscConn_ == null ?
              com.linbit.linstor.proto.RscConnOuterClass.RscConn.getDefaultInstance() : rscConn_;
        }
      }
      /**
       * <code>required .com.linbit.linstor.proto.RscConn rsc_conn = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.linbit.linstor.proto.RscConnOuterClass.RscConn, com.linbit.linstor.proto.RscConnOuterClass.RscConn.Builder, com.linbit.linstor.proto.RscConnOuterClass.RscConnOrBuilder> 
          getRscConnFieldBuilder() {
        if (rscConnBuilder_ == null) {
          rscConnBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.linbit.linstor.proto.RscConnOuterClass.RscConn, com.linbit.linstor.proto.RscConnOuterClass.RscConn.Builder, com.linbit.linstor.proto.RscConnOuterClass.RscConnOrBuilder>(
                  getRscConn(),
                  getParentForChildren(),
                  isClean());
          rscConn_ = null;
        }
        return rscConnBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.linbit.linstor.proto.MsgCrtRscConn)
    }

    // @@protoc_insertion_point(class_scope:com.linbit.linstor.proto.MsgCrtRscConn)
    private static final com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn();
    }

    public static com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<MsgCrtRscConn>
        PARSER = new com.google.protobuf.AbstractParser<MsgCrtRscConn>() {
      public MsgCrtRscConn parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new MsgCrtRscConn(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgCrtRscConn> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgCrtRscConn> getParserForType() {
      return PARSER;
    }

    public com.linbit.linstor.proto.MsgCrtRscConnOuterClass.MsgCrtRscConn getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_linbit_linstor_proto_MsgCrtRscConn_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_linbit_linstor_proto_MsgCrtRscConn_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031proto/MsgCrtRscConn.proto\022\030com.linbit." +
      "linstor.proto\032\023proto/RscConn.proto\"D\n\rMs" +
      "gCrtRscConn\0223\n\010rsc_conn\030\001 \002(\0132!.com.linb" +
      "it.linstor.proto.RscConnP\000"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.linbit.linstor.proto.RscConnOuterClass.getDescriptor(),
        }, assigner);
    internal_static_com_linbit_linstor_proto_MsgCrtRscConn_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_linbit_linstor_proto_MsgCrtRscConn_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_linbit_linstor_proto_MsgCrtRscConn_descriptor,
        new java.lang.String[] { "RscConn", });
    com.linbit.linstor.proto.RscConnOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
