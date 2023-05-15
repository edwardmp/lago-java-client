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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ChargeUsageObject;

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
 * CustomerUsageObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-15T13:40:27.972560Z[Etc/UTC]")
public class CustomerUsageObject {
  public static final String SERIALIZED_NAME_FROM_DATETIME = "from_datetime";
  @SerializedName(SERIALIZED_NAME_FROM_DATETIME)
  private OffsetDateTime fromDatetime;

  public static final String SERIALIZED_NAME_TO_DATETIME = "to_datetime";
  @SerializedName(SERIALIZED_NAME_TO_DATETIME)
  private OffsetDateTime toDatetime;

  public static final String SERIALIZED_NAME_ISSUING_DATE = "issuing_date";
  @SerializedName(SERIALIZED_NAME_ISSUING_DATE)
  private OffsetDateTime issuingDate;

  public static final String SERIALIZED_NAME_AMOUNT_CENTS = "amount_cents";
  @SerializedName(SERIALIZED_NAME_AMOUNT_CENTS)
  private Integer amountCents;

  public static final String SERIALIZED_NAME_AMOUNT_CURRENCY = "amount_currency";
  @SerializedName(SERIALIZED_NAME_AMOUNT_CURRENCY)
  private String amountCurrency;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT_CENTS = "total_amount_cents";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT_CENTS)
  private Integer totalAmountCents;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT_CURRENCY = "total_amount_currency";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT_CURRENCY)
  private String totalAmountCurrency;

  public static final String SERIALIZED_NAME_VAT_AMOUNT_CENTS = "vat_amount_cents";
  @SerializedName(SERIALIZED_NAME_VAT_AMOUNT_CENTS)
  private Integer vatAmountCents;

  public static final String SERIALIZED_NAME_VAT_AMOUNT_CURRENCY = "vat_amount_currency";
  @SerializedName(SERIALIZED_NAME_VAT_AMOUNT_CURRENCY)
  private String vatAmountCurrency;

  public static final String SERIALIZED_NAME_CHARGES_USAGE = "charges_usage";
  @SerializedName(SERIALIZED_NAME_CHARGES_USAGE)
  private List<ChargeUsageObject> chargesUsage = new ArrayList<>();

  public CustomerUsageObject() {
  }

  public CustomerUsageObject fromDatetime(OffsetDateTime fromDatetime) {
    
    this.fromDatetime = fromDatetime;
    return this;
  }

   /**
   * Get fromDatetime
   * @return fromDatetime
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getFromDatetime() {
    return fromDatetime;
  }


  public void setFromDatetime(OffsetDateTime fromDatetime) {
    this.fromDatetime = fromDatetime;
  }


  public CustomerUsageObject toDatetime(OffsetDateTime toDatetime) {
    
    this.toDatetime = toDatetime;
    return this;
  }

   /**
   * Get toDatetime
   * @return toDatetime
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getToDatetime() {
    return toDatetime;
  }


  public void setToDatetime(OffsetDateTime toDatetime) {
    this.toDatetime = toDatetime;
  }


  public CustomerUsageObject issuingDate(OffsetDateTime issuingDate) {
    
    this.issuingDate = issuingDate;
    return this;
  }

   /**
   * Get issuingDate
   * @return issuingDate
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getIssuingDate() {
    return issuingDate;
  }


  public void setIssuingDate(OffsetDateTime issuingDate) {
    this.issuingDate = issuingDate;
  }


  public CustomerUsageObject amountCents(Integer amountCents) {
    
    this.amountCents = amountCents;
    return this;
  }

   /**
   * Get amountCents
   * @return amountCents
  **/
  @javax.annotation.Nonnull
  public Integer getAmountCents() {
    return amountCents;
  }


  public void setAmountCents(Integer amountCents) {
    this.amountCents = amountCents;
  }


  public CustomerUsageObject amountCurrency(String amountCurrency) {
    
    this.amountCurrency = amountCurrency;
    return this;
  }

   /**
   * Get amountCurrency
   * @return amountCurrency
  **/
  @javax.annotation.Nonnull
  public String getAmountCurrency() {
    return amountCurrency;
  }


  public void setAmountCurrency(String amountCurrency) {
    this.amountCurrency = amountCurrency;
  }


  public CustomerUsageObject totalAmountCents(Integer totalAmountCents) {
    
    this.totalAmountCents = totalAmountCents;
    return this;
  }

   /**
   * Get totalAmountCents
   * @return totalAmountCents
  **/
  @javax.annotation.Nonnull
  public Integer getTotalAmountCents() {
    return totalAmountCents;
  }


  public void setTotalAmountCents(Integer totalAmountCents) {
    this.totalAmountCents = totalAmountCents;
  }


  public CustomerUsageObject totalAmountCurrency(String totalAmountCurrency) {
    
    this.totalAmountCurrency = totalAmountCurrency;
    return this;
  }

   /**
   * Get totalAmountCurrency
   * @return totalAmountCurrency
  **/
  @javax.annotation.Nonnull
  public String getTotalAmountCurrency() {
    return totalAmountCurrency;
  }


  public void setTotalAmountCurrency(String totalAmountCurrency) {
    this.totalAmountCurrency = totalAmountCurrency;
  }


  public CustomerUsageObject vatAmountCents(Integer vatAmountCents) {
    
    this.vatAmountCents = vatAmountCents;
    return this;
  }

   /**
   * Get vatAmountCents
   * @return vatAmountCents
  **/
  @javax.annotation.Nonnull
  public Integer getVatAmountCents() {
    return vatAmountCents;
  }


  public void setVatAmountCents(Integer vatAmountCents) {
    this.vatAmountCents = vatAmountCents;
  }


  public CustomerUsageObject vatAmountCurrency(String vatAmountCurrency) {
    
    this.vatAmountCurrency = vatAmountCurrency;
    return this;
  }

   /**
   * Get vatAmountCurrency
   * @return vatAmountCurrency
  **/
  @javax.annotation.Nonnull
  public String getVatAmountCurrency() {
    return vatAmountCurrency;
  }


  public void setVatAmountCurrency(String vatAmountCurrency) {
    this.vatAmountCurrency = vatAmountCurrency;
  }


  public CustomerUsageObject chargesUsage(List<ChargeUsageObject> chargesUsage) {
    
    this.chargesUsage = chargesUsage;
    return this;
  }

  public CustomerUsageObject addChargesUsageItem(ChargeUsageObject chargesUsageItem) {
    if (this.chargesUsage == null) {
      this.chargesUsage = new ArrayList<>();
    }
    this.chargesUsage.add(chargesUsageItem);
    return this;
  }

   /**
   * Get chargesUsage
   * @return chargesUsage
  **/
  @javax.annotation.Nonnull
  public List<ChargeUsageObject> getChargesUsage() {
    return chargesUsage;
  }


  public void setChargesUsage(List<ChargeUsageObject> chargesUsage) {
    this.chargesUsage = chargesUsage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerUsageObject customerUsageObject = (CustomerUsageObject) o;
    return Objects.equals(this.fromDatetime, customerUsageObject.fromDatetime) &&
        Objects.equals(this.toDatetime, customerUsageObject.toDatetime) &&
        Objects.equals(this.issuingDate, customerUsageObject.issuingDate) &&
        Objects.equals(this.amountCents, customerUsageObject.amountCents) &&
        Objects.equals(this.amountCurrency, customerUsageObject.amountCurrency) &&
        Objects.equals(this.totalAmountCents, customerUsageObject.totalAmountCents) &&
        Objects.equals(this.totalAmountCurrency, customerUsageObject.totalAmountCurrency) &&
        Objects.equals(this.vatAmountCents, customerUsageObject.vatAmountCents) &&
        Objects.equals(this.vatAmountCurrency, customerUsageObject.vatAmountCurrency) &&
        Objects.equals(this.chargesUsage, customerUsageObject.chargesUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromDatetime, toDatetime, issuingDate, amountCents, amountCurrency, totalAmountCents, totalAmountCurrency, vatAmountCents, vatAmountCurrency, chargesUsage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerUsageObject {\n");
    sb.append("    fromDatetime: ").append(toIndentedString(fromDatetime)).append("\n");
    sb.append("    toDatetime: ").append(toIndentedString(toDatetime)).append("\n");
    sb.append("    issuingDate: ").append(toIndentedString(issuingDate)).append("\n");
    sb.append("    amountCents: ").append(toIndentedString(amountCents)).append("\n");
    sb.append("    amountCurrency: ").append(toIndentedString(amountCurrency)).append("\n");
    sb.append("    totalAmountCents: ").append(toIndentedString(totalAmountCents)).append("\n");
    sb.append("    totalAmountCurrency: ").append(toIndentedString(totalAmountCurrency)).append("\n");
    sb.append("    vatAmountCents: ").append(toIndentedString(vatAmountCents)).append("\n");
    sb.append("    vatAmountCurrency: ").append(toIndentedString(vatAmountCurrency)).append("\n");
    sb.append("    chargesUsage: ").append(toIndentedString(chargesUsage)).append("\n");
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
    openapiFields.add("from_datetime");
    openapiFields.add("to_datetime");
    openapiFields.add("issuing_date");
    openapiFields.add("amount_cents");
    openapiFields.add("amount_currency");
    openapiFields.add("total_amount_cents");
    openapiFields.add("total_amount_currency");
    openapiFields.add("vat_amount_cents");
    openapiFields.add("vat_amount_currency");
    openapiFields.add("charges_usage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("from_datetime");
    openapiRequiredFields.add("to_datetime");
    openapiRequiredFields.add("issuing_date");
    openapiRequiredFields.add("amount_cents");
    openapiRequiredFields.add("amount_currency");
    openapiRequiredFields.add("total_amount_cents");
    openapiRequiredFields.add("total_amount_currency");
    openapiRequiredFields.add("vat_amount_cents");
    openapiRequiredFields.add("vat_amount_currency");
    openapiRequiredFields.add("charges_usage");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomerUsageObject
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomerUsageObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerUsageObject is not found in the empty JSON string", CustomerUsageObject.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomerUsageObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerUsageObject` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomerUsageObject.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("amount_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount_currency").toString()));
      }
      if (!jsonObj.get("total_amount_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_amount_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_amount_currency").toString()));
      }
      if (!jsonObj.get("vat_amount_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vat_amount_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vat_amount_currency").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("charges_usage").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `charges_usage` to be an array in the JSON string but got `%s`", jsonObj.get("charges_usage").toString()));
      }

      JsonArray jsonArraychargesUsage = jsonObj.getAsJsonArray("charges_usage");
      // validate the required field `charges_usage` (array)
      for (int i = 0; i < jsonArraychargesUsage.size(); i++) {
        ChargeUsageObject.validateJsonObject(jsonArraychargesUsage.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerUsageObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerUsageObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerUsageObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerUsageObject.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerUsageObject>() {
           @Override
           public void write(JsonWriter out, CustomerUsageObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerUsageObject read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerUsageObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerUsageObject
  * @throws IOException if the JSON string is invalid with respect to CustomerUsageObject
  */
  public static CustomerUsageObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerUsageObject.class);
  }

 /**
  * Convert an instance of CustomerUsageObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
