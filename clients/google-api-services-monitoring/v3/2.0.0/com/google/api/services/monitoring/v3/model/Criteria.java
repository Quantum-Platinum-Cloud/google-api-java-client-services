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

package com.google.api.services.monitoring.v3.model;

/**
 * Criteria specific to the AlertPolicys that this Snooze applies to. The Snooze will suppress
 * alerts that come from one of the AlertPolicys whose names are supplied.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Criteria extends com.google.api.client.json.GenericJson {

  /**
   * The specific AlertPolicy names for the alert that should be snoozed. The format is:
   * projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[POLICY_ID] There is a limit of 10 policies per
   * snooze. This limit is checked during snooze creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> policies;

  /**
   * The specific AlertPolicy names for the alert that should be snoozed. The format is:
   * projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[POLICY_ID] There is a limit of 10 policies per
   * snooze. This limit is checked during snooze creation.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPolicies() {
    return policies;
  }

  /**
   * The specific AlertPolicy names for the alert that should be snoozed. The format is:
   * projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[POLICY_ID] There is a limit of 10 policies per
   * snooze. This limit is checked during snooze creation.
   * @param policies policies or {@code null} for none
   */
  public Criteria setPolicies(java.util.List<java.lang.String> policies) {
    this.policies = policies;
    return this;
  }

  @Override
  public Criteria set(String fieldName, Object value) {
    return (Criteria) super.set(fieldName, value);
  }

  @Override
  public Criteria clone() {
    return (Criteria) super.clone();
  }

}
