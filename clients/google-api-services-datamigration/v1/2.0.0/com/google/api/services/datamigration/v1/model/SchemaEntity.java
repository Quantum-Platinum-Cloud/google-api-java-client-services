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

package com.google.api.services.datamigration.v1.model;

/**
 * Schema typically has no parent entity, but can have a parent entity DatabaseInstance (for
 * database engines which supports it). For some database engines the term schema and user can be
 * used interchangeably when they refer to a namespace or a collection of other database entities.
 * Can store additional information which is schema specific.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Database Migration API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SchemaEntity extends com.google.api.client.json.GenericJson {

  /**
   * Custom engine specific features
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> customFeatures;

  /**
   * Custom engine specific features
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getCustomFeatures() {
    return customFeatures;
  }

  /**
   * Custom engine specific features
   * @param customFeatures customFeatures or {@code null} for none
   */
  public SchemaEntity setCustomFeatures(java.util.Map<String, java.lang.Object> customFeatures) {
    this.customFeatures = customFeatures;
    return this;
  }

  @Override
  public SchemaEntity set(String fieldName, Object value) {
    return (SchemaEntity) super.set(fieldName, value);
  }

  @Override
  public SchemaEntity clone() {
    return (SchemaEntity) super.clone();
  }

}
