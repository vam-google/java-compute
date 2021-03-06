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

public interface RouterNatOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RouterNat)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT only.
   * </pre>
   *
   * <code>repeated string drain_nat_ips = 504078535;</code>
   *
   * @return A list containing the drainNatIps.
   */
  java.util.List<java.lang.String> getDrainNatIpsList();
  /**
   *
   *
   * <pre>
   * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT only.
   * </pre>
   *
   * <code>repeated string drain_nat_ips = 504078535;</code>
   *
   * @return The count of drainNatIps.
   */
  int getDrainNatIpsCount();
  /**
   *
   *
   * <pre>
   * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT only.
   * </pre>
   *
   * <code>repeated string drain_nat_ips = 504078535;</code>
   *
   * @param index The index of the element to return.
   * @return The drainNatIps at the given index.
   */
  java.lang.String getDrainNatIps(int index);
  /**
   *
   *
   * <pre>
   * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT only.
   * </pre>
   *
   * <code>repeated string drain_nat_ips = 504078535;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the drainNatIps at the given index.
   */
  com.google.protobuf.ByteString getDrainNatIpsBytes(int index);

  /**
   * <code>bool enable_endpoint_independent_mapping = 259441819;</code>
   *
   * @return Whether the enableEndpointIndependentMapping field is set.
   */
  boolean hasEnableEndpointIndependentMapping();
  /**
   * <code>bool enable_endpoint_independent_mapping = 259441819;</code>
   *
   * @return The enableEndpointIndependentMapping.
   */
  boolean getEnableEndpointIndependentMapping();

  /**
   *
   *
   * <pre>
   * Timeout (in seconds) for ICMP connections. Defaults to 30s if not set.
   * </pre>
   *
   * <code>int32 icmp_idle_timeout_sec = 3647562;</code>
   *
   * @return Whether the icmpIdleTimeoutSec field is set.
   */
  boolean hasIcmpIdleTimeoutSec();
  /**
   *
   *
   * <pre>
   * Timeout (in seconds) for ICMP connections. Defaults to 30s if not set.
   * </pre>
   *
   * <code>int32 icmp_idle_timeout_sec = 3647562;</code>
   *
   * @return The icmpIdleTimeoutSec.
   */
  int getIcmpIdleTimeoutSec();

  /**
   *
   *
   * <pre>
   * Configure logging on this NAT.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RouterNatLogConfig log_config = 351299741;</code>
   *
   * @return Whether the logConfig field is set.
   */
  boolean hasLogConfig();
  /**
   *
   *
   * <pre>
   * Configure logging on this NAT.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RouterNatLogConfig log_config = 351299741;</code>
   *
   * @return The logConfig.
   */
  com.google.cloud.compute.v1.RouterNatLogConfig getLogConfig();
  /**
   *
   *
   * <pre>
   * Configure logging on this NAT.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RouterNatLogConfig log_config = 351299741;</code>
   */
  com.google.cloud.compute.v1.RouterNatLogConfigOrBuilder getLogConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Minimum number of ports allocated to a VM from this NAT config. If not set, a default number of ports is allocated to a VM. This is rounded up to the nearest power of 2. For example, if the value of this field is 50, at least 64 ports are allocated to a VM.
   * </pre>
   *
   * <code>int32 min_ports_per_vm = 186193587;</code>
   *
   * @return Whether the minPortsPerVm field is set.
   */
  boolean hasMinPortsPerVm();
  /**
   *
   *
   * <pre>
   * Minimum number of ports allocated to a VM from this NAT config. If not set, a default number of ports is allocated to a VM. This is rounded up to the nearest power of 2. For example, if the value of this field is 50, at least 64 ports are allocated to a VM.
   * </pre>
   *
   * <code>int32 min_ports_per_vm = 186193587;</code>
   *
   * @return The minPortsPerVm.
   */
  int getMinPortsPerVm();

  /**
   *
   *
   * <pre>
   * Unique name of this Nat service. The name must be 1-63 characters long and comply with RFC1035.
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
   * Unique name of this Nat service. The name must be 1-63 characters long and comply with RFC1035.
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
   * Unique name of this Nat service. The name must be 1-63 characters long and comply with RFC1035.
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
   * Specify the NatIpAllocateOption, which can take one of the following values:
   * - MANUAL_ONLY: Uses only Nat IP addresses provided by customers. When there are not enough specified Nat IPs, the Nat service fails for new VMs.
   * - AUTO_ONLY: Nat IPs are allocated by Google Cloud Platform; customers can't specify any Nat IPs. When choosing AUTO_ONLY, then nat_ip should be empty.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.RouterNat.NatIpAllocateOption nat_ip_allocate_option = 429726845;
   * </code>
   *
   * @return Whether the natIpAllocateOption field is set.
   */
  boolean hasNatIpAllocateOption();
  /**
   *
   *
   * <pre>
   * Specify the NatIpAllocateOption, which can take one of the following values:
   * - MANUAL_ONLY: Uses only Nat IP addresses provided by customers. When there are not enough specified Nat IPs, the Nat service fails for new VMs.
   * - AUTO_ONLY: Nat IPs are allocated by Google Cloud Platform; customers can't specify any Nat IPs. When choosing AUTO_ONLY, then nat_ip should be empty.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.RouterNat.NatIpAllocateOption nat_ip_allocate_option = 429726845;
   * </code>
   *
   * @return The enum numeric value on the wire for natIpAllocateOption.
   */
  int getNatIpAllocateOptionValue();
  /**
   *
   *
   * <pre>
   * Specify the NatIpAllocateOption, which can take one of the following values:
   * - MANUAL_ONLY: Uses only Nat IP addresses provided by customers. When there are not enough specified Nat IPs, the Nat service fails for new VMs.
   * - AUTO_ONLY: Nat IPs are allocated by Google Cloud Platform; customers can't specify any Nat IPs. When choosing AUTO_ONLY, then nat_ip should be empty.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.RouterNat.NatIpAllocateOption nat_ip_allocate_option = 429726845;
   * </code>
   *
   * @return The natIpAllocateOption.
   */
  com.google.cloud.compute.v1.RouterNat.NatIpAllocateOption getNatIpAllocateOption();

  /**
   *
   *
   * <pre>
   * A list of URLs of the IP resources used for this Nat service. These IP addresses must be valid static external IP addresses assigned to the project.
   * </pre>
   *
   * <code>repeated string nat_ips = 117635086;</code>
   *
   * @return A list containing the natIps.
   */
  java.util.List<java.lang.String> getNatIpsList();
  /**
   *
   *
   * <pre>
   * A list of URLs of the IP resources used for this Nat service. These IP addresses must be valid static external IP addresses assigned to the project.
   * </pre>
   *
   * <code>repeated string nat_ips = 117635086;</code>
   *
   * @return The count of natIps.
   */
  int getNatIpsCount();
  /**
   *
   *
   * <pre>
   * A list of URLs of the IP resources used for this Nat service. These IP addresses must be valid static external IP addresses assigned to the project.
   * </pre>
   *
   * <code>repeated string nat_ips = 117635086;</code>
   *
   * @param index The index of the element to return.
   * @return The natIps at the given index.
   */
  java.lang.String getNatIps(int index);
  /**
   *
   *
   * <pre>
   * A list of URLs of the IP resources used for this Nat service. These IP addresses must be valid static external IP addresses assigned to the project.
   * </pre>
   *
   * <code>repeated string nat_ips = 117635086;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the natIps at the given index.
   */
  com.google.protobuf.ByteString getNatIpsBytes(int index);

  /**
   *
   *
   * <pre>
   * Specify the Nat option, which can take one of the following values:
   * - ALL_SUBNETWORKS_ALL_IP_RANGES: All of the IP ranges in every Subnetwork are allowed to Nat.
   * - ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES: All of the primary IP ranges in every Subnetwork are allowed to Nat.
   * - LIST_OF_SUBNETWORKS: A list of Subnetworks are allowed to Nat (specified in the field subnetwork below) The default is SUBNETWORK_IP_RANGE_TO_NAT_OPTION_UNSPECIFIED. Note that if this field contains ALL_SUBNETWORKS_ALL_IP_RANGES or ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES, then there should not be any other Router.Nat section in any Router for this network in this region.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.RouterNat.SourceSubnetworkIpRangesToNat source_subnetwork_ip_ranges_to_nat = 252213211;
   * </code>
   *
   * @return Whether the sourceSubnetworkIpRangesToNat field is set.
   */
  boolean hasSourceSubnetworkIpRangesToNat();
  /**
   *
   *
   * <pre>
   * Specify the Nat option, which can take one of the following values:
   * - ALL_SUBNETWORKS_ALL_IP_RANGES: All of the IP ranges in every Subnetwork are allowed to Nat.
   * - ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES: All of the primary IP ranges in every Subnetwork are allowed to Nat.
   * - LIST_OF_SUBNETWORKS: A list of Subnetworks are allowed to Nat (specified in the field subnetwork below) The default is SUBNETWORK_IP_RANGE_TO_NAT_OPTION_UNSPECIFIED. Note that if this field contains ALL_SUBNETWORKS_ALL_IP_RANGES or ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES, then there should not be any other Router.Nat section in any Router for this network in this region.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.RouterNat.SourceSubnetworkIpRangesToNat source_subnetwork_ip_ranges_to_nat = 252213211;
   * </code>
   *
   * @return The enum numeric value on the wire for sourceSubnetworkIpRangesToNat.
   */
  int getSourceSubnetworkIpRangesToNatValue();
  /**
   *
   *
   * <pre>
   * Specify the Nat option, which can take one of the following values:
   * - ALL_SUBNETWORKS_ALL_IP_RANGES: All of the IP ranges in every Subnetwork are allowed to Nat.
   * - ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES: All of the primary IP ranges in every Subnetwork are allowed to Nat.
   * - LIST_OF_SUBNETWORKS: A list of Subnetworks are allowed to Nat (specified in the field subnetwork below) The default is SUBNETWORK_IP_RANGE_TO_NAT_OPTION_UNSPECIFIED. Note that if this field contains ALL_SUBNETWORKS_ALL_IP_RANGES or ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES, then there should not be any other Router.Nat section in any Router for this network in this region.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.RouterNat.SourceSubnetworkIpRangesToNat source_subnetwork_ip_ranges_to_nat = 252213211;
   * </code>
   *
   * @return The sourceSubnetworkIpRangesToNat.
   */
  com.google.cloud.compute.v1.RouterNat.SourceSubnetworkIpRangesToNat
      getSourceSubnetworkIpRangesToNat();

  /**
   *
   *
   * <pre>
   * A list of Subnetwork resources whose traffic should be translated by NAT Gateway. It is used only when LIST_OF_SUBNETWORKS is selected for the SubnetworkIpRangeToNatOption above.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.RouterNatSubnetworkToNat subnetworks = 415853125;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.RouterNatSubnetworkToNat> getSubnetworksList();
  /**
   *
   *
   * <pre>
   * A list of Subnetwork resources whose traffic should be translated by NAT Gateway. It is used only when LIST_OF_SUBNETWORKS is selected for the SubnetworkIpRangeToNatOption above.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.RouterNatSubnetworkToNat subnetworks = 415853125;
   * </code>
   */
  com.google.cloud.compute.v1.RouterNatSubnetworkToNat getSubnetworks(int index);
  /**
   *
   *
   * <pre>
   * A list of Subnetwork resources whose traffic should be translated by NAT Gateway. It is used only when LIST_OF_SUBNETWORKS is selected for the SubnetworkIpRangeToNatOption above.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.RouterNatSubnetworkToNat subnetworks = 415853125;
   * </code>
   */
  int getSubnetworksCount();
  /**
   *
   *
   * <pre>
   * A list of Subnetwork resources whose traffic should be translated by NAT Gateway. It is used only when LIST_OF_SUBNETWORKS is selected for the SubnetworkIpRangeToNatOption above.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.RouterNatSubnetworkToNat subnetworks = 415853125;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.RouterNatSubnetworkToNatOrBuilder>
      getSubnetworksOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of Subnetwork resources whose traffic should be translated by NAT Gateway. It is used only when LIST_OF_SUBNETWORKS is selected for the SubnetworkIpRangeToNatOption above.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.RouterNatSubnetworkToNat subnetworks = 415853125;
   * </code>
   */
  com.google.cloud.compute.v1.RouterNatSubnetworkToNatOrBuilder getSubnetworksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Timeout (in seconds) for TCP established connections. Defaults to 1200s if not set.
   * </pre>
   *
   * <code>int32 tcp_established_idle_timeout_sec = 223098349;</code>
   *
   * @return Whether the tcpEstablishedIdleTimeoutSec field is set.
   */
  boolean hasTcpEstablishedIdleTimeoutSec();
  /**
   *
   *
   * <pre>
   * Timeout (in seconds) for TCP established connections. Defaults to 1200s if not set.
   * </pre>
   *
   * <code>int32 tcp_established_idle_timeout_sec = 223098349;</code>
   *
   * @return The tcpEstablishedIdleTimeoutSec.
   */
  int getTcpEstablishedIdleTimeoutSec();

  /**
   *
   *
   * <pre>
   * Timeout (in seconds) for TCP transitory connections. Defaults to 30s if not set.
   * </pre>
   *
   * <code>int32 tcp_transitory_idle_timeout_sec = 205028774;</code>
   *
   * @return Whether the tcpTransitoryIdleTimeoutSec field is set.
   */
  boolean hasTcpTransitoryIdleTimeoutSec();
  /**
   *
   *
   * <pre>
   * Timeout (in seconds) for TCP transitory connections. Defaults to 30s if not set.
   * </pre>
   *
   * <code>int32 tcp_transitory_idle_timeout_sec = 205028774;</code>
   *
   * @return The tcpTransitoryIdleTimeoutSec.
   */
  int getTcpTransitoryIdleTimeoutSec();

  /**
   *
   *
   * <pre>
   * Timeout (in seconds) for UDP connections. Defaults to 30s if not set.
   * </pre>
   *
   * <code>int32 udp_idle_timeout_sec = 64919878;</code>
   *
   * @return Whether the udpIdleTimeoutSec field is set.
   */
  boolean hasUdpIdleTimeoutSec();
  /**
   *
   *
   * <pre>
   * Timeout (in seconds) for UDP connections. Defaults to 30s if not set.
   * </pre>
   *
   * <code>int32 udp_idle_timeout_sec = 64919878;</code>
   *
   * @return The udpIdleTimeoutSec.
   */
  int getUdpIdleTimeoutSec();
}
