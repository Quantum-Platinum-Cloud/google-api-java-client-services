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

package com.google.api.services.integrations.v1alpha.model;

/**
 * Task authors would use this type to configure the UI for a particular task by specifying what UI
 * config modules should be included to compose the UI. Learn more about config module framework: go
 * /integration-platform-config-module-framework
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Application Integration API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EnterpriseCrmEventbusProtoTaskUiConfig extends com.google.api.client.json.GenericJson {

  /**
   * Configurations of included config modules.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EnterpriseCrmEventbusProtoTaskUiModuleConfig> taskUiModuleConfigs;

  /**
   * Configurations of included config modules.
   * @return value or {@code null} for none
   */
  public java.util.List<EnterpriseCrmEventbusProtoTaskUiModuleConfig> getTaskUiModuleConfigs() {
    return taskUiModuleConfigs;
  }

  /**
   * Configurations of included config modules.
   * @param taskUiModuleConfigs taskUiModuleConfigs or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoTaskUiConfig setTaskUiModuleConfigs(java.util.List<EnterpriseCrmEventbusProtoTaskUiModuleConfig> taskUiModuleConfigs) {
    this.taskUiModuleConfigs = taskUiModuleConfigs;
    return this;
  }

  @Override
  public EnterpriseCrmEventbusProtoTaskUiConfig set(String fieldName, Object value) {
    return (EnterpriseCrmEventbusProtoTaskUiConfig) super.set(fieldName, value);
  }

  @Override
  public EnterpriseCrmEventbusProtoTaskUiConfig clone() {
    return (EnterpriseCrmEventbusProtoTaskUiConfig) super.clone();
  }

}
