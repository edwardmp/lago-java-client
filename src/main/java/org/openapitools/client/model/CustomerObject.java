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
import java.util.UUID;
import org.openapitools.client.model.BillingConfigurationCustomer;
import org.openapitools.client.model.CustomerMetadataObject;

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
 * CustomerObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-15T13:40:27.972560Z[Etc/UTC]")
public class CustomerObject {
  public static final String SERIALIZED_NAME_LAGO_ID = "lago_id";
  @SerializedName(SERIALIZED_NAME_LAGO_ID)
  private UUID lagoId;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SEQUENTIAL_ID = "sequential_id";
  @SerializedName(SERIALIZED_NAME_SEQUENTIAL_ID)
  private Integer sequentialId;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_ADDRESS_LINE1 = "address_line1";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE1)
  private String addressLine1;

  public static final String SERIALIZED_NAME_ADDRESS_LINE2 = "address_line2";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE2)
  private String addressLine2;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_ZIPCODE = "zipcode";
  @SerializedName(SERIALIZED_NAME_ZIPCODE)
  private String zipcode;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_LAGO_URL = "lago_url";
  @SerializedName(SERIALIZED_NAME_LAGO_URL)
  private String lagoUrl;

  public static final String SERIALIZED_NAME_LEGAL_NAME = "legal_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME)
  private String legalName;

  public static final String SERIALIZED_NAME_LEGAL_NUMBER = "legal_number";
  @SerializedName(SERIALIZED_NAME_LEGAL_NUMBER)
  private String legalNumber;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_APPLICABLE_TIMEZONE = "applicable_timezone";
  @SerializedName(SERIALIZED_NAME_APPLICABLE_TIMEZONE)
  private String applicableTimezone;

  public static final String SERIALIZED_NAME_BILLING_CONFIGURATION = "billing_configuration";
  @SerializedName(SERIALIZED_NAME_BILLING_CONFIGURATION)
  private BillingConfigurationCustomer billingConfiguration;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private List<CustomerMetadataObject> metadata;

  public CustomerObject() {
  }

  public CustomerObject lagoId(UUID lagoId) {
    
    this.lagoId = lagoId;
    return this;
  }

   /**
   * Get lagoId
   * @return lagoId
  **/
  @javax.annotation.Nonnull
  public UUID getLagoId() {
    return lagoId;
  }


  public void setLagoId(UUID lagoId) {
    this.lagoId = lagoId;
  }


  public CustomerObject externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @javax.annotation.Nonnull
  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public CustomerObject name(String name) {
    
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


  public CustomerObject sequentialId(Integer sequentialId) {
    
    this.sequentialId = sequentialId;
    return this;
  }

   /**
   * Get sequentialId
   * @return sequentialId
  **/
  @javax.annotation.Nonnull
  public Integer getSequentialId() {
    return sequentialId;
  }


  public void setSequentialId(Integer sequentialId) {
    this.sequentialId = sequentialId;
  }


  public CustomerObject slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @javax.annotation.Nonnull
  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    this.slug = slug;
  }


  public CustomerObject createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public CustomerObject country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public CustomerObject addressLine1(String addressLine1) {
    
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Get addressLine1
   * @return addressLine1
  **/
  @javax.annotation.Nullable
  public String getAddressLine1() {
    return addressLine1;
  }


  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  public CustomerObject addressLine2(String addressLine2) {
    
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Get addressLine2
   * @return addressLine2
  **/
  @javax.annotation.Nullable
  public String getAddressLine2() {
    return addressLine2;
  }


  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  public CustomerObject state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public CustomerObject zipcode(String zipcode) {
    
    this.zipcode = zipcode;
    return this;
  }

   /**
   * Get zipcode
   * @return zipcode
  **/
  @javax.annotation.Nullable
  public String getZipcode() {
    return zipcode;
  }


  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }


  public CustomerObject email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public CustomerObject city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public CustomerObject url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public CustomerObject phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public CustomerObject lagoUrl(String lagoUrl) {
    
    this.lagoUrl = lagoUrl;
    return this;
  }

   /**
   * Get lagoUrl
   * @return lagoUrl
  **/
  @javax.annotation.Nullable
  public String getLagoUrl() {
    return lagoUrl;
  }


  public void setLagoUrl(String lagoUrl) {
    this.lagoUrl = lagoUrl;
  }


  public CustomerObject legalName(String legalName) {
    
    this.legalName = legalName;
    return this;
  }

   /**
   * Get legalName
   * @return legalName
  **/
  @javax.annotation.Nullable
  public String getLegalName() {
    return legalName;
  }


  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }


  public CustomerObject legalNumber(String legalNumber) {
    
    this.legalNumber = legalNumber;
    return this;
  }

   /**
   * Get legalNumber
   * @return legalNumber
  **/
  @javax.annotation.Nullable
  public String getLegalNumber() {
    return legalNumber;
  }


  public void setLegalNumber(String legalNumber) {
    this.legalNumber = legalNumber;
  }


  public CustomerObject currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public CustomerObject timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public CustomerObject applicableTimezone(String applicableTimezone) {
    
    this.applicableTimezone = applicableTimezone;
    return this;
  }

   /**
   * Get applicableTimezone
   * @return applicableTimezone
  **/
  @javax.annotation.Nullable
  public String getApplicableTimezone() {
    return applicableTimezone;
  }


  public void setApplicableTimezone(String applicableTimezone) {
    this.applicableTimezone = applicableTimezone;
  }


  public CustomerObject billingConfiguration(BillingConfigurationCustomer billingConfiguration) {
    
    this.billingConfiguration = billingConfiguration;
    return this;
  }

   /**
   * Get billingConfiguration
   * @return billingConfiguration
  **/
  @javax.annotation.Nullable
  public BillingConfigurationCustomer getBillingConfiguration() {
    return billingConfiguration;
  }


  public void setBillingConfiguration(BillingConfigurationCustomer billingConfiguration) {
    this.billingConfiguration = billingConfiguration;
  }


  public CustomerObject metadata(List<CustomerMetadataObject> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public CustomerObject addMetadataItem(CustomerMetadataObject metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  public List<CustomerMetadataObject> getMetadata() {
    return metadata;
  }


  public void setMetadata(List<CustomerMetadataObject> metadata) {
    this.metadata = metadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerObject customerObject = (CustomerObject) o;
    return Objects.equals(this.lagoId, customerObject.lagoId) &&
        Objects.equals(this.externalId, customerObject.externalId) &&
        Objects.equals(this.name, customerObject.name) &&
        Objects.equals(this.sequentialId, customerObject.sequentialId) &&
        Objects.equals(this.slug, customerObject.slug) &&
        Objects.equals(this.createdAt, customerObject.createdAt) &&
        Objects.equals(this.country, customerObject.country) &&
        Objects.equals(this.addressLine1, customerObject.addressLine1) &&
        Objects.equals(this.addressLine2, customerObject.addressLine2) &&
        Objects.equals(this.state, customerObject.state) &&
        Objects.equals(this.zipcode, customerObject.zipcode) &&
        Objects.equals(this.email, customerObject.email) &&
        Objects.equals(this.city, customerObject.city) &&
        Objects.equals(this.url, customerObject.url) &&
        Objects.equals(this.phone, customerObject.phone) &&
        Objects.equals(this.lagoUrl, customerObject.lagoUrl) &&
        Objects.equals(this.legalName, customerObject.legalName) &&
        Objects.equals(this.legalNumber, customerObject.legalNumber) &&
        Objects.equals(this.currency, customerObject.currency) &&
        Objects.equals(this.timezone, customerObject.timezone) &&
        Objects.equals(this.applicableTimezone, customerObject.applicableTimezone) &&
        Objects.equals(this.billingConfiguration, customerObject.billingConfiguration) &&
        Objects.equals(this.metadata, customerObject.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lagoId, externalId, name, sequentialId, slug, createdAt, country, addressLine1, addressLine2, state, zipcode, email, city, url, phone, lagoUrl, legalName, legalNumber, currency, timezone, applicableTimezone, billingConfiguration, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerObject {\n");
    sb.append("    lagoId: ").append(toIndentedString(lagoId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sequentialId: ").append(toIndentedString(sequentialId)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    lagoUrl: ").append(toIndentedString(lagoUrl)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    legalNumber: ").append(toIndentedString(legalNumber)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    applicableTimezone: ").append(toIndentedString(applicableTimezone)).append("\n");
    sb.append("    billingConfiguration: ").append(toIndentedString(billingConfiguration)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("lago_id");
    openapiFields.add("external_id");
    openapiFields.add("name");
    openapiFields.add("sequential_id");
    openapiFields.add("slug");
    openapiFields.add("created_at");
    openapiFields.add("country");
    openapiFields.add("address_line1");
    openapiFields.add("address_line2");
    openapiFields.add("state");
    openapiFields.add("zipcode");
    openapiFields.add("email");
    openapiFields.add("city");
    openapiFields.add("url");
    openapiFields.add("phone");
    openapiFields.add("lago_url");
    openapiFields.add("legal_name");
    openapiFields.add("legal_number");
    openapiFields.add("currency");
    openapiFields.add("timezone");
    openapiFields.add("applicable_timezone");
    openapiFields.add("billing_configuration");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("lago_id");
    openapiRequiredFields.add("external_id");
    openapiRequiredFields.add("sequential_id");
    openapiRequiredFields.add("slug");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomerObject
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomerObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerObject is not found in the empty JSON string", CustomerObject.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomerObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerObject` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomerObject.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("lago_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lago_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lago_id").toString()));
      }
      if (!jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("address_line1") != null && !jsonObj.get("address_line1").isJsonNull()) && !jsonObj.get("address_line1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line1").toString()));
      }
      if ((jsonObj.get("address_line2") != null && !jsonObj.get("address_line2").isJsonNull()) && !jsonObj.get("address_line2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line2").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("zipcode") != null && !jsonObj.get("zipcode").isJsonNull()) && !jsonObj.get("zipcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zipcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zipcode").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("lago_url") != null && !jsonObj.get("lago_url").isJsonNull()) && !jsonObj.get("lago_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lago_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lago_url").toString()));
      }
      if ((jsonObj.get("legal_name") != null && !jsonObj.get("legal_name").isJsonNull()) && !jsonObj.get("legal_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_name").toString()));
      }
      if ((jsonObj.get("legal_number") != null && !jsonObj.get("legal_number").isJsonNull()) && !jsonObj.get("legal_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_number").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      if ((jsonObj.get("applicable_timezone") != null && !jsonObj.get("applicable_timezone").isJsonNull()) && !jsonObj.get("applicable_timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `applicable_timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("applicable_timezone").toString()));
      }
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        JsonArray jsonArraymetadata = jsonObj.getAsJsonArray("metadata");
        if (jsonArraymetadata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("metadata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `metadata` to be an array in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
          }

          // validate the optional field `metadata` (array)
          for (int i = 0; i < jsonArraymetadata.size(); i++) {
            CustomerMetadataObject.validateJsonObject(jsonArraymetadata.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerObject.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerObject>() {
           @Override
           public void write(JsonWriter out, CustomerObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerObject read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerObject
  * @throws IOException if the JSON string is invalid with respect to CustomerObject
  */
  public static CustomerObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerObject.class);
  }

 /**
  * Convert an instance of CustomerObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
