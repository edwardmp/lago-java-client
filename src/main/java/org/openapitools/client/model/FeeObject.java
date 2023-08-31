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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.Currency;
import org.openapitools.client.model.FeeAppliedTaxObject;
import org.openapitools.client.model.FeeObjectItem;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * FeeObject
 */
@JsonPropertyOrder({
  FeeObject.JSON_PROPERTY_LAGO_ID,
  FeeObject.JSON_PROPERTY_LAGO_GROUP_ID,
  FeeObject.JSON_PROPERTY_LAGO_INVOICE_ID,
  FeeObject.JSON_PROPERTY_LAGO_TRUE_UP_FEE_ID,
  FeeObject.JSON_PROPERTY_LAGO_TRUE_UP_PARENT_FEE_ID,
  FeeObject.JSON_PROPERTY_LAGO_SUBSCRIPTION_ID,
  FeeObject.JSON_PROPERTY_LAGO_CUSTOMER_ID,
  FeeObject.JSON_PROPERTY_EXTERNAL_CUSTOMER_ID,
  FeeObject.JSON_PROPERTY_EXTERNAL_SUBSCRIPTION_ID,
  FeeObject.JSON_PROPERTY_AMOUNT_CENTS,
  FeeObject.JSON_PROPERTY_AMOUNT_CURRENCY,
  FeeObject.JSON_PROPERTY_TAXES_AMOUNT_CENTS,
  FeeObject.JSON_PROPERTY_TAXES_RATE,
  FeeObject.JSON_PROPERTY_UNITS,
  FeeObject.JSON_PROPERTY_TOTAL_AMOUNT_CENTS,
  FeeObject.JSON_PROPERTY_TOTAL_AMOUNT_CURRENCY,
  FeeObject.JSON_PROPERTY_EVENTS_COUNT,
  FeeObject.JSON_PROPERTY_PAY_IN_ADVANCE,
  FeeObject.JSON_PROPERTY_INVOICEABLE,
  FeeObject.JSON_PROPERTY_FROM_DATE,
  FeeObject.JSON_PROPERTY_TO_DATE,
  FeeObject.JSON_PROPERTY_PAYMENT_STATUS,
  FeeObject.JSON_PROPERTY_CREATED_AT,
  FeeObject.JSON_PROPERTY_SUCCEEDED_AT,
  FeeObject.JSON_PROPERTY_FAILED_AT,
  FeeObject.JSON_PROPERTY_REFUNDED_AT,
  FeeObject.JSON_PROPERTY_EVENT_TRANSACTION_ID,
  FeeObject.JSON_PROPERTY_ITEM,
  FeeObject.JSON_PROPERTY_APPLIED_TAXES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T15:04:44.084574Z[Etc/UTC]")
public class FeeObject {
  public static final String JSON_PROPERTY_LAGO_ID = "lago_id";
  private JsonNullable<UUID> lagoId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_LAGO_GROUP_ID = "lago_group_id";
  private JsonNullable<UUID> lagoGroupId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_LAGO_INVOICE_ID = "lago_invoice_id";
  private JsonNullable<UUID> lagoInvoiceId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_LAGO_TRUE_UP_FEE_ID = "lago_true_up_fee_id";
  private JsonNullable<UUID> lagoTrueUpFeeId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_LAGO_TRUE_UP_PARENT_FEE_ID = "lago_true_up_parent_fee_id";
  private JsonNullable<UUID> lagoTrueUpParentFeeId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_LAGO_SUBSCRIPTION_ID = "lago_subscription_id";
  private JsonNullable<UUID> lagoSubscriptionId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_LAGO_CUSTOMER_ID = "lago_customer_id";
  private JsonNullable<UUID> lagoCustomerId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_EXTERNAL_CUSTOMER_ID = "external_customer_id";
  private JsonNullable<String> externalCustomerId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXTERNAL_SUBSCRIPTION_ID = "external_subscription_id";
  private JsonNullable<String> externalSubscriptionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AMOUNT_CENTS = "amount_cents";
  private Integer amountCents;

  public static final String JSON_PROPERTY_AMOUNT_CURRENCY = "amount_currency";
  private Currency amountCurrency;

  public static final String JSON_PROPERTY_TAXES_AMOUNT_CENTS = "taxes_amount_cents";
  private Integer taxesAmountCents;

  public static final String JSON_PROPERTY_TAXES_RATE = "taxes_rate";
  private BigDecimal taxesRate;

  public static final String JSON_PROPERTY_UNITS = "units";
  private String units;

  public static final String JSON_PROPERTY_TOTAL_AMOUNT_CENTS = "total_amount_cents";
  private Integer totalAmountCents;

  public static final String JSON_PROPERTY_TOTAL_AMOUNT_CURRENCY = "total_amount_currency";
  private Currency totalAmountCurrency;

  public static final String JSON_PROPERTY_EVENTS_COUNT = "events_count";
  private Integer eventsCount;

  public static final String JSON_PROPERTY_PAY_IN_ADVANCE = "pay_in_advance";
  private Boolean payInAdvance;

  public static final String JSON_PROPERTY_INVOICEABLE = "invoiceable";
  private Boolean invoiceable;

  public static final String JSON_PROPERTY_FROM_DATE = "from_date";
  private JsonNullable<OffsetDateTime> fromDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_TO_DATE = "to_date";
  private JsonNullable<OffsetDateTime> toDate = JsonNullable.<OffsetDateTime>undefined();

  /**
   * Indicates the payment status of the fee. It represents the current status of the payment associated with the fee. The possible values for this field are &#x60;pending&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60; and &#x60;refunded&#x60;.
   */
  public enum PaymentStatusEnum {
    PENDING("pending"),
    
    SUCCEEDED("succeeded"),
    
    FAILED("failed"),
    
    REFUNDED("refunded");

    private String value;

    PaymentStatusEnum(String value) {
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
    public static PaymentStatusEnum fromValue(String value) {
      for (PaymentStatusEnum b : PaymentStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PAYMENT_STATUS = "payment_status";
  private PaymentStatusEnum paymentStatus;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private JsonNullable<OffsetDateTime> createdAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_SUCCEEDED_AT = "succeeded_at";
  private JsonNullable<OffsetDateTime> succeededAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_FAILED_AT = "failed_at";
  private JsonNullable<OffsetDateTime> failedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_REFUNDED_AT = "refunded_at";
  private JsonNullable<OffsetDateTime> refundedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_EVENT_TRANSACTION_ID = "event_transaction_id";
  private JsonNullable<String> eventTransactionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ITEM = "item";
  private FeeObjectItem item;

  public static final String JSON_PROPERTY_APPLIED_TAXES = "applied_taxes";
  private List<FeeAppliedTaxObject> appliedTaxes;

  public FeeObject() {
  }

  public FeeObject lagoId(UUID lagoId) {
    this.lagoId = JsonNullable.<UUID>of(lagoId);
    
    return this;
  }

   /**
   * Unique identifier assigned to the fee within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the fee’s record within the Lago system.
   * @return lagoId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public UUID getLagoId() {
        return lagoId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAGO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getLagoId_JsonNullable() {
    return lagoId;
  }
  
  @JsonProperty(JSON_PROPERTY_LAGO_ID)
  public void setLagoId_JsonNullable(JsonNullable<UUID> lagoId) {
    this.lagoId = lagoId;
  }

  public void setLagoId(UUID lagoId) {
    this.lagoId = JsonNullable.<UUID>of(lagoId);
  }


  public FeeObject lagoGroupId(UUID lagoGroupId) {
    this.lagoGroupId = JsonNullable.<UUID>of(lagoGroupId);
    
    return this;
  }

   /**
   * Unique identifier assigned to the group that the fee belongs to
   * @return lagoGroupId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public UUID getLagoGroupId() {
        return lagoGroupId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAGO_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getLagoGroupId_JsonNullable() {
    return lagoGroupId;
  }
  
  @JsonProperty(JSON_PROPERTY_LAGO_GROUP_ID)
  public void setLagoGroupId_JsonNullable(JsonNullable<UUID> lagoGroupId) {
    this.lagoGroupId = lagoGroupId;
  }

  public void setLagoGroupId(UUID lagoGroupId) {
    this.lagoGroupId = JsonNullable.<UUID>of(lagoGroupId);
  }


  public FeeObject lagoInvoiceId(UUID lagoInvoiceId) {
    this.lagoInvoiceId = JsonNullable.<UUID>of(lagoInvoiceId);
    
    return this;
  }

   /**
   * Unique identifier assigned to the invoice that the fee belongs to
   * @return lagoInvoiceId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public UUID getLagoInvoiceId() {
        return lagoInvoiceId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAGO_INVOICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getLagoInvoiceId_JsonNullable() {
    return lagoInvoiceId;
  }
  
  @JsonProperty(JSON_PROPERTY_LAGO_INVOICE_ID)
  public void setLagoInvoiceId_JsonNullable(JsonNullable<UUID> lagoInvoiceId) {
    this.lagoInvoiceId = lagoInvoiceId;
  }

  public void setLagoInvoiceId(UUID lagoInvoiceId) {
    this.lagoInvoiceId = JsonNullable.<UUID>of(lagoInvoiceId);
  }


  public FeeObject lagoTrueUpFeeId(UUID lagoTrueUpFeeId) {
    this.lagoTrueUpFeeId = JsonNullable.<UUID>of(lagoTrueUpFeeId);
    
    return this;
  }

   /**
   * Unique identifier assigned to the true-up fee when a minimum has been set to the charge. This identifier helps to distinguish and manage the true-up fee associated with the charge, which may be applicable when a minimum threshold or limit is set for the charge amount.
   * @return lagoTrueUpFeeId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public UUID getLagoTrueUpFeeId() {
        return lagoTrueUpFeeId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAGO_TRUE_UP_FEE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getLagoTrueUpFeeId_JsonNullable() {
    return lagoTrueUpFeeId;
  }
  
  @JsonProperty(JSON_PROPERTY_LAGO_TRUE_UP_FEE_ID)
  public void setLagoTrueUpFeeId_JsonNullable(JsonNullable<UUID> lagoTrueUpFeeId) {
    this.lagoTrueUpFeeId = lagoTrueUpFeeId;
  }

  public void setLagoTrueUpFeeId(UUID lagoTrueUpFeeId) {
    this.lagoTrueUpFeeId = JsonNullable.<UUID>of(lagoTrueUpFeeId);
  }


  public FeeObject lagoTrueUpParentFeeId(UUID lagoTrueUpParentFeeId) {
    this.lagoTrueUpParentFeeId = JsonNullable.<UUID>of(lagoTrueUpParentFeeId);
    
    return this;
  }

   /**
   * Unique identifier assigned to the parent fee on which the true-up fee is assigned. This identifier establishes the relationship between the parent fee and the associated true-up fee.
   * @return lagoTrueUpParentFeeId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public UUID getLagoTrueUpParentFeeId() {
        return lagoTrueUpParentFeeId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAGO_TRUE_UP_PARENT_FEE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getLagoTrueUpParentFeeId_JsonNullable() {
    return lagoTrueUpParentFeeId;
  }
  
  @JsonProperty(JSON_PROPERTY_LAGO_TRUE_UP_PARENT_FEE_ID)
  public void setLagoTrueUpParentFeeId_JsonNullable(JsonNullable<UUID> lagoTrueUpParentFeeId) {
    this.lagoTrueUpParentFeeId = lagoTrueUpParentFeeId;
  }

  public void setLagoTrueUpParentFeeId(UUID lagoTrueUpParentFeeId) {
    this.lagoTrueUpParentFeeId = JsonNullable.<UUID>of(lagoTrueUpParentFeeId);
  }


  public FeeObject lagoSubscriptionId(UUID lagoSubscriptionId) {
    this.lagoSubscriptionId = JsonNullable.<UUID>of(lagoSubscriptionId);
    
    return this;
  }

   /**
   * Unique identifier assigned to the subscription, created by Lago. This field is specifically displayed when the fee type is charge and the payment for the fee is made in advance (&#x60;pay_in_advance&#x60; is set to true).
   * @return lagoSubscriptionId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public UUID getLagoSubscriptionId() {
        return lagoSubscriptionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAGO_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getLagoSubscriptionId_JsonNullable() {
    return lagoSubscriptionId;
  }
  
  @JsonProperty(JSON_PROPERTY_LAGO_SUBSCRIPTION_ID)
  public void setLagoSubscriptionId_JsonNullable(JsonNullable<UUID> lagoSubscriptionId) {
    this.lagoSubscriptionId = lagoSubscriptionId;
  }

  public void setLagoSubscriptionId(UUID lagoSubscriptionId) {
    this.lagoSubscriptionId = JsonNullable.<UUID>of(lagoSubscriptionId);
  }


  public FeeObject lagoCustomerId(UUID lagoCustomerId) {
    this.lagoCustomerId = JsonNullable.<UUID>of(lagoCustomerId);
    
    return this;
  }

   /**
   * Unique identifier assigned to the customer, created by Lago. This field is specifically displayed when the fee type is charge and the payment for the fee is made in advance (&#x60;pay_in_advance&#x60; is set to true).
   * @return lagoCustomerId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public UUID getLagoCustomerId() {
        return lagoCustomerId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAGO_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getLagoCustomerId_JsonNullable() {
    return lagoCustomerId;
  }
  
  @JsonProperty(JSON_PROPERTY_LAGO_CUSTOMER_ID)
  public void setLagoCustomerId_JsonNullable(JsonNullable<UUID> lagoCustomerId) {
    this.lagoCustomerId = lagoCustomerId;
  }

  public void setLagoCustomerId(UUID lagoCustomerId) {
    this.lagoCustomerId = JsonNullable.<UUID>of(lagoCustomerId);
  }


  public FeeObject externalCustomerId(String externalCustomerId) {
    this.externalCustomerId = JsonNullable.<String>of(externalCustomerId);
    
    return this;
  }

   /**
   * Unique identifier assigned to the customer in your application. This field is specifically displayed when the fee type is charge and the payment for the fee is made in advance (&#x60;pay_in_advance&#x60; is set to true).
   * @return externalCustomerId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getExternalCustomerId() {
        return externalCustomerId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXTERNAL_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getExternalCustomerId_JsonNullable() {
    return externalCustomerId;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTERNAL_CUSTOMER_ID)
  public void setExternalCustomerId_JsonNullable(JsonNullable<String> externalCustomerId) {
    this.externalCustomerId = externalCustomerId;
  }

  public void setExternalCustomerId(String externalCustomerId) {
    this.externalCustomerId = JsonNullable.<String>of(externalCustomerId);
  }


  public FeeObject externalSubscriptionId(String externalSubscriptionId) {
    this.externalSubscriptionId = JsonNullable.<String>of(externalSubscriptionId);
    
    return this;
  }

   /**
   * Unique identifier assigned to the subscription in your application. This field is specifically displayed when the fee type is charge and the payment for the fee is made in advance (&#x60;pay_in_advance&#x60; is set to true).
   * @return externalSubscriptionId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getExternalSubscriptionId() {
        return externalSubscriptionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXTERNAL_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getExternalSubscriptionId_JsonNullable() {
    return externalSubscriptionId;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTERNAL_SUBSCRIPTION_ID)
  public void setExternalSubscriptionId_JsonNullable(JsonNullable<String> externalSubscriptionId) {
    this.externalSubscriptionId = externalSubscriptionId;
  }

  public void setExternalSubscriptionId(String externalSubscriptionId) {
    this.externalSubscriptionId = JsonNullable.<String>of(externalSubscriptionId);
  }


  public FeeObject amountCents(Integer amountCents) {
    
    this.amountCents = amountCents;
    return this;
  }

   /**
   * The cost of this specific fee, excluding any applicable taxes.
   * @return amountCents
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getAmountCents() {
    return amountCents;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmountCents(Integer amountCents) {
    this.amountCents = amountCents;
  }


  public FeeObject amountCurrency(Currency amountCurrency) {
    
    this.amountCurrency = amountCurrency;
    return this;
  }

   /**
   * Get amountCurrency
   * @return amountCurrency
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Currency getAmountCurrency() {
    return amountCurrency;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmountCurrency(Currency amountCurrency) {
    this.amountCurrency = amountCurrency;
  }


  public FeeObject taxesAmountCents(Integer taxesAmountCents) {
    
    this.taxesAmountCents = taxesAmountCents;
    return this;
  }

   /**
   * The cost of the tax associated with this specific fee.
   * @return taxesAmountCents
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TAXES_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTaxesAmountCents() {
    return taxesAmountCents;
  }


  @JsonProperty(JSON_PROPERTY_TAXES_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTaxesAmountCents(Integer taxesAmountCents) {
    this.taxesAmountCents = taxesAmountCents;
  }


  public FeeObject taxesRate(BigDecimal taxesRate) {
    
    this.taxesRate = taxesRate;
    return this;
  }

   /**
   * The tax rate associated with this specific fee.
   * @return taxesRate
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TAXES_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getTaxesRate() {
    return taxesRate;
  }


  @JsonProperty(JSON_PROPERTY_TAXES_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTaxesRate(BigDecimal taxesRate) {
    this.taxesRate = taxesRate;
  }


  public FeeObject units(String units) {
    
    this.units = units;
    return this;
  }

   /**
   * The number of units used to charge the customer. This field indicates the quantity or count of units consumed or utilized in the context of the charge. It helps in determining the basis for calculating the fee or cost associated with the usage of the service or product provided to the customer.
   * @return units
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UNITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUnits() {
    return units;
  }


  @JsonProperty(JSON_PROPERTY_UNITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnits(String units) {
    this.units = units;
  }


  public FeeObject totalAmountCents(Integer totalAmountCents) {
    
    this.totalAmountCents = totalAmountCents;
    return this;
  }

   /**
   * The cost of this specific fee, including any applicable taxes.
   * @return totalAmountCents
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTotalAmountCents() {
    return totalAmountCents;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalAmountCents(Integer totalAmountCents) {
    this.totalAmountCents = totalAmountCents;
  }


  public FeeObject totalAmountCurrency(Currency totalAmountCurrency) {
    
    this.totalAmountCurrency = totalAmountCurrency;
    return this;
  }

   /**
   * Get totalAmountCurrency
   * @return totalAmountCurrency
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Currency getTotalAmountCurrency() {
    return totalAmountCurrency;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalAmountCurrency(Currency totalAmountCurrency) {
    this.totalAmountCurrency = totalAmountCurrency;
  }


  public FeeObject eventsCount(Integer eventsCount) {
    
    this.eventsCount = eventsCount;
    return this;
  }

   /**
   * The number of events that have been sent and used to charge the customer. This field indicates the count or quantity of events that have been processed and considered in the charging process.
   * @return eventsCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEventsCount() {
    return eventsCount;
  }


  @JsonProperty(JSON_PROPERTY_EVENTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventsCount(Integer eventsCount) {
    this.eventsCount = eventsCount;
  }


  public FeeObject payInAdvance(Boolean payInAdvance) {
    
    this.payInAdvance = payInAdvance;
    return this;
  }

   /**
   * Flag that indicates whether the fee was paid in advance. It serves as a boolean value, where &#x60;true&#x60; represents that the fee was paid in advance (straightaway), and &#x60;false&#x60; indicates that the fee was not paid in arrears (at the end of the period).
   * @return payInAdvance
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAY_IN_ADVANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getPayInAdvance() {
    return payInAdvance;
  }


  @JsonProperty(JSON_PROPERTY_PAY_IN_ADVANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayInAdvance(Boolean payInAdvance) {
    this.payInAdvance = payInAdvance;
  }


  public FeeObject invoiceable(Boolean invoiceable) {
    
    this.invoiceable = invoiceable;
    return this;
  }

   /**
   * Flag that indicates whether the fee was included on the invoice. It serves as a boolean value, where &#x60;true&#x60; represents that the fee was included on the invoice, and &#x60;false&#x60; indicates that the fee was not included on the invoice.
   * @return invoiceable
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INVOICEABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getInvoiceable() {
    return invoiceable;
  }


  @JsonProperty(JSON_PROPERTY_INVOICEABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInvoiceable(Boolean invoiceable) {
    this.invoiceable = invoiceable;
  }


  public FeeObject fromDate(OffsetDateTime fromDate) {
    this.fromDate = JsonNullable.<OffsetDateTime>of(fromDate);
    
    return this;
  }

   /**
   * The beginning date of the period that the fee covers. It is applicable only to &#x60;subscription&#x60; and &#x60;charge&#x60; fees. This field indicates the start date of the billing period or subscription period associated with the fee.
   * @return fromDate
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getFromDate() {
        return fromDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FROM_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getFromDate_JsonNullable() {
    return fromDate;
  }
  
  @JsonProperty(JSON_PROPERTY_FROM_DATE)
  public void setFromDate_JsonNullable(JsonNullable<OffsetDateTime> fromDate) {
    this.fromDate = fromDate;
  }

  public void setFromDate(OffsetDateTime fromDate) {
    this.fromDate = JsonNullable.<OffsetDateTime>of(fromDate);
  }


  public FeeObject toDate(OffsetDateTime toDate) {
    this.toDate = JsonNullable.<OffsetDateTime>of(toDate);
    
    return this;
  }

   /**
   * The ending date of the period that the fee covers. It is applicable only to &#x60;subscription&#x60; and &#x60;charge&#x60; fees. This field indicates the end date of the billing period or subscription period associated with the fee.
   * @return toDate
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getToDate() {
        return toDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TO_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getToDate_JsonNullable() {
    return toDate;
  }
  
  @JsonProperty(JSON_PROPERTY_TO_DATE)
  public void setToDate_JsonNullable(JsonNullable<OffsetDateTime> toDate) {
    this.toDate = toDate;
  }

  public void setToDate(OffsetDateTime toDate) {
    this.toDate = JsonNullable.<OffsetDateTime>of(toDate);
  }


  public FeeObject paymentStatus(PaymentStatusEnum paymentStatus) {
    
    this.paymentStatus = paymentStatus;
    return this;
  }

   /**
   * Indicates the payment status of the fee. It represents the current status of the payment associated with the fee. The possible values for this field are &#x60;pending&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60; and &#x60;refunded&#x60;.
   * @return paymentStatus
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PaymentStatusEnum getPaymentStatus() {
    return paymentStatus;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentStatus(PaymentStatusEnum paymentStatus) {
    this.paymentStatus = paymentStatus;
  }


  public FeeObject createdAt(OffsetDateTime createdAt) {
    this.createdAt = JsonNullable.<OffsetDateTime>of(createdAt);
    
    return this;
  }

   /**
   * The date and time when the fee was created. It is provided in Coordinated Universal Time (UTC) format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getCreatedAt() {
        return createdAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getCreatedAt_JsonNullable() {
    return createdAt;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  public void setCreatedAt_JsonNullable(JsonNullable<OffsetDateTime> createdAt) {
    this.createdAt = createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = JsonNullable.<OffsetDateTime>of(createdAt);
  }


  public FeeObject succeededAt(OffsetDateTime succeededAt) {
    this.succeededAt = JsonNullable.<OffsetDateTime>of(succeededAt);
    
    return this;
  }

   /**
   * The date and time when the payment for the fee was successfully processed. It is provided in Coordinated Universal Time (UTC) format.
   * @return succeededAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getSucceededAt() {
        return succeededAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUCCEEDED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getSucceededAt_JsonNullable() {
    return succeededAt;
  }
  
  @JsonProperty(JSON_PROPERTY_SUCCEEDED_AT)
  public void setSucceededAt_JsonNullable(JsonNullable<OffsetDateTime> succeededAt) {
    this.succeededAt = succeededAt;
  }

  public void setSucceededAt(OffsetDateTime succeededAt) {
    this.succeededAt = JsonNullable.<OffsetDateTime>of(succeededAt);
  }


  public FeeObject failedAt(OffsetDateTime failedAt) {
    this.failedAt = JsonNullable.<OffsetDateTime>of(failedAt);
    
    return this;
  }

   /**
   * The date and time when the payment for the fee failed to process. It is provided in Coordinated Universal Time (UTC) format.
   * @return failedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getFailedAt() {
        return failedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FAILED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getFailedAt_JsonNullable() {
    return failedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_FAILED_AT)
  public void setFailedAt_JsonNullable(JsonNullable<OffsetDateTime> failedAt) {
    this.failedAt = failedAt;
  }

  public void setFailedAt(OffsetDateTime failedAt) {
    this.failedAt = JsonNullable.<OffsetDateTime>of(failedAt);
  }


  public FeeObject refundedAt(OffsetDateTime refundedAt) {
    this.refundedAt = JsonNullable.<OffsetDateTime>of(refundedAt);
    
    return this;
  }

   /**
   * The date and time when the payment for the fee was refunded. It is provided in Coordinated Universal Time (UTC) format
   * @return refundedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getRefundedAt() {
        return refundedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REFUNDED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getRefundedAt_JsonNullable() {
    return refundedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_REFUNDED_AT)
  public void setRefundedAt_JsonNullable(JsonNullable<OffsetDateTime> refundedAt) {
    this.refundedAt = refundedAt;
  }

  public void setRefundedAt(OffsetDateTime refundedAt) {
    this.refundedAt = JsonNullable.<OffsetDateTime>of(refundedAt);
  }


  public FeeObject eventTransactionId(String eventTransactionId) {
    this.eventTransactionId = JsonNullable.<String>of(eventTransactionId);
    
    return this;
  }

   /**
   * Unique identifier assigned to the transaction. This field is specifically displayed when the fee type is &#x60;charge&#x60; and the payment for the fee is made in advance (&#x60;pay_in_advance&#x60; is set to &#x60;true&#x60;).
   * @return eventTransactionId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getEventTransactionId() {
        return eventTransactionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EVENT_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEventTransactionId_JsonNullable() {
    return eventTransactionId;
  }
  
  @JsonProperty(JSON_PROPERTY_EVENT_TRANSACTION_ID)
  public void setEventTransactionId_JsonNullable(JsonNullable<String> eventTransactionId) {
    this.eventTransactionId = eventTransactionId;
  }

  public void setEventTransactionId(String eventTransactionId) {
    this.eventTransactionId = JsonNullable.<String>of(eventTransactionId);
  }


  public FeeObject item(FeeObjectItem item) {
    
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FeeObjectItem getItem() {
    return item;
  }


  @JsonProperty(JSON_PROPERTY_ITEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setItem(FeeObjectItem item) {
    this.item = item;
  }


  public FeeObject appliedTaxes(List<FeeAppliedTaxObject> appliedTaxes) {
    
    this.appliedTaxes = appliedTaxes;
    return this;
  }

  public FeeObject addAppliedTaxesItem(FeeAppliedTaxObject appliedTaxesItem) {
    if (this.appliedTaxes == null) {
      this.appliedTaxes = new ArrayList<>();
    }
    this.appliedTaxes.add(appliedTaxesItem);
    return this;
  }

   /**
   * List of fee applied taxes
   * @return appliedTaxes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLIED_TAXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FeeAppliedTaxObject> getAppliedTaxes() {
    return appliedTaxes;
  }


  @JsonProperty(JSON_PROPERTY_APPLIED_TAXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppliedTaxes(List<FeeAppliedTaxObject> appliedTaxes) {
    this.appliedTaxes = appliedTaxes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeeObject feeObject = (FeeObject) o;
    return equalsNullable(this.lagoId, feeObject.lagoId) &&
        equalsNullable(this.lagoGroupId, feeObject.lagoGroupId) &&
        equalsNullable(this.lagoInvoiceId, feeObject.lagoInvoiceId) &&
        equalsNullable(this.lagoTrueUpFeeId, feeObject.lagoTrueUpFeeId) &&
        equalsNullable(this.lagoTrueUpParentFeeId, feeObject.lagoTrueUpParentFeeId) &&
        equalsNullable(this.lagoSubscriptionId, feeObject.lagoSubscriptionId) &&
        equalsNullable(this.lagoCustomerId, feeObject.lagoCustomerId) &&
        equalsNullable(this.externalCustomerId, feeObject.externalCustomerId) &&
        equalsNullable(this.externalSubscriptionId, feeObject.externalSubscriptionId) &&
        Objects.equals(this.amountCents, feeObject.amountCents) &&
        Objects.equals(this.amountCurrency, feeObject.amountCurrency) &&
        Objects.equals(this.taxesAmountCents, feeObject.taxesAmountCents) &&
        Objects.equals(this.taxesRate, feeObject.taxesRate) &&
        Objects.equals(this.units, feeObject.units) &&
        Objects.equals(this.totalAmountCents, feeObject.totalAmountCents) &&
        Objects.equals(this.totalAmountCurrency, feeObject.totalAmountCurrency) &&
        Objects.equals(this.eventsCount, feeObject.eventsCount) &&
        Objects.equals(this.payInAdvance, feeObject.payInAdvance) &&
        Objects.equals(this.invoiceable, feeObject.invoiceable) &&
        equalsNullable(this.fromDate, feeObject.fromDate) &&
        equalsNullable(this.toDate, feeObject.toDate) &&
        Objects.equals(this.paymentStatus, feeObject.paymentStatus) &&
        equalsNullable(this.createdAt, feeObject.createdAt) &&
        equalsNullable(this.succeededAt, feeObject.succeededAt) &&
        equalsNullable(this.failedAt, feeObject.failedAt) &&
        equalsNullable(this.refundedAt, feeObject.refundedAt) &&
        equalsNullable(this.eventTransactionId, feeObject.eventTransactionId) &&
        Objects.equals(this.item, feeObject.item) &&
        Objects.equals(this.appliedTaxes, feeObject.appliedTaxes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(lagoId), hashCodeNullable(lagoGroupId), hashCodeNullable(lagoInvoiceId), hashCodeNullable(lagoTrueUpFeeId), hashCodeNullable(lagoTrueUpParentFeeId), hashCodeNullable(lagoSubscriptionId), hashCodeNullable(lagoCustomerId), hashCodeNullable(externalCustomerId), hashCodeNullable(externalSubscriptionId), amountCents, amountCurrency, taxesAmountCents, taxesRate, units, totalAmountCents, totalAmountCurrency, eventsCount, payInAdvance, invoiceable, hashCodeNullable(fromDate), hashCodeNullable(toDate), paymentStatus, hashCodeNullable(createdAt), hashCodeNullable(succeededAt), hashCodeNullable(failedAt), hashCodeNullable(refundedAt), hashCodeNullable(eventTransactionId), item, appliedTaxes);
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
    sb.append("class FeeObject {\n");
    sb.append("    lagoId: ").append(toIndentedString(lagoId)).append("\n");
    sb.append("    lagoGroupId: ").append(toIndentedString(lagoGroupId)).append("\n");
    sb.append("    lagoInvoiceId: ").append(toIndentedString(lagoInvoiceId)).append("\n");
    sb.append("    lagoTrueUpFeeId: ").append(toIndentedString(lagoTrueUpFeeId)).append("\n");
    sb.append("    lagoTrueUpParentFeeId: ").append(toIndentedString(lagoTrueUpParentFeeId)).append("\n");
    sb.append("    lagoSubscriptionId: ").append(toIndentedString(lagoSubscriptionId)).append("\n");
    sb.append("    lagoCustomerId: ").append(toIndentedString(lagoCustomerId)).append("\n");
    sb.append("    externalCustomerId: ").append(toIndentedString(externalCustomerId)).append("\n");
    sb.append("    externalSubscriptionId: ").append(toIndentedString(externalSubscriptionId)).append("\n");
    sb.append("    amountCents: ").append(toIndentedString(amountCents)).append("\n");
    sb.append("    amountCurrency: ").append(toIndentedString(amountCurrency)).append("\n");
    sb.append("    taxesAmountCents: ").append(toIndentedString(taxesAmountCents)).append("\n");
    sb.append("    taxesRate: ").append(toIndentedString(taxesRate)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    totalAmountCents: ").append(toIndentedString(totalAmountCents)).append("\n");
    sb.append("    totalAmountCurrency: ").append(toIndentedString(totalAmountCurrency)).append("\n");
    sb.append("    eventsCount: ").append(toIndentedString(eventsCount)).append("\n");
    sb.append("    payInAdvance: ").append(toIndentedString(payInAdvance)).append("\n");
    sb.append("    invoiceable: ").append(toIndentedString(invoiceable)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    succeededAt: ").append(toIndentedString(succeededAt)).append("\n");
    sb.append("    failedAt: ").append(toIndentedString(failedAt)).append("\n");
    sb.append("    refundedAt: ").append(toIndentedString(refundedAt)).append("\n");
    sb.append("    eventTransactionId: ").append(toIndentedString(eventTransactionId)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    appliedTaxes: ").append(toIndentedString(appliedTaxes)).append("\n");
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

