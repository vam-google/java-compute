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

public interface BackendServiceFailoverPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.BackendServiceFailoverPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * This can be set to true only if the protocol is TCP.
   * The default is false.
   * </pre>
   *
   * <code>bool disable_connection_drain_on_failover = 182150753;</code>
   *
   * @return Whether the disableConnectionDrainOnFailover field is set.
   */
  boolean hasDisableConnectionDrainOnFailover();
  /**
   *
   *
   * <pre>
   * This can be set to true only if the protocol is TCP.
   * The default is false.
   * </pre>
   *
   * <code>bool disable_connection_drain_on_failover = 182150753;</code>
   *
   * @return The disableConnectionDrainOnFailover.
   */
  boolean getDisableConnectionDrainOnFailover();

  /**
   *
   *
   * <pre>
   * Applicable only to Failover for Internal TCP/UDP Load Balancing and Network Load Balancing, If set to true, connections to the load balancer are dropped when all primary and all backup backend VMs are unhealthy.If set to false, connections are distributed among all primary VMs when all primary and all backup backend VMs are unhealthy. The default is false.
   * </pre>
   *
   * <code>bool drop_traffic_if_unhealthy = 112289428;</code>
   *
   * @return Whether the dropTrafficIfUnhealthy field is set.
   */
  boolean hasDropTrafficIfUnhealthy();
  /**
   *
   *
   * <pre>
   * Applicable only to Failover for Internal TCP/UDP Load Balancing and Network Load Balancing, If set to true, connections to the load balancer are dropped when all primary and all backup backend VMs are unhealthy.If set to false, connections are distributed among all primary VMs when all primary and all backup backend VMs are unhealthy. The default is false.
   * </pre>
   *
   * <code>bool drop_traffic_if_unhealthy = 112289428;</code>
   *
   * @return The dropTrafficIfUnhealthy.
   */
  boolean getDropTrafficIfUnhealthy();

  /**
   *
   *
   * <pre>
   * Applicable only to Failover for Internal TCP/UDP Load Balancing and Network Load Balancing. The value of the field must be in the range [0, 1]. If the value is 0, the load balancer performs a failover when the number of healthy primary VMs equals zero. For all other values, the load balancer performs a failover when the total number of healthy primary VMs is less than this ratio.
   * </pre>
   *
   * <code>float failover_ratio = 212667006;</code>
   *
   * @return Whether the failoverRatio field is set.
   */
  boolean hasFailoverRatio();
  /**
   *
   *
   * <pre>
   * Applicable only to Failover for Internal TCP/UDP Load Balancing and Network Load Balancing. The value of the field must be in the range [0, 1]. If the value is 0, the load balancer performs a failover when the number of healthy primary VMs equals zero. For all other values, the load balancer performs a failover when the total number of healthy primary VMs is less than this ratio.
   * </pre>
   *
   * <code>float failover_ratio = 212667006;</code>
   *
   * @return The failoverRatio.
   */
  float getFailoverRatio();
}
