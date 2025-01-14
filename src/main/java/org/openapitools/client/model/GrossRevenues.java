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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.GrossRevenueObject;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GrossRevenues
 */
@JsonPropertyOrder({
  GrossRevenues.JSON_PROPERTY_GROSS_REVENUES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class GrossRevenues {
  public static final String JSON_PROPERTY_GROSS_REVENUES = "gross_revenues";
  private List<GrossRevenueObject> grossRevenues = new ArrayList<>();

  public GrossRevenues() {
  }

  public GrossRevenues grossRevenues(List<GrossRevenueObject> grossRevenues) {
    
    this.grossRevenues = grossRevenues;
    return this;
  }

  public GrossRevenues addGrossRevenuesItem(GrossRevenueObject grossRevenuesItem) {
    if (this.grossRevenues == null) {
      this.grossRevenues = new ArrayList<>();
    }
    this.grossRevenues.add(grossRevenuesItem);
    return this;
  }

   /**
   * Get grossRevenues
   * @return grossRevenues
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GROSS_REVENUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<GrossRevenueObject> getGrossRevenues() {
    return grossRevenues;
  }


  @JsonProperty(JSON_PROPERTY_GROSS_REVENUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGrossRevenues(List<GrossRevenueObject> grossRevenues) {
    this.grossRevenues = grossRevenues;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrossRevenues grossRevenues = (GrossRevenues) o;
    return Objects.equals(this.grossRevenues, grossRevenues.grossRevenues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grossRevenues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrossRevenues {\n");
    sb.append("    grossRevenues: ").append(toIndentedString(grossRevenues)).append("\n");
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

