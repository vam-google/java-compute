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

public interface MetadataFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.MetadataFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria
   * This list must not be empty and can have at the most 64 entries.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.MetadataFilterLabelMatch filter_labels = 307903142;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.MetadataFilterLabelMatch> getFilterLabelsList();
  /**
   *
   *
   * <pre>
   * The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria
   * This list must not be empty and can have at the most 64 entries.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.MetadataFilterLabelMatch filter_labels = 307903142;
   * </code>
   */
  com.google.cloud.compute.v1.MetadataFilterLabelMatch getFilterLabels(int index);
  /**
   *
   *
   * <pre>
   * The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria
   * This list must not be empty and can have at the most 64 entries.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.MetadataFilterLabelMatch filter_labels = 307903142;
   * </code>
   */
  int getFilterLabelsCount();
  /**
   *
   *
   * <pre>
   * The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria
   * This list must not be empty and can have at the most 64 entries.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.MetadataFilterLabelMatch filter_labels = 307903142;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.MetadataFilterLabelMatchOrBuilder>
      getFilterLabelsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria
   * This list must not be empty and can have at the most 64 entries.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.MetadataFilterLabelMatch filter_labels = 307903142;
   * </code>
   */
  com.google.cloud.compute.v1.MetadataFilterLabelMatchOrBuilder getFilterLabelsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Specifies how individual filterLabel matches within the list of filterLabels contribute towards the overall metadataFilter match.
   * Supported values are:
   * - MATCH_ANY: At least one of the filterLabels must have a matching label in the provided metadata.
   * - MATCH_ALL: All filterLabels must have matching labels in the provided metadata.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.MetadataFilter.FilterMatchCriteria filter_match_criteria = 239970368;
   * </code>
   *
   * @return Whether the filterMatchCriteria field is set.
   */
  boolean hasFilterMatchCriteria();
  /**
   *
   *
   * <pre>
   * Specifies how individual filterLabel matches within the list of filterLabels contribute towards the overall metadataFilter match.
   * Supported values are:
   * - MATCH_ANY: At least one of the filterLabels must have a matching label in the provided metadata.
   * - MATCH_ALL: All filterLabels must have matching labels in the provided metadata.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.MetadataFilter.FilterMatchCriteria filter_match_criteria = 239970368;
   * </code>
   *
   * @return The enum numeric value on the wire for filterMatchCriteria.
   */
  int getFilterMatchCriteriaValue();
  /**
   *
   *
   * <pre>
   * Specifies how individual filterLabel matches within the list of filterLabels contribute towards the overall metadataFilter match.
   * Supported values are:
   * - MATCH_ANY: At least one of the filterLabels must have a matching label in the provided metadata.
   * - MATCH_ALL: All filterLabels must have matching labels in the provided metadata.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.MetadataFilter.FilterMatchCriteria filter_match_criteria = 239970368;
   * </code>
   *
   * @return The filterMatchCriteria.
   */
  com.google.cloud.compute.v1.MetadataFilter.FilterMatchCriteria getFilterMatchCriteria();
}