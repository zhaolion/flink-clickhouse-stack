// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user_duration_event.proto

package com.zhaolion.flink_clickhouse_stack.event;

/**
 * Protobuf type {@code event.UserDurationEvent}
 */
public final class UserDurationEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:event.UserDurationEvent)
    UserDurationEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserDurationEvent.newBuilder() to construct.
  private UserDurationEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserDurationEvent() {
    id_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserDurationEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserDurationEvent(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 16: {

            eventAtNs_ = input.readInt64();
            break;
          }
          case 24: {

            durationSec_ = input.readInt32();
            break;
          }
          case 32: {

            userId_ = input.readUInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return com.zhaolion.flink_clickhouse_stack.event.UserDurationEventProto.internal_static_event_UserDurationEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.zhaolion.flink_clickhouse_stack.event.UserDurationEventProto.internal_static_event_UserDurationEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent.class, com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVENT_AT_NS_FIELD_NUMBER = 2;
  private long eventAtNs_;
  /**
   * <code>int64 event_at_ns = 2;</code>
   * @return The eventAtNs.
   */
  @java.lang.Override
  public long getEventAtNs() {
    return eventAtNs_;
  }

  public static final int DURATION_SEC_FIELD_NUMBER = 3;
  private int durationSec_;
  /**
   * <code>int32 duration_sec = 3;</code>
   * @return The durationSec.
   */
  @java.lang.Override
  public int getDurationSec() {
    return durationSec_;
  }

  public static final int USER_ID_FIELD_NUMBER = 4;
  private long userId_;
  /**
   * <code>uint64 user_id = 4;</code>
   * @return The userId.
   */
  @java.lang.Override
  public long getUserId() {
    return userId_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (eventAtNs_ != 0L) {
      output.writeInt64(2, eventAtNs_);
    }
    if (durationSec_ != 0) {
      output.writeInt32(3, durationSec_);
    }
    if (userId_ != 0L) {
      output.writeUInt64(4, userId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (eventAtNs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, eventAtNs_);
    }
    if (durationSec_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, durationSec_);
    }
    if (userId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, userId_);
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
    if (!(obj instanceof com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent)) {
      return super.equals(obj);
    }
    com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent other = (com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (getEventAtNs()
        != other.getEventAtNs()) return false;
    if (getDurationSec()
        != other.getDurationSec()) return false;
    if (getUserId()
        != other.getUserId()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + EVENT_AT_NS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEventAtNs());
    hash = (37 * hash) + DURATION_SEC_FIELD_NUMBER;
    hash = (53 * hash) + getDurationSec();
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUserId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent parseFrom(
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
  public static Builder newBuilder(com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent prototype) {
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
   * Protobuf type {@code event.UserDurationEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:event.UserDurationEvent)
      com.zhaolion.flink_clickhouse_stack.event.UserDurationEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zhaolion.flink_clickhouse_stack.event.UserDurationEventProto.internal_static_event_UserDurationEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zhaolion.flink_clickhouse_stack.event.UserDurationEventProto.internal_static_event_UserDurationEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent.class, com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent.Builder.class);
    }

    // Construct using com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent.newBuilder()
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
      id_ = "";

      eventAtNs_ = 0L;

      durationSec_ = 0;

      userId_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.zhaolion.flink_clickhouse_stack.event.UserDurationEventProto.internal_static_event_UserDurationEvent_descriptor;
    }

    @java.lang.Override
    public com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent getDefaultInstanceForType() {
      return com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent build() {
      com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent buildPartial() {
      com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent result = new com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent(this);
      result.id_ = id_;
      result.eventAtNs_ = eventAtNs_;
      result.durationSec_ = durationSec_;
      result.userId_ = userId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent) {
        return mergeFrom((com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent other) {
      if (other == com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (other.getEventAtNs() != 0L) {
        setEventAtNs(other.getEventAtNs());
      }
      if (other.getDurationSec() != 0) {
        setDurationSec(other.getDurationSec());
      }
      if (other.getUserId() != 0L) {
        setUserId(other.getUserId());
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
      com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private long eventAtNs_ ;
    /**
     * <code>int64 event_at_ns = 2;</code>
     * @return The eventAtNs.
     */
    @java.lang.Override
    public long getEventAtNs() {
      return eventAtNs_;
    }
    /**
     * <code>int64 event_at_ns = 2;</code>
     * @param value The eventAtNs to set.
     * @return This builder for chaining.
     */
    public Builder setEventAtNs(long value) {
      
      eventAtNs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 event_at_ns = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventAtNs() {
      
      eventAtNs_ = 0L;
      onChanged();
      return this;
    }

    private int durationSec_ ;
    /**
     * <code>int32 duration_sec = 3;</code>
     * @return The durationSec.
     */
    @java.lang.Override
    public int getDurationSec() {
      return durationSec_;
    }
    /**
     * <code>int32 duration_sec = 3;</code>
     * @param value The durationSec to set.
     * @return This builder for chaining.
     */
    public Builder setDurationSec(int value) {
      
      durationSec_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 duration_sec = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDurationSec() {
      
      durationSec_ = 0;
      onChanged();
      return this;
    }

    private long userId_ ;
    /**
     * <code>uint64 user_id = 4;</code>
     * @return The userId.
     */
    @java.lang.Override
    public long getUserId() {
      return userId_;
    }
    /**
     * <code>uint64 user_id = 4;</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(long value) {
      
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 user_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      
      userId_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:event.UserDurationEvent)
  }

  // @@protoc_insertion_point(class_scope:event.UserDurationEvent)
  private static final com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent();
  }

  public static com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserDurationEvent>
      PARSER = new com.google.protobuf.AbstractParser<UserDurationEvent>() {
    @java.lang.Override
    public UserDurationEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserDurationEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserDurationEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserDurationEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.zhaolion.flink_clickhouse_stack.event.UserDurationEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
