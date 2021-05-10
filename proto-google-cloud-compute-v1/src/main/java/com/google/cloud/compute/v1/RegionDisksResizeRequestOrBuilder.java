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

public interface RegionDisksResizeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RegionDisksResizeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The new size of the regional persistent disk, which is specified in GB.
   * </pre>
   *
   * <code>string size_gb = 494929369;</code>
   *
   * @return Whether the sizeGb field is set.
   */
  boolean hasSizeGb();
  /**
   *
   *
   * <pre>
   * The new size of the regional persistent disk, which is specified in GB.
   * </pre>
   *
   * <code>string size_gb = 494929369;</code>
   *
   * @return The sizeGb.
   */
  java.lang.String getSizeGb();
  /**
   *
   *
   * <pre>
   * The new size of the regional persistent disk, which is specified in GB.
   * </pre>
   *
   * <code>string size_gb = 494929369;</code>
   *
   * @return The bytes for sizeGb.
   */
  com.google.protobuf.ByteString getSizeGbBytes();
}
