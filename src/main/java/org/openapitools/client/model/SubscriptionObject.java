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
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SubscriptionObject
 */
@JsonPropertyOrder({
  SubscriptionObject.JSON_PROPERTY_LAGO_ID,
  SubscriptionObject.JSON_PROPERTY_EXTERNAL_ID,
  SubscriptionObject.JSON_PROPERTY_LAGO_CUSTOMER_ID,
  SubscriptionObject.JSON_PROPERTY_EXTERNAL_CUSTOMER_ID,
  SubscriptionObject.JSON_PROPERTY_BILLING_TIME,
  SubscriptionObject.JSON_PROPERTY_NAME,
  SubscriptionObject.JSON_PROPERTY_PLAN_CODE,
  SubscriptionObject.JSON_PROPERTY_STATUS,
  SubscriptionObject.JSON_PROPERTY_CREATED_AT,
  SubscriptionObject.JSON_PROPERTY_CANCELED_AT,
  SubscriptionObject.JSON_PROPERTY_STARTED_AT,
  SubscriptionObject.JSON_PROPERTY_ENDING_AT,
  SubscriptionObject.JSON_PROPERTY_SUBSCRIPTION_AT,
  SubscriptionObject.JSON_PROPERTY_TERMINATED_AT,
  SubscriptionObject.JSON_PROPERTY_PREVIOUS_PLAN_CODE,
  SubscriptionObject.JSON_PROPERTY_NEXT_PLAN_CODE,
  SubscriptionObject.JSON_PROPERTY_DOWNGRADE_PLAN_DATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class SubscriptionObject {
  public static final String JSON_PROPERTY_LAGO_ID = "lago_id";
  private UUID lagoId;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "external_id";
  private String externalId;

  public static final String JSON_PROPERTY_LAGO_CUSTOMER_ID = "lago_customer_id";
  private UUID lagoCustomerId;

  public static final String JSON_PROPERTY_EXTERNAL_CUSTOMER_ID = "external_customer_id";
  private String externalCustomerId;

  /**
   * The billing time for the subscription, which can be set as either &#x60;anniversary&#x60; or &#x60;calendar&#x60;. If not explicitly provided, it will default to &#x60;calendar&#x60;. The billing time determines the timing of recurring billing cycles for the subscription. By specifying &#x60;anniversary&#x60;, the billing cycle will be based on the specific date the subscription started (billed fully), while &#x60;calendar&#x60; sets the billing cycle at the first day of the week/month/year (billed with proration).
   */
  public enum BillingTimeEnum {
    CALENDAR("calendar"),
    
    ANNIVERSARY("anniversary");

    private String value;

    BillingTimeEnum(String value) {
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
    public static BillingTimeEnum fromValue(String value) {
      for (BillingTimeEnum b : BillingTimeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_BILLING_TIME = "billing_time";
  private BillingTimeEnum billingTime;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PLAN_CODE = "plan_code";
  private String planCode;

  /**
   * The status of the subscription, which can have the following values: - &#x60;pending&#x60;: a previous subscription has been downgraded, and the current one is awaiting automatic activation at the end of the billing period. - &#x60;active&#x60;: the subscription is currently active and applied to the customer. - &#x60;terminated&#x60;: the subscription is no longer active. - &#x60;canceled&#x60;: the subscription has been stopped before its activation. This can occur when two consecutive downgrades have been applied to a customer or when a subscription with a pending status is terminated.
   */
  public enum StatusEnum {
    ACTIVE("active"),
    
    PENDING("pending"),
    
    TERMINATED("terminated"),
    
    CANCELED("canceled");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CANCELED_AT = "canceled_at";
  private JsonNullable<OffsetDateTime> canceledAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private JsonNullable<OffsetDateTime> startedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_ENDING_AT = "ending_at";
  private OffsetDateTime endingAt;

  public static final String JSON_PROPERTY_SUBSCRIPTION_AT = "subscription_at";
  private OffsetDateTime subscriptionAt;

  public static final String JSON_PROPERTY_TERMINATED_AT = "terminated_at";
  private JsonNullable<OffsetDateTime> terminatedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_PREVIOUS_PLAN_CODE = "previous_plan_code";
  private JsonNullable<String> previousPlanCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NEXT_PLAN_CODE = "next_plan_code";
  private JsonNullable<String> nextPlanCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DOWNGRADE_PLAN_DATE = "downgrade_plan_date";
  private JsonNullable<LocalDate> downgradePlanDate = JsonNullable.<LocalDate>undefined();

  public SubscriptionObject() {
  }

  public SubscriptionObject lagoId(UUID lagoId) {
    
    this.lagoId = lagoId;
    return this;
  }

   /**
   * Unique identifier assigned to the subscription within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the subscription’s record within the Lago system
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


  public SubscriptionObject externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * The subscription external unique identifier (provided by your own application).
   * @return externalId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public SubscriptionObject lagoCustomerId(UUID lagoCustomerId) {
    
    this.lagoCustomerId = lagoCustomerId;
    return this;
  }

   /**
   * Unique identifier assigned to the customer within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the customer&#39;s record within the Lago system
   * @return lagoCustomerId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAGO_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getLagoCustomerId() {
    return lagoCustomerId;
  }


  @JsonProperty(JSON_PROPERTY_LAGO_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLagoCustomerId(UUID lagoCustomerId) {
    this.lagoCustomerId = lagoCustomerId;
  }


  public SubscriptionObject externalCustomerId(String externalCustomerId) {
    
    this.externalCustomerId = externalCustomerId;
    return this;
  }

   /**
   * The customer external unique identifier (provided by your own application).
   * @return externalCustomerId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXTERNAL_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExternalCustomerId() {
    return externalCustomerId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExternalCustomerId(String externalCustomerId) {
    this.externalCustomerId = externalCustomerId;
  }


  public SubscriptionObject billingTime(BillingTimeEnum billingTime) {
    
    this.billingTime = billingTime;
    return this;
  }

   /**
   * The billing time for the subscription, which can be set as either &#x60;anniversary&#x60; or &#x60;calendar&#x60;. If not explicitly provided, it will default to &#x60;calendar&#x60;. The billing time determines the timing of recurring billing cycles for the subscription. By specifying &#x60;anniversary&#x60;, the billing cycle will be based on the specific date the subscription started (billed fully), while &#x60;calendar&#x60; sets the billing cycle at the first day of the week/month/year (billed with proration).
   * @return billingTime
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BILLING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BillingTimeEnum getBillingTime() {
    return billingTime;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBillingTime(BillingTimeEnum billingTime) {
    this.billingTime = billingTime;
  }


  public SubscriptionObject name(String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

   /**
   * The display name of the subscription on an invoice. This field allows for customization of the subscription&#39;s name for billing purposes, especially useful when a single customer has multiple subscriptions using the same plan.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public SubscriptionObject planCode(String planCode) {
    
    this.planCode = planCode;
    return this;
  }

   /**
   * The unique code representing the plan to be attached to the customer. This code must correspond to the &#x60;code&#x60; property of one of the active plans.
   * @return planCode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PLAN_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPlanCode() {
    return planCode;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlanCode(String planCode) {
    this.planCode = planCode;
  }


  public SubscriptionObject status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the subscription, which can have the following values: - &#x60;pending&#x60;: a previous subscription has been downgraded, and the current one is awaiting automatic activation at the end of the billing period. - &#x60;active&#x60;: the subscription is currently active and applied to the customer. - &#x60;terminated&#x60;: the subscription is no longer active. - &#x60;canceled&#x60;: the subscription has been stopped before its activation. This can occur when two consecutive downgrades have been applied to a customer or when a subscription with a pending status is terminated.
   * @return status
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public SubscriptionObject createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The creation date of the subscription, represented in ISO 8601 datetime format and expressed in Coordinated Universal Time (UTC). This date provides a timestamp indicating when the subscription was initially created.
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


  public SubscriptionObject canceledAt(OffsetDateTime canceledAt) {
    this.canceledAt = JsonNullable.<OffsetDateTime>of(canceledAt);
    
    return this;
  }

   /**
   * The cancellation date of the subscription. This field is not null when the subscription is &#x60;canceled&#x60;. This date should be provided in ISO 8601 datetime format and expressed in Coordinated Universal Time (UTC).
   * @return canceledAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getCanceledAt() {
        return canceledAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CANCELED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getCanceledAt_JsonNullable() {
    return canceledAt;
  }
  
  @JsonProperty(JSON_PROPERTY_CANCELED_AT)
  public void setCanceledAt_JsonNullable(JsonNullable<OffsetDateTime> canceledAt) {
    this.canceledAt = canceledAt;
  }

  public void setCanceledAt(OffsetDateTime canceledAt) {
    this.canceledAt = JsonNullable.<OffsetDateTime>of(canceledAt);
  }


  public SubscriptionObject startedAt(OffsetDateTime startedAt) {
    this.startedAt = JsonNullable.<OffsetDateTime>of(startedAt);
    
    return this;
  }

   /**
   * The effective start date of the subscription. This field can be null if the subscription is &#x60;pending&#x60; or &#x60;canceled&#x60;. This date should be provided in ISO 8601 datetime format and expressed in Coordinated Universal Time (UTC).
   * @return startedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getStartedAt() {
        return startedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getStartedAt_JsonNullable() {
    return startedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  public void setStartedAt_JsonNullable(JsonNullable<OffsetDateTime> startedAt) {
    this.startedAt = startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = JsonNullable.<OffsetDateTime>of(startedAt);
  }


  public SubscriptionObject endingAt(OffsetDateTime endingAt) {
    
    this.endingAt = endingAt;
    return this;
  }

   /**
   * The effective end date of the subscription. If this field is set to null, the subscription will automatically renew. This date should be provided in ISO 8601 datetime format, and use Coordinated Universal Time (UTC).
   * @return endingAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDING_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndingAt() {
    return endingAt;
  }


  @JsonProperty(JSON_PROPERTY_ENDING_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndingAt(OffsetDateTime endingAt) {
    this.endingAt = endingAt;
  }


  public SubscriptionObject subscriptionAt(OffsetDateTime subscriptionAt) {
    
    this.subscriptionAt = subscriptionAt;
    return this;
  }

   /**
   * The anniversary date and time of the initial subscription. This date serves as the basis for billing subscriptions with &#x60;anniversary&#x60; billing time. The &#x60;anniversary_date&#x60; should be provided in ISO 8601 datetime format and expressed in Coordinated Universal Time (UTC).
   * @return subscriptionAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getSubscriptionAt() {
    return subscriptionAt;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubscriptionAt(OffsetDateTime subscriptionAt) {
    this.subscriptionAt = subscriptionAt;
  }


  public SubscriptionObject terminatedAt(OffsetDateTime terminatedAt) {
    this.terminatedAt = JsonNullable.<OffsetDateTime>of(terminatedAt);
    
    return this;
  }

   /**
   * The termination date of the subscription. This field is not null when the subscription is &#x60;terminated&#x60;. This date should be provided in ISO 8601 datetime format and expressed in Coordinated Universal Time (UTC)
   * @return terminatedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getTerminatedAt() {
        return terminatedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TERMINATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getTerminatedAt_JsonNullable() {
    return terminatedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_TERMINATED_AT)
  public void setTerminatedAt_JsonNullable(JsonNullable<OffsetDateTime> terminatedAt) {
    this.terminatedAt = terminatedAt;
  }

  public void setTerminatedAt(OffsetDateTime terminatedAt) {
    this.terminatedAt = JsonNullable.<OffsetDateTime>of(terminatedAt);
  }


  public SubscriptionObject previousPlanCode(String previousPlanCode) {
    this.previousPlanCode = JsonNullable.<String>of(previousPlanCode);
    
    return this;
  }

   /**
   * The code identifying the previous plan associated with this subscription.
   * @return previousPlanCode
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPreviousPlanCode() {
        return previousPlanCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PREVIOUS_PLAN_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPreviousPlanCode_JsonNullable() {
    return previousPlanCode;
  }
  
  @JsonProperty(JSON_PROPERTY_PREVIOUS_PLAN_CODE)
  public void setPreviousPlanCode_JsonNullable(JsonNullable<String> previousPlanCode) {
    this.previousPlanCode = previousPlanCode;
  }

  public void setPreviousPlanCode(String previousPlanCode) {
    this.previousPlanCode = JsonNullable.<String>of(previousPlanCode);
  }


  public SubscriptionObject nextPlanCode(String nextPlanCode) {
    this.nextPlanCode = JsonNullable.<String>of(nextPlanCode);
    
    return this;
  }

   /**
   * The code identifying the next plan in the case of a downgrade.
   * @return nextPlanCode
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getNextPlanCode() {
        return nextPlanCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEXT_PLAN_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getNextPlanCode_JsonNullable() {
    return nextPlanCode;
  }
  
  @JsonProperty(JSON_PROPERTY_NEXT_PLAN_CODE)
  public void setNextPlanCode_JsonNullable(JsonNullable<String> nextPlanCode) {
    this.nextPlanCode = nextPlanCode;
  }

  public void setNextPlanCode(String nextPlanCode) {
    this.nextPlanCode = JsonNullable.<String>of(nextPlanCode);
  }


  public SubscriptionObject downgradePlanDate(LocalDate downgradePlanDate) {
    this.downgradePlanDate = JsonNullable.<LocalDate>of(downgradePlanDate);
    
    return this;
  }

   /**
   * The date when the plan will be downgraded, represented in ISO 8601 date format.
   * @return downgradePlanDate
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public LocalDate getDowngradePlanDate() {
        return downgradePlanDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DOWNGRADE_PLAN_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getDowngradePlanDate_JsonNullable() {
    return downgradePlanDate;
  }
  
  @JsonProperty(JSON_PROPERTY_DOWNGRADE_PLAN_DATE)
  public void setDowngradePlanDate_JsonNullable(JsonNullable<LocalDate> downgradePlanDate) {
    this.downgradePlanDate = downgradePlanDate;
  }

  public void setDowngradePlanDate(LocalDate downgradePlanDate) {
    this.downgradePlanDate = JsonNullable.<LocalDate>of(downgradePlanDate);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionObject subscriptionObject = (SubscriptionObject) o;
    return Objects.equals(this.lagoId, subscriptionObject.lagoId) &&
        Objects.equals(this.externalId, subscriptionObject.externalId) &&
        Objects.equals(this.lagoCustomerId, subscriptionObject.lagoCustomerId) &&
        Objects.equals(this.externalCustomerId, subscriptionObject.externalCustomerId) &&
        Objects.equals(this.billingTime, subscriptionObject.billingTime) &&
        equalsNullable(this.name, subscriptionObject.name) &&
        Objects.equals(this.planCode, subscriptionObject.planCode) &&
        Objects.equals(this.status, subscriptionObject.status) &&
        Objects.equals(this.createdAt, subscriptionObject.createdAt) &&
        equalsNullable(this.canceledAt, subscriptionObject.canceledAt) &&
        equalsNullable(this.startedAt, subscriptionObject.startedAt) &&
        Objects.equals(this.endingAt, subscriptionObject.endingAt) &&
        Objects.equals(this.subscriptionAt, subscriptionObject.subscriptionAt) &&
        equalsNullable(this.terminatedAt, subscriptionObject.terminatedAt) &&
        equalsNullable(this.previousPlanCode, subscriptionObject.previousPlanCode) &&
        equalsNullable(this.nextPlanCode, subscriptionObject.nextPlanCode) &&
        equalsNullable(this.downgradePlanDate, subscriptionObject.downgradePlanDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(lagoId, externalId, lagoCustomerId, externalCustomerId, billingTime, hashCodeNullable(name), planCode, status, createdAt, hashCodeNullable(canceledAt), hashCodeNullable(startedAt), endingAt, subscriptionAt, hashCodeNullable(terminatedAt), hashCodeNullable(previousPlanCode), hashCodeNullable(nextPlanCode), hashCodeNullable(downgradePlanDate));
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
    sb.append("class SubscriptionObject {\n");
    sb.append("    lagoId: ").append(toIndentedString(lagoId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    lagoCustomerId: ").append(toIndentedString(lagoCustomerId)).append("\n");
    sb.append("    externalCustomerId: ").append(toIndentedString(externalCustomerId)).append("\n");
    sb.append("    billingTime: ").append(toIndentedString(billingTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    planCode: ").append(toIndentedString(planCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    canceledAt: ").append(toIndentedString(canceledAt)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    endingAt: ").append(toIndentedString(endingAt)).append("\n");
    sb.append("    subscriptionAt: ").append(toIndentedString(subscriptionAt)).append("\n");
    sb.append("    terminatedAt: ").append(toIndentedString(terminatedAt)).append("\n");
    sb.append("    previousPlanCode: ").append(toIndentedString(previousPlanCode)).append("\n");
    sb.append("    nextPlanCode: ").append(toIndentedString(nextPlanCode)).append("\n");
    sb.append("    downgradePlanDate: ").append(toIndentedString(downgradePlanDate)).append("\n");
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

