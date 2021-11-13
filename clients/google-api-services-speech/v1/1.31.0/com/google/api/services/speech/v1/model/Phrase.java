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

package com.google.api.services.speech.v1.model;

/**
 * A phrases containing words and phrase "hints" so that the speech recognition is more likely to
 * recognize them. This can be used to improve the accuracy for specific words and phrases, for
 * example, if specific commands are typically spoken by the user. This can also be used to add
 * additional words to the vocabulary of the recognizer. See [usage limits](https://cloud.google.com
 * /speech-to-text/quotas#content). List items can also include pre-built or custom classes
 * containing groups of words that represent common concepts that occur in natural language. For
 * example, rather than providing a phrase hint for every month of the year (e.g. "i was born in
 * january", "i was born in febuary", ...), use the pre-built `$MONTH` class improves the likelihood
 * of correctly transcribing audio that includes months (e.g. "i was born in $month"). To refer to
 * pre-built classes, use the class' symbol prepended with `$` e.g. `$MONTH`. To refer to custom
 * classes that were defined inline in the request, set the class's `custom_class_id` to a string
 * unique to all class resources and inline classes. Then use the class' id wrapped in $`{...}` e.g.
 * "${my-months}". To refer to custom classes resources, use the class' id wrapped in `${}` (e.g.
 * `${my-months}`).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Speech-to-Text API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Phrase extends com.google.api.client.json.GenericJson {

  /**
   * Hint Boost. Overrides the boost set at the phrase set level. Positive value will increase the
   * probability that a specific phrase will be recognized over other similar sounding phrases. The
   * higher the boost, the higher the chance of false positive recognition as well. Negative boost
   * will simply be ignored. Though `boost` can accept a wide range of positive values, most use
   * cases are best served with values between 0 and 20. We recommend using a binary search approach
   * to finding the optimal value for your use case. Speech recognition will skip PhraseSets with a
   * boost value of 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float boost;

  /**
   * The phrase itself.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * Hint Boost. Overrides the boost set at the phrase set level. Positive value will increase the
   * probability that a specific phrase will be recognized over other similar sounding phrases. The
   * higher the boost, the higher the chance of false positive recognition as well. Negative boost
   * will simply be ignored. Though `boost` can accept a wide range of positive values, most use
   * cases are best served with values between 0 and 20. We recommend using a binary search approach
   * to finding the optimal value for your use case. Speech recognition will skip PhraseSets with a
   * boost value of 0.
   * @return value or {@code null} for none
   */
  public java.lang.Float getBoost() {
    return boost;
  }

  /**
   * Hint Boost. Overrides the boost set at the phrase set level. Positive value will increase the
   * probability that a specific phrase will be recognized over other similar sounding phrases. The
   * higher the boost, the higher the chance of false positive recognition as well. Negative boost
   * will simply be ignored. Though `boost` can accept a wide range of positive values, most use
   * cases are best served with values between 0 and 20. We recommend using a binary search approach
   * to finding the optimal value for your use case. Speech recognition will skip PhraseSets with a
   * boost value of 0.
   * @param boost boost or {@code null} for none
   */
  public Phrase setBoost(java.lang.Float boost) {
    this.boost = boost;
    return this;
  }

  /**
   * The phrase itself.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The phrase itself.
   * @param value value or {@code null} for none
   */
  public Phrase setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public Phrase set(String fieldName, Object value) {
    return (Phrase) super.set(fieldName, value);
  }

  @Override
  public Phrase clone() {
    return (Phrase) super.clone();
  }

}