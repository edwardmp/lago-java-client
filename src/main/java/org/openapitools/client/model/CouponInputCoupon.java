/*
 * Lago API documentation
 * Lago API allows your application to push customer information and metrics (events) from your application to the billing application.
 *
 * The version of the OpenAPI document: 0.32.0-beta
 * Contact: tech@getlago.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.openapitools.client.model.CouponInputCouponAppliesTo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * CouponInputCoupon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-15T13:40:27.972560Z[Etc/UTC]")
public class CouponInputCoupon {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  /**
   * Coupon type
   */
  @JsonAdapter(CouponTypeEnum.Adapter.class)
  public enum CouponTypeEnum {
    FIXED_AMOUNT("fixed_amount"),
    
    PERCENTAGE("percentage");

    private String value;

    CouponTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CouponTypeEnum fromValue(String value) {
      for (CouponTypeEnum b : CouponTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CouponTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CouponTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CouponTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CouponTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COUPON_TYPE = "coupon_type";
  @SerializedName(SERIALIZED_NAME_COUPON_TYPE)
  private CouponTypeEnum couponType;

  public static final String SERIALIZED_NAME_AMOUNT_CENTS = "amount_cents";
  @SerializedName(SERIALIZED_NAME_AMOUNT_CENTS)
  private Integer amountCents;

  public static final String SERIALIZED_NAME_AMOUNT_CURRENCY = "amount_currency";
  @SerializedName(SERIALIZED_NAME_AMOUNT_CURRENCY)
  private String amountCurrency;

  public static final String SERIALIZED_NAME_REUSABLE = "reusable";
  @SerializedName(SERIALIZED_NAME_REUSABLE)
  private Boolean reusable;

  public static final String SERIALIZED_NAME_PERCENTAGE_RATE = "percentage_rate";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE_RATE)
  private BigDecimal percentageRate;

  /**
   * Frequency type
   */
  @JsonAdapter(FrequencyEnum.Adapter.class)
  public enum FrequencyEnum {
    ONCE("once"),
    
    RECURRING("recurring");

    private String value;

    FrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FrequencyEnum fromValue(String value) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FrequencyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private FrequencyEnum frequency;

  public static final String SERIALIZED_NAME_FREQUENCY_DURATION = "frequency_duration";
  @SerializedName(SERIALIZED_NAME_FREQUENCY_DURATION)
  private Integer frequencyDuration;

  public static final String SERIALIZED_NAME_EXPIRATION_AT = "expiration_at";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_AT)
  private OffsetDateTime expirationAt;

  /**
   * Expiration type
   */
  @JsonAdapter(ExpirationEnum.Adapter.class)
  public enum ExpirationEnum {
    NO_EXPIRATION("no_expiration"),
    
    TIME_LIMIT("time_limit");

    private String value;

    ExpirationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExpirationEnum fromValue(String value) {
      for (ExpirationEnum b : ExpirationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ExpirationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExpirationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExpirationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExpirationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EXPIRATION = "expiration";
  @SerializedName(SERIALIZED_NAME_EXPIRATION)
  private ExpirationEnum expiration;

  public static final String SERIALIZED_NAME_APPLIES_TO = "applies_to";
  @SerializedName(SERIALIZED_NAME_APPLIES_TO)
  private CouponInputCouponAppliesTo appliesTo;

  public CouponInputCoupon() {
  }

  public CouponInputCoupon name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CouponInputCoupon code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public CouponInputCoupon couponType(CouponTypeEnum couponType) {
    
    this.couponType = couponType;
    return this;
  }

   /**
   * Coupon type
   * @return couponType
  **/
  @javax.annotation.Nullable
  public CouponTypeEnum getCouponType() {
    return couponType;
  }


  public void setCouponType(CouponTypeEnum couponType) {
    this.couponType = couponType;
  }


  public CouponInputCoupon amountCents(Integer amountCents) {
    
    this.amountCents = amountCents;
    return this;
  }

   /**
   * Get amountCents
   * @return amountCents
  **/
  @javax.annotation.Nullable
  public Integer getAmountCents() {
    return amountCents;
  }


  public void setAmountCents(Integer amountCents) {
    this.amountCents = amountCents;
  }


  public CouponInputCoupon amountCurrency(String amountCurrency) {
    
    this.amountCurrency = amountCurrency;
    return this;
  }

   /**
   * Get amountCurrency
   * @return amountCurrency
  **/
  @javax.annotation.Nullable
  public String getAmountCurrency() {
    return amountCurrency;
  }


  public void setAmountCurrency(String amountCurrency) {
    this.amountCurrency = amountCurrency;
  }


  public CouponInputCoupon reusable(Boolean reusable) {
    
    this.reusable = reusable;
    return this;
  }

   /**
   * Get reusable
   * @return reusable
  **/
  @javax.annotation.Nullable
  public Boolean getReusable() {
    return reusable;
  }


  public void setReusable(Boolean reusable) {
    this.reusable = reusable;
  }


  public CouponInputCoupon percentageRate(BigDecimal percentageRate) {
    
    this.percentageRate = percentageRate;
    return this;
  }

   /**
   * Get percentageRate
   * @return percentageRate
  **/
  @javax.annotation.Nullable
  public BigDecimal getPercentageRate() {
    return percentageRate;
  }


  public void setPercentageRate(BigDecimal percentageRate) {
    this.percentageRate = percentageRate;
  }


  public CouponInputCoupon frequency(FrequencyEnum frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Frequency type
   * @return frequency
  **/
  @javax.annotation.Nullable
  public FrequencyEnum getFrequency() {
    return frequency;
  }


  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }


  public CouponInputCoupon frequencyDuration(Integer frequencyDuration) {
    
    this.frequencyDuration = frequencyDuration;
    return this;
  }

   /**
   * Get frequencyDuration
   * @return frequencyDuration
  **/
  @javax.annotation.Nullable
  public Integer getFrequencyDuration() {
    return frequencyDuration;
  }


  public void setFrequencyDuration(Integer frequencyDuration) {
    this.frequencyDuration = frequencyDuration;
  }


  public CouponInputCoupon expirationAt(OffsetDateTime expirationAt) {
    
    this.expirationAt = expirationAt;
    return this;
  }

   /**
   * Get expirationAt
   * @return expirationAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getExpirationAt() {
    return expirationAt;
  }


  public void setExpirationAt(OffsetDateTime expirationAt) {
    this.expirationAt = expirationAt;
  }


  public CouponInputCoupon expiration(ExpirationEnum expiration) {
    
    this.expiration = expiration;
    return this;
  }

   /**
   * Expiration type
   * @return expiration
  **/
  @javax.annotation.Nullable
  public ExpirationEnum getExpiration() {
    return expiration;
  }


  public void setExpiration(ExpirationEnum expiration) {
    this.expiration = expiration;
  }


  public CouponInputCoupon appliesTo(CouponInputCouponAppliesTo appliesTo) {
    
    this.appliesTo = appliesTo;
    return this;
  }

   /**
   * Get appliesTo
   * @return appliesTo
  **/
  @javax.annotation.Nullable
  public CouponInputCouponAppliesTo getAppliesTo() {
    return appliesTo;
  }


  public void setAppliesTo(CouponInputCouponAppliesTo appliesTo) {
    this.appliesTo = appliesTo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponInputCoupon couponInputCoupon = (CouponInputCoupon) o;
    return Objects.equals(this.name, couponInputCoupon.name) &&
        Objects.equals(this.code, couponInputCoupon.code) &&
        Objects.equals(this.couponType, couponInputCoupon.couponType) &&
        Objects.equals(this.amountCents, couponInputCoupon.amountCents) &&
        Objects.equals(this.amountCurrency, couponInputCoupon.amountCurrency) &&
        Objects.equals(this.reusable, couponInputCoupon.reusable) &&
        Objects.equals(this.percentageRate, couponInputCoupon.percentageRate) &&
        Objects.equals(this.frequency, couponInputCoupon.frequency) &&
        Objects.equals(this.frequencyDuration, couponInputCoupon.frequencyDuration) &&
        Objects.equals(this.expirationAt, couponInputCoupon.expirationAt) &&
        Objects.equals(this.expiration, couponInputCoupon.expiration) &&
        Objects.equals(this.appliesTo, couponInputCoupon.appliesTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code, couponType, amountCents, amountCurrency, reusable, percentageRate, frequency, frequencyDuration, expirationAt, expiration, appliesTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponInputCoupon {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    couponType: ").append(toIndentedString(couponType)).append("\n");
    sb.append("    amountCents: ").append(toIndentedString(amountCents)).append("\n");
    sb.append("    amountCurrency: ").append(toIndentedString(amountCurrency)).append("\n");
    sb.append("    reusable: ").append(toIndentedString(reusable)).append("\n");
    sb.append("    percentageRate: ").append(toIndentedString(percentageRate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    frequencyDuration: ").append(toIndentedString(frequencyDuration)).append("\n");
    sb.append("    expirationAt: ").append(toIndentedString(expirationAt)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    appliesTo: ").append(toIndentedString(appliesTo)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("name");
    openapiFields.add("code");
    openapiFields.add("coupon_type");
    openapiFields.add("amount_cents");
    openapiFields.add("amount_currency");
    openapiFields.add("reusable");
    openapiFields.add("percentage_rate");
    openapiFields.add("frequency");
    openapiFields.add("frequency_duration");
    openapiFields.add("expiration_at");
    openapiFields.add("expiration");
    openapiFields.add("applies_to");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CouponInputCoupon
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CouponInputCoupon.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CouponInputCoupon is not found in the empty JSON string", CouponInputCoupon.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CouponInputCoupon.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CouponInputCoupon` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("coupon_type") != null && !jsonObj.get("coupon_type").isJsonNull()) && !jsonObj.get("coupon_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coupon_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coupon_type").toString()));
      }
      if ((jsonObj.get("amount_currency") != null && !jsonObj.get("amount_currency").isJsonNull()) && !jsonObj.get("amount_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount_currency").toString()));
      }
      if ((jsonObj.get("frequency") != null && !jsonObj.get("frequency").isJsonNull()) && !jsonObj.get("frequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `frequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frequency").toString()));
      }
      if ((jsonObj.get("expiration") != null && !jsonObj.get("expiration").isJsonNull()) && !jsonObj.get("expiration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiration").toString()));
      }
      // validate the optional field `applies_to`
      if (jsonObj.get("applies_to") != null && !jsonObj.get("applies_to").isJsonNull()) {
        CouponInputCouponAppliesTo.validateJsonObject(jsonObj.getAsJsonObject("applies_to"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CouponInputCoupon.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CouponInputCoupon' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CouponInputCoupon> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CouponInputCoupon.class));

       return (TypeAdapter<T>) new TypeAdapter<CouponInputCoupon>() {
           @Override
           public void write(JsonWriter out, CouponInputCoupon value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CouponInputCoupon read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CouponInputCoupon given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CouponInputCoupon
  * @throws IOException if the JSON string is invalid with respect to CouponInputCoupon
  */
  public static CouponInputCoupon fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CouponInputCoupon.class);
  }

 /**
  * Convert an instance of CouponInputCoupon to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
