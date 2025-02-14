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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetCustomerPortalUrl200ResponseCustomer
 */
@JsonPropertyOrder({
  GetCustomerPortalUrl200ResponseCustomer.JSON_PROPERTY_PORTAL_URL
})
@JsonTypeName("getCustomerPortalUrl_200_response_customer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class GetCustomerPortalUrl200ResponseCustomer {
  public static final String JSON_PROPERTY_PORTAL_URL = "portal_url";
  private String portalUrl;

  public GetCustomerPortalUrl200ResponseCustomer() {
  }

  public GetCustomerPortalUrl200ResponseCustomer portalUrl(String portalUrl) {
    
    this.portalUrl = portalUrl;
    return this;
  }

   /**
   * An embeddable link for displaying a customer portal
   * @return portalUrl
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PORTAL_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPortalUrl() {
    return portalUrl;
  }


  @JsonProperty(JSON_PROPERTY_PORTAL_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPortalUrl(String portalUrl) {
    this.portalUrl = portalUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCustomerPortalUrl200ResponseCustomer getCustomerPortalUrl200ResponseCustomer = (GetCustomerPortalUrl200ResponseCustomer) o;
    return Objects.equals(this.portalUrl, getCustomerPortalUrl200ResponseCustomer.portalUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portalUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCustomerPortalUrl200ResponseCustomer {\n");
    sb.append("    portalUrl: ").append(toIndentedString(portalUrl)).append("\n");
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

