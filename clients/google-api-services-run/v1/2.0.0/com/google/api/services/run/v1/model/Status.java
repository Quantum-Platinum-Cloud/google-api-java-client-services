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

package com.google.api.services.run.v1.model;

/**
 * Status is a return value for calls that don't return other objects.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Status extends com.google.api.client.json.GenericJson {

  /**
   * Suggested HTTP return code for this status, 0 if not set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer code;

  /**
   * Extended data associated with the reason. Each reason may define its own extended details. This
   * field is optional and the data returned is not guaranteed to conform to any schema except that
   * defined by the reason type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StatusDetails details;

  /**
   * A human-readable description of the status of this operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-
   * architecture/api-conventions.md#types-kinds
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ListMeta metadata;

  /**
   * A machine-readable description of why this operation is in the "Failure" status. If this value
   * is empty there is no information available. A Reason clarifies an HTTP status code but does not
   * override it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * Status of the operation. One of: "Success" or "Failure". More info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-
   * status
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Suggested HTTP return code for this status, 0 if not set.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCode() {
    return code;
  }

  /**
   * Suggested HTTP return code for this status, 0 if not set.
   * @param code code or {@code null} for none
   */
  public Status setCode(java.lang.Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Extended data associated with the reason. Each reason may define its own extended details. This
   * field is optional and the data returned is not guaranteed to conform to any schema except that
   * defined by the reason type.
   * @return value or {@code null} for none
   */
  public StatusDetails getDetails() {
    return details;
  }

  /**
   * Extended data associated with the reason. Each reason may define its own extended details. This
   * field is optional and the data returned is not guaranteed to conform to any schema except that
   * defined by the reason type.
   * @param details details or {@code null} for none
   */
  public Status setDetails(StatusDetails details) {
    this.details = details;
    return this;
  }

  /**
   * A human-readable description of the status of this operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * A human-readable description of the status of this operation.
   * @param message message or {@code null} for none
   */
  public Status setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-
   * architecture/api-conventions.md#types-kinds
   * @return value or {@code null} for none
   */
  public ListMeta getMetadata() {
    return metadata;
  }

  /**
   * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-
   * architecture/api-conventions.md#types-kinds
   * @param metadata metadata or {@code null} for none
   */
  public Status setMetadata(ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * A machine-readable description of why this operation is in the "Failure" status. If this value
   * is empty there is no information available. A Reason clarifies an HTTP status code but does not
   * override it.
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * A machine-readable description of why this operation is in the "Failure" status. If this value
   * is empty there is no information available. A Reason clarifies an HTTP status code but does not
   * override it.
   * @param reason reason or {@code null} for none
   */
  public Status setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Status of the operation. One of: "Success" or "Failure". More info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-
   * status
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Status of the operation. One of: "Success" or "Failure". More info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-
   * status
   * @param status status or {@code null} for none
   */
  public Status setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public Status set(String fieldName, Object value) {
    return (Status) super.set(fieldName, value);
  }

  @Override
  public Status clone() {
    return (Status) super.clone();
  }

}
