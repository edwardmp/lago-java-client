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
import org.openapitools.client.model.InvoicedUsageObject;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InvoicedUsages
 */
@JsonPropertyOrder({
  InvoicedUsages.JSON_PROPERTY_INVOICED_USAGES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class InvoicedUsages {
  public static final String JSON_PROPERTY_INVOICED_USAGES = "invoiced_usages";
  private List<InvoicedUsageObject> invoicedUsages = new ArrayList<>();

  public InvoicedUsages() {
  }

  public InvoicedUsages invoicedUsages(List<InvoicedUsageObject> invoicedUsages) {
    
    this.invoicedUsages = invoicedUsages;
    return this;
  }

  public InvoicedUsages addInvoicedUsagesItem(InvoicedUsageObject invoicedUsagesItem) {
    if (this.invoicedUsages == null) {
      this.invoicedUsages = new ArrayList<>();
    }
    this.invoicedUsages.add(invoicedUsagesItem);
    return this;
  }

   /**
   * Get invoicedUsages
   * @return invoicedUsages
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INVOICED_USAGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<InvoicedUsageObject> getInvoicedUsages() {
    return invoicedUsages;
  }


  @JsonProperty(JSON_PROPERTY_INVOICED_USAGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInvoicedUsages(List<InvoicedUsageObject> invoicedUsages) {
    this.invoicedUsages = invoicedUsages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicedUsages invoicedUsages = (InvoicedUsages) o;
    return Objects.equals(this.invoicedUsages, invoicedUsages.invoicedUsages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoicedUsages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicedUsages {\n");
    sb.append("    invoicedUsages: ").append(toIndentedString(invoicedUsages)).append("\n");
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

