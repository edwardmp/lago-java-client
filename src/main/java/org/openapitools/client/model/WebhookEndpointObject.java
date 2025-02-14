/*
 * Lago API documentation
 * Lago API allows your application to push customer information and metrics (events) from your application to the billing application.
 *
 * The version of the OpenAPI document: 0.52.2-beta
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
import java.time.OffsetDateTime;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * WebhookEndpointObject
 */
@JsonPropertyOrder({
  WebhookEndpointObject.JSON_PROPERTY_LAGO_ID,
  WebhookEndpointObject.JSON_PROPERTY_LAGO_ORGANIZATION_ID,
  WebhookEndpointObject.JSON_PROPERTY_WEBHOOK_URL,
  WebhookEndpointObject.JSON_PROPERTY_SIGNATURE_ALGO,
  WebhookEndpointObject.JSON_PROPERTY_CREATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class WebhookEndpointObject {
  public static final String JSON_PROPERTY_LAGO_ID = "lago_id";
  private UUID lagoId;

  public static final String JSON_PROPERTY_LAGO_ORGANIZATION_ID = "lago_organization_id";
  private UUID lagoOrganizationId;

  public static final String JSON_PROPERTY_WEBHOOK_URL = "webhook_url";
  private String webhookUrl;

  /**
   * The signature algo for the webhook.
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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SIGNATURE_ALGO = "signature_algo";
  private SignatureAlgoEnum signatureAlgo;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public WebhookEndpointObject() {
  }

  public WebhookEndpointObject lagoId(UUID lagoId) {
    
    this.lagoId = lagoId;
    return this;
  }

   /**
   * Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system.
   * @return lagoId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAGO_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getLagoId() {
    return lagoId;
  }


  @JsonProperty(JSON_PROPERTY_LAGO_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLagoId(UUID lagoId) {
    this.lagoId = lagoId;
  }


  public WebhookEndpointObject lagoOrganizationId(UUID lagoOrganizationId) {
    
    this.lagoOrganizationId = lagoOrganizationId;
    return this;
  }

   /**
   * Unique identifier assigned to the organization attached to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the organization’s record within the Lago system.
   * @return lagoOrganizationId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAGO_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getLagoOrganizationId() {
    return lagoOrganizationId;
  }


  @JsonProperty(JSON_PROPERTY_LAGO_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLagoOrganizationId(UUID lagoOrganizationId) {
    this.lagoOrganizationId = lagoOrganizationId;
  }


  public WebhookEndpointObject webhookUrl(String webhookUrl) {
    
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * The name of the wallet.
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


  public WebhookEndpointObject signatureAlgo(SignatureAlgoEnum signatureAlgo) {
    
    this.signatureAlgo = signatureAlgo;
    return this;
  }

   /**
   * The signature algo for the webhook.
   * @return signatureAlgo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNATURE_ALGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SignatureAlgoEnum getSignatureAlgo() {
    return signatureAlgo;
  }


  @JsonProperty(JSON_PROPERTY_SIGNATURE_ALGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignatureAlgo(SignatureAlgoEnum signatureAlgo) {
    this.signatureAlgo = signatureAlgo;
  }


  public WebhookEndpointObject createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date of the webhook endpoint creation, represented in ISO 8601 datetime format and expressed in Coordinated Universal Time (UTC).
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookEndpointObject webhookEndpointObject = (WebhookEndpointObject) o;
    return Objects.equals(this.lagoId, webhookEndpointObject.lagoId) &&
        Objects.equals(this.lagoOrganizationId, webhookEndpointObject.lagoOrganizationId) &&
        Objects.equals(this.webhookUrl, webhookEndpointObject.webhookUrl) &&
        Objects.equals(this.signatureAlgo, webhookEndpointObject.signatureAlgo) &&
        Objects.equals(this.createdAt, webhookEndpointObject.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lagoId, lagoOrganizationId, webhookUrl, signatureAlgo, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookEndpointObject {\n");
    sb.append("    lagoId: ").append(toIndentedString(lagoId)).append("\n");
    sb.append("    lagoOrganizationId: ").append(toIndentedString(lagoOrganizationId)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    signatureAlgo: ").append(toIndentedString(signatureAlgo)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

