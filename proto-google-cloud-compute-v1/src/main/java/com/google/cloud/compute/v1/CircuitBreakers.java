/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * Settings controlling the volume of connections to a backend service.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.CircuitBreakers}
 */
public final class CircuitBreakers extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.CircuitBreakers)
    CircuitBreakersOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CircuitBreakers.newBuilder() to construct.
  private CircuitBreakers(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CircuitBreakers() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CircuitBreakers();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CircuitBreakers(
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
          case 224780792:
            {
              bitField0_ |= 0x00000004;
              maxRequests_ = input.readInt32();
              break;
            }
          case 444369752:
            {
              bitField0_ |= 0x00000010;
              maxRetries_ = input.readInt32();
              break;
            }
          case 885217232:
            {
              bitField0_ |= 0x00000001;
              maxConnections_ = input.readInt32();
              break;
            }
          case -1401923072:
            {
              bitField0_ |= 0x00000008;
              maxRequestsPerConnection_ = input.readInt32();
              break;
            }
          case -1290496200:
            {
              bitField0_ |= 0x00000002;
              maxPendingRequests_ = input.readInt32();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_CircuitBreakers_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_CircuitBreakers_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.CircuitBreakers.class,
            com.google.cloud.compute.v1.CircuitBreakers.Builder.class);
  }

  private int bitField0_;
  public static final int MAX_CONNECTIONS_FIELD_NUMBER = 110652154;
  private int maxConnections_;
  /**
   *
   *
   * <pre>
   * The maximum number of connections to the backend service. If not specified, there is no limit.
   * </pre>
   *
   * <code>int32 max_connections = 110652154;</code>
   *
   * @return Whether the maxConnections field is set.
   */
  @java.lang.Override
  public boolean hasMaxConnections() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The maximum number of connections to the backend service. If not specified, there is no limit.
   * </pre>
   *
   * <code>int32 max_connections = 110652154;</code>
   *
   * @return The maxConnections.
   */
  @java.lang.Override
  public int getMaxConnections() {
    return maxConnections_;
  }

  public static final int MAX_PENDING_REQUESTS_FIELD_NUMBER = 375558887;
  private int maxPendingRequests_;
  /**
   *
   *
   * <pre>
   * The maximum number of pending requests allowed to the backend service. If not specified, there is no limit.
   * </pre>
   *
   * <code>int32 max_pending_requests = 375558887;</code>
   *
   * @return Whether the maxPendingRequests field is set.
   */
  @java.lang.Override
  public boolean hasMaxPendingRequests() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * The maximum number of pending requests allowed to the backend service. If not specified, there is no limit.
   * </pre>
   *
   * <code>int32 max_pending_requests = 375558887;</code>
   *
   * @return The maxPendingRequests.
   */
  @java.lang.Override
  public int getMaxPendingRequests() {
    return maxPendingRequests_;
  }

  public static final int MAX_REQUESTS_FIELD_NUMBER = 28097599;
  private int maxRequests_;
  /**
   *
   *
   * <pre>
   * The maximum number of parallel requests that allowed to the backend service. If not specified, there is no limit.
   * </pre>
   *
   * <code>int32 max_requests = 28097599;</code>
   *
   * @return Whether the maxRequests field is set.
   */
  @java.lang.Override
  public boolean hasMaxRequests() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   *
   *
   * <pre>
   * The maximum number of parallel requests that allowed to the backend service. If not specified, there is no limit.
   * </pre>
   *
   * <code>int32 max_requests = 28097599;</code>
   *
   * @return The maxRequests.
   */
  @java.lang.Override
  public int getMaxRequests() {
    return maxRequests_;
  }

  public static final int MAX_REQUESTS_PER_CONNECTION_FIELD_NUMBER = 361630528;
  private int maxRequestsPerConnection_;
  /**
   *
   *
   * <pre>
   * Maximum requests for a single connection to the backend service. This parameter is respected by both the HTTP/1.1 and HTTP/2 implementations. If not specified, there is no limit. Setting this parameter to 1 will effectively disable keep alive.
   * </pre>
   *
   * <code>int32 max_requests_per_connection = 361630528;</code>
   *
   * @return Whether the maxRequestsPerConnection field is set.
   */
  @java.lang.Override
  public boolean hasMaxRequestsPerConnection() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   *
   *
   * <pre>
   * Maximum requests for a single connection to the backend service. This parameter is respected by both the HTTP/1.1 and HTTP/2 implementations. If not specified, there is no limit. Setting this parameter to 1 will effectively disable keep alive.
   * </pre>
   *
   * <code>int32 max_requests_per_connection = 361630528;</code>
   *
   * @return The maxRequestsPerConnection.
   */
  @java.lang.Override
  public int getMaxRequestsPerConnection() {
    return maxRequestsPerConnection_;
  }

  public static final int MAX_RETRIES_FIELD_NUMBER = 55546219;
  private int maxRetries_;
  /**
   *
   *
   * <pre>
   * The maximum number of parallel retries allowed to the backend cluster. If not specified, the default is 1.
   * </pre>
   *
   * <code>int32 max_retries = 55546219;</code>
   *
   * @return Whether the maxRetries field is set.
   */
  @java.lang.Override
  public boolean hasMaxRetries() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   *
   *
   * <pre>
   * The maximum number of parallel retries allowed to the backend cluster. If not specified, the default is 1.
   * </pre>
   *
   * <code>int32 max_retries = 55546219;</code>
   *
   * @return The maxRetries.
   */
  @java.lang.Override
  public int getMaxRetries() {
    return maxRetries_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(28097599, maxRequests_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      output.writeInt32(55546219, maxRetries_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(110652154, maxConnections_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeInt32(361630528, maxRequestsPerConnection_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(375558887, maxPendingRequests_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(28097599, maxRequests_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(55546219, maxRetries_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(110652154, maxConnections_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeInt32Size(
              361630528, maxRequestsPerConnection_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeInt32Size(375558887, maxPendingRequests_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.CircuitBreakers)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.CircuitBreakers other =
        (com.google.cloud.compute.v1.CircuitBreakers) obj;

    if (hasMaxConnections() != other.hasMaxConnections()) return false;
    if (hasMaxConnections()) {
      if (getMaxConnections() != other.getMaxConnections()) return false;
    }
    if (hasMaxPendingRequests() != other.hasMaxPendingRequests()) return false;
    if (hasMaxPendingRequests()) {
      if (getMaxPendingRequests() != other.getMaxPendingRequests()) return false;
    }
    if (hasMaxRequests() != other.hasMaxRequests()) return false;
    if (hasMaxRequests()) {
      if (getMaxRequests() != other.getMaxRequests()) return false;
    }
    if (hasMaxRequestsPerConnection() != other.hasMaxRequestsPerConnection()) return false;
    if (hasMaxRequestsPerConnection()) {
      if (getMaxRequestsPerConnection() != other.getMaxRequestsPerConnection()) return false;
    }
    if (hasMaxRetries() != other.hasMaxRetries()) return false;
    if (hasMaxRetries()) {
      if (getMaxRetries() != other.getMaxRetries()) return false;
    }
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
    if (hasMaxConnections()) {
      hash = (37 * hash) + MAX_CONNECTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getMaxConnections();
    }
    if (hasMaxPendingRequests()) {
      hash = (37 * hash) + MAX_PENDING_REQUESTS_FIELD_NUMBER;
      hash = (53 * hash) + getMaxPendingRequests();
    }
    if (hasMaxRequests()) {
      hash = (37 * hash) + MAX_REQUESTS_FIELD_NUMBER;
      hash = (53 * hash) + getMaxRequests();
    }
    if (hasMaxRequestsPerConnection()) {
      hash = (37 * hash) + MAX_REQUESTS_PER_CONNECTION_FIELD_NUMBER;
      hash = (53 * hash) + getMaxRequestsPerConnection();
    }
    if (hasMaxRetries()) {
      hash = (37 * hash) + MAX_RETRIES_FIELD_NUMBER;
      hash = (53 * hash) + getMaxRetries();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.CircuitBreakers parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.CircuitBreakers parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.CircuitBreakers parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.CircuitBreakers parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.CircuitBreakers parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.CircuitBreakers parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.CircuitBreakers parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.CircuitBreakers parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.CircuitBreakers parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.CircuitBreakers parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.CircuitBreakers parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.CircuitBreakers parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.compute.v1.CircuitBreakers prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Settings controlling the volume of connections to a backend service.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.CircuitBreakers}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.CircuitBreakers)
      com.google.cloud.compute.v1.CircuitBreakersOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_CircuitBreakers_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_CircuitBreakers_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.CircuitBreakers.class,
              com.google.cloud.compute.v1.CircuitBreakers.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.CircuitBreakers.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      maxConnections_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      maxPendingRequests_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      maxRequests_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      maxRequestsPerConnection_ = 0;
      bitField0_ = (bitField0_ & ~0x00000008);
      maxRetries_ = 0;
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_CircuitBreakers_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.CircuitBreakers getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.CircuitBreakers.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.CircuitBreakers build() {
      com.google.cloud.compute.v1.CircuitBreakers result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.CircuitBreakers buildPartial() {
      com.google.cloud.compute.v1.CircuitBreakers result =
          new com.google.cloud.compute.v1.CircuitBreakers(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.maxConnections_ = maxConnections_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxPendingRequests_ = maxPendingRequests_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.maxRequests_ = maxRequests_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.maxRequestsPerConnection_ = maxRequestsPerConnection_;
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.maxRetries_ = maxRetries_;
        to_bitField0_ |= 0x00000010;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.CircuitBreakers) {
        return mergeFrom((com.google.cloud.compute.v1.CircuitBreakers) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.CircuitBreakers other) {
      if (other == com.google.cloud.compute.v1.CircuitBreakers.getDefaultInstance()) return this;
      if (other.hasMaxConnections()) {
        setMaxConnections(other.getMaxConnections());
      }
      if (other.hasMaxPendingRequests()) {
        setMaxPendingRequests(other.getMaxPendingRequests());
      }
      if (other.hasMaxRequests()) {
        setMaxRequests(other.getMaxRequests());
      }
      if (other.hasMaxRequestsPerConnection()) {
        setMaxRequestsPerConnection(other.getMaxRequestsPerConnection());
      }
      if (other.hasMaxRetries()) {
        setMaxRetries(other.getMaxRetries());
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
      com.google.cloud.compute.v1.CircuitBreakers parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.CircuitBreakers) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private int maxConnections_;
    /**
     *
     *
     * <pre>
     * The maximum number of connections to the backend service. If not specified, there is no limit.
     * </pre>
     *
     * <code>int32 max_connections = 110652154;</code>
     *
     * @return Whether the maxConnections field is set.
     */
    @java.lang.Override
    public boolean hasMaxConnections() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The maximum number of connections to the backend service. If not specified, there is no limit.
     * </pre>
     *
     * <code>int32 max_connections = 110652154;</code>
     *
     * @return The maxConnections.
     */
    @java.lang.Override
    public int getMaxConnections() {
      return maxConnections_;
    }
    /**
     *
     *
     * <pre>
     * The maximum number of connections to the backend service. If not specified, there is no limit.
     * </pre>
     *
     * <code>int32 max_connections = 110652154;</code>
     *
     * @param value The maxConnections to set.
     * @return This builder for chaining.
     */
    public Builder setMaxConnections(int value) {
      bitField0_ |= 0x00000001;
      maxConnections_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The maximum number of connections to the backend service. If not specified, there is no limit.
     * </pre>
     *
     * <code>int32 max_connections = 110652154;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxConnections() {
      bitField0_ = (bitField0_ & ~0x00000001);
      maxConnections_ = 0;
      onChanged();
      return this;
    }

    private int maxPendingRequests_;
    /**
     *
     *
     * <pre>
     * The maximum number of pending requests allowed to the backend service. If not specified, there is no limit.
     * </pre>
     *
     * <code>int32 max_pending_requests = 375558887;</code>
     *
     * @return Whether the maxPendingRequests field is set.
     */
    @java.lang.Override
    public boolean hasMaxPendingRequests() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The maximum number of pending requests allowed to the backend service. If not specified, there is no limit.
     * </pre>
     *
     * <code>int32 max_pending_requests = 375558887;</code>
     *
     * @return The maxPendingRequests.
     */
    @java.lang.Override
    public int getMaxPendingRequests() {
      return maxPendingRequests_;
    }
    /**
     *
     *
     * <pre>
     * The maximum number of pending requests allowed to the backend service. If not specified, there is no limit.
     * </pre>
     *
     * <code>int32 max_pending_requests = 375558887;</code>
     *
     * @param value The maxPendingRequests to set.
     * @return This builder for chaining.
     */
    public Builder setMaxPendingRequests(int value) {
      bitField0_ |= 0x00000002;
      maxPendingRequests_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The maximum number of pending requests allowed to the backend service. If not specified, there is no limit.
     * </pre>
     *
     * <code>int32 max_pending_requests = 375558887;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxPendingRequests() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxPendingRequests_ = 0;
      onChanged();
      return this;
    }

    private int maxRequests_;
    /**
     *
     *
     * <pre>
     * The maximum number of parallel requests that allowed to the backend service. If not specified, there is no limit.
     * </pre>
     *
     * <code>int32 max_requests = 28097599;</code>
     *
     * @return Whether the maxRequests field is set.
     */
    @java.lang.Override
    public boolean hasMaxRequests() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * The maximum number of parallel requests that allowed to the backend service. If not specified, there is no limit.
     * </pre>
     *
     * <code>int32 max_requests = 28097599;</code>
     *
     * @return The maxRequests.
     */
    @java.lang.Override
    public int getMaxRequests() {
      return maxRequests_;
    }
    /**
     *
     *
     * <pre>
     * The maximum number of parallel requests that allowed to the backend service. If not specified, there is no limit.
     * </pre>
     *
     * <code>int32 max_requests = 28097599;</code>
     *
     * @param value The maxRequests to set.
     * @return This builder for chaining.
     */
    public Builder setMaxRequests(int value) {
      bitField0_ |= 0x00000004;
      maxRequests_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The maximum number of parallel requests that allowed to the backend service. If not specified, there is no limit.
     * </pre>
     *
     * <code>int32 max_requests = 28097599;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxRequests() {
      bitField0_ = (bitField0_ & ~0x00000004);
      maxRequests_ = 0;
      onChanged();
      return this;
    }

    private int maxRequestsPerConnection_;
    /**
     *
     *
     * <pre>
     * Maximum requests for a single connection to the backend service. This parameter is respected by both the HTTP/1.1 and HTTP/2 implementations. If not specified, there is no limit. Setting this parameter to 1 will effectively disable keep alive.
     * </pre>
     *
     * <code>int32 max_requests_per_connection = 361630528;</code>
     *
     * @return Whether the maxRequestsPerConnection field is set.
     */
    @java.lang.Override
    public boolean hasMaxRequestsPerConnection() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     *
     *
     * <pre>
     * Maximum requests for a single connection to the backend service. This parameter is respected by both the HTTP/1.1 and HTTP/2 implementations. If not specified, there is no limit. Setting this parameter to 1 will effectively disable keep alive.
     * </pre>
     *
     * <code>int32 max_requests_per_connection = 361630528;</code>
     *
     * @return The maxRequestsPerConnection.
     */
    @java.lang.Override
    public int getMaxRequestsPerConnection() {
      return maxRequestsPerConnection_;
    }
    /**
     *
     *
     * <pre>
     * Maximum requests for a single connection to the backend service. This parameter is respected by both the HTTP/1.1 and HTTP/2 implementations. If not specified, there is no limit. Setting this parameter to 1 will effectively disable keep alive.
     * </pre>
     *
     * <code>int32 max_requests_per_connection = 361630528;</code>
     *
     * @param value The maxRequestsPerConnection to set.
     * @return This builder for chaining.
     */
    public Builder setMaxRequestsPerConnection(int value) {
      bitField0_ |= 0x00000008;
      maxRequestsPerConnection_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Maximum requests for a single connection to the backend service. This parameter is respected by both the HTTP/1.1 and HTTP/2 implementations. If not specified, there is no limit. Setting this parameter to 1 will effectively disable keep alive.
     * </pre>
     *
     * <code>int32 max_requests_per_connection = 361630528;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxRequestsPerConnection() {
      bitField0_ = (bitField0_ & ~0x00000008);
      maxRequestsPerConnection_ = 0;
      onChanged();
      return this;
    }

    private int maxRetries_;
    /**
     *
     *
     * <pre>
     * The maximum number of parallel retries allowed to the backend cluster. If not specified, the default is 1.
     * </pre>
     *
     * <code>int32 max_retries = 55546219;</code>
     *
     * @return Whether the maxRetries field is set.
     */
    @java.lang.Override
    public boolean hasMaxRetries() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     *
     *
     * <pre>
     * The maximum number of parallel retries allowed to the backend cluster. If not specified, the default is 1.
     * </pre>
     *
     * <code>int32 max_retries = 55546219;</code>
     *
     * @return The maxRetries.
     */
    @java.lang.Override
    public int getMaxRetries() {
      return maxRetries_;
    }
    /**
     *
     *
     * <pre>
     * The maximum number of parallel retries allowed to the backend cluster. If not specified, the default is 1.
     * </pre>
     *
     * <code>int32 max_retries = 55546219;</code>
     *
     * @param value The maxRetries to set.
     * @return This builder for chaining.
     */
    public Builder setMaxRetries(int value) {
      bitField0_ |= 0x00000010;
      maxRetries_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The maximum number of parallel retries allowed to the backend cluster. If not specified, the default is 1.
     * </pre>
     *
     * <code>int32 max_retries = 55546219;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxRetries() {
      bitField0_ = (bitField0_ & ~0x00000010);
      maxRetries_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.CircuitBreakers)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.CircuitBreakers)
  private static final com.google.cloud.compute.v1.CircuitBreakers DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.CircuitBreakers();
  }

  public static com.google.cloud.compute.v1.CircuitBreakers getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CircuitBreakers> PARSER =
      new com.google.protobuf.AbstractParser<CircuitBreakers>() {
        @java.lang.Override
        public CircuitBreakers parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CircuitBreakers(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CircuitBreakers> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CircuitBreakers> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.CircuitBreakers getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
