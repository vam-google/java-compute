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

public interface RuleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Rule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Rule.Action action = 187661878;</code>
   *
   * @return Whether the action field is set.
   */
  boolean hasAction();
  /**
   *
   *
   * <pre>
   * Required
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Rule.Action action = 187661878;</code>
   *
   * @return The enum numeric value on the wire for action.
   */
  int getActionValue();
  /**
   *
   *
   * <pre>
   * Required
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Rule.Action action = 187661878;</code>
   *
   * @return The action.
   */
  com.google.cloud.compute.v1.Rule.Action getAction();

  /**
   *
   *
   * <pre>
   * Additional restrictions that must be met. All conditions must pass for the rule to match.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Condition conditions = 142882488;</code>
   */
  java.util.List<com.google.cloud.compute.v1.Condition> getConditionsList();
  /**
   *
   *
   * <pre>
   * Additional restrictions that must be met. All conditions must pass for the rule to match.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Condition conditions = 142882488;</code>
   */
  com.google.cloud.compute.v1.Condition getConditions(int index);
  /**
   *
   *
   * <pre>
   * Additional restrictions that must be met. All conditions must pass for the rule to match.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Condition conditions = 142882488;</code>
   */
  int getConditionsCount();
  /**
   *
   *
   * <pre>
   * Additional restrictions that must be met. All conditions must pass for the rule to match.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Condition conditions = 142882488;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.ConditionOrBuilder>
      getConditionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Additional restrictions that must be met. All conditions must pass for the rule to match.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Condition conditions = 142882488;</code>
   */
  com.google.cloud.compute.v1.ConditionOrBuilder getConditionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Human-readable description of the rule.
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
   * Human-readable description of the rule.
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
   * Human-readable description of the rule.
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
   * If one or more 'in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in at least one of these entries.
   * </pre>
   *
   * <code>repeated string ins = 104430;</code>
   *
   * @return A list containing the ins.
   */
  java.util.List<java.lang.String> getInsList();
  /**
   *
   *
   * <pre>
   * If one or more 'in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in at least one of these entries.
   * </pre>
   *
   * <code>repeated string ins = 104430;</code>
   *
   * @return The count of ins.
   */
  int getInsCount();
  /**
   *
   *
   * <pre>
   * If one or more 'in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in at least one of these entries.
   * </pre>
   *
   * <code>repeated string ins = 104430;</code>
   *
   * @param index The index of the element to return.
   * @return The ins at the given index.
   */
  java.lang.String getIns(int index);
  /**
   *
   *
   * <pre>
   * If one or more 'in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in at least one of these entries.
   * </pre>
   *
   * <code>repeated string ins = 104430;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the ins at the given index.
   */
  com.google.protobuf.ByteString getInsBytes(int index);

  /**
   *
   *
   * <pre>
   * The config returned to callers of tech.iam.IAM.CheckPolicy for any entries that match the LOG action.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.LogConfig log_configs = 152873846;</code>
   */
  java.util.List<com.google.cloud.compute.v1.LogConfig> getLogConfigsList();
  /**
   *
   *
   * <pre>
   * The config returned to callers of tech.iam.IAM.CheckPolicy for any entries that match the LOG action.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.LogConfig log_configs = 152873846;</code>
   */
  com.google.cloud.compute.v1.LogConfig getLogConfigs(int index);
  /**
   *
   *
   * <pre>
   * The config returned to callers of tech.iam.IAM.CheckPolicy for any entries that match the LOG action.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.LogConfig log_configs = 152873846;</code>
   */
  int getLogConfigsCount();
  /**
   *
   *
   * <pre>
   * The config returned to callers of tech.iam.IAM.CheckPolicy for any entries that match the LOG action.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.LogConfig log_configs = 152873846;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.LogConfigOrBuilder>
      getLogConfigsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The config returned to callers of tech.iam.IAM.CheckPolicy for any entries that match the LOG action.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.LogConfig log_configs = 152873846;</code>
   */
  com.google.cloud.compute.v1.LogConfigOrBuilder getLogConfigsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If one or more 'not_in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in none of the entries.
   * </pre>
   *
   * <code>repeated string not_ins = 518443138;</code>
   *
   * @return A list containing the notIns.
   */
  java.util.List<java.lang.String> getNotInsList();
  /**
   *
   *
   * <pre>
   * If one or more 'not_in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in none of the entries.
   * </pre>
   *
   * <code>repeated string not_ins = 518443138;</code>
   *
   * @return The count of notIns.
   */
  int getNotInsCount();
  /**
   *
   *
   * <pre>
   * If one or more 'not_in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in none of the entries.
   * </pre>
   *
   * <code>repeated string not_ins = 518443138;</code>
   *
   * @param index The index of the element to return.
   * @return The notIns at the given index.
   */
  java.lang.String getNotIns(int index);
  /**
   *
   *
   * <pre>
   * If one or more 'not_in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in none of the entries.
   * </pre>
   *
   * <code>repeated string not_ins = 518443138;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the notIns at the given index.
   */
  com.google.protobuf.ByteString getNotInsBytes(int index);

  /**
   *
   *
   * <pre>
   * A permission is a string of form '..' (e.g., 'storage.buckets.list'). A value of '*' matches all permissions, and a verb part of '*' (e.g., 'storage.buckets.*') matches all verbs.
   * </pre>
   *
   * <code>repeated string permissions = 59962500;</code>
   *
   * @return A list containing the permissions.
   */
  java.util.List<java.lang.String> getPermissionsList();
  /**
   *
   *
   * <pre>
   * A permission is a string of form '..' (e.g., 'storage.buckets.list'). A value of '*' matches all permissions, and a verb part of '*' (e.g., 'storage.buckets.*') matches all verbs.
   * </pre>
   *
   * <code>repeated string permissions = 59962500;</code>
   *
   * @return The count of permissions.
   */
  int getPermissionsCount();
  /**
   *
   *
   * <pre>
   * A permission is a string of form '..' (e.g., 'storage.buckets.list'). A value of '*' matches all permissions, and a verb part of '*' (e.g., 'storage.buckets.*') matches all verbs.
   * </pre>
   *
   * <code>repeated string permissions = 59962500;</code>
   *
   * @param index The index of the element to return.
   * @return The permissions at the given index.
   */
  java.lang.String getPermissions(int index);
  /**
   *
   *
   * <pre>
   * A permission is a string of form '..' (e.g., 'storage.buckets.list'). A value of '*' matches all permissions, and a verb part of '*' (e.g., 'storage.buckets.*') matches all verbs.
   * </pre>
   *
   * <code>repeated string permissions = 59962500;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the permissions at the given index.
   */
  com.google.protobuf.ByteString getPermissionsBytes(int index);
}
