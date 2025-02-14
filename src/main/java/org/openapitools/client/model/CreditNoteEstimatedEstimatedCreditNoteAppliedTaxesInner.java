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
import java.util.UUID;
import org.openapitools.client.model.Currency;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner
 */
@JsonPropertyOrder({
  CreditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner.JSON_PROPERTY_LAGO_TAX_ID,
  CreditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner.JSON_PROPERTY_TAX_NAME,
  CreditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner.JSON_PROPERTY_TAX_CODE,
  CreditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner.JSON_PROPERTY_TAX_RATE,
  CreditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner.JSON_PROPERTY_TAX_DESCRIPTION,
  CreditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner.JSON_PROPERTY_BASE_AMOUNT_CENTS,
  CreditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner.JSON_PROPERTY_AMOUNT_CENTS,
  CreditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner.JSON_PROPERTY_AMOUNT_CURRENCY
})
@JsonTypeName("CreditNoteEstimated_estimated_credit_note_applied_taxes_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class CreditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner {
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

  public static final String JSON_PROPERTY_BASE_AMOUNT_CENTS = "base_amount_cents";
  private Integer baseAmountCents;

  public static final String JSON_PROPERTY_AMOUNT_CENTS = "amount_cents";
  private Integer amountCents;

  public static final String JSON_PROPERTY_AMOUNT_CURRENCY = "amount_currency";
  private Currency amountCurrency;

  public CreditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner() {
  }

  public CreditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner lagoTaxId(UUID lagoTaxId) {
    
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


  public CreditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner taxName(String taxName) {
    
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


  public CreditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner taxCode(String taxCode) {
    
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


  public CreditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner taxRate(BigDecimal taxRate) {
    
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


  public CreditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner taxDescription(String taxDescription) {
    
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


  public CreditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner baseAmountCents(Integer baseAmountCents) {
    
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


  public CreditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner amountCents(Integer amountCents) {
    
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


  public CreditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner amountCurrency(Currency amountCurrency) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner creditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner = (CreditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner) o;
    return Objects.equals(this.lagoTaxId, creditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner.lagoTaxId) &&
        Objects.equals(this.taxName, creditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner.taxName) &&
        Objects.equals(this.taxCode, creditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner.taxCode) &&
        Objects.equals(this.taxRate, creditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner.taxRate) &&
        Objects.equals(this.taxDescription, creditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner.taxDescription) &&
        Objects.equals(this.baseAmountCents, creditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner.baseAmountCents) &&
        Objects.equals(this.amountCents, creditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner.amountCents) &&
        Objects.equals(this.amountCurrency, creditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner.amountCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lagoTaxId, taxName, taxCode, taxRate, taxDescription, baseAmountCents, amountCents, amountCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner {\n");
    sb.append("    lagoTaxId: ").append(toIndentedString(lagoTaxId)).append("\n");
    sb.append("    taxName: ").append(toIndentedString(taxName)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    taxDescription: ").append(toIndentedString(taxDescription)).append("\n");
    sb.append("    baseAmountCents: ").append(toIndentedString(baseAmountCents)).append("\n");
    sb.append("    amountCents: ").append(toIndentedString(amountCents)).append("\n");
    sb.append("    amountCurrency: ").append(toIndentedString(amountCurrency)).append("\n");
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

