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
import org.openapitools.client.model.InvoiceObject;
import org.openapitools.client.model.PaginationMeta;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InvoicesPaginated
 */
@JsonPropertyOrder({
  InvoicesPaginated.JSON_PROPERTY_INVOICES,
  InvoicesPaginated.JSON_PROPERTY_META
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class InvoicesPaginated {
  public static final String JSON_PROPERTY_INVOICES = "invoices";
  private List<InvoiceObject> invoices = new ArrayList<>();

  public static final String JSON_PROPERTY_META = "meta";
  private PaginationMeta meta;

  public InvoicesPaginated() {
  }

  public InvoicesPaginated invoices(List<InvoiceObject> invoices) {
    
    this.invoices = invoices;
    return this;
  }

  public InvoicesPaginated addInvoicesItem(InvoiceObject invoicesItem) {
    if (this.invoices == null) {
      this.invoices = new ArrayList<>();
    }
    this.invoices.add(invoicesItem);
    return this;
  }

   /**
   * Get invoices
   * @return invoices
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INVOICES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<InvoiceObject> getInvoices() {
    return invoices;
  }


  @JsonProperty(JSON_PROPERTY_INVOICES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInvoices(List<InvoiceObject> invoices) {
    this.invoices = invoices;
  }


  public InvoicesPaginated meta(PaginationMeta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PaginationMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(PaginationMeta meta) {
    this.meta = meta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicesPaginated invoicesPaginated = (InvoicesPaginated) o;
    return Objects.equals(this.invoices, invoicesPaginated.invoices) &&
        Objects.equals(this.meta, invoicesPaginated.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoices, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicesPaginated {\n");
    sb.append("    invoices: ").append(toIndentedString(invoices)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

