/*
 * Lago API documentation
 * Lago API allows your application to push customer information and metrics (events) from your application to the billing application.
 *
 * The version of the OpenAPI document: 0.46.0-beta
 * Contact: tech@getlago.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateWebhookEndpointRequestWebhookEndpoint
 */
@JsonPropertyOrder({
  CreateWebhookEndpointRequestWebhookEndpoint.JSON_PROPERTY_WEBHOOK_URL,
  CreateWebhookEndpointRequestWebhookEndpoint.JSON_PROPERTY_SIGNATURE_ALGO
})
@JsonTypeName("createWebhookEndpoint_request_webhook_endpoint")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T15:04:44.084574Z[Etc/UTC]")
public class CreateWebhookEndpointRequestWebhookEndpoint {
  public static final String JSON_PROPERTY_WEBHOOK_URL = "webhook_url";
  private String webhookUrl;

  /**
   * The signature used for the webhook. If no value is passed,
   */
  public enum SignatureAlgoEnum {
    JWT("jwt"),
    
    HMAC("hmac");

    private String value;

    SignatureAlgoEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SignatureAlgoEnum fromValue(String value) {
      for (SignatureAlgoEnum b : SignatureAlgoEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_SIGNATURE_ALGO = "signature_algo";
  private JsonNullable<SignatureAlgoEnum> signatureAlgo = JsonNullable.<SignatureAlgoEnum>undefined();

  public CreateWebhookEndpointRequestWebhookEndpoint() {
  }

  public CreateWebhookEndpointRequestWebhookEndpoint webhookUrl(String webhookUrl) {
    
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * The URL of the webhook endpoint.
   * @return webhookUrl
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWebhookUrl() {
    return webhookUrl;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }


  public CreateWebhookEndpointRequestWebhookEndpoint signatureAlgo(SignatureAlgoEnum signatureAlgo) {
    this.signatureAlgo = JsonNullable.<SignatureAlgoEnum>of(signatureAlgo);
    
    return this;
  }

   /**
   * The signature used for the webhook. If no value is passed,
   * @return signatureAlgo
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public SignatureAlgoEnum getSignatureAlgo() {
        return signatureAlgo.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SIGNATURE_ALGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SignatureAlgoEnum> getSignatureAlgo_JsonNullable() {
    return signatureAlgo;
  }
  
  @JsonProperty(JSON_PROPERTY_SIGNATURE_ALGO)
  public void setSignatureAlgo_JsonNullable(JsonNullable<SignatureAlgoEnum> signatureAlgo) {
    this.signatureAlgo = signatureAlgo;
  }

  public void setSignatureAlgo(SignatureAlgoEnum signatureAlgo) {
    this.signatureAlgo = JsonNullable.<SignatureAlgoEnum>of(signatureAlgo);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWebhookEndpointRequestWebhookEndpoint createWebhookEndpointRequestWebhookEndpoint = (CreateWebhookEndpointRequestWebhookEndpoint) o;
    return Objects.equals(this.webhookUrl, createWebhookEndpointRequestWebhookEndpoint.webhookUrl) &&
        equalsNullable(this.signatureAlgo, createWebhookEndpointRequestWebhookEndpoint.signatureAlgo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookUrl, hashCodeNullable(signatureAlgo));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWebhookEndpointRequestWebhookEndpoint {\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    signatureAlgo: ").append(toIndentedString(signatureAlgo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

