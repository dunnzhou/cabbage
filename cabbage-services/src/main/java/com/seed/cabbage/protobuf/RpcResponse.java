// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RpcResponse.proto

package com.seed.cabbage.protobuf;

public final class RpcResponse {
  private RpcResponse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Response)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 sequeceId = 1;</code>
     */
    long getSequeceId();

    /**
     * <code>string service = 2;</code>
     */
    java.lang.String getService();
    /**
     * <code>string service = 2;</code>
     */
    com.google.protobuf.ByteString
        getServiceBytes();

    /**
     * <code>string method = 3;</code>
     */
    java.lang.String getMethod();
    /**
     * <code>string method = 3;</code>
     */
    com.google.protobuf.ByteString
        getMethodBytes();

    /**
     * <code>string version = 4;</code>
     */
    java.lang.String getVersion();
    /**
     * <code>string version = 4;</code>
     */
    com.google.protobuf.ByteString
        getVersionBytes();

    /**
     * <code>int64 traceId = 5;</code>
     */
    long getTraceId();

    /**
     * <code>string host = 6;</code>
     */
    java.lang.String getHost();
    /**
     * <code>string host = 6;</code>
     */
    com.google.protobuf.ByteString
        getHostBytes();

    /**
     * <code>int64 timstamp = 7;</code>
     */
    long getTimstamp();

    /**
     * <code>bytes messageBody = 8;</code>
     */
    com.google.protobuf.ByteString getMessageBody();
  }
  /**
   * Protobuf type {@code Response}
   */
  public  static final class Response extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Response)
      ResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Response.newBuilder() to construct.
    private Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Response() {
      sequeceId_ = 0L;
      service_ = "";
      method_ = "";
      version_ = "";
      traceId_ = 0L;
      host_ = "";
      timstamp_ = 0L;
      messageBody_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Response(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              sequeceId_ = input.readInt64();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              service_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              method_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              version_ = s;
              break;
            }
            case 40: {

              traceId_ = input.readInt64();
              break;
            }
            case 50: {
              java.lang.String s = input.readStringRequireUtf8();

              host_ = s;
              break;
            }
            case 56: {

              timstamp_ = input.readInt64();
              break;
            }
            case 66: {

              messageBody_ = input.readBytes();
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
      return com.seed.cabbage.protobuf.RpcResponse.internal_static_Response_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.seed.cabbage.protobuf.RpcResponse.internal_static_Response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.seed.cabbage.protobuf.RpcResponse.Response.class, com.seed.cabbage.protobuf.RpcResponse.Response.Builder.class);
    }

    public static final int SEQUECEID_FIELD_NUMBER = 1;
    private long sequeceId_;
    /**
     * <code>int64 sequeceId = 1;</code>
     */
    public long getSequeceId() {
      return sequeceId_;
    }

    public static final int SERVICE_FIELD_NUMBER = 2;
    private volatile java.lang.Object service_;
    /**
     * <code>string service = 2;</code>
     */
    public java.lang.String getService() {
      java.lang.Object ref = service_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        service_ = s;
        return s;
      }
    }
    /**
     * <code>string service = 2;</code>
     */
    public com.google.protobuf.ByteString
        getServiceBytes() {
      java.lang.Object ref = service_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        service_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int METHOD_FIELD_NUMBER = 3;
    private volatile java.lang.Object method_;
    /**
     * <code>string method = 3;</code>
     */
    public java.lang.String getMethod() {
      java.lang.Object ref = method_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        method_ = s;
        return s;
      }
    }
    /**
     * <code>string method = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMethodBytes() {
      java.lang.Object ref = method_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        method_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VERSION_FIELD_NUMBER = 4;
    private volatile java.lang.Object version_;
    /**
     * <code>string version = 4;</code>
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      }
    }
    /**
     * <code>string version = 4;</code>
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TRACEID_FIELD_NUMBER = 5;
    private long traceId_;
    /**
     * <code>int64 traceId = 5;</code>
     */
    public long getTraceId() {
      return traceId_;
    }

    public static final int HOST_FIELD_NUMBER = 6;
    private volatile java.lang.Object host_;
    /**
     * <code>string host = 6;</code>
     */
    public java.lang.String getHost() {
      java.lang.Object ref = host_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        host_ = s;
        return s;
      }
    }
    /**
     * <code>string host = 6;</code>
     */
    public com.google.protobuf.ByteString
        getHostBytes() {
      java.lang.Object ref = host_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        host_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIMSTAMP_FIELD_NUMBER = 7;
    private long timstamp_;
    /**
     * <code>int64 timstamp = 7;</code>
     */
    public long getTimstamp() {
      return timstamp_;
    }

    public static final int MESSAGEBODY_FIELD_NUMBER = 8;
    private com.google.protobuf.ByteString messageBody_;
    /**
     * <code>bytes messageBody = 8;</code>
     */
    public com.google.protobuf.ByteString getMessageBody() {
      return messageBody_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (sequeceId_ != 0L) {
        output.writeInt64(1, sequeceId_);
      }
      if (!getServiceBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, service_);
      }
      if (!getMethodBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, method_);
      }
      if (!getVersionBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, version_);
      }
      if (traceId_ != 0L) {
        output.writeInt64(5, traceId_);
      }
      if (!getHostBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, host_);
      }
      if (timstamp_ != 0L) {
        output.writeInt64(7, timstamp_);
      }
      if (!messageBody_.isEmpty()) {
        output.writeBytes(8, messageBody_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sequeceId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, sequeceId_);
      }
      if (!getServiceBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, service_);
      }
      if (!getMethodBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, method_);
      }
      if (!getVersionBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, version_);
      }
      if (traceId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, traceId_);
      }
      if (!getHostBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, host_);
      }
      if (timstamp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(7, timstamp_);
      }
      if (!messageBody_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(8, messageBody_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.seed.cabbage.protobuf.RpcResponse.Response)) {
        return super.equals(obj);
      }
      com.seed.cabbage.protobuf.RpcResponse.Response other = (com.seed.cabbage.protobuf.RpcResponse.Response) obj;

      boolean result = true;
      result = result && (getSequeceId()
          == other.getSequeceId());
      result = result && getService()
          .equals(other.getService());
      result = result && getMethod()
          .equals(other.getMethod());
      result = result && getVersion()
          .equals(other.getVersion());
      result = result && (getTraceId()
          == other.getTraceId());
      result = result && getHost()
          .equals(other.getHost());
      result = result && (getTimstamp()
          == other.getTimstamp());
      result = result && getMessageBody()
          .equals(other.getMessageBody());
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
      hash = (37 * hash) + SEQUECEID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSequeceId());
      hash = (37 * hash) + SERVICE_FIELD_NUMBER;
      hash = (53 * hash) + getService().hashCode();
      hash = (37 * hash) + METHOD_FIELD_NUMBER;
      hash = (53 * hash) + getMethod().hashCode();
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion().hashCode();
      hash = (37 * hash) + TRACEID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTraceId());
      hash = (37 * hash) + HOST_FIELD_NUMBER;
      hash = (53 * hash) + getHost().hashCode();
      hash = (37 * hash) + TIMSTAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimstamp());
      hash = (37 * hash) + MESSAGEBODY_FIELD_NUMBER;
      hash = (53 * hash) + getMessageBody().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.seed.cabbage.protobuf.RpcResponse.Response parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.seed.cabbage.protobuf.RpcResponse.Response parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.seed.cabbage.protobuf.RpcResponse.Response parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.seed.cabbage.protobuf.RpcResponse.Response parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.seed.cabbage.protobuf.RpcResponse.Response parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.seed.cabbage.protobuf.RpcResponse.Response parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.seed.cabbage.protobuf.RpcResponse.Response parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.seed.cabbage.protobuf.RpcResponse.Response parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.seed.cabbage.protobuf.RpcResponse.Response parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.seed.cabbage.protobuf.RpcResponse.Response parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.seed.cabbage.protobuf.RpcResponse.Response parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.seed.cabbage.protobuf.RpcResponse.Response parseFrom(
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
    public static Builder newBuilder(com.seed.cabbage.protobuf.RpcResponse.Response prototype) {
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
     * Protobuf type {@code Response}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Response)
        com.seed.cabbage.protobuf.RpcResponse.ResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.seed.cabbage.protobuf.RpcResponse.internal_static_Response_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.seed.cabbage.protobuf.RpcResponse.internal_static_Response_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.seed.cabbage.protobuf.RpcResponse.Response.class, com.seed.cabbage.protobuf.RpcResponse.Response.Builder.class);
      }

      // Construct using com.seed.cabbage.protobuf.RpcResponse.Response.newBuilder()
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
        }
      }
      public Builder clear() {
        super.clear();
        sequeceId_ = 0L;

        service_ = "";

        method_ = "";

        version_ = "";

        traceId_ = 0L;

        host_ = "";

        timstamp_ = 0L;

        messageBody_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.seed.cabbage.protobuf.RpcResponse.internal_static_Response_descriptor;
      }

      public com.seed.cabbage.protobuf.RpcResponse.Response getDefaultInstanceForType() {
        return com.seed.cabbage.protobuf.RpcResponse.Response.getDefaultInstance();
      }

      public com.seed.cabbage.protobuf.RpcResponse.Response build() {
        com.seed.cabbage.protobuf.RpcResponse.Response result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.seed.cabbage.protobuf.RpcResponse.Response buildPartial() {
        com.seed.cabbage.protobuf.RpcResponse.Response result = new com.seed.cabbage.protobuf.RpcResponse.Response(this);
        result.sequeceId_ = sequeceId_;
        result.service_ = service_;
        result.method_ = method_;
        result.version_ = version_;
        result.traceId_ = traceId_;
        result.host_ = host_;
        result.timstamp_ = timstamp_;
        result.messageBody_ = messageBody_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
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
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.seed.cabbage.protobuf.RpcResponse.Response) {
          return mergeFrom((com.seed.cabbage.protobuf.RpcResponse.Response)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.seed.cabbage.protobuf.RpcResponse.Response other) {
        if (other == com.seed.cabbage.protobuf.RpcResponse.Response.getDefaultInstance()) return this;
        if (other.getSequeceId() != 0L) {
          setSequeceId(other.getSequeceId());
        }
        if (!other.getService().isEmpty()) {
          service_ = other.service_;
          onChanged();
        }
        if (!other.getMethod().isEmpty()) {
          method_ = other.method_;
          onChanged();
        }
        if (!other.getVersion().isEmpty()) {
          version_ = other.version_;
          onChanged();
        }
        if (other.getTraceId() != 0L) {
          setTraceId(other.getTraceId());
        }
        if (!other.getHost().isEmpty()) {
          host_ = other.host_;
          onChanged();
        }
        if (other.getTimstamp() != 0L) {
          setTimstamp(other.getTimstamp());
        }
        if (other.getMessageBody() != com.google.protobuf.ByteString.EMPTY) {
          setMessageBody(other.getMessageBody());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.seed.cabbage.protobuf.RpcResponse.Response parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.seed.cabbage.protobuf.RpcResponse.Response) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long sequeceId_ ;
      /**
       * <code>int64 sequeceId = 1;</code>
       */
      public long getSequeceId() {
        return sequeceId_;
      }
      /**
       * <code>int64 sequeceId = 1;</code>
       */
      public Builder setSequeceId(long value) {
        
        sequeceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 sequeceId = 1;</code>
       */
      public Builder clearSequeceId() {
        
        sequeceId_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object service_ = "";
      /**
       * <code>string service = 2;</code>
       */
      public java.lang.String getService() {
        java.lang.Object ref = service_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          service_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string service = 2;</code>
       */
      public com.google.protobuf.ByteString
          getServiceBytes() {
        java.lang.Object ref = service_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          service_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string service = 2;</code>
       */
      public Builder setService(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        service_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string service = 2;</code>
       */
      public Builder clearService() {
        
        service_ = getDefaultInstance().getService();
        onChanged();
        return this;
      }
      /**
       * <code>string service = 2;</code>
       */
      public Builder setServiceBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        service_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object method_ = "";
      /**
       * <code>string method = 3;</code>
       */
      public java.lang.String getMethod() {
        java.lang.Object ref = method_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          method_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string method = 3;</code>
       */
      public com.google.protobuf.ByteString
          getMethodBytes() {
        java.lang.Object ref = method_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          method_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string method = 3;</code>
       */
      public Builder setMethod(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        method_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string method = 3;</code>
       */
      public Builder clearMethod() {
        
        method_ = getDefaultInstance().getMethod();
        onChanged();
        return this;
      }
      /**
       * <code>string method = 3;</code>
       */
      public Builder setMethodBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        method_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object version_ = "";
      /**
       * <code>string version = 4;</code>
       */
      public java.lang.String getVersion() {
        java.lang.Object ref = version_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          version_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string version = 4;</code>
       */
      public com.google.protobuf.ByteString
          getVersionBytes() {
        java.lang.Object ref = version_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          version_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string version = 4;</code>
       */
      public Builder setVersion(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        version_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string version = 4;</code>
       */
      public Builder clearVersion() {
        
        version_ = getDefaultInstance().getVersion();
        onChanged();
        return this;
      }
      /**
       * <code>string version = 4;</code>
       */
      public Builder setVersionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        version_ = value;
        onChanged();
        return this;
      }

      private long traceId_ ;
      /**
       * <code>int64 traceId = 5;</code>
       */
      public long getTraceId() {
        return traceId_;
      }
      /**
       * <code>int64 traceId = 5;</code>
       */
      public Builder setTraceId(long value) {
        
        traceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 traceId = 5;</code>
       */
      public Builder clearTraceId() {
        
        traceId_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object host_ = "";
      /**
       * <code>string host = 6;</code>
       */
      public java.lang.String getHost() {
        java.lang.Object ref = host_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          host_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string host = 6;</code>
       */
      public com.google.protobuf.ByteString
          getHostBytes() {
        java.lang.Object ref = host_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          host_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string host = 6;</code>
       */
      public Builder setHost(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        host_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string host = 6;</code>
       */
      public Builder clearHost() {
        
        host_ = getDefaultInstance().getHost();
        onChanged();
        return this;
      }
      /**
       * <code>string host = 6;</code>
       */
      public Builder setHostBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        host_ = value;
        onChanged();
        return this;
      }

      private long timstamp_ ;
      /**
       * <code>int64 timstamp = 7;</code>
       */
      public long getTimstamp() {
        return timstamp_;
      }
      /**
       * <code>int64 timstamp = 7;</code>
       */
      public Builder setTimstamp(long value) {
        
        timstamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 timstamp = 7;</code>
       */
      public Builder clearTimstamp() {
        
        timstamp_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString messageBody_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes messageBody = 8;</code>
       */
      public com.google.protobuf.ByteString getMessageBody() {
        return messageBody_;
      }
      /**
       * <code>bytes messageBody = 8;</code>
       */
      public Builder setMessageBody(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        messageBody_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes messageBody = 8;</code>
       */
      public Builder clearMessageBody() {
        
        messageBody_ = getDefaultInstance().getMessageBody();
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Response)
    }

    // @@protoc_insertion_point(class_scope:Response)
    private static final com.seed.cabbage.protobuf.RpcResponse.Response DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.seed.cabbage.protobuf.RpcResponse.Response();
    }

    public static com.seed.cabbage.protobuf.RpcResponse.Response getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Response>
        PARSER = new com.google.protobuf.AbstractParser<Response>() {
      public Response parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Response(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Response> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Response> getParserForType() {
      return PARSER;
    }

    public com.seed.cabbage.protobuf.RpcResponse.Response getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Response_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021RpcResponse.proto\"\225\001\n\010Response\022\021\n\tsequ" +
      "eceId\030\001 \001(\003\022\017\n\007service\030\002 \001(\t\022\016\n\006method\030\003" +
      " \001(\t\022\017\n\007version\030\004 \001(\t\022\017\n\007traceId\030\005 \001(\003\022\014" +
      "\n\004host\030\006 \001(\t\022\020\n\010timstamp\030\007 \001(\003\022\023\n\013messag" +
      "eBody\030\010 \001(\014B(\n\031com.seed.cabbage.protobuf" +
      "B\013RpcResponseb\006proto3"
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
        }, assigner);
    internal_static_Response_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Response_descriptor,
        new java.lang.String[] { "SequeceId", "Service", "Method", "Version", "TraceId", "Host", "Timstamp", "MessageBody", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}