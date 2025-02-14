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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.openapitools.client.model.Currency;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreditNoteAppliedTaxObject
 */
@JsonPropertyOrder({
  CreditNoteAppliedTaxObject.JSON_PROPERTY_LAGO_CREDIT_NOTE_ID,
  CreditNoteAppliedTaxObject.JSON_PROPERTY_BASE_AMOUNT_CENTS,
  CreditNoteAppliedTaxObject.JSON_PROPERTY_LAGO_ID,
  CreditNoteAppliedTaxObject.JSON_PROPERTY_LAGO_TAX_ID,
  CreditNoteAppliedTaxObject.JSON_PROPERTY_TAX_NAME,
  CreditNoteAppliedTaxObject.JSON_PROPERTY_TAX_CODE,
  CreditNoteAppliedTaxObject.JSON_PROPERTY_TAX_RATE,
  CreditNoteAppliedTaxObject.JSON_PROPERTY_TAX_DESCRIPTION,
  CreditNoteAppliedTaxObject.JSON_PROPERTY_AMOUNT_CENTS,
  CreditNoteAppliedTaxObject.JSON_PROPERTY_AMOUNT_CURRENCY,
  CreditNoteAppliedTaxObject.JSON_PROPERTY_CREATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class CreditNoteAppliedTaxObject {
  public static final String JSON_PROPERTY_LAGO_CREDIT_NOTE_ID = "lago_credit_note_id";
  private UUID lagoCreditNoteId;

  public static final String JSON_PROPERTY_BASE_AMOUNT_CENTS = "base_amount_cents";
  private Integer baseAmountCents;

  public static final String JSON_PROPERTY_LAGO_ID = "lago_id";
  private UUID lagoId;

  public static final String JSON_PROPERTY_LAGO_TAX_ID = "lago_tax_id";
  private UUID lagoTaxId;

  public static final String JSON_PROPERTY_TAX_NAME = "tax_name";
  private String taxName;

  public static final String JSON_PROPERTY_TAX_CODE = "tax_code";
  private String taxCode;

  public static final String JSON_PROPERTY_TAX_RATE = "tax_rate";
  private BigDecimal taxRate;

  public static final String JSON_PROPERTY_TAX_DESCRIPTION = "tax_description";
  private String taxDescription;

  public static final String JSON_PROPERTY_AMOUNT_CENTS = "amount_cents";
  private Integer amountCents;

  public static final String JSON_PROPERTY_AMOUNT_CURRENCY = "amount_currency";
  private Currency amountCurrency;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public CreditNoteAppliedTaxObject() {
  }

  public CreditNoteAppliedTaxObject lagoCreditNoteId(UUID lagoCreditNoteId) {
    
    this.lagoCreditNoteId = lagoCreditNoteId;
    return this;
  }

   /**
   * Unique identifier of the credit note, created by Lago.
   * @return lagoCreditNoteId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAGO_CREDIT_NOTE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getLagoCreditNoteId() {
    return lagoCreditNoteId;
  }


  @JsonProperty(JSON_PROPERTY_LAGO_CREDIT_NOTE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLagoCreditNoteId(UUID lagoCreditNoteId) {
    this.lagoCreditNoteId = lagoCreditNoteId;
  }


  public CreditNoteAppliedTaxObject baseAmountCents(Integer baseAmountCents) {
    
    this.baseAmountCents = baseAmountCents;
    return this;
  }

   /**
   * Get baseAmountCents
   * @return baseAmountCents
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BASE_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBaseAmountCents() {
    return baseAmountCents;
  }


  @JsonProperty(JSON_PROPERTY_BASE_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBaseAmountCents(Integer baseAmountCents) {
    this.baseAmountCents = baseAmountCents;
  }


  public CreditNoteAppliedTaxObject lagoId(UUID lagoId) {
    
    this.lagoId = lagoId;
    return this;
  }

   /**
   * Unique identifier of the applied tax, created by Lago.
   * @return lagoId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAGO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getLagoId() {
    return lagoId;
  }


  @JsonProperty(JSON_PROPERTY_LAGO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLagoId(UUID lagoId) {
    this.lagoId = lagoId;
  }


  public CreditNoteAppliedTaxObject lagoTaxId(UUID lagoTaxId) {
    
    this.lagoTaxId = lagoTaxId;
    return this;
  }

   /**
   * Unique identifier of the tax, created by Lago.
   * @return lagoTaxId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAGO_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getLagoTaxId() {
    return lagoTaxId;
  }


  @JsonProperty(JSON_PROPERTY_LAGO_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLagoTaxId(UUID lagoTaxId) {
    this.lagoTaxId = lagoTaxId;
  }


  public CreditNoteAppliedTaxObject taxName(String taxName) {
    
    this.taxName = taxName;
    return this;
  }

   /**
   * Name of the tax.
   * @return taxName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaxName() {
    return taxName;
  }


  @JsonProperty(JSON_PROPERTY_TAX_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxName(String taxName) {
    this.taxName = taxName;
  }


  public CreditNoteAppliedTaxObject taxCode(String taxCode) {
    
    this.taxCode = taxCode;
    return this;
  }

   /**
   * Unique code used to identify the tax associated with the API request.
   * @return taxCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaxCode() {
    return taxCode;
  }


  @JsonProperty(JSON_PROPERTY_TAX_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxCode(String taxCode) {
    this.taxCode = taxCode;
  }


  public CreditNoteAppliedTaxObject taxRate(BigDecimal taxRate) {
    
    this.taxRate = taxRate;
    return this;
  }

   /**
   * The percentage rate of the tax
   * @return taxRate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTaxRate() {
    return taxRate;
  }


  @JsonProperty(JSON_PROPERTY_TAX_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxRate(BigDecimal taxRate) {
    this.taxRate = taxRate;
  }


  public CreditNoteAppliedTaxObject taxDescription(String taxDescription) {
    
    this.taxDescription = taxDescription;
    return this;
  }

   /**
   * Internal description of the taxe
   * @return taxDescription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaxDescription() {
    return taxDescription;
  }


  @JsonProperty(JSON_PROPERTY_TAX_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxDescription(String taxDescription) {
    this.taxDescription = taxDescription;
  }


  public CreditNoteAppliedTaxObject amountCents(Integer amountCents) {
    
    this.amountCents = amountCents;
    return this;
  }

   /**
   * Amount of the tax
   * @return amountCents
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAmountCents() {
    return amountCents;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountCents(Integer amountCents) {
    this.amountCents = amountCents;
  }


  public CreditNoteAppliedTaxObject amountCurrency(Currency amountCurrency) {
    
    this.amountCurrency = amountCurrency;
    return this;
  }

   /**
   * Get amountCurrency
   * @return amountCurrency
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Currency getAmountCurrency() {
    return amountCurrency;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountCurrency(Currency amountCurrency) {
    this.amountCurrency = amountCurrency;
  }


  public CreditNoteAppliedTaxObject createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when the applied tax was created. It is expressed in UTC format according to the ISO 8601 datetime standard. This field provides the timestamp for the exact moment when the applied tax was initially created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    CreditNoteAppliedTaxObject creditNoteAppliedTaxObject = (CreditNoteAppliedTaxObject) o;
    return Objects.equals(this.lagoCreditNoteId, creditNoteAppliedTaxObject.lagoCreditNoteId) &&
        Objects.equals(this.baseAmountCents, creditNoteAppliedTaxObject.baseAmountCents) &&
        Objects.equals(this.lagoId, creditNoteAppliedTaxObject.lagoId) &&
        Objects.equals(this.lagoTaxId, creditNoteAppliedTaxObject.lagoTaxId) &&
        Objects.equals(this.taxName, creditNoteAppliedTaxObject.taxName) &&
        Objects.equals(this.taxCode, creditNoteAppliedTaxObject.taxCode) &&
        Objects.equals(this.taxRate, creditNoteAppliedTaxObject.taxRate) &&
        Objects.equals(this.taxDescription, creditNoteAppliedTaxObject.taxDescription) &&
        Objects.equals(this.amountCents, creditNoteAppliedTaxObject.amountCents) &&
        Objects.equals(this.amountCurrency, creditNoteAppliedTaxObject.amountCurrency) &&
        Objects.equals(this.createdAt, creditNoteAppliedTaxObject.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lagoCreditNoteId, baseAmountCents, lagoId, lagoTaxId, taxName, taxCode, taxRate, taxDescription, amountCents, amountCurrency, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditNoteAppliedTaxObject {\n");
    sb.append("    lagoCreditNoteId: ").append(toIndentedString(lagoCreditNoteId)).append("\n");
    sb.append("    baseAmountCents: ").append(toIndentedString(baseAmountCents)).append("\n");
    sb.append("    lagoId: ").append(toIndentedString(lagoId)).append("\n");
    sb.append("    lagoTaxId: ").append(toIndentedString(lagoTaxId)).append("\n");
    sb.append("    taxName: ").append(toIndentedString(taxName)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    taxDescription: ").append(toIndentedString(taxDescription)).append("\n");
    sb.append("    amountCents: ").append(toIndentedString(amountCents)).append("\n");
    sb.append("    amountCurrency: ").append(toIndentedString(amountCurrency)).append("\n");
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

