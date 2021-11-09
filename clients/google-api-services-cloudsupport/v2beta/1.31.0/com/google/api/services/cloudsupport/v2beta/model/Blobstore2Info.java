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

package com.google.api.services.cloudsupport.v2beta.model;

/**
 * # gdata.* are outside protos with mising documentation
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Support API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Blobstore2Info extends com.google.api.client.json.GenericJson {

  /**
   * # gdata.* are outside protos with mising documentation
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long blobGeneration;

  /**
   * # gdata.* are outside protos with mising documentation
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String blobId;

  /**
   * # gdata.* are outside protos with mising documentation
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String downloadReadHandle;

  /**
   * # gdata.* are outside protos with mising documentation
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String readToken;

  /**
   * # gdata.* are outside protos with mising documentation
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uploadMetadataContainer;

  /**
   * # gdata.* are outside protos with mising documentation
   * @return value or {@code null} for none
   */
  public java.lang.Long getBlobGeneration() {
    return blobGeneration;
  }

  /**
   * # gdata.* are outside protos with mising documentation
   * @param blobGeneration blobGeneration or {@code null} for none
   */
  public Blobstore2Info setBlobGeneration(java.lang.Long blobGeneration) {
    this.blobGeneration = blobGeneration;
    return this;
  }

  /**
   * # gdata.* are outside protos with mising documentation
   * @return value or {@code null} for none
   */
  public java.lang.String getBlobId() {
    return blobId;
  }

  /**
   * # gdata.* are outside protos with mising documentation
   * @param blobId blobId or {@code null} for none
   */
  public Blobstore2Info setBlobId(java.lang.String blobId) {
    this.blobId = blobId;
    return this;
  }

  /**
   * # gdata.* are outside protos with mising documentation
   * @see #decodeDownloadReadHandle()
   * @return value or {@code null} for none
   */
  public java.lang.String getDownloadReadHandle() {
    return downloadReadHandle;
  }

  /**
   * # gdata.* are outside protos with mising documentation
   * @see #getDownloadReadHandle()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeDownloadReadHandle() {
    return com.google.api.client.util.Base64.decodeBase64(downloadReadHandle);
  }

  /**
   * # gdata.* are outside protos with mising documentation
   * @see #encodeDownloadReadHandle()
   * @param downloadReadHandle downloadReadHandle or {@code null} for none
   */
  public Blobstore2Info setDownloadReadHandle(java.lang.String downloadReadHandle) {
    this.downloadReadHandle = downloadReadHandle;
    return this;
  }

  /**
   * # gdata.* are outside protos with mising documentation
   * @see #setDownloadReadHandle()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Blobstore2Info encodeDownloadReadHandle(byte[] downloadReadHandle) {
    this.downloadReadHandle = com.google.api.client.util.Base64.encodeBase64URLSafeString(downloadReadHandle);
    return this;
  }

  /**
   * # gdata.* are outside protos with mising documentation
   * @return value or {@code null} for none
   */
  public java.lang.String getReadToken() {
    return readToken;
  }

  /**
   * # gdata.* are outside protos with mising documentation
   * @param readToken readToken or {@code null} for none
   */
  public Blobstore2Info setReadToken(java.lang.String readToken) {
    this.readToken = readToken;
    return this;
  }

  /**
   * # gdata.* are outside protos with mising documentation
   * @see #decodeUploadMetadataContainer()
   * @return value or {@code null} for none
   */
  public java.lang.String getUploadMetadataContainer() {
    return uploadMetadataContainer;
  }

  /**
   * # gdata.* are outside protos with mising documentation
   * @see #getUploadMetadataContainer()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeUploadMetadataContainer() {
    return com.google.api.client.util.Base64.decodeBase64(uploadMetadataContainer);
  }

  /**
   * # gdata.* are outside protos with mising documentation
   * @see #encodeUploadMetadataContainer()
   * @param uploadMetadataContainer uploadMetadataContainer or {@code null} for none
   */
  public Blobstore2Info setUploadMetadataContainer(java.lang.String uploadMetadataContainer) {
    this.uploadMetadataContainer = uploadMetadataContainer;
    return this;
  }

  /**
   * # gdata.* are outside protos with mising documentation
   * @see #setUploadMetadataContainer()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Blobstore2Info encodeUploadMetadataContainer(byte[] uploadMetadataContainer) {
    this.uploadMetadataContainer = com.google.api.client.util.Base64.encodeBase64URLSafeString(uploadMetadataContainer);
    return this;
  }

  @Override
  public Blobstore2Info set(String fieldName, Object value) {
    return (Blobstore2Info) super.set(fieldName, value);
  }

  @Override
  public Blobstore2Info clone() {
    return (Blobstore2Info) super.clone();
  }

}