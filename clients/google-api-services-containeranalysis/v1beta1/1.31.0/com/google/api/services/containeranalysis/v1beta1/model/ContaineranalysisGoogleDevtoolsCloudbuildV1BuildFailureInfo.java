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

package com.google.api.services.containeranalysis.v1beta1.model;

/**
 * A fatal problem encountered during the execution of the build.
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
public final class ContaineranalysisGoogleDevtoolsCloudbuildV1BuildFailureInfo extends com.google.api.client.json.GenericJson {

  /**
   * Explains the failure issue in more detail using hard-coded text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String detail;

  /**
   * The name of the failure.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Explains the failure issue in more detail using hard-coded text.
   * @return value or {@code null} for none
   */
  public java.lang.String getDetail() {
    return detail;
  }

  /**
   * Explains the failure issue in more detail using hard-coded text.
   * @param detail detail or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildFailureInfo setDetail(java.lang.String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * The name of the failure.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The name of the failure.
   * @param type type or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildFailureInfo setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildFailureInfo set(String fieldName, Object value) {
    return (ContaineranalysisGoogleDevtoolsCloudbuildV1BuildFailureInfo) super.set(fieldName, value);
  }

  @Override
  public ContaineranalysisGoogleDevtoolsCloudbuildV1BuildFailureInfo clone() {
    return (ContaineranalysisGoogleDevtoolsCloudbuildV1BuildFailureInfo) super.clone();
  }

}