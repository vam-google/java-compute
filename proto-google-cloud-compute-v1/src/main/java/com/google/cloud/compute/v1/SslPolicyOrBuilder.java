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

public interface SslPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SslPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string creation_timestamp = 30525366;</code>
   *
   * @return Whether the creationTimestamp field is set.
   */
  boolean hasCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string creation_timestamp = 30525366;</code>
   *
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string creation_timestamp = 30525366;</code>
   *
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString getCreationTimestampBytes();

  /**
   *
   *
   * <pre>
   * A list of features enabled when the selected profile is CUSTOM. The
   * - method returns the set of features that can be specified in this list. This field must be empty if the profile is not CUSTOM.
   * </pre>
   *
   * <code>repeated string custom_features = 34789707;</code>
   *
   * @return A list containing the customFeatures.
   */
  java.util.List<java.lang.String> getCustomFeaturesList();
  /**
   *
   *
   * <pre>
   * A list of features enabled when the selected profile is CUSTOM. The
   * - method returns the set of features that can be specified in this list. This field must be empty if the profile is not CUSTOM.
   * </pre>
   *
   * <code>repeated string custom_features = 34789707;</code>
   *
   * @return The count of customFeatures.
   */
  int getCustomFeaturesCount();
  /**
   *
   *
   * <pre>
   * A list of features enabled when the selected profile is CUSTOM. The
   * - method returns the set of features that can be specified in this list. This field must be empty if the profile is not CUSTOM.
   * </pre>
   *
   * <code>repeated string custom_features = 34789707;</code>
   *
   * @param index The index of the element to return.
   * @return The customFeatures at the given index.
   */
  java.lang.String getCustomFeatures(int index);
  /**
   *
   *
   * <pre>
   * A list of features enabled when the selected profile is CUSTOM. The
   * - method returns the set of features that can be specified in this list. This field must be empty if the profile is not CUSTOM.
   * </pre>
   *
   * <code>repeated string custom_features = 34789707;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the customFeatures at the given index.
   */
  com.google.protobuf.ByteString getCustomFeaturesBytes(int index);

  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The list of features enabled in the SSL policy.
   * </pre>
   *
   * <code>repeated string enabled_features = 469017467;</code>
   *
   * @return A list containing the enabledFeatures.
   */
  java.util.List<java.lang.String> getEnabledFeaturesList();
  /**
   *
   *
   * <pre>
   * [Output Only] The list of features enabled in the SSL policy.
   * </pre>
   *
   * <code>repeated string enabled_features = 469017467;</code>
   *
   * @return The count of enabledFeatures.
   */
  int getEnabledFeaturesCount();
  /**
   *
   *
   * <pre>
   * [Output Only] The list of features enabled in the SSL policy.
   * </pre>
   *
   * <code>repeated string enabled_features = 469017467;</code>
   *
   * @param index The index of the element to return.
   * @return The enabledFeatures at the given index.
   */
  java.lang.String getEnabledFeatures(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] The list of features enabled in the SSL policy.
   * </pre>
   *
   * <code>repeated string enabled_features = 469017467;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the enabledFeatures at the given index.
   */
  com.google.protobuf.ByteString getEnabledFeaturesBytes(int index);

  /**
   *
   *
   * <pre>
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a SslPolicy. An up-to-date fingerprint must be provided in order to update the SslPolicy, otherwise the request will fail with error 412 conditionNotMet.
   * To see the latest fingerprint, make a get() request to retrieve an SslPolicy.
   * </pre>
   *
   * <code>string fingerprint = 234678500;</code>
   *
   * @return Whether the fingerprint field is set.
   */
  boolean hasFingerprint();
  /**
   *
   *
   * <pre>
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a SslPolicy. An up-to-date fingerprint must be provided in order to update the SslPolicy, otherwise the request will fail with error 412 conditionNotMet.
   * To see the latest fingerprint, make a get() request to retrieve an SslPolicy.
   * </pre>
   *
   * <code>string fingerprint = 234678500;</code>
   *
   * @return The fingerprint.
   */
  java.lang.String getFingerprint();
  /**
   *
   *
   * <pre>
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a SslPolicy. An up-to-date fingerprint must be provided in order to update the SslPolicy, otherwise the request will fail with error 412 conditionNotMet.
   * To see the latest fingerprint, make a get() request to retrieve an SslPolicy.
   * </pre>
   *
   * <code>string fingerprint = 234678500;</code>
   *
   * @return The bytes for fingerprint.
   */
  com.google.protobuf.ByteString getFingerprintBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>uint64 id = 3355;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>uint64 id = 3355;</code>
   *
   * @return The id.
   */
  long getId();

  /**
   *
   *
   * <pre>
   * [Output only] Type of the resource. Always compute#sslPolicyfor SSL policies.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   *
   *
   * <pre>
   * [Output only] Type of the resource. Always compute#sslPolicyfor SSL policies.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * [Output only] Type of the resource. Always compute#sslPolicyfor SSL policies.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * The minimum version of SSL protocol that can be used by the clients to establish a connection with the load balancer. This can be one of TLS_1_0, TLS_1_1, TLS_1_2.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.SslPolicy.MinTlsVersion min_tls_version = 8155943;</code>
   *
   * @return Whether the minTlsVersion field is set.
   */
  boolean hasMinTlsVersion();
  /**
   *
   *
   * <pre>
   * The minimum version of SSL protocol that can be used by the clients to establish a connection with the load balancer. This can be one of TLS_1_0, TLS_1_1, TLS_1_2.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.SslPolicy.MinTlsVersion min_tls_version = 8155943;</code>
   *
   * @return The enum numeric value on the wire for minTlsVersion.
   */
  int getMinTlsVersionValue();
  /**
   *
   *
   * <pre>
   * The minimum version of SSL protocol that can be used by the clients to establish a connection with the load balancer. This can be one of TLS_1_0, TLS_1_1, TLS_1_2.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.SslPolicy.MinTlsVersion min_tls_version = 8155943;</code>
   *
   * @return The minTlsVersion.
   */
  com.google.cloud.compute.v1.SslPolicy.MinTlsVersion getMinTlsVersion();

  /**
   *
   *
   * <pre>
   * Name of the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * Name of the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Profile specifies the set of SSL features that can be used by the load balancer when negotiating SSL with clients. This can be one of COMPATIBLE, MODERN, RESTRICTED, or CUSTOM. If using CUSTOM, the set of SSL features to enable must be specified in the customFeatures field.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.SslPolicy.Profile profile = 227445161;</code>
   *
   * @return Whether the profile field is set.
   */
  boolean hasProfile();
  /**
   *
   *
   * <pre>
   * Profile specifies the set of SSL features that can be used by the load balancer when negotiating SSL with clients. This can be one of COMPATIBLE, MODERN, RESTRICTED, or CUSTOM. If using CUSTOM, the set of SSL features to enable must be specified in the customFeatures field.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.SslPolicy.Profile profile = 227445161;</code>
   *
   * @return The enum numeric value on the wire for profile.
   */
  int getProfileValue();
  /**
   *
   *
   * <pre>
   * Profile specifies the set of SSL features that can be used by the load balancer when negotiating SSL with clients. This can be one of COMPATIBLE, MODERN, RESTRICTED, or CUSTOM. If using CUSTOM, the set of SSL features to enable must be specified in the customFeatures field.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.SslPolicy.Profile profile = 227445161;</code>
   *
   * @return The profile.
   */
  com.google.cloud.compute.v1.SslPolicy.Profile getProfile();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>string self_link = 456214797;</code>
   *
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>string self_link = 456214797;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>string self_link = 456214797;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] If potential misconfigurations are detected for this SSL policy, this field will be populated with warning messages.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Warnings warnings = 498091095;</code>
   */
  java.util.List<com.google.cloud.compute.v1.Warnings> getWarningsList();
  /**
   *
   *
   * <pre>
   * [Output Only] If potential misconfigurations are detected for this SSL policy, this field will be populated with warning messages.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Warnings warnings = 498091095;</code>
   */
  com.google.cloud.compute.v1.Warnings getWarnings(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] If potential misconfigurations are detected for this SSL policy, this field will be populated with warning messages.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Warnings warnings = 498091095;</code>
   */
  int getWarningsCount();
  /**
   *
   *
   * <pre>
   * [Output Only] If potential misconfigurations are detected for this SSL policy, this field will be populated with warning messages.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Warnings warnings = 498091095;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.WarningsOrBuilder>
      getWarningsOrBuilderList();
  /**
   *
   *
   * <pre>
   * [Output Only] If potential misconfigurations are detected for this SSL policy, this field will be populated with warning messages.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Warnings warnings = 498091095;</code>
   */
  com.google.cloud.compute.v1.WarningsOrBuilder getWarningsOrBuilder(int index);
}
