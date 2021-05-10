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
 * A set of Confidential Instance options.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.ConfidentialInstanceConfig}
 */
public final class ConfidentialInstanceConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.ConfidentialInstanceConfig)
    ConfidentialInstanceConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ConfidentialInstanceConfig.newBuilder() to construct.
  private ConfidentialInstanceConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ConfidentialInstanceConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ConfidentialInstanceConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ConfidentialInstanceConfig(
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
          case 817081824:
            {
              bitField0_ |= 0x00000001;
              enableConfidentialCompute_ = input.readBool();
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
        .internal_static_google_cloud_compute_v1_ConfidentialInstanceConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_ConfidentialInstanceConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.ConfidentialInstanceConfig.class,
            com.google.cloud.compute.v1.ConfidentialInstanceConfig.Builder.class);
  }

  private int bitField0_;
  public static final int ENABLE_CONFIDENTIAL_COMPUTE_FIELD_NUMBER = 102135228;
  private boolean enableConfidentialCompute_;
  /**
   *
   *
   * <pre>
   * Defines whether the instance should have confidential compute enabled.
   * </pre>
   *
   * <code>bool enable_confidential_compute = 102135228;</code>
   *
   * @return Whether the enableConfidentialCompute field is set.
   */
  @java.lang.Override
  public boolean hasEnableConfidentialCompute() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Defines whether the instance should have confidential compute enabled.
   * </pre>
   *
   * <code>bool enable_confidential_compute = 102135228;</code>
   *
   * @return The enableConfidentialCompute.
   */
  @java.lang.Override
  public boolean getEnableConfidentialCompute() {
    return enableConfidentialCompute_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBool(102135228, enableConfidentialCompute_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(
              102135228, enableConfidentialCompute_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.ConfidentialInstanceConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.ConfidentialInstanceConfig other =
        (com.google.cloud.compute.v1.ConfidentialInstanceConfig) obj;

    if (hasEnableConfidentialCompute() != other.hasEnableConfidentialCompute()) return false;
    if (hasEnableConfidentialCompute()) {
      if (getEnableConfidentialCompute() != other.getEnableConfidentialCompute()) return false;
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
    if (hasEnableConfidentialCompute()) {
      hash = (37 * hash) + ENABLE_CONFIDENTIAL_COMPUTE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnableConfidentialCompute());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.ConfidentialInstanceConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ConfidentialInstanceConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ConfidentialInstanceConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ConfidentialInstanceConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ConfidentialInstanceConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ConfidentialInstanceConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ConfidentialInstanceConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ConfidentialInstanceConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ConfidentialInstanceConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ConfidentialInstanceConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ConfidentialInstanceConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ConfidentialInstanceConfig parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.compute.v1.ConfidentialInstanceConfig prototype) {
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
   * A set of Confidential Instance options.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.ConfidentialInstanceConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.ConfidentialInstanceConfig)
      com.google.cloud.compute.v1.ConfidentialInstanceConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ConfidentialInstanceConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ConfidentialInstanceConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.ConfidentialInstanceConfig.class,
              com.google.cloud.compute.v1.ConfidentialInstanceConfig.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.ConfidentialInstanceConfig.newBuilder()
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
      enableConfidentialCompute_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ConfidentialInstanceConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ConfidentialInstanceConfig getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.ConfidentialInstanceConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ConfidentialInstanceConfig build() {
      com.google.cloud.compute.v1.ConfidentialInstanceConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ConfidentialInstanceConfig buildPartial() {
      com.google.cloud.compute.v1.ConfidentialInstanceConfig result =
          new com.google.cloud.compute.v1.ConfidentialInstanceConfig(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enableConfidentialCompute_ = enableConfidentialCompute_;
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.cloud.compute.v1.ConfidentialInstanceConfig) {
        return mergeFrom((com.google.cloud.compute.v1.ConfidentialInstanceConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.ConfidentialInstanceConfig other) {
      if (other == com.google.cloud.compute.v1.ConfidentialInstanceConfig.getDefaultInstance())
        return this;
      if (other.hasEnableConfidentialCompute()) {
        setEnableConfidentialCompute(other.getEnableConfidentialCompute());
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
      com.google.cloud.compute.v1.ConfidentialInstanceConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.ConfidentialInstanceConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private boolean enableConfidentialCompute_;
    /**
     *
     *
     * <pre>
     * Defines whether the instance should have confidential compute enabled.
     * </pre>
     *
     * <code>bool enable_confidential_compute = 102135228;</code>
     *
     * @return Whether the enableConfidentialCompute field is set.
     */
    @java.lang.Override
    public boolean hasEnableConfidentialCompute() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Defines whether the instance should have confidential compute enabled.
     * </pre>
     *
     * <code>bool enable_confidential_compute = 102135228;</code>
     *
     * @return The enableConfidentialCompute.
     */
    @java.lang.Override
    public boolean getEnableConfidentialCompute() {
      return enableConfidentialCompute_;
    }
    /**
     *
     *
     * <pre>
     * Defines whether the instance should have confidential compute enabled.
     * </pre>
     *
     * <code>bool enable_confidential_compute = 102135228;</code>
     *
     * @param value The enableConfidentialCompute to set.
     * @return This builder for chaining.
     */
    public Builder setEnableConfidentialCompute(boolean value) {
      bitField0_ |= 0x00000001;
      enableConfidentialCompute_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines whether the instance should have confidential compute enabled.
     * </pre>
     *
     * <code>bool enable_confidential_compute = 102135228;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnableConfidentialCompute() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enableConfidentialCompute_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.ConfidentialInstanceConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.ConfidentialInstanceConfig)
  private static final com.google.cloud.compute.v1.ConfidentialInstanceConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.ConfidentialInstanceConfig();
  }

  public static com.google.cloud.compute.v1.ConfidentialInstanceConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConfidentialInstanceConfig> PARSER =
      new com.google.protobuf.AbstractParser<ConfidentialInstanceConfig>() {
        @java.lang.Override
        public ConfidentialInstanceConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ConfidentialInstanceConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ConfidentialInstanceConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConfidentialInstanceConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.ConfidentialInstanceConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
