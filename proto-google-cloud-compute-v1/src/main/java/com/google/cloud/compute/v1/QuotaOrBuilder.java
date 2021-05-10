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

public interface QuotaOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Quota)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] Quota limit for this metric.
   * </pre>
   *
   * <code>double limit = 102976443;</code>
   *
   * @return Whether the limit field is set.
   */
  boolean hasLimit();
  /**
   *
   *
   * <pre>
   * [Output Only] Quota limit for this metric.
   * </pre>
   *
   * <code>double limit = 102976443;</code>
   *
   * @return The limit.
   */
  double getLimit();

  /**
   *
   *
   * <pre>
   * [Output Only] Name of the quota metric.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Quota.Metric metric = 533067184;</code>
   *
   * @return Whether the metric field is set.
   */
  boolean hasMetric();
  /**
   *
   *
   * <pre>
   * [Output Only] Name of the quota metric.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Quota.Metric metric = 533067184;</code>
   *
   * @return The enum numeric value on the wire for metric.
   */
  int getMetricValue();
  /**
   *
   *
   * <pre>
   * [Output Only] Name of the quota metric.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Quota.Metric metric = 533067184;</code>
   *
   * @return The metric.
   */
  com.google.cloud.compute.v1.Quota.Metric getMetric();

  /**
   *
   *
   * <pre>
   * [Output Only] Owning resource. This is the resource on which this quota is applied.
   * </pre>
   *
   * <code>string owner = 106164915;</code>
   *
   * @return Whether the owner field is set.
   */
  boolean hasOwner();
  /**
   *
   *
   * <pre>
   * [Output Only] Owning resource. This is the resource on which this quota is applied.
   * </pre>
   *
   * <code>string owner = 106164915;</code>
   *
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   *
   *
   * <pre>
   * [Output Only] Owning resource. This is the resource on which this quota is applied.
   * </pre>
   *
   * <code>string owner = 106164915;</code>
   *
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString getOwnerBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Current usage of this metric.
   * </pre>
   *
   * <code>double usage = 111574433;</code>
   *
   * @return Whether the usage field is set.
   */
  boolean hasUsage();
  /**
   *
   *
   * <pre>
   * [Output Only] Current usage of this metric.
   * </pre>
   *
   * <code>double usage = 111574433;</code>
   *
   * @return The usage.
   */
  double getUsage();
}
