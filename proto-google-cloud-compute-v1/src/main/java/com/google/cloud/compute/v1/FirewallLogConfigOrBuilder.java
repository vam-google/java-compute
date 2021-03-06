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

public interface FirewallLogConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.FirewallLogConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * This field denotes whether to enable logging for a particular firewall rule.
   * </pre>
   *
   * <code>bool enable = 311764355;</code>
   *
   * @return Whether the enable field is set.
   */
  boolean hasEnable();
  /**
   *
   *
   * <pre>
   * This field denotes whether to enable logging for a particular firewall rule.
   * </pre>
   *
   * <code>bool enable = 311764355;</code>
   *
   * @return The enable.
   */
  boolean getEnable();

  /**
   *
   *
   * <pre>
   * This field can only be specified for a particular firewall rule if logging is enabled for that rule. This field denotes whether to include or exclude metadata for firewall logs.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.FirewallLogConfig.Metadata metadata = 86866735;</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * This field can only be specified for a particular firewall rule if logging is enabled for that rule. This field denotes whether to include or exclude metadata for firewall logs.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.FirewallLogConfig.Metadata metadata = 86866735;</code>
   *
   * @return The enum numeric value on the wire for metadata.
   */
  int getMetadataValue();
  /**
   *
   *
   * <pre>
   * This field can only be specified for a particular firewall rule if logging is enabled for that rule. This field denotes whether to include or exclude metadata for firewall logs.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.FirewallLogConfig.Metadata metadata = 86866735;</code>
   *
   * @return The metadata.
   */
  com.google.cloud.compute.v1.FirewallLogConfig.Metadata getMetadata();
}
