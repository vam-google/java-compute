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

public interface DeleteGlobalOrganizationOperationRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.DeleteGlobalOrganizationOperationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the Operations resource to delete.
   * </pre>
   *
   * <code>string operation = 52090215 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The operation.
   */
  java.lang.String getOperation();
  /**
   *
   *
   * <pre>
   * Name of the Operations resource to delete.
   * </pre>
   *
   * <code>string operation = 52090215 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for operation.
   */
  com.google.protobuf.ByteString getOperationBytes();

  /**
   *
   *
   * <pre>
   * Parent ID for this request.
   * </pre>
   *
   * <code>string parent_id = 459714768;</code>
   *
   * @return Whether the parentId field is set.
   */
  boolean hasParentId();
  /**
   *
   *
   * <pre>
   * Parent ID for this request.
   * </pre>
   *
   * <code>string parent_id = 459714768;</code>
   *
   * @return The parentId.
   */
  java.lang.String getParentId();
  /**
   *
   *
   * <pre>
   * Parent ID for this request.
   * </pre>
   *
   * <code>string parent_id = 459714768;</code>
   *
   * @return The bytes for parentId.
   */
  com.google.protobuf.ByteString getParentIdBytes();
}
