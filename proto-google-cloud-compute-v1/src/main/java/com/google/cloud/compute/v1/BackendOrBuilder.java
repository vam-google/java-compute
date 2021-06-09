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

public interface BackendOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Backend)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specifies how to determine whether the backend of a load balancer can handle additional traffic or is fully loaded. For usage guidelines, see  Connection balancing mode.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Backend.BalancingMode balancing_mode = 430286217;</code>
   *
   * @return Whether the balancingMode field is set.
   */
  boolean hasBalancingMode();
  /**
   *
   *
   * <pre>
   * Specifies how to determine whether the backend of a load balancer can handle additional traffic or is fully loaded. For usage guidelines, see  Connection balancing mode.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Backend.BalancingMode balancing_mode = 430286217;</code>
   *
   * @return The enum numeric value on the wire for balancingMode.
   */
  int getBalancingModeValue();
  /**
   *
   *
   * <pre>
   * Specifies how to determine whether the backend of a load balancer can handle additional traffic or is fully loaded. For usage guidelines, see  Connection balancing mode.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Backend.BalancingMode balancing_mode = 430286217;</code>
   *
   * @return The balancingMode.
   */
  com.google.cloud.compute.v1.Backend.BalancingMode getBalancingMode();

  /**
   *
   *
   * <pre>
   * A multiplier applied to the backend's target capacity of its balancing mode. The default value is 1, which means the group serves up to 100% of its configured capacity (depending on balancingMode). A setting of 0 means the group is completely drained, offering 0% of its available capacity. The valid ranges are 0.0 and [0.1,1.0]. You cannot configure a setting larger than 0 and smaller than 0.1. You cannot configure a setting of 0 when there is only one backend attached to the backend service.
   * Not supported by:
   * - Internal TCP/UDP Load Balancing - Network Load Balancing
   * </pre>
   *
   * <code>float capacity_scaler = 315958157;</code>
   *
   * @return Whether the capacityScaler field is set.
   */
  boolean hasCapacityScaler();
  /**
   *
   *
   * <pre>
   * A multiplier applied to the backend's target capacity of its balancing mode. The default value is 1, which means the group serves up to 100% of its configured capacity (depending on balancingMode). A setting of 0 means the group is completely drained, offering 0% of its available capacity. The valid ranges are 0.0 and [0.1,1.0]. You cannot configure a setting larger than 0 and smaller than 0.1. You cannot configure a setting of 0 when there is only one backend attached to the backend service.
   * Not supported by:
   * - Internal TCP/UDP Load Balancing - Network Load Balancing
   * </pre>
   *
   * <code>float capacity_scaler = 315958157;</code>
   *
   * @return The capacityScaler.
   */
  float getCapacityScaler();

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
   * This field designates whether this is a failover backend. More than one failover backend can be configured for a given BackendService.
   * </pre>
   *
   * <code>bool failover = 138892530;</code>
   *
   * @return Whether the failover field is set.
   */
  boolean hasFailover();
  /**
   *
   *
   * <pre>
   * This field designates whether this is a failover backend. More than one failover backend can be configured for a given BackendService.
   * </pre>
   *
   * <code>bool failover = 138892530;</code>
   *
   * @return The failover.
   */
  boolean getFailover();

  /**
   *
   *
   * <pre>
   * The fully-qualified URL of an instance group or network endpoint group (NEG) resource. The type of backend that a backend service supports depends on the backend service's loadBalancingScheme.
   * - When the loadBalancingScheme for the backend service is EXTERNAL (except Network Load Balancing),  INTERNAL_SELF_MANAGED, or INTERNAL_MANAGED , the backend can be either an instance group or a NEG. The backends on the backend service must be either all instance groups or all NEGs. You cannot mix instance group and NEG backends on the same backend service.
   * - When the loadBalancingScheme for the backend service is EXTERNAL for Network Load Balancing or INTERNAL for Internal TCP/UDP Load Balancing, the backend must be an instance group. NEGs are not supported.
   * For regional services, the backend must be in the same region as the backend service.
   * You must use the fully-qualified URL (starting with https://www.googleapis.com/) to specify the instance group or NEG. Partial URLs are not supported.
   * </pre>
   *
   * <code>string group = 98629247;</code>
   *
   * @return Whether the group field is set.
   */
  boolean hasGroup();
  /**
   *
   *
   * <pre>
   * The fully-qualified URL of an instance group or network endpoint group (NEG) resource. The type of backend that a backend service supports depends on the backend service's loadBalancingScheme.
   * - When the loadBalancingScheme for the backend service is EXTERNAL (except Network Load Balancing),  INTERNAL_SELF_MANAGED, or INTERNAL_MANAGED , the backend can be either an instance group or a NEG. The backends on the backend service must be either all instance groups or all NEGs. You cannot mix instance group and NEG backends on the same backend service.
   * - When the loadBalancingScheme for the backend service is EXTERNAL for Network Load Balancing or INTERNAL for Internal TCP/UDP Load Balancing, the backend must be an instance group. NEGs are not supported.
   * For regional services, the backend must be in the same region as the backend service.
   * You must use the fully-qualified URL (starting with https://www.googleapis.com/) to specify the instance group or NEG. Partial URLs are not supported.
   * </pre>
   *
   * <code>string group = 98629247;</code>
   *
   * @return The group.
   */
  java.lang.String getGroup();
  /**
   *
   *
   * <pre>
   * The fully-qualified URL of an instance group or network endpoint group (NEG) resource. The type of backend that a backend service supports depends on the backend service's loadBalancingScheme.
   * - When the loadBalancingScheme for the backend service is EXTERNAL (except Network Load Balancing),  INTERNAL_SELF_MANAGED, or INTERNAL_MANAGED , the backend can be either an instance group or a NEG. The backends on the backend service must be either all instance groups or all NEGs. You cannot mix instance group and NEG backends on the same backend service.
   * - When the loadBalancingScheme for the backend service is EXTERNAL for Network Load Balancing or INTERNAL for Internal TCP/UDP Load Balancing, the backend must be an instance group. NEGs are not supported.
   * For regional services, the backend must be in the same region as the backend service.
   * You must use the fully-qualified URL (starting with https://www.googleapis.com/) to specify the instance group or NEG. Partial URLs are not supported.
   * </pre>
   *
   * <code>string group = 98629247;</code>
   *
   * @return The bytes for group.
   */
  com.google.protobuf.ByteString getGroupBytes();

  /**
   *
   *
   * <pre>
   * Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is RATE. Not supported by:
   * - Internal TCP/UDP Load Balancing - Network Load Balancing
   * </pre>
   *
   * <code>int32 max_connections = 110652154;</code>
   *
   * @return Whether the maxConnections field is set.
   */
  boolean hasMaxConnections();
  /**
   *
   *
   * <pre>
   * Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is RATE. Not supported by:
   * - Internal TCP/UDP Load Balancing - Network Load Balancing
   * </pre>
   *
   * <code>int32 max_connections = 110652154;</code>
   *
   * @return The maxConnections.
   */
  int getMaxConnections();

  /**
   *
   *
   * <pre>
   * Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode.
   * Not available if the backend's balancingMode is RATE. Not supported by:
   * - Internal TCP/UDP Load Balancing - Network Load Balancing.
   * </pre>
   *
   * <code>int32 max_connections_per_endpoint = 216904604;</code>
   *
   * @return Whether the maxConnectionsPerEndpoint field is set.
   */
  boolean hasMaxConnectionsPerEndpoint();
  /**
   *
   *
   * <pre>
   * Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode.
   * Not available if the backend's balancingMode is RATE. Not supported by:
   * - Internal TCP/UDP Load Balancing - Network Load Balancing.
   * </pre>
   *
   * <code>int32 max_connections_per_endpoint = 216904604;</code>
   *
   * @return The maxConnectionsPerEndpoint.
   */
  int getMaxConnectionsPerEndpoint();

  /**
   *
   *
   * <pre>
   * Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode.
   * Not available if the backend's balancingMode is RATE. Not supported by:
   * - Internal TCP/UDP Load Balancing - Network Load Balancing.
   * </pre>
   *
   * <code>int32 max_connections_per_instance = 104671900;</code>
   *
   * @return Whether the maxConnectionsPerInstance field is set.
   */
  boolean hasMaxConnectionsPerInstance();
  /**
   *
   *
   * <pre>
   * Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode.
   * Not available if the backend's balancingMode is RATE. Not supported by:
   * - Internal TCP/UDP Load Balancing - Network Load Balancing.
   * </pre>
   *
   * <code>int32 max_connections_per_instance = 104671900;</code>
   *
   * @return The maxConnectionsPerInstance.
   */
  int getMaxConnectionsPerInstance();

  /**
   *
   *
   * <pre>
   * Defines a maximum number of HTTP requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode.
   * Not available if the backend's balancingMode is CONNECTION.
   * </pre>
   *
   * <code>int32 max_rate = 408035035;</code>
   *
   * @return Whether the maxRate field is set.
   */
  boolean hasMaxRate();
  /**
   *
   *
   * <pre>
   * Defines a maximum number of HTTP requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode.
   * Not available if the backend's balancingMode is CONNECTION.
   * </pre>
   *
   * <code>int32 max_rate = 408035035;</code>
   *
   * @return The maxRate.
   */
  int getMaxRate();

  /**
   *
   *
   * <pre>
   * Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode.
   * Not available if the backend's balancingMode is CONNECTION.
   * </pre>
   *
   * <code>float max_rate_per_endpoint = 129832283;</code>
   *
   * @return Whether the maxRatePerEndpoint field is set.
   */
  boolean hasMaxRatePerEndpoint();
  /**
   *
   *
   * <pre>
   * Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode.
   * Not available if the backend's balancingMode is CONNECTION.
   * </pre>
   *
   * <code>float max_rate_per_endpoint = 129832283;</code>
   *
   * @return The maxRatePerEndpoint.
   */
  float getMaxRatePerEndpoint();

  /**
   *
   *
   * <pre>
   * Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode.
   * Not available if the backend's balancingMode is CONNECTION.
   * </pre>
   *
   * <code>float max_rate_per_instance = 17599579;</code>
   *
   * @return Whether the maxRatePerInstance field is set.
   */
  boolean hasMaxRatePerInstance();
  /**
   *
   *
   * <pre>
   * Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode.
   * Not available if the backend's balancingMode is CONNECTION.
   * </pre>
   *
   * <code>float max_rate_per_instance = 17599579;</code>
   *
   * @return The maxRatePerInstance.
   */
  float getMaxRatePerInstance();

  /**
   * <code>float max_utilization = 148192199;</code>
   *
   * @return Whether the maxUtilization field is set.
   */
  boolean hasMaxUtilization();
  /**
   * <code>float max_utilization = 148192199;</code>
   *
   * @return The maxUtilization.
   */
  float getMaxUtilization();
}