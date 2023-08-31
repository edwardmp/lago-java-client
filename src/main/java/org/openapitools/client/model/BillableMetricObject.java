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
import java.time.OffsetDateTime;
import java.util.UUID;
import org.openapitools.client.model.BillableMetricGroup;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BillableMetricObject
 */
@JsonPropertyOrder({
  BillableMetricObject.JSON_PROPERTY_LAGO_ID,
  BillableMetricObject.JSON_PROPERTY_NAME,
  BillableMetricObject.JSON_PROPERTY_CODE,
  BillableMetricObject.JSON_PROPERTY_DESCRIPTION,
  BillableMetricObject.JSON_PROPERTY_RECURRING,
  BillableMetricObject.JSON_PROPERTY_CREATED_AT,
  BillableMetricObject.JSON_PROPERTY_FIELD_NAME,
  BillableMetricObject.JSON_PROPERTY_AGGREGATION_TYPE,
  BillableMetricObject.JSON_PROPERTY_GROUP,
  BillableMetricObject.JSON_PROPERTY_ACTIVE_SUBSCRIPTIONS_COUNT,
  BillableMetricObject.JSON_PROPERTY_DRAFT_INVOICES_COUNT,
  BillableMetricObject.JSON_PROPERTY_PLANS_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T15:04:44.084574Z[Etc/UTC]")
public class BillableMetricObject {
  public static final String JSON_PROPERTY_LAGO_ID = "lago_id";
  private UUID lagoId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RECURRING = "recurring";
  private Boolean recurring;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_FIELD_NAME = "field_name";
  private JsonNullable<String> fieldName = JsonNullable.<String>undefined();

  /**
   * Aggregation method used to compute usage for this billable metric. Possible values are &#x60;count_agg&#x60;, &#x60;sum_agg&#x60;, &#x60;max_agg&#x60; or &#x60;unique_count_agg&#x60;.
   */
  public enum AggregationTypeEnum {
    COUNT_AGG("count_agg"),
    
    SUM_AGG("sum_agg"),
    
    MAX_AGG("max_agg"),
    
    UNIQUE_COUNT_AGG("unique_count_agg");

    private String value;

    AggregationTypeEnum(String value) {
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
    public static AggregationTypeEnum fromValue(String value) {
      for (AggregationTypeEnum b : AggregationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_AGGREGATION_TYPE = "aggregation_type";
  private AggregationTypeEnum aggregationType;

  public static final String JSON_PROPERTY_GROUP = "group";
  private BillableMetricGroup group;

  public static final String JSON_PROPERTY_ACTIVE_SUBSCRIPTIONS_COUNT = "active_subscriptions_count";
  private Integer activeSubscriptionsCount;

  public static final String JSON_PROPERTY_DRAFT_INVOICES_COUNT = "draft_invoices_count";
  private Integer draftInvoicesCount;

  public static final String JSON_PROPERTY_PLANS_COUNT = "plans_count";
  private Integer plansCount;

  public BillableMetricObject() {
  }

  public BillableMetricObject lagoId(UUID lagoId) {
    
    this.lagoId = lagoId;
    return this;
  }

   /**
   * Unique identifier of the billable metric created by Lago.
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


  public BillableMetricObject name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the billable metric.
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public BillableMetricObject code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Unique code used to identify the billable metric associated with the API request. This code associates each event with the correct metric.
   * @return code
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(String code) {
    this.code = code;
  }


  public BillableMetricObject description(String description) {
    this.description = JsonNullable.<String>of(description);
    
    return this;
  }

   /**
   * Internal description of the billable metric.
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public BillableMetricObject recurring(Boolean recurring) {
    
    this.recurring = recurring;
    return this;
  }

   /**
   * Defines if the billable metric is persisted billing period over billing period.  - If set to &#x60;true&#x60;: the accumulated number of units calculated from the previous billing period is persisted to the next billing period. - If set to &#x60;false&#x60;: the accumulated number of units is reset to 0 at the end of the billing period. - If not defined in the request, default value is &#x60;false&#x60;.
   * @return recurring
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RECURRING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getRecurring() {
    return recurring;
  }


  @JsonProperty(JSON_PROPERTY_RECURRING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecurring(Boolean recurring) {
    this.recurring = recurring;
  }


  public BillableMetricObject createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation date of the billable metric.
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


  public BillableMetricObject fieldName(String fieldName) {
    this.fieldName = JsonNullable.<String>of(fieldName);
    
    return this;
  }

   /**
   * Property of the billable metric used for aggregating usage data. This field is not required for &#x60;count_agg&#x60;.
   * @return fieldName
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFieldName() {
        return fieldName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FIELD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFieldName_JsonNullable() {
    return fieldName;
  }
  
  @JsonProperty(JSON_PROPERTY_FIELD_NAME)
  public void setFieldName_JsonNullable(JsonNullable<String> fieldName) {
    this.fieldName = fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = JsonNullable.<String>of(fieldName);
  }


  public BillableMetricObject aggregationType(AggregationTypeEnum aggregationType) {
    
    this.aggregationType = aggregationType;
    return this;
  }

   /**
   * Aggregation method used to compute usage for this billable metric. Possible values are &#x60;count_agg&#x60;, &#x60;sum_agg&#x60;, &#x60;max_agg&#x60; or &#x60;unique_count_agg&#x60;.
   * @return aggregationType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AGGREGATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AggregationTypeEnum getAggregationType() {
    return aggregationType;
  }


  @JsonProperty(JSON_PROPERTY_AGGREGATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAggregationType(AggregationTypeEnum aggregationType) {
    this.aggregationType = aggregationType;
  }


  public BillableMetricObject group(BillableMetricGroup group) {
    
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BillableMetricGroup getGroup() {
    return group;
  }


  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroup(BillableMetricGroup group) {
    this.group = group;
  }


  public BillableMetricObject activeSubscriptionsCount(Integer activeSubscriptionsCount) {
    
    this.activeSubscriptionsCount = activeSubscriptionsCount;
    return this;
  }

   /**
   * Number of active subscriptions using this billable metric.
   * @return activeSubscriptionsCount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACTIVE_SUBSCRIPTIONS_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getActiveSubscriptionsCount() {
    return activeSubscriptionsCount;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_SUBSCRIPTIONS_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setActiveSubscriptionsCount(Integer activeSubscriptionsCount) {
    this.activeSubscriptionsCount = activeSubscriptionsCount;
  }


  public BillableMetricObject draftInvoicesCount(Integer draftInvoicesCount) {
    
    this.draftInvoicesCount = draftInvoicesCount;
    return this;
  }

   /**
   * Number of draft invoices for which this billable metric is listed as an invoice item.
   * @return draftInvoicesCount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DRAFT_INVOICES_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDraftInvoicesCount() {
    return draftInvoicesCount;
  }


  @JsonProperty(JSON_PROPERTY_DRAFT_INVOICES_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDraftInvoicesCount(Integer draftInvoicesCount) {
    this.draftInvoicesCount = draftInvoicesCount;
  }


  public BillableMetricObject plansCount(Integer plansCount) {
    
    this.plansCount = plansCount;
    return this;
  }

   /**
   * Number of plans using this billable metric.
   * @return plansCount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PLANS_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPlansCount() {
    return plansCount;
  }


  @JsonProperty(JSON_PROPERTY_PLANS_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlansCount(Integer plansCount) {
    this.plansCount = plansCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillableMetricObject billableMetricObject = (BillableMetricObject) o;
    return Objects.equals(this.lagoId, billableMetricObject.lagoId) &&
        Objects.equals(this.name, billableMetricObject.name) &&
        Objects.equals(this.code, billableMetricObject.code) &&
        equalsNullable(this.description, billableMetricObject.description) &&
        Objects.equals(this.recurring, billableMetricObject.recurring) &&
        Objects.equals(this.createdAt, billableMetricObject.createdAt) &&
        equalsNullable(this.fieldName, billableMetricObject.fieldName) &&
        Objects.equals(this.aggregationType, billableMetricObject.aggregationType) &&
        Objects.equals(this.group, billableMetricObject.group) &&
        Objects.equals(this.activeSubscriptionsCount, billableMetricObject.activeSubscriptionsCount) &&
        Objects.equals(this.draftInvoicesCount, billableMetricObject.draftInvoicesCount) &&
        Objects.equals(this.plansCount, billableMetricObject.plansCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(lagoId, name, code, hashCodeNullable(description), recurring, createdAt, hashCodeNullable(fieldName), aggregationType, group, activeSubscriptionsCount, draftInvoicesCount, plansCount);
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
    sb.append("class BillableMetricObject {\n");
    sb.append("    lagoId: ").append(toIndentedString(lagoId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    aggregationType: ").append(toIndentedString(aggregationType)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    activeSubscriptionsCount: ").append(toIndentedString(activeSubscriptionsCount)).append("\n");
    sb.append("    draftInvoicesCount: ").append(toIndentedString(draftInvoicesCount)).append("\n");
    sb.append("    plansCount: ").append(toIndentedString(plansCount)).append("\n");
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

