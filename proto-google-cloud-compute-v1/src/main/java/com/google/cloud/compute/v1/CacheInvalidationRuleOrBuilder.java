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

public interface CacheInvalidationRuleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.CacheInvalidationRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * If set, this invalidation rule will only apply to requests with a Host header matching host.
   * </pre>
   *
   * <code>string host = 3208616;</code>
   *
   * @return Whether the host field is set.
   */
  boolean hasHost();
  /**
   *
   *
   * <pre>
   * If set, this invalidation rule will only apply to requests with a Host header matching host.
   * </pre>
   *
   * <code>string host = 3208616;</code>
   *
   * @return The host.
   */
  java.lang.String getHost();
  /**
   *
   *
   * <pre>
   * If set, this invalidation rule will only apply to requests with a Host header matching host.
   * </pre>
   *
   * <code>string host = 3208616;</code>
   *
   * @return The bytes for host.
   */
  com.google.protobuf.ByteString getHostBytes();

  /**
   * <code>string path = 3433509;</code>
   *
   * @return Whether the path field is set.
   */
  boolean hasPath();
  /**
   * <code>string path = 3433509;</code>
   *
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <code>string path = 3433509;</code>
   *
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString getPathBytes();
}
