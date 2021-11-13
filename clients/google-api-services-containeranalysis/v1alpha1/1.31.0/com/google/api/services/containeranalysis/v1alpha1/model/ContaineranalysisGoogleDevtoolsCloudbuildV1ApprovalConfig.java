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

package com.google.api.services.containeranalysis.v1alpha1.model;

/**
 * ApprovalConfig describes configuration for manual approval of a build.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalConfig extends com.google.api.client.json.GenericJson {

  /**
   * Whether or not approval is needed. If this is set on a build, it will become pending when
   * created, and will need to be explicitly approved to start.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean approvalRequired;

  /**
   * Whether or not approval is needed. If this is set on a build, it will become pending when
   * created, and will need to be explicitly approved to start.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getApprovalRequired() {
    return approvalRequired;
  }

  /**
   * Whether or not approval is needed. If this is set on a build, it will become pending when
   * created, and will need to be explicitly approved to start.
   * @param approvalRequired approvalRequired or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalConfig setApprovalRequired(java.lang.Boolean approvalRequired) {
    this.approvalRequired = approvalRequired;
    return this;
  }

  @Override
  public ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalConfig set(String fieldName, Object value) {
    return (ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalConfig) super.set(fieldName, value);
  }

  @Override
  public ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalConfig clone() {
    return (ContaineranalysisGoogleDevtoolsCloudbuildV1ApprovalConfig) super.clone();
  }

}