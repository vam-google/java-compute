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

public interface LogConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.LogConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Cloud audit options.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.LogConfigCloudAuditOptions cloud_audit = 412852561;</code>
   *
   * @return Whether the cloudAudit field is set.
   */
  boolean hasCloudAudit();
  /**
   *
   *
   * <pre>
   * Cloud audit options.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.LogConfigCloudAuditOptions cloud_audit = 412852561;</code>
   *
   * @return The cloudAudit.
   */
  com.google.cloud.compute.v1.LogConfigCloudAuditOptions getCloudAudit();
  /**
   *
   *
   * <pre>
   * Cloud audit options.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.LogConfigCloudAuditOptions cloud_audit = 412852561;</code>
   */
  com.google.cloud.compute.v1.LogConfigCloudAuditOptionsOrBuilder getCloudAuditOrBuilder();

  /**
   *
   *
   * <pre>
   * Counter options.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.LogConfigCounterOptions counter = 420959740;</code>
   *
   * @return Whether the counter field is set.
   */
  boolean hasCounter();
  /**
   *
   *
   * <pre>
   * Counter options.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.LogConfigCounterOptions counter = 420959740;</code>
   *
   * @return The counter.
   */
  com.google.cloud.compute.v1.LogConfigCounterOptions getCounter();
  /**
   *
   *
   * <pre>
   * Counter options.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.LogConfigCounterOptions counter = 420959740;</code>
   */
  com.google.cloud.compute.v1.LogConfigCounterOptionsOrBuilder getCounterOrBuilder();

  /**
   *
   *
   * <pre>
   * Data access options.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.LogConfigDataAccessOptions data_access = 286633881;</code>
   *
   * @return Whether the dataAccess field is set.
   */
  boolean hasDataAccess();
  /**
   *
   *
   * <pre>
   * Data access options.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.LogConfigDataAccessOptions data_access = 286633881;</code>
   *
   * @return The dataAccess.
   */
  com.google.cloud.compute.v1.LogConfigDataAccessOptions getDataAccess();
  /**
   *
   *
   * <pre>
   * Data access options.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.LogConfigDataAccessOptions data_access = 286633881;</code>
   */
  com.google.cloud.compute.v1.LogConfigDataAccessOptionsOrBuilder getDataAccessOrBuilder();
}
