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

public interface NetworkInterfaceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NetworkInterface)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * An array of configurations for this interface. Currently, only one access config, ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance will have no external internet access.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AccessConfig access_configs = 111058326;</code>
   */
  java.util.List<com.google.cloud.compute.v1.AccessConfig> getAccessConfigsList();
  /**
   *
   *
   * <pre>
   * An array of configurations for this interface. Currently, only one access config, ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance will have no external internet access.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AccessConfig access_configs = 111058326;</code>
   */
  com.google.cloud.compute.v1.AccessConfig getAccessConfigs(int index);
  /**
   *
   *
   * <pre>
   * An array of configurations for this interface. Currently, only one access config, ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance will have no external internet access.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AccessConfig access_configs = 111058326;</code>
   */
  int getAccessConfigsCount();
  /**
   *
   *
   * <pre>
   * An array of configurations for this interface. Currently, only one access config, ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance will have no external internet access.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AccessConfig access_configs = 111058326;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.AccessConfigOrBuilder>
      getAccessConfigsOrBuilderList();
  /**
   *
   *
   * <pre>
   * An array of configurations for this interface. Currently, only one access config, ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance will have no external internet access.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AccessConfig access_configs = 111058326;</code>
   */
  com.google.cloud.compute.v1.AccessConfigOrBuilder getAccessConfigsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * An array of alias IP ranges for this network interface. You can only specify this field for network interfaces in VPC networks.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AliasIpRange alias_ip_ranges = 165085631;</code>
   */
  java.util.List<com.google.cloud.compute.v1.AliasIpRange> getAliasIpRangesList();
  /**
   *
   *
   * <pre>
   * An array of alias IP ranges for this network interface. You can only specify this field for network interfaces in VPC networks.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AliasIpRange alias_ip_ranges = 165085631;</code>
   */
  com.google.cloud.compute.v1.AliasIpRange getAliasIpRanges(int index);
  /**
   *
   *
   * <pre>
   * An array of alias IP ranges for this network interface. You can only specify this field for network interfaces in VPC networks.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AliasIpRange alias_ip_ranges = 165085631;</code>
   */
  int getAliasIpRangesCount();
  /**
   *
   *
   * <pre>
   * An array of alias IP ranges for this network interface. You can only specify this field for network interfaces in VPC networks.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AliasIpRange alias_ip_ranges = 165085631;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.AliasIpRangeOrBuilder>
      getAliasIpRangesOrBuilderList();
  /**
   *
   *
   * <pre>
   * An array of alias IP ranges for this network interface. You can only specify this field for network interfaces in VPC networks.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AliasIpRange alias_ip_ranges = 165085631;</code>
   */
  com.google.cloud.compute.v1.AliasIpRangeOrBuilder getAliasIpRangesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Fingerprint hash of contents stored in this network interface. This field will be ignored when inserting an Instance or adding a NetworkInterface. An up-to-date fingerprint must be provided in order to update the NetworkInterface, otherwise the request will fail with error 412 conditionNotMet.
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
   * Fingerprint hash of contents stored in this network interface. This field will be ignored when inserting an Instance or adding a NetworkInterface. An up-to-date fingerprint must be provided in order to update the NetworkInterface, otherwise the request will fail with error 412 conditionNotMet.
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
   * Fingerprint hash of contents stored in this network interface. This field will be ignored when inserting an Instance or adding a NetworkInterface. An up-to-date fingerprint must be provided in order to update the NetworkInterface, otherwise the request will fail with error 412 conditionNotMet.
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
   * [Output Only] An IPv6 internal network address for this network interface.
   * </pre>
   *
   * <code>string ipv6_address = 341563804;</code>
   *
   * @return Whether the ipv6Address field is set.
   */
  boolean hasIpv6Address();
  /**
   *
   *
   * <pre>
   * [Output Only] An IPv6 internal network address for this network interface.
   * </pre>
   *
   * <code>string ipv6_address = 341563804;</code>
   *
   * @return The ipv6Address.
   */
  java.lang.String getIpv6Address();
  /**
   *
   *
   * <pre>
   * [Output Only] An IPv6 internal network address for this network interface.
   * </pre>
   *
   * <code>string ipv6_address = 341563804;</code>
   *
   * @return The bytes for ipv6Address.
   */
  com.google.protobuf.ByteString getIpv6AddressBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#networkInterface for network interfaces.
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
   * [Output Only] Type of the resource. Always compute#networkInterface for network interfaces.
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
   * [Output Only] Type of the resource. Always compute#networkInterface for network interfaces.
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
   * [Output Only] The name of the network interface, which is generated by the server. For network devices, these are eth0, eth1, etc.
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
   * [Output Only] The name of the network interface, which is generated by the server. For network devices, these are eth0, eth1, etc.
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
   * [Output Only] The name of the network interface, which is generated by the server. For network devices, these are eth0, eth1, etc.
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
   * URL of the network resource for this instance. When creating an instance, if neither the network nor the subnetwork is specified, the default network global/networks/default is used; if the network is not specified but the subnetwork is specified, the network is inferred.
   * If you specify this property, you can specify the network as a full or partial URL. For example, the following are all valid URLs:
   * - https://www.googleapis.com/compute/v1/projects/project/global/networks/network
   * - projects/project/global/networks/network
   * - global/networks/default
   * </pre>
   *
   * <code>string network = 232872494;</code>
   *
   * @return Whether the network field is set.
   */
  boolean hasNetwork();
  /**
   *
   *
   * <pre>
   * URL of the network resource for this instance. When creating an instance, if neither the network nor the subnetwork is specified, the default network global/networks/default is used; if the network is not specified but the subnetwork is specified, the network is inferred.
   * If you specify this property, you can specify the network as a full or partial URL. For example, the following are all valid URLs:
   * - https://www.googleapis.com/compute/v1/projects/project/global/networks/network
   * - projects/project/global/networks/network
   * - global/networks/default
   * </pre>
   *
   * <code>string network = 232872494;</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * URL of the network resource for this instance. When creating an instance, if neither the network nor the subnetwork is specified, the default network global/networks/default is used; if the network is not specified but the subnetwork is specified, the network is inferred.
   * If you specify this property, you can specify the network as a full or partial URL. For example, the following are all valid URLs:
   * - https://www.googleapis.com/compute/v1/projects/project/global/networks/network
   * - projects/project/global/networks/network
   * - global/networks/default
   * </pre>
   *
   * <code>string network = 232872494;</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * An IPv4 internal IP address to assign to the instance for this network interface. If not specified by the user, an unused internal IP is assigned by the system.
   * </pre>
   *
   * <code>string network_i_p = 207181961;</code>
   *
   * @return Whether the networkIP field is set.
   */
  boolean hasNetworkIP();
  /**
   *
   *
   * <pre>
   * An IPv4 internal IP address to assign to the instance for this network interface. If not specified by the user, an unused internal IP is assigned by the system.
   * </pre>
   *
   * <code>string network_i_p = 207181961;</code>
   *
   * @return The networkIP.
   */
  java.lang.String getNetworkIP();
  /**
   *
   *
   * <pre>
   * An IPv4 internal IP address to assign to the instance for this network interface. If not specified by the user, an unused internal IP is assigned by the system.
   * </pre>
   *
   * <code>string network_i_p = 207181961;</code>
   *
   * @return The bytes for networkIP.
   */
  com.google.protobuf.ByteString getNetworkIPBytes();

  /**
   *
   *
   * <pre>
   * The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.NetworkInterface.NicType nic_type = 59810577;</code>
   *
   * @return Whether the nicType field is set.
   */
  boolean hasNicType();
  /**
   *
   *
   * <pre>
   * The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.NetworkInterface.NicType nic_type = 59810577;</code>
   *
   * @return The enum numeric value on the wire for nicType.
   */
  int getNicTypeValue();
  /**
   *
   *
   * <pre>
   * The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.NetworkInterface.NicType nic_type = 59810577;</code>
   *
   * @return The nicType.
   */
  com.google.cloud.compute.v1.NetworkInterface.NicType getNicType();

  /**
   *
   *
   * <pre>
   * The URL of the Subnetwork resource for this instance. If the network resource is in legacy mode, do not specify this field. If the network is in auto subnet mode, specifying the subnetwork is optional. If the network is in custom subnet mode, specifying the subnetwork is required. If you specify this field, you can specify the subnetwork as a full or partial URL. For example, the following are all valid URLs:
   * - https://www.googleapis.com/compute/v1/projects/project/regions/region/subnetworks/subnetwork
   * - regions/region/subnetworks/subnetwork
   * </pre>
   *
   * <code>string subnetwork = 307827694;</code>
   *
   * @return Whether the subnetwork field is set.
   */
  boolean hasSubnetwork();
  /**
   *
   *
   * <pre>
   * The URL of the Subnetwork resource for this instance. If the network resource is in legacy mode, do not specify this field. If the network is in auto subnet mode, specifying the subnetwork is optional. If the network is in custom subnet mode, specifying the subnetwork is required. If you specify this field, you can specify the subnetwork as a full or partial URL. For example, the following are all valid URLs:
   * - https://www.googleapis.com/compute/v1/projects/project/regions/region/subnetworks/subnetwork
   * - regions/region/subnetworks/subnetwork
   * </pre>
   *
   * <code>string subnetwork = 307827694;</code>
   *
   * @return The subnetwork.
   */
  java.lang.String getSubnetwork();
  /**
   *
   *
   * <pre>
   * The URL of the Subnetwork resource for this instance. If the network resource is in legacy mode, do not specify this field. If the network is in auto subnet mode, specifying the subnetwork is optional. If the network is in custom subnet mode, specifying the subnetwork is required. If you specify this field, you can specify the subnetwork as a full or partial URL. For example, the following are all valid URLs:
   * - https://www.googleapis.com/compute/v1/projects/project/regions/region/subnetworks/subnetwork
   * - regions/region/subnetworks/subnetwork
   * </pre>
   *
   * <code>string subnetwork = 307827694;</code>
   *
   * @return The bytes for subnetwork.
   */
  com.google.protobuf.ByteString getSubnetworkBytes();
}
