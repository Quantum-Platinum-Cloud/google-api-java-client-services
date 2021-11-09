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

package com.google.api.services.translate.v3.model;

/**
 * A document translation request input config.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Translation API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DocumentInputConfig extends com.google.api.client.json.GenericJson {

  /**
   * Document's content represented as a stream of bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * Google Cloud Storage location. This must be a single file. For example:
   * gs://example_bucket/example_file.pdf
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GcsSource gcsSource;

  /**
   * Specifies the input document's mime_type. If not specified it will be determined using the file
   * extension for gcs_source provided files. For a file provided through bytes content the
   * mime_type must be provided. Currently supported mime types are: - application/pdf -
   * application/vnd.openxmlformats-officedocument.wordprocessingml.document - application/vnd
   * .openxmlformats-officedocument.presentationml.presentation - application/vnd.openxmlformats-
   * officedocument.spreadsheetml.sheet
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mimeType;

  /**
   * Document's content represented as a stream of bytes.
   * @see #decodeContent()
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * Document's content represented as a stream of bytes.
   * @see #getContent()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeContent() {
    return com.google.api.client.util.Base64.decodeBase64(content);
  }

  /**
   * Document's content represented as a stream of bytes.
   * @see #encodeContent()
   * @param content content or {@code null} for none
   */
  public DocumentInputConfig setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * Document's content represented as a stream of bytes.
   * @see #setContent()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public DocumentInputConfig encodeContent(byte[] content) {
    this.content = com.google.api.client.util.Base64.encodeBase64URLSafeString(content);
    return this;
  }

  /**
   * Google Cloud Storage location. This must be a single file. For example:
   * gs://example_bucket/example_file.pdf
   * @return value or {@code null} for none
   */
  public GcsSource getGcsSource() {
    return gcsSource;
  }

  /**
   * Google Cloud Storage location. This must be a single file. For example:
   * gs://example_bucket/example_file.pdf
   * @param gcsSource gcsSource or {@code null} for none
   */
  public DocumentInputConfig setGcsSource(GcsSource gcsSource) {
    this.gcsSource = gcsSource;
    return this;
  }

  /**
   * Specifies the input document's mime_type. If not specified it will be determined using the file
   * extension for gcs_source provided files. For a file provided through bytes content the
   * mime_type must be provided. Currently supported mime types are: - application/pdf -
   * application/vnd.openxmlformats-officedocument.wordprocessingml.document - application/vnd
   * .openxmlformats-officedocument.presentationml.presentation - application/vnd.openxmlformats-
   * officedocument.spreadsheetml.sheet
   * @return value or {@code null} for none
   */
  public java.lang.String getMimeType() {
    return mimeType;
  }

  /**
   * Specifies the input document's mime_type. If not specified it will be determined using the file
   * extension for gcs_source provided files. For a file provided through bytes content the
   * mime_type must be provided. Currently supported mime types are: - application/pdf -
   * application/vnd.openxmlformats-officedocument.wordprocessingml.document - application/vnd
   * .openxmlformats-officedocument.presentationml.presentation - application/vnd.openxmlformats-
   * officedocument.spreadsheetml.sheet
   * @param mimeType mimeType or {@code null} for none
   */
  public DocumentInputConfig setMimeType(java.lang.String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  @Override
  public DocumentInputConfig set(String fieldName, Object value) {
    return (DocumentInputConfig) super.set(fieldName, value);
  }

  @Override
  public DocumentInputConfig clone() {
    return (DocumentInputConfig) super.clone();
  }

}