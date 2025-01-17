/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.chromepolicy.v1.model;

/**
 * Request message for updating the group priority ordering of an app.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Chrome Policy API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleChromePolicyVersionsV1UpdateGroupPriorityOrderingRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The group IDs, in desired priority ordering.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> groupIds;

  /**
   * Required. The namespace of the policy type for the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String policyNamespace;

  /**
   * Required. The key of the target for which we want to update the group priority ordering. The
   * target resource must point to an app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleChromePolicyVersionsV1PolicyTargetKey policyTargetKey;

  /**
   * Required. The group IDs, in desired priority ordering.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getGroupIds() {
    return groupIds;
  }

  /**
   * Required. The group IDs, in desired priority ordering.
   * @param groupIds groupIds or {@code null} for none
   */
  public GoogleChromePolicyVersionsV1UpdateGroupPriorityOrderingRequest setGroupIds(java.util.List<java.lang.String> groupIds) {
    this.groupIds = groupIds;
    return this;
  }

  /**
   * Required. The namespace of the policy type for the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getPolicyNamespace() {
    return policyNamespace;
  }

  /**
   * Required. The namespace of the policy type for the request.
   * @param policyNamespace policyNamespace or {@code null} for none
   */
  public GoogleChromePolicyVersionsV1UpdateGroupPriorityOrderingRequest setPolicyNamespace(java.lang.String policyNamespace) {
    this.policyNamespace = policyNamespace;
    return this;
  }

  /**
   * Required. The key of the target for which we want to update the group priority ordering. The
   * target resource must point to an app.
   * @return value or {@code null} for none
   */
  public GoogleChromePolicyVersionsV1PolicyTargetKey getPolicyTargetKey() {
    return policyTargetKey;
  }

  /**
   * Required. The key of the target for which we want to update the group priority ordering. The
   * target resource must point to an app.
   * @param policyTargetKey policyTargetKey or {@code null} for none
   */
  public GoogleChromePolicyVersionsV1UpdateGroupPriorityOrderingRequest setPolicyTargetKey(GoogleChromePolicyVersionsV1PolicyTargetKey policyTargetKey) {
    this.policyTargetKey = policyTargetKey;
    return this;
  }

  @Override
  public GoogleChromePolicyVersionsV1UpdateGroupPriorityOrderingRequest set(String fieldName, Object value) {
    return (GoogleChromePolicyVersionsV1UpdateGroupPriorityOrderingRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleChromePolicyVersionsV1UpdateGroupPriorityOrderingRequest clone() {
    return (GoogleChromePolicyVersionsV1UpdateGroupPriorityOrderingRequest) super.clone();
  }

}
