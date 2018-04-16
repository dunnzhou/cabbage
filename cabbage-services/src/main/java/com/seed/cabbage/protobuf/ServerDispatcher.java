// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServerDispatch.proto

package com.seed.cabbage.protobuf;

public final class ServerDispatcher {
  private ServerDispatcher() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DispatcherOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Dispatcher)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 sequeceId = 1;</code>
     */
    long getSequeceId();

    /**
     * <code>string dispatcher = 2;</code>
     */
    java.lang.String getDispatcher();
    /**
     * <code>string dispatcher = 2;</code>
     */
    com.google.protobuf.ByteString
        getDispatcherBytes();

    /**
     * <code>bytes messageBody = 3;</code>
     */
    com.google.protobuf.ByteString getMessageBody();
  }
  /**
   * Protobuf type {@code Dispatcher}
   */
  public  static final class Dispatcher extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Dispatcher)
      DispatcherOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Dispatcher.newBuilder() to construct.
    private Dispatcher(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Dispatcher() {
      sequeceId_ = 0L;
      dispatcher_ = "";
      messageBody_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Dispatcher(
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

              dispatcher_ = s;
              break;
            }
            case 26: {

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
      return com.seed.cabbage.protobuf.ServerDispatcher.internal_static_Dispatcher_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.seed.cabbage.protobuf.ServerDispatcher.internal_static_Dispatcher_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher.class, com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher.Builder.class);
    }

    public static final int SEQUECEID_FIELD_NUMBER = 1;
    private long sequeceId_;
    /**
     * <code>int64 sequeceId = 1;</code>
     */
    public long getSequeceId() {
      return sequeceId_;
    }

    public static final int DISPATCHER_FIELD_NUMBER = 2;
    private volatile java.lang.Object dispatcher_;
    /**
     * <code>string dispatcher = 2;</code>
     */
    public java.lang.String getDispatcher() {
      java.lang.Object ref = dispatcher_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dispatcher_ = s;
        return s;
      }
    }
    /**
     * <code>string dispatcher = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDispatcherBytes() {
      java.lang.Object ref = dispatcher_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dispatcher_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MESSAGEBODY_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString messageBody_;
    /**
     * <code>bytes messageBody = 3;</code>
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
      if (!getDispatcherBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dispatcher_);
      }
      if (!messageBody_.isEmpty()) {
        output.writeBytes(3, messageBody_);
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
      if (!getDispatcherBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dispatcher_);
      }
      if (!messageBody_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, messageBody_);
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
      if (!(obj instanceof com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher)) {
        return super.equals(obj);
      }
      com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher other = (com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher) obj;

      boolean result = true;
      result = result && (getSequeceId()
          == other.getSequeceId());
      result = result && getDispatcher()
          .equals(other.getDispatcher());
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
      hash = (37 * hash) + DISPATCHER_FIELD_NUMBER;
      hash = (53 * hash) + getDispatcher().hashCode();
      hash = (37 * hash) + MESSAGEBODY_FIELD_NUMBER;
      hash = (53 * hash) + getMessageBody().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher parseFrom(
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
    public static Builder newBuilder(com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher prototype) {
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
     * Protobuf type {@code Dispatcher}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Dispatcher)
        com.seed.cabbage.protobuf.ServerDispatcher.DispatcherOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.seed.cabbage.protobuf.ServerDispatcher.internal_static_Dispatcher_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.seed.cabbage.protobuf.ServerDispatcher.internal_static_Dispatcher_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher.class, com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher.Builder.class);
      }

      // Construct using com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher.newBuilder()
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

        dispatcher_ = "";

        messageBody_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.seed.cabbage.protobuf.ServerDispatcher.internal_static_Dispatcher_descriptor;
      }

      public com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher getDefaultInstanceForType() {
        return com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher.getDefaultInstance();
      }

      public com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher build() {
        com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher buildPartial() {
        com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher result = new com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher(this);
        result.sequeceId_ = sequeceId_;
        result.dispatcher_ = dispatcher_;
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
        if (other instanceof com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher) {
          return mergeFrom((com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher other) {
        if (other == com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher.getDefaultInstance()) return this;
        if (other.getSequeceId() != 0L) {
          setSequeceId(other.getSequeceId());
        }
        if (!other.getDispatcher().isEmpty()) {
          dispatcher_ = other.dispatcher_;
          onChanged();
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
        com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher) e.getUnfinishedMessage();
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

      private java.lang.Object dispatcher_ = "";
      /**
       * <code>string dispatcher = 2;</code>
       */
      public java.lang.String getDispatcher() {
        java.lang.Object ref = dispatcher_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          dispatcher_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string dispatcher = 2;</code>
       */
      public com.google.protobuf.ByteString
          getDispatcherBytes() {
        java.lang.Object ref = dispatcher_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          dispatcher_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string dispatcher = 2;</code>
       */
      public Builder setDispatcher(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        dispatcher_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string dispatcher = 2;</code>
       */
      public Builder clearDispatcher() {
        
        dispatcher_ = getDefaultInstance().getDispatcher();
        onChanged();
        return this;
      }
      /**
       * <code>string dispatcher = 2;</code>
       */
      public Builder setDispatcherBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        dispatcher_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString messageBody_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes messageBody = 3;</code>
       */
      public com.google.protobuf.ByteString getMessageBody() {
        return messageBody_;
      }
      /**
       * <code>bytes messageBody = 3;</code>
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
       * <code>bytes messageBody = 3;</code>
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


      // @@protoc_insertion_point(builder_scope:Dispatcher)
    }

    // @@protoc_insertion_point(class_scope:Dispatcher)
    private static final com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher();
    }

    public static com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Dispatcher>
        PARSER = new com.google.protobuf.AbstractParser<Dispatcher>() {
      public Dispatcher parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Dispatcher(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Dispatcher> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Dispatcher> getParserForType() {
      return PARSER;
    }

    public com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Dispatcher_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Dispatcher_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024ServerDispatch.proto\032\021RpcResponse.prot" +
      "o\"H\n\nDispatcher\022\021\n\tsequeceId\030\001 \001(\003\022\022\n\ndi" +
      "spatcher\030\002 \001(\t\022\023\n\013messageBody\030\003 \001(\014B-\n\031c" +
      "om.seed.cabbage.protobufB\020ServerDispatch" +
      "erb\006proto3"
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
          com.seed.cabbage.protobuf.RpcResponse.getDescriptor(),
        }, assigner);
    internal_static_Dispatcher_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Dispatcher_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Dispatcher_descriptor,
        new java.lang.String[] { "SequeceId", "Dispatcher", "MessageBody", });
    com.seed.cabbage.protobuf.RpcResponse.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}