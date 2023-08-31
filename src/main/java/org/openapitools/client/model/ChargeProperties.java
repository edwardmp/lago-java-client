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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ChargePropertiesGraduatedPercentageRangesInner;
import org.openapitools.client.model.ChargePropertiesGraduatedRangesInner;
import org.openapitools.client.model.ChargePropertiesVolumeRangesInner;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ChargeProperties
 */
@JsonPropertyOrder({
  ChargeProperties.JSON_PROPERTY_GRADUATED_RANGES,
  ChargeProperties.JSON_PROPERTY_GRADUATED_PERCENTAGE_RANGES,
  ChargeProperties.JSON_PROPERTY_AMOUNT,
  ChargeProperties.JSON_PROPERTY_FREE_UNITS,
  ChargeProperties.JSON_PROPERTY_PACKAGE_SIZE,
  ChargeProperties.JSON_PROPERTY_RATE,
  ChargeProperties.JSON_PROPERTY_FIXED_AMOUNT,
  ChargeProperties.JSON_PROPERTY_FREE_UNITS_PER_EVENTS,
  ChargeProperties.JSON_PROPERTY_FREE_UNITS_PER_TOTAL_AGGREGATION,
  ChargeProperties.JSON_PROPERTY_PER_TRANSACTION_MAX_AMOUNT,
  ChargeProperties.JSON_PROPERTY_PER_TRANSACTION_MIN_AMOUNT,
  ChargeProperties.JSON_PROPERTY_VOLUME_RANGES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T15:04:44.084574Z[Etc/UTC]")
public class ChargeProperties {
  public static final String JSON_PROPERTY_GRADUATED_RANGES = "graduated_ranges";
  private List<ChargePropertiesGraduatedRangesInner> graduatedRanges;

  public static final String JSON_PROPERTY_GRADUATED_PERCENTAGE_RANGES = "graduated_percentage_ranges";
  private List<ChargePropertiesGraduatedPercentageRangesInner> graduatedPercentageRanges;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  public static final String JSON_PROPERTY_FREE_UNITS = "free_units";
  private Integer freeUnits;

  public static final String JSON_PROPERTY_PACKAGE_SIZE = "package_size";
  private Integer packageSize;

  public static final String JSON_PROPERTY_RATE = "rate";
  private String rate;

  public static final String JSON_PROPERTY_FIXED_AMOUNT = "fixed_amount";
  private String fixedAmount;

  public static final String JSON_PROPERTY_FREE_UNITS_PER_EVENTS = "free_units_per_events";
  private JsonNullable<Integer> freeUnitsPerEvents = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_FREE_UNITS_PER_TOTAL_AGGREGATION = "free_units_per_total_aggregation";
  private JsonNullable<String> freeUnitsPerTotalAggregation = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PER_TRANSACTION_MAX_AMOUNT = "per_transaction_max_amount";
  private JsonNullable<String> perTransactionMaxAmount = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PER_TRANSACTION_MIN_AMOUNT = "per_transaction_min_amount";
  private JsonNullable<String> perTransactionMinAmount = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VOLUME_RANGES = "volume_ranges";
  private List<ChargePropertiesVolumeRangesInner> volumeRanges;

  public ChargeProperties() {
  }

  public ChargeProperties graduatedRanges(List<ChargePropertiesGraduatedRangesInner> graduatedRanges) {
    
    this.graduatedRanges = graduatedRanges;
    return this;
  }

  public ChargeProperties addGraduatedRangesItem(ChargePropertiesGraduatedRangesInner graduatedRangesItem) {
    if (this.graduatedRanges == null) {
      this.graduatedRanges = new ArrayList<>();
    }
    this.graduatedRanges.add(graduatedRangesItem);
    return this;
  }

   /**
   * Graduated ranges, sorted from bottom to top tiers, used for a &#x60;graduated&#x60; charge model.
   * @return graduatedRanges
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRADUATED_RANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ChargePropertiesGraduatedRangesInner> getGraduatedRanges() {
    return graduatedRanges;
  }


  @JsonProperty(JSON_PROPERTY_GRADUATED_RANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGraduatedRanges(List<ChargePropertiesGraduatedRangesInner> graduatedRanges) {
    this.graduatedRanges = graduatedRanges;
  }


  public ChargeProperties graduatedPercentageRanges(List<ChargePropertiesGraduatedPercentageRangesInner> graduatedPercentageRanges) {
    
    this.graduatedPercentageRanges = graduatedPercentageRanges;
    return this;
  }

  public ChargeProperties addGraduatedPercentageRangesItem(ChargePropertiesGraduatedPercentageRangesInner graduatedPercentageRangesItem) {
    if (this.graduatedPercentageRanges == null) {
      this.graduatedPercentageRanges = new ArrayList<>();
    }
    this.graduatedPercentageRanges.add(graduatedPercentageRangesItem);
    return this;
  }

   /**
   * Graduated percentage ranges, sorted from bottom to top tiers, used for a &#x60;graduated_percentage&#x60; charge model.
   * @return graduatedPercentageRanges
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRADUATED_PERCENTAGE_RANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ChargePropertiesGraduatedPercentageRangesInner> getGraduatedPercentageRanges() {
    return graduatedPercentageRanges;
  }


  @JsonProperty(JSON_PROPERTY_GRADUATED_PERCENTAGE_RANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGraduatedPercentageRanges(List<ChargePropertiesGraduatedPercentageRangesInner> graduatedPercentageRanges) {
    this.graduatedPercentageRanges = graduatedPercentageRanges;
  }


  public ChargeProperties amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * - The unit price, excluding tax, for a &#x60;standard&#x60; charge model. It is expressed as a decimal value. - The amount, excluding tax, for a complete set of units in a &#x60;package&#x60; charge model. It is expressed as a decimal value.
   * @return amount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(String amount) {
    this.amount = amount;
  }


  public ChargeProperties freeUnits(Integer freeUnits) {
    
    this.freeUnits = freeUnits;
    return this;
  }

   /**
   * The quantity of units that are provided free of charge for each billing period in a &#x60;package&#x60; charge model. This field specifies the number of units that customers can use without incurring any additional cost during each billing cycle.
   * @return freeUnits
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FREE_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFreeUnits() {
    return freeUnits;
  }


  @JsonProperty(JSON_PROPERTY_FREE_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFreeUnits(Integer freeUnits) {
    this.freeUnits = freeUnits;
  }


  public ChargeProperties packageSize(Integer packageSize) {
    
    this.packageSize = packageSize;
    return this;
  }

   /**
   * The quantity of units included in each pack or set for a &#x60;package&#x60; charge model. It indicates the number of units that are bundled together as a single package or set within the pricing structure.
   * @return packageSize
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PACKAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPackageSize() {
    return packageSize;
  }


  @JsonProperty(JSON_PROPERTY_PACKAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPackageSize(Integer packageSize) {
    this.packageSize = packageSize;
  }


  public ChargeProperties rate(String rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * The percentage rate that is applied to the amount of each transaction for a &#x60;percentage&#x60; charge model. It is expressed as a decimal value.
   * @return rate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRate() {
    return rate;
  }


  @JsonProperty(JSON_PROPERTY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRate(String rate) {
    this.rate = rate;
  }


  public ChargeProperties fixedAmount(String fixedAmount) {
    
    this.fixedAmount = fixedAmount;
    return this;
  }

   /**
   * The fixed fee that is applied to each transaction for a &#x60;percentage&#x60; charge model. It is expressed as a decimal value.
   * @return fixedAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIXED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFixedAmount() {
    return fixedAmount;
  }


  @JsonProperty(JSON_PROPERTY_FIXED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFixedAmount(String fixedAmount) {
    this.fixedAmount = fixedAmount;
  }


  public ChargeProperties freeUnitsPerEvents(Integer freeUnitsPerEvents) {
    this.freeUnitsPerEvents = JsonNullable.<Integer>of(freeUnitsPerEvents);
    
    return this;
  }

   /**
   * The count of transactions that are not impacted by the &#x60;percentage&#x60; rate and fixed fee in a percentage charge model. This field indicates the number of transactions that are exempt from the calculation of charges based on the specified percentage rate and fixed fee.
   * @return freeUnitsPerEvents
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getFreeUnitsPerEvents() {
        return freeUnitsPerEvents.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FREE_UNITS_PER_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getFreeUnitsPerEvents_JsonNullable() {
    return freeUnitsPerEvents;
  }
  
  @JsonProperty(JSON_PROPERTY_FREE_UNITS_PER_EVENTS)
  public void setFreeUnitsPerEvents_JsonNullable(JsonNullable<Integer> freeUnitsPerEvents) {
    this.freeUnitsPerEvents = freeUnitsPerEvents;
  }

  public void setFreeUnitsPerEvents(Integer freeUnitsPerEvents) {
    this.freeUnitsPerEvents = JsonNullable.<Integer>of(freeUnitsPerEvents);
  }


  public ChargeProperties freeUnitsPerTotalAggregation(String freeUnitsPerTotalAggregation) {
    this.freeUnitsPerTotalAggregation = JsonNullable.<String>of(freeUnitsPerTotalAggregation);
    
    return this;
  }

   /**
   * The transaction amount that is not impacted by the &#x60;percentage&#x60; rate and fixed fee in a percentage charge model. This field indicates the portion of the transaction amount that is exempt from the calculation of charges based on the specified percentage rate and fixed fee.
   * @return freeUnitsPerTotalAggregation
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFreeUnitsPerTotalAggregation() {
        return freeUnitsPerTotalAggregation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FREE_UNITS_PER_TOTAL_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFreeUnitsPerTotalAggregation_JsonNullable() {
    return freeUnitsPerTotalAggregation;
  }
  
  @JsonProperty(JSON_PROPERTY_FREE_UNITS_PER_TOTAL_AGGREGATION)
  public void setFreeUnitsPerTotalAggregation_JsonNullable(JsonNullable<String> freeUnitsPerTotalAggregation) {
    this.freeUnitsPerTotalAggregation = freeUnitsPerTotalAggregation;
  }

  public void setFreeUnitsPerTotalAggregation(String freeUnitsPerTotalAggregation) {
    this.freeUnitsPerTotalAggregation = JsonNullable.<String>of(freeUnitsPerTotalAggregation);
  }


  public ChargeProperties perTransactionMaxAmount(String perTransactionMaxAmount) {
    this.perTransactionMaxAmount = JsonNullable.<String>of(perTransactionMaxAmount);
    
    return this;
  }

   /**
   * Specifies the maximum allowable spending for a single transaction. Working as a transaction cap.
   * @return perTransactionMaxAmount
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPerTransactionMaxAmount() {
        return perTransactionMaxAmount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PER_TRANSACTION_MAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPerTransactionMaxAmount_JsonNullable() {
    return perTransactionMaxAmount;
  }
  
  @JsonProperty(JSON_PROPERTY_PER_TRANSACTION_MAX_AMOUNT)
  public void setPerTransactionMaxAmount_JsonNullable(JsonNullable<String> perTransactionMaxAmount) {
    this.perTransactionMaxAmount = perTransactionMaxAmount;
  }

  public void setPerTransactionMaxAmount(String perTransactionMaxAmount) {
    this.perTransactionMaxAmount = JsonNullable.<String>of(perTransactionMaxAmount);
  }


  public ChargeProperties perTransactionMinAmount(String perTransactionMinAmount) {
    this.perTransactionMinAmount = JsonNullable.<String>of(perTransactionMinAmount);
    
    return this;
  }

   /**
   * Specifies the minimum allowable spending for a single transaction. Working as a transaction floor.
   * @return perTransactionMinAmount
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPerTransactionMinAmount() {
        return perTransactionMinAmount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PER_TRANSACTION_MIN_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPerTransactionMinAmount_JsonNullable() {
    return perTransactionMinAmount;
  }
  
  @JsonProperty(JSON_PROPERTY_PER_TRANSACTION_MIN_AMOUNT)
  public void setPerTransactionMinAmount_JsonNullable(JsonNullable<String> perTransactionMinAmount) {
    this.perTransactionMinAmount = perTransactionMinAmount;
  }

  public void setPerTransactionMinAmount(String perTransactionMinAmount) {
    this.perTransactionMinAmount = JsonNullable.<String>of(perTransactionMinAmount);
  }


  public ChargeProperties volumeRanges(List<ChargePropertiesVolumeRangesInner> volumeRanges) {
    
    this.volumeRanges = volumeRanges;
    return this;
  }

  public ChargeProperties addVolumeRangesItem(ChargePropertiesVolumeRangesInner volumeRangesItem) {
    if (this.volumeRanges == null) {
      this.volumeRanges = new ArrayList<>();
    }
    this.volumeRanges.add(volumeRangesItem);
    return this;
  }

   /**
   * Volume ranges, sorted from bottom to top tiers, used for a &#x60;volume&#x60; charge model.
   * @return volumeRanges
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VOLUME_RANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ChargePropertiesVolumeRangesInner> getVolumeRanges() {
    return volumeRanges;
  }


  @JsonProperty(JSON_PROPERTY_VOLUME_RANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolumeRanges(List<ChargePropertiesVolumeRangesInner> volumeRanges) {
    this.volumeRanges = volumeRanges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeProperties chargeProperties = (ChargeProperties) o;
    return Objects.equals(this.graduatedRanges, chargeProperties.graduatedRanges) &&
        Objects.equals(this.graduatedPercentageRanges, chargeProperties.graduatedPercentageRanges) &&
        Objects.equals(this.amount, chargeProperties.amount) &&
        Objects.equals(this.freeUnits, chargeProperties.freeUnits) &&
        Objects.equals(this.packageSize, chargeProperties.packageSize) &&
        Objects.equals(this.rate, chargeProperties.rate) &&
        Objects.equals(this.fixedAmount, chargeProperties.fixedAmount) &&
        equalsNullable(this.freeUnitsPerEvents, chargeProperties.freeUnitsPerEvents) &&
        equalsNullable(this.freeUnitsPerTotalAggregation, chargeProperties.freeUnitsPerTotalAggregation) &&
        equalsNullable(this.perTransactionMaxAmount, chargeProperties.perTransactionMaxAmount) &&
        equalsNullable(this.perTransactionMinAmount, chargeProperties.perTransactionMinAmount) &&
        Objects.equals(this.volumeRanges, chargeProperties.volumeRanges);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(graduatedRanges, graduatedPercentageRanges, amount, freeUnits, packageSize, rate, fixedAmount, hashCodeNullable(freeUnitsPerEvents), hashCodeNullable(freeUnitsPerTotalAggregation), hashCodeNullable(perTransactionMaxAmount), hashCodeNullable(perTransactionMinAmount), volumeRanges);
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
    sb.append("class ChargeProperties {\n");
    sb.append("    graduatedRanges: ").append(toIndentedString(graduatedRanges)).append("\n");
    sb.append("    graduatedPercentageRanges: ").append(toIndentedString(graduatedPercentageRanges)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    freeUnits: ").append(toIndentedString(freeUnits)).append("\n");
    sb.append("    packageSize: ").append(toIndentedString(packageSize)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    fixedAmount: ").append(toIndentedString(fixedAmount)).append("\n");
    sb.append("    freeUnitsPerEvents: ").append(toIndentedString(freeUnitsPerEvents)).append("\n");
    sb.append("    freeUnitsPerTotalAggregation: ").append(toIndentedString(freeUnitsPerTotalAggregation)).append("\n");
    sb.append("    perTransactionMaxAmount: ").append(toIndentedString(perTransactionMaxAmount)).append("\n");
    sb.append("    perTransactionMinAmount: ").append(toIndentedString(perTransactionMinAmount)).append("\n");
    sb.append("    volumeRanges: ").append(toIndentedString(volumeRanges)).append("\n");
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

