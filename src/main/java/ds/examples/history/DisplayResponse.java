// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: history.proto

package ds.examples.history;

/**
 * Protobuf type {@code history.DisplayResponse}
 */
public  final class DisplayResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:history.DisplayResponse)
    DisplayResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DisplayResponse.newBuilder() to construct.
  private DisplayResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DisplayResponse() {
    transactionId_ = 0;
    transactionAmount_ = 0F;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DisplayResponse(
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
          case 8: {

            transactionId_ = input.readInt32();
            break;
          }
          case 21: {

            transactionAmount_ = input.readFloat();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
    return ds.examples.history.TransferServiceImpl.internal_static_history_DisplayResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.examples.history.TransferServiceImpl.internal_static_history_DisplayResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.examples.history.DisplayResponse.class, ds.examples.history.DisplayResponse.Builder.class);
  }

  public static final int TRANSACTIONID_FIELD_NUMBER = 1;
  private int transactionId_;
  /**
   * <code>int32 transactionId = 1;</code>
   */
  public int getTransactionId() {
    return transactionId_;
  }

  public static final int TRANSACTIONAMOUNT_FIELD_NUMBER = 2;
  private float transactionAmount_;
  /**
   * <code>float transactionAmount = 2;</code>
   */
  public float getTransactionAmount() {
    return transactionAmount_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (transactionId_ != 0) {
      output.writeInt32(1, transactionId_);
    }
    if (transactionAmount_ != 0F) {
      output.writeFloat(2, transactionAmount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (transactionId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, transactionId_);
    }
    if (transactionAmount_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, transactionAmount_);
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
    if (!(obj instanceof ds.examples.history.DisplayResponse)) {
      return super.equals(obj);
    }
    ds.examples.history.DisplayResponse other = (ds.examples.history.DisplayResponse) obj;

    boolean result = true;
    result = result && (getTransactionId()
        == other.getTransactionId());
    result = result && (
        java.lang.Float.floatToIntBits(getTransactionAmount())
        == java.lang.Float.floatToIntBits(
            other.getTransactionAmount()));
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
    hash = (37 * hash) + TRANSACTIONID_FIELD_NUMBER;
    hash = (53 * hash) + getTransactionId();
    hash = (37 * hash) + TRANSACTIONAMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getTransactionAmount());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.examples.history.DisplayResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.examples.history.DisplayResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.examples.history.DisplayResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.examples.history.DisplayResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.examples.history.DisplayResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.examples.history.DisplayResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.examples.history.DisplayResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.examples.history.DisplayResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.examples.history.DisplayResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.examples.history.DisplayResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.examples.history.DisplayResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.examples.history.DisplayResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ds.examples.history.DisplayResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code history.DisplayResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:history.DisplayResponse)
      ds.examples.history.DisplayResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.examples.history.TransferServiceImpl.internal_static_history_DisplayResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.examples.history.TransferServiceImpl.internal_static_history_DisplayResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.examples.history.DisplayResponse.class, ds.examples.history.DisplayResponse.Builder.class);
    }

    // Construct using ds.examples.history.DisplayResponse.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      transactionId_ = 0;

      transactionAmount_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.examples.history.TransferServiceImpl.internal_static_history_DisplayResponse_descriptor;
    }

    @java.lang.Override
    public ds.examples.history.DisplayResponse getDefaultInstanceForType() {
      return ds.examples.history.DisplayResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ds.examples.history.DisplayResponse build() {
      ds.examples.history.DisplayResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.examples.history.DisplayResponse buildPartial() {
      ds.examples.history.DisplayResponse result = new ds.examples.history.DisplayResponse(this);
      result.transactionId_ = transactionId_;
      result.transactionAmount_ = transactionAmount_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ds.examples.history.DisplayResponse) {
        return mergeFrom((ds.examples.history.DisplayResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.examples.history.DisplayResponse other) {
      if (other == ds.examples.history.DisplayResponse.getDefaultInstance()) return this;
      if (other.getTransactionId() != 0) {
        setTransactionId(other.getTransactionId());
      }
      if (other.getTransactionAmount() != 0F) {
        setTransactionAmount(other.getTransactionAmount());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ds.examples.history.DisplayResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.examples.history.DisplayResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int transactionId_ ;
    /**
     * <code>int32 transactionId = 1;</code>
     */
    public int getTransactionId() {
      return transactionId_;
    }
    /**
     * <code>int32 transactionId = 1;</code>
     */
    public Builder setTransactionId(int value) {
      
      transactionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 transactionId = 1;</code>
     */
    public Builder clearTransactionId() {
      
      transactionId_ = 0;
      onChanged();
      return this;
    }

    private float transactionAmount_ ;
    /**
     * <code>float transactionAmount = 2;</code>
     */
    public float getTransactionAmount() {
      return transactionAmount_;
    }
    /**
     * <code>float transactionAmount = 2;</code>
     */
    public Builder setTransactionAmount(float value) {
      
      transactionAmount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float transactionAmount = 2;</code>
     */
    public Builder clearTransactionAmount() {
      
      transactionAmount_ = 0F;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:history.DisplayResponse)
  }

  // @@protoc_insertion_point(class_scope:history.DisplayResponse)
  private static final ds.examples.history.DisplayResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.examples.history.DisplayResponse();
  }

  public static ds.examples.history.DisplayResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DisplayResponse>
      PARSER = new com.google.protobuf.AbstractParser<DisplayResponse>() {
    @java.lang.Override
    public DisplayResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DisplayResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DisplayResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DisplayResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.examples.history.DisplayResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

