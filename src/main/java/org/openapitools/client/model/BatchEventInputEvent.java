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
import java.util.ArrayList;
import java.util.List;

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
 * BatchEventInputEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-15T13:40:27.972560Z[Etc/UTC]")
public class BatchEventInputEvent {
  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transaction_id";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_EXTERNAL_CUSTOMER_ID = "external_customer_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_CUSTOMER_ID)
  private String externalCustomerId;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_EXTERNAL_SUBSCRIPTION_IDS = "external_subscription_ids";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBSCRIPTION_IDS)
  private List<String> externalSubscriptionIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Object properties;

  public BatchEventInputEvent() {
  }

  public BatchEventInputEvent transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @javax.annotation.Nonnull
  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public BatchEventInputEvent externalCustomerId(String externalCustomerId) {
    
    this.externalCustomerId = externalCustomerId;
    return this;
  }

   /**
   * Get externalCustomerId
   * @return externalCustomerId
  **/
  @javax.annotation.Nullable
  public String getExternalCustomerId() {
    return externalCustomerId;
  }


  public void setExternalCustomerId(String externalCustomerId) {
    this.externalCustomerId = externalCustomerId;
  }


  public BatchEventInputEvent code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nonnull
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public BatchEventInputEvent timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public BatchEventInputEvent externalSubscriptionIds(List<String> externalSubscriptionIds) {
    
    this.externalSubscriptionIds = externalSubscriptionIds;
    return this;
  }

  public BatchEventInputEvent addExternalSubscriptionIdsItem(String externalSubscriptionIdsItem) {
    if (this.externalSubscriptionIds == null) {
      this.externalSubscriptionIds = new ArrayList<>();
    }
    this.externalSubscriptionIds.add(externalSubscriptionIdsItem);
    return this;
  }

   /**
   * Get externalSubscriptionIds
   * @return externalSubscriptionIds
  **/
  @javax.annotation.Nonnull
  public List<String> getExternalSubscriptionIds() {
    return externalSubscriptionIds;
  }


  public void setExternalSubscriptionIds(List<String> externalSubscriptionIds) {
    this.externalSubscriptionIds = externalSubscriptionIds;
  }


  public BatchEventInputEvent properties(Object properties) {
    
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  public Object getProperties() {
    return properties;
  }


  public void setProperties(Object properties) {
    this.properties = properties;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchEventInputEvent batchEventInputEvent = (BatchEventInputEvent) o;
    return Objects.equals(this.transactionId, batchEventInputEvent.transactionId) &&
        Objects.equals(this.externalCustomerId, batchEventInputEvent.externalCustomerId) &&
        Objects.equals(this.code, batchEventInputEvent.code) &&
        Objects.equals(this.timestamp, batchEventInputEvent.timestamp) &&
        Objects.equals(this.externalSubscriptionIds, batchEventInputEvent.externalSubscriptionIds) &&
        Objects.equals(this.properties, batchEventInputEvent.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, externalCustomerId, code, timestamp, externalSubscriptionIds, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchEventInputEvent {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    externalCustomerId: ").append(toIndentedString(externalCustomerId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    externalSubscriptionIds: ").append(toIndentedString(externalSubscriptionIds)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
    openapiFields.add("transaction_id");
    openapiFields.add("external_customer_id");
    openapiFields.add("code");
    openapiFields.add("timestamp");
    openapiFields.add("external_subscription_ids");
    openapiFields.add("properties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("transaction_id");
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("external_subscription_ids");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BatchEventInputEvent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BatchEventInputEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BatchEventInputEvent is not found in the empty JSON string", BatchEventInputEvent.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BatchEventInputEvent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BatchEventInputEvent` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BatchEventInputEvent.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("transaction_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_id").toString()));
      }
      if ((jsonObj.get("external_customer_id") != null && !jsonObj.get("external_customer_id").isJsonNull()) && !jsonObj.get("external_customer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_customer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_customer_id").toString()));
      }
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("external_subscription_ids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("external_subscription_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_subscription_ids` to be an array in the JSON string but got `%s`", jsonObj.get("external_subscription_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BatchEventInputEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BatchEventInputEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BatchEventInputEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BatchEventInputEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<BatchEventInputEvent>() {
           @Override
           public void write(JsonWriter out, BatchEventInputEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BatchEventInputEvent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BatchEventInputEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BatchEventInputEvent
  * @throws IOException if the JSON string is invalid with respect to BatchEventInputEvent
  */
  public static BatchEventInputEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BatchEventInputEvent.class);
  }

 /**
  * Convert an instance of BatchEventInputEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
