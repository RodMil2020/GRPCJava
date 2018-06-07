// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/grpc/binarylog.proto

package io.grpc.binarylog;

/**
 * <pre>
 * A list of metadata pairs, used in the payload of CLIENT_INIT_METADATA,
 * SERVER_INIT_METADATA and TRAILING_METADATA
 * Implementations may omit some entries to honor the header limits
 * of GRPC_BINARY_LOG_CONFIG.
 * Implementations will not log the following entries, and this is
 * not to be treated as a truncation:
 * - entries handled by grpc that are not user visible, such as those
 *   that begin with 'grpc-' or keys like 'lb-token'
 * - transport specific entries, including but not limited to:
 *   ':path', ':authority', 'content-encoding', 'user-agent', 'te', etc
 * - entries added for call credentials
 * </pre>
 *
 * Protobuf type {@code grpc.binarylog.v1alpha.Metadata}
 */
public  final class Metadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.binarylog.v1alpha.Metadata)
    MetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Metadata.newBuilder() to construct.
  private Metadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Metadata() {
    entry_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Metadata(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              entry_ = new java.util.ArrayList<io.grpc.binarylog.MetadataEntry>();
              mutable_bitField0_ |= 0x00000001;
            }
            entry_.add(
                input.readMessage(io.grpc.binarylog.MetadataEntry.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        entry_ = java.util.Collections.unmodifiableList(entry_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.binarylog.BinaryLogProto.internal_static_grpc_binarylog_v1alpha_Metadata_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.binarylog.BinaryLogProto.internal_static_grpc_binarylog_v1alpha_Metadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.binarylog.Metadata.class, io.grpc.binarylog.Metadata.Builder.class);
  }

  public static final int ENTRY_FIELD_NUMBER = 1;
  private java.util.List<io.grpc.binarylog.MetadataEntry> entry_;
  /**
   * <code>repeated .grpc.binarylog.v1alpha.MetadataEntry entry = 1;</code>
   */
  public java.util.List<io.grpc.binarylog.MetadataEntry> getEntryList() {
    return entry_;
  }
  /**
   * <code>repeated .grpc.binarylog.v1alpha.MetadataEntry entry = 1;</code>
   */
  public java.util.List<? extends io.grpc.binarylog.MetadataEntryOrBuilder> 
      getEntryOrBuilderList() {
    return entry_;
  }
  /**
   * <code>repeated .grpc.binarylog.v1alpha.MetadataEntry entry = 1;</code>
   */
  public int getEntryCount() {
    return entry_.size();
  }
  /**
   * <code>repeated .grpc.binarylog.v1alpha.MetadataEntry entry = 1;</code>
   */
  public io.grpc.binarylog.MetadataEntry getEntry(int index) {
    return entry_.get(index);
  }
  /**
   * <code>repeated .grpc.binarylog.v1alpha.MetadataEntry entry = 1;</code>
   */
  public io.grpc.binarylog.MetadataEntryOrBuilder getEntryOrBuilder(
      int index) {
    return entry_.get(index);
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
    for (int i = 0; i < entry_.size(); i++) {
      output.writeMessage(1, entry_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < entry_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, entry_.get(i));
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
    if (!(obj instanceof io.grpc.binarylog.Metadata)) {
      return super.equals(obj);
    }
    io.grpc.binarylog.Metadata other = (io.grpc.binarylog.Metadata) obj;

    boolean result = true;
    result = result && getEntryList()
        .equals(other.getEntryList());
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
    if (getEntryCount() > 0) {
      hash = (37 * hash) + ENTRY_FIELD_NUMBER;
      hash = (53 * hash) + getEntryList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.binarylog.Metadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.binarylog.Metadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.binarylog.Metadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.binarylog.Metadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.binarylog.Metadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.binarylog.Metadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.binarylog.Metadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.binarylog.Metadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.binarylog.Metadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.binarylog.Metadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.binarylog.Metadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.binarylog.Metadata parseFrom(
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
  public static Builder newBuilder(io.grpc.binarylog.Metadata prototype) {
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
   * A list of metadata pairs, used in the payload of CLIENT_INIT_METADATA,
   * SERVER_INIT_METADATA and TRAILING_METADATA
   * Implementations may omit some entries to honor the header limits
   * of GRPC_BINARY_LOG_CONFIG.
   * Implementations will not log the following entries, and this is
   * not to be treated as a truncation:
   * - entries handled by grpc that are not user visible, such as those
   *   that begin with 'grpc-' or keys like 'lb-token'
   * - transport specific entries, including but not limited to:
   *   ':path', ':authority', 'content-encoding', 'user-agent', 'te', etc
   * - entries added for call credentials
   * </pre>
   *
   * Protobuf type {@code grpc.binarylog.v1alpha.Metadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.binarylog.v1alpha.Metadata)
      io.grpc.binarylog.MetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.binarylog.BinaryLogProto.internal_static_grpc_binarylog_v1alpha_Metadata_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.binarylog.BinaryLogProto.internal_static_grpc_binarylog_v1alpha_Metadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.binarylog.Metadata.class, io.grpc.binarylog.Metadata.Builder.class);
    }

    // Construct using io.grpc.binarylog.Metadata.newBuilder()
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
        getEntryFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (entryBuilder_ == null) {
        entry_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        entryBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.binarylog.BinaryLogProto.internal_static_grpc_binarylog_v1alpha_Metadata_descriptor;
    }

    public io.grpc.binarylog.Metadata getDefaultInstanceForType() {
      return io.grpc.binarylog.Metadata.getDefaultInstance();
    }

    public io.grpc.binarylog.Metadata build() {
      io.grpc.binarylog.Metadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.binarylog.Metadata buildPartial() {
      io.grpc.binarylog.Metadata result = new io.grpc.binarylog.Metadata(this);
      int from_bitField0_ = bitField0_;
      if (entryBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          entry_ = java.util.Collections.unmodifiableList(entry_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.entry_ = entry_;
      } else {
        result.entry_ = entryBuilder_.build();
      }
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
      if (other instanceof io.grpc.binarylog.Metadata) {
        return mergeFrom((io.grpc.binarylog.Metadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.binarylog.Metadata other) {
      if (other == io.grpc.binarylog.Metadata.getDefaultInstance()) return this;
      if (entryBuilder_ == null) {
        if (!other.entry_.isEmpty()) {
          if (entry_.isEmpty()) {
            entry_ = other.entry_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEntryIsMutable();
            entry_.addAll(other.entry_);
          }
          onChanged();
        }
      } else {
        if (!other.entry_.isEmpty()) {
          if (entryBuilder_.isEmpty()) {
            entryBuilder_.dispose();
            entryBuilder_ = null;
            entry_ = other.entry_;
            bitField0_ = (bitField0_ & ~0x00000001);
            entryBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEntryFieldBuilder() : null;
          } else {
            entryBuilder_.addAllMessages(other.entry_);
          }
        }
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
      io.grpc.binarylog.Metadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.binarylog.Metadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grpc.binarylog.MetadataEntry> entry_ =
      java.util.Collections.emptyList();
    private void ensureEntryIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        entry_ = new java.util.ArrayList<io.grpc.binarylog.MetadataEntry>(entry_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grpc.binarylog.MetadataEntry, io.grpc.binarylog.MetadataEntry.Builder, io.grpc.binarylog.MetadataEntryOrBuilder> entryBuilder_;

    /**
     * <code>repeated .grpc.binarylog.v1alpha.MetadataEntry entry = 1;</code>
     */
    public java.util.List<io.grpc.binarylog.MetadataEntry> getEntryList() {
      if (entryBuilder_ == null) {
        return java.util.Collections.unmodifiableList(entry_);
      } else {
        return entryBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .grpc.binarylog.v1alpha.MetadataEntry entry = 1;</code>
     */
    public int getEntryCount() {
      if (entryBuilder_ == null) {
        return entry_.size();
      } else {
        return entryBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .grpc.binarylog.v1alpha.MetadataEntry entry = 1;</code>
     */
    public io.grpc.binarylog.MetadataEntry getEntry(int index) {
      if (entryBuilder_ == null) {
        return entry_.get(index);
      } else {
        return entryBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .grpc.binarylog.v1alpha.MetadataEntry entry = 1;</code>
     */
    public Builder setEntry(
        int index, io.grpc.binarylog.MetadataEntry value) {
      if (entryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntryIsMutable();
        entry_.set(index, value);
        onChanged();
      } else {
        entryBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .grpc.binarylog.v1alpha.MetadataEntry entry = 1;</code>
     */
    public Builder setEntry(
        int index, io.grpc.binarylog.MetadataEntry.Builder builderForValue) {
      if (entryBuilder_ == null) {
        ensureEntryIsMutable();
        entry_.set(index, builderForValue.build());
        onChanged();
      } else {
        entryBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .grpc.binarylog.v1alpha.MetadataEntry entry = 1;</code>
     */
    public Builder addEntry(io.grpc.binarylog.MetadataEntry value) {
      if (entryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntryIsMutable();
        entry_.add(value);
        onChanged();
      } else {
        entryBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .grpc.binarylog.v1alpha.MetadataEntry entry = 1;</code>
     */
    public Builder addEntry(
        int index, io.grpc.binarylog.MetadataEntry value) {
      if (entryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntryIsMutable();
        entry_.add(index, value);
        onChanged();
      } else {
        entryBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .grpc.binarylog.v1alpha.MetadataEntry entry = 1;</code>
     */
    public Builder addEntry(
        io.grpc.binarylog.MetadataEntry.Builder builderForValue) {
      if (entryBuilder_ == null) {
        ensureEntryIsMutable();
        entry_.add(builderForValue.build());
        onChanged();
      } else {
        entryBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .grpc.binarylog.v1alpha.MetadataEntry entry = 1;</code>
     */
    public Builder addEntry(
        int index, io.grpc.binarylog.MetadataEntry.Builder builderForValue) {
      if (entryBuilder_ == null) {
        ensureEntryIsMutable();
        entry_.add(index, builderForValue.build());
        onChanged();
      } else {
        entryBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .grpc.binarylog.v1alpha.MetadataEntry entry = 1;</code>
     */
    public Builder addAllEntry(
        java.lang.Iterable<? extends io.grpc.binarylog.MetadataEntry> values) {
      if (entryBuilder_ == null) {
        ensureEntryIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, entry_);
        onChanged();
      } else {
        entryBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .grpc.binarylog.v1alpha.MetadataEntry entry = 1;</code>
     */
    public Builder clearEntry() {
      if (entryBuilder_ == null) {
        entry_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        entryBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .grpc.binarylog.v1alpha.MetadataEntry entry = 1;</code>
     */
    public Builder removeEntry(int index) {
      if (entryBuilder_ == null) {
        ensureEntryIsMutable();
        entry_.remove(index);
        onChanged();
      } else {
        entryBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .grpc.binarylog.v1alpha.MetadataEntry entry = 1;</code>
     */
    public io.grpc.binarylog.MetadataEntry.Builder getEntryBuilder(
        int index) {
      return getEntryFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .grpc.binarylog.v1alpha.MetadataEntry entry = 1;</code>
     */
    public io.grpc.binarylog.MetadataEntryOrBuilder getEntryOrBuilder(
        int index) {
      if (entryBuilder_ == null) {
        return entry_.get(index);  } else {
        return entryBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .grpc.binarylog.v1alpha.MetadataEntry entry = 1;</code>
     */
    public java.util.List<? extends io.grpc.binarylog.MetadataEntryOrBuilder> 
         getEntryOrBuilderList() {
      if (entryBuilder_ != null) {
        return entryBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(entry_);
      }
    }
    /**
     * <code>repeated .grpc.binarylog.v1alpha.MetadataEntry entry = 1;</code>
     */
    public io.grpc.binarylog.MetadataEntry.Builder addEntryBuilder() {
      return getEntryFieldBuilder().addBuilder(
          io.grpc.binarylog.MetadataEntry.getDefaultInstance());
    }
    /**
     * <code>repeated .grpc.binarylog.v1alpha.MetadataEntry entry = 1;</code>
     */
    public io.grpc.binarylog.MetadataEntry.Builder addEntryBuilder(
        int index) {
      return getEntryFieldBuilder().addBuilder(
          index, io.grpc.binarylog.MetadataEntry.getDefaultInstance());
    }
    /**
     * <code>repeated .grpc.binarylog.v1alpha.MetadataEntry entry = 1;</code>
     */
    public java.util.List<io.grpc.binarylog.MetadataEntry.Builder> 
         getEntryBuilderList() {
      return getEntryFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grpc.binarylog.MetadataEntry, io.grpc.binarylog.MetadataEntry.Builder, io.grpc.binarylog.MetadataEntryOrBuilder> 
        getEntryFieldBuilder() {
      if (entryBuilder_ == null) {
        entryBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grpc.binarylog.MetadataEntry, io.grpc.binarylog.MetadataEntry.Builder, io.grpc.binarylog.MetadataEntryOrBuilder>(
                entry_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        entry_ = null;
      }
      return entryBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpc.binarylog.v1alpha.Metadata)
  }

  // @@protoc_insertion_point(class_scope:grpc.binarylog.v1alpha.Metadata)
  private static final io.grpc.binarylog.Metadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.binarylog.Metadata();
  }

  public static io.grpc.binarylog.Metadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Metadata>
      PARSER = new com.google.protobuf.AbstractParser<Metadata>() {
    public Metadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Metadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Metadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Metadata> getParserForType() {
    return PARSER;
  }

  public io.grpc.binarylog.Metadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

