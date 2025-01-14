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
import org.openapitools.client.model.CreditNoteObject;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreditNotes
 */
@JsonPropertyOrder({
  CreditNotes.JSON_PROPERTY_CREDIT_NOTES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class CreditNotes {
  public static final String JSON_PROPERTY_CREDIT_NOTES = "credit_notes";
  private List<CreditNoteObject> creditNotes = new ArrayList<>();

  public CreditNotes() {
  }

  public CreditNotes creditNotes(List<CreditNoteObject> creditNotes) {
    
    this.creditNotes = creditNotes;
    return this;
  }

  public CreditNotes addCreditNotesItem(CreditNoteObject creditNotesItem) {
    if (this.creditNotes == null) {
      this.creditNotes = new ArrayList<>();
    }
    this.creditNotes.add(creditNotesItem);
    return this;
  }

   /**
   * Get creditNotes
   * @return creditNotes
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREDIT_NOTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<CreditNoteObject> getCreditNotes() {
    return creditNotes;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_NOTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreditNotes(List<CreditNoteObject> creditNotes) {
    this.creditNotes = creditNotes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditNotes creditNotes = (CreditNotes) o;
    return Objects.equals(this.creditNotes, creditNotes.creditNotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditNotes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditNotes {\n");
    sb.append("    creditNotes: ").append(toIndentedString(creditNotes)).append("\n");
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

