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
import org.openapitools.client.model.AppliedAddOnObject;

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
 * AppliedAddOn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-15T13:40:27.972560Z[Etc/UTC]")
public class AppliedAddOn {
  public static final String SERIALIZED_NAME_APPLIED_ADD_ON = "applied_add_on";
  @SerializedName(SERIALIZED_NAME_APPLIED_ADD_ON)
  private AppliedAddOnObject appliedAddOn;

  public AppliedAddOn() {
  }

  public AppliedAddOn appliedAddOn(AppliedAddOnObject appliedAddOn) {
    
    this.appliedAddOn = appliedAddOn;
    return this;
  }

   /**
   * Get appliedAddOn
   * @return appliedAddOn
  **/
  @javax.annotation.Nonnull
  public AppliedAddOnObject getAppliedAddOn() {
    return appliedAddOn;
  }


  public void setAppliedAddOn(AppliedAddOnObject appliedAddOn) {
    this.appliedAddOn = appliedAddOn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppliedAddOn appliedAddOn = (AppliedAddOn) o;
    return Objects.equals(this.appliedAddOn, appliedAddOn.appliedAddOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedAddOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppliedAddOn {\n");
    sb.append("    appliedAddOn: ").append(toIndentedString(appliedAddOn)).append("\n");
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
    openapiFields.add("applied_add_on");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("applied_add_on");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AppliedAddOn
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AppliedAddOn.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppliedAddOn is not found in the empty JSON string", AppliedAddOn.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AppliedAddOn.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppliedAddOn` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AppliedAddOn.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `applied_add_on`
      AppliedAddOnObject.validateJsonObject(jsonObj.getAsJsonObject("applied_add_on"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppliedAddOn.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppliedAddOn' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppliedAddOn> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppliedAddOn.class));

       return (TypeAdapter<T>) new TypeAdapter<AppliedAddOn>() {
           @Override
           public void write(JsonWriter out, AppliedAddOn value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppliedAddOn read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppliedAddOn given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppliedAddOn
  * @throws IOException if the JSON string is invalid with respect to AppliedAddOn
  */
  public static AppliedAddOn fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppliedAddOn.class);
  }

 /**
  * Convert an instance of AppliedAddOn to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
