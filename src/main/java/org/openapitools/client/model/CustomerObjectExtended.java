/*
 * Lago API documentation
 * Lago API allows your application to push customer information and metrics (events) from your application to the billing application.
 *
 * The version of the OpenAPI document: 0.52.0-beta
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.Country;
import org.openapitools.client.model.Currency;
import org.openapitools.client.model.CustomerBillingConfiguration;
import org.openapitools.client.model.CustomerMetadata;
import org.openapitools.client.model.TaxObject;
import org.openapitools.client.model.Timezone;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CustomerObjectExtended
 */
@JsonPropertyOrder({
  CustomerObjectExtended.JSON_PROPERTY_LAGO_ID,
  CustomerObjectExtended.JSON_PROPERTY_SEQUENTIAL_ID,
  CustomerObjectExtended.JSON_PROPERTY_SLUG,
  CustomerObjectExtended.JSON_PROPERTY_EXTERNAL_ID,
  CustomerObjectExtended.JSON_PROPERTY_ADDRESS_LINE1,
  CustomerObjectExtended.JSON_PROPERTY_ADDRESS_LINE2,
  CustomerObjectExtended.JSON_PROPERTY_APPLICABLE_TIMEZONE,
  CustomerObjectExtended.JSON_PROPERTY_CITY,
  CustomerObjectExtended.JSON_PROPERTY_COUNTRY,
  CustomerObjectExtended.JSON_PROPERTY_CURRENCY,
  CustomerObjectExtended.JSON_PROPERTY_EMAIL,
  CustomerObjectExtended.JSON_PROPERTY_LEGAL_NAME,
  CustomerObjectExtended.JSON_PROPERTY_LEGAL_NUMBER,
  CustomerObjectExtended.JSON_PROPERTY_LOGO_URL,
  CustomerObjectExtended.JSON_PROPERTY_NAME,
  CustomerObjectExtended.JSON_PROPERTY_PHONE,
  CustomerObjectExtended.JSON_PROPERTY_STATE,
  CustomerObjectExtended.JSON_PROPERTY_TAX_IDENTIFICATION_NUMBER,
  CustomerObjectExtended.JSON_PROPERTY_TIMEZONE,
  CustomerObjectExtended.JSON_PROPERTY_URL,
  CustomerObjectExtended.JSON_PROPERTY_ZIPCODE,
  CustomerObjectExtended.JSON_PROPERTY_NET_PAYMENT_TERM,
  CustomerObjectExtended.JSON_PROPERTY_CREATED_AT,
  CustomerObjectExtended.JSON_PROPERTY_UPDATED_AT,
  CustomerObjectExtended.JSON_PROPERTY_BILLING_CONFIGURATION,
  CustomerObjectExtended.JSON_PROPERTY_METADATA,
  CustomerObjectExtended.JSON_PROPERTY_TAXES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:46:07.416771019Z[Etc/UTC]")
public class CustomerObjectExtended {
  public static final String JSON_PROPERTY_LAGO_ID = "lago_id";
  private UUID lagoId;

  public static final String JSON_PROPERTY_SEQUENTIAL_ID = "sequential_id";
  private Integer sequentialId;

  public static final String JSON_PROPERTY_SLUG = "slug";
  private String slug;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "external_id";
  private String externalId;

  public static final String JSON_PROPERTY_ADDRESS_LINE1 = "address_line1";
  private JsonNullable<String> addressLine1 = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ADDRESS_LINE2 = "address_line2";
  private JsonNullable<String> addressLine2 = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_APPLICABLE_TIMEZONE = "applicable_timezone";
  private Timezone applicableTimezone;

  public static final String JSON_PROPERTY_CITY = "city";
  private JsonNullable<String> city = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private Country country;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private Currency currency;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LEGAL_NAME = "legal_name";
  private JsonNullable<String> legalName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LEGAL_NUMBER = "legal_number";
  private JsonNullable<String> legalNumber = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LOGO_URL = "logo_url";
  private JsonNullable<String> logoUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PHONE = "phone";
  private JsonNullable<String> phone = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATE = "state";
  private JsonNullable<String> state = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TAX_IDENTIFICATION_NUMBER = "tax_identification_number";
  private JsonNullable<String> taxIdentificationNumber = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private Timezone timezone;

  public static final String JSON_PROPERTY_URL = "url";
  private JsonNullable<String> url = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ZIPCODE = "zipcode";
  private JsonNullable<String> zipcode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NET_PAYMENT_TERM = "net_payment_term";
  private JsonNullable<Integer> netPaymentTerm = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_BILLING_CONFIGURATION = "billing_configuration";
  private CustomerBillingConfiguration billingConfiguration;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private List<CustomerMetadata> metadata;

  public static final String JSON_PROPERTY_TAXES = "taxes";
  private List<TaxObject> taxes;

  public CustomerObjectExtended() {
  }

  public CustomerObjectExtended lagoId(UUID lagoId) {
    
    this.lagoId = lagoId;
    return this;
  }

   /**
   * Unique identifier assigned to the customer within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the customer&#39;s record within the Lago system
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


  public CustomerObjectExtended sequentialId(Integer sequentialId) {
    
    this.sequentialId = sequentialId;
    return this;
  }

   /**
   * The unique identifier assigned to the customer within the organization&#39;s scope. This identifier is used to track and reference the customer&#39;s order of creation within the organization&#39;s system. It ensures that each customer has a distinct &#x60;sequential_id&#x60;&#x60; associated with them, allowing for easy identification and sorting based on the order of creation
   * @return sequentialId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SEQUENTIAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSequentialId() {
    return sequentialId;
  }


  @JsonProperty(JSON_PROPERTY_SEQUENTIAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSequentialId(Integer sequentialId) {
    this.sequentialId = sequentialId;
  }


  public CustomerObjectExtended slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * A concise and unique identifier for the customer, formed by combining the Organization&#39;s &#x60;name&#x60;, &#x60;id&#x60;, and customer&#39;s &#x60;sequential_id&#x60;
   * @return slug
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SLUG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSlug() {
    return slug;
  }


  @JsonProperty(JSON_PROPERTY_SLUG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSlug(String slug) {
    this.slug = slug;
  }


  public CustomerObjectExtended externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * The customer external unique identifier (provided by your own application)
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


  public CustomerObjectExtended addressLine1(String addressLine1) {
    this.addressLine1 = JsonNullable.<String>of(addressLine1);
    
    return this;
  }

   /**
   * The first line of the billing address
   * @return addressLine1
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAddressLine1() {
        return addressLine1.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAddressLine1_JsonNullable() {
    return addressLine1;
  }
  
  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE1)
  public void setAddressLine1_JsonNullable(JsonNullable<String> addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = JsonNullable.<String>of(addressLine1);
  }


  public CustomerObjectExtended addressLine2(String addressLine2) {
    this.addressLine2 = JsonNullable.<String>of(addressLine2);
    
    return this;
  }

   /**
   * The second line of the billing address
   * @return addressLine2
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAddressLine2() {
        return addressLine2.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAddressLine2_JsonNullable() {
    return addressLine2;
  }
  
  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE2)
  public void setAddressLine2_JsonNullable(JsonNullable<String> addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = JsonNullable.<String>of(addressLine2);
  }


  public CustomerObjectExtended applicableTimezone(Timezone applicableTimezone) {
    
    this.applicableTimezone = applicableTimezone;
    return this;
  }

   /**
   * Get applicableTimezone
   * @return applicableTimezone
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_APPLICABLE_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Timezone getApplicableTimezone() {
    return applicableTimezone;
  }


  @JsonProperty(JSON_PROPERTY_APPLICABLE_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApplicableTimezone(Timezone applicableTimezone) {
    this.applicableTimezone = applicableTimezone;
  }


  public CustomerObjectExtended city(String city) {
    this.city = JsonNullable.<String>of(city);
    
    return this;
  }

   /**
   * The city of the customer&#39;s billing address
   * @return city
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCity() {
        return city.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCity_JsonNullable() {
    return city;
  }
  
  @JsonProperty(JSON_PROPERTY_CITY)
  public void setCity_JsonNullable(JsonNullable<String> city) {
    this.city = city;
  }

  public void setCity(String city) {
    this.city = JsonNullable.<String>of(city);
  }


  public CustomerObjectExtended country(Country country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Country getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(Country country) {
    this.country = country;
  }


  public CustomerObjectExtended currency(Currency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Currency getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }


  public CustomerObjectExtended email(String email) {
    this.email = JsonNullable.<String>of(email);
    
    return this;
  }

   /**
   * The email of the customer
   * @return email
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getEmail() {
        return email.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEmail_JsonNullable() {
    return email;
  }
  
  @JsonProperty(JSON_PROPERTY_EMAIL)
  public void setEmail_JsonNullable(JsonNullable<String> email) {
    this.email = email;
  }

  public void setEmail(String email) {
    this.email = JsonNullable.<String>of(email);
  }


  public CustomerObjectExtended legalName(String legalName) {
    this.legalName = JsonNullable.<String>of(legalName);
    
    return this;
  }

   /**
   * The legal company name of the customer
   * @return legalName
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLegalName() {
        return legalName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LEGAL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLegalName_JsonNullable() {
    return legalName;
  }
  
  @JsonProperty(JSON_PROPERTY_LEGAL_NAME)
  public void setLegalName_JsonNullable(JsonNullable<String> legalName) {
    this.legalName = legalName;
  }

  public void setLegalName(String legalName) {
    this.legalName = JsonNullable.<String>of(legalName);
  }


  public CustomerObjectExtended legalNumber(String legalNumber) {
    this.legalNumber = JsonNullable.<String>of(legalNumber);
    
    return this;
  }

   /**
   * The legal company number of the customer
   * @return legalNumber
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLegalNumber() {
        return legalNumber.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LEGAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLegalNumber_JsonNullable() {
    return legalNumber;
  }
  
  @JsonProperty(JSON_PROPERTY_LEGAL_NUMBER)
  public void setLegalNumber_JsonNullable(JsonNullable<String> legalNumber) {
    this.legalNumber = legalNumber;
  }

  public void setLegalNumber(String legalNumber) {
    this.legalNumber = JsonNullable.<String>of(legalNumber);
  }


  public CustomerObjectExtended logoUrl(String logoUrl) {
    this.logoUrl = JsonNullable.<String>of(logoUrl);
    
    return this;
  }

   /**
   * The logo URL of the customer
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLogoUrl() {
        return logoUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOGO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLogoUrl_JsonNullable() {
    return logoUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_LOGO_URL)
  public void setLogoUrl_JsonNullable(JsonNullable<String> logoUrl) {
    this.logoUrl = logoUrl;
  }

  public void setLogoUrl(String logoUrl) {
    this.logoUrl = JsonNullable.<String>of(logoUrl);
  }


  public CustomerObjectExtended name(String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

   /**
   * The full name of the customer
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


  public CustomerObjectExtended phone(String phone) {
    this.phone = JsonNullable.<String>of(phone);
    
    return this;
  }

   /**
   * The phone number of the customer
   * @return phone
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPhone() {
        return phone.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPhone_JsonNullable() {
    return phone;
  }
  
  @JsonProperty(JSON_PROPERTY_PHONE)
  public void setPhone_JsonNullable(JsonNullable<String> phone) {
    this.phone = phone;
  }

  public void setPhone(String phone) {
    this.phone = JsonNullable.<String>of(phone);
  }


  public CustomerObjectExtended state(String state) {
    this.state = JsonNullable.<String>of(state);
    
    return this;
  }

   /**
   * The state of the customer&#39;s billing address
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getState() {
        return state.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getState_JsonNullable() {
    return state;
  }
  
  @JsonProperty(JSON_PROPERTY_STATE)
  public void setState_JsonNullable(JsonNullable<String> state) {
    this.state = state;
  }

  public void setState(String state) {
    this.state = JsonNullable.<String>of(state);
  }


  public CustomerObjectExtended taxIdentificationNumber(String taxIdentificationNumber) {
    this.taxIdentificationNumber = JsonNullable.<String>of(taxIdentificationNumber);
    
    return this;
  }

   /**
   * The tax identification number of the customer
   * @return taxIdentificationNumber
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getTaxIdentificationNumber() {
        return taxIdentificationNumber.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAX_IDENTIFICATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTaxIdentificationNumber_JsonNullable() {
    return taxIdentificationNumber;
  }
  
  @JsonProperty(JSON_PROPERTY_TAX_IDENTIFICATION_NUMBER)
  public void setTaxIdentificationNumber_JsonNullable(JsonNullable<String> taxIdentificationNumber) {
    this.taxIdentificationNumber = taxIdentificationNumber;
  }

  public void setTaxIdentificationNumber(String taxIdentificationNumber) {
    this.taxIdentificationNumber = JsonNullable.<String>of(taxIdentificationNumber);
  }


  public CustomerObjectExtended timezone(Timezone timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Timezone getTimezone() {
    return timezone;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezone(Timezone timezone) {
    this.timezone = timezone;
  }


  public CustomerObjectExtended url(String url) {
    this.url = JsonNullable.<String>of(url);
    
    return this;
  }

   /**
   * The custom website URL of the customer
   * @return url
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getUrl() {
        return url.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUrl_JsonNullable() {
    return url;
  }
  
  @JsonProperty(JSON_PROPERTY_URL)
  public void setUrl_JsonNullable(JsonNullable<String> url) {
    this.url = url;
  }

  public void setUrl(String url) {
    this.url = JsonNullable.<String>of(url);
  }


  public CustomerObjectExtended zipcode(String zipcode) {
    this.zipcode = JsonNullable.<String>of(zipcode);
    
    return this;
  }

   /**
   * The zipcode of the customer&#39;s billing address
   * @return zipcode
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getZipcode() {
        return zipcode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ZIPCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getZipcode_JsonNullable() {
    return zipcode;
  }
  
  @JsonProperty(JSON_PROPERTY_ZIPCODE)
  public void setZipcode_JsonNullable(JsonNullable<String> zipcode) {
    this.zipcode = zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = JsonNullable.<String>of(zipcode);
  }


  public CustomerObjectExtended netPaymentTerm(Integer netPaymentTerm) {
    this.netPaymentTerm = JsonNullable.<Integer>of(netPaymentTerm);
    
    return this;
  }

   /**
   * The net payment term, expressed in days, specifies the duration within which a customer is expected to remit payment after the invoice is finalized.
   * @return netPaymentTerm
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getNetPaymentTerm() {
        return netPaymentTerm.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NET_PAYMENT_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getNetPaymentTerm_JsonNullable() {
    return netPaymentTerm;
  }
  
  @JsonProperty(JSON_PROPERTY_NET_PAYMENT_TERM)
  public void setNetPaymentTerm_JsonNullable(JsonNullable<Integer> netPaymentTerm) {
    this.netPaymentTerm = netPaymentTerm;
  }

  public void setNetPaymentTerm(Integer netPaymentTerm) {
    this.netPaymentTerm = JsonNullable.<Integer>of(netPaymentTerm);
  }


  public CustomerObjectExtended createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date of the customer creation, represented in ISO 8601 datetime format and expressed in Coordinated Universal Time (UTC). The creation_date provides a standardized and internationally recognized timestamp for when the customer object was created
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


  public CustomerObjectExtended updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date of the customer update, represented in ISO 8601 datetime format and expressed in Coordinated Universal Time (UTC). The update_date provides a standardized and internationally recognized timestamp for when the customer object was updated
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public CustomerObjectExtended billingConfiguration(CustomerBillingConfiguration billingConfiguration) {
    
    this.billingConfiguration = billingConfiguration;
    return this;
  }

   /**
   * Get billingConfiguration
   * @return billingConfiguration
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomerBillingConfiguration getBillingConfiguration() {
    return billingConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingConfiguration(CustomerBillingConfiguration billingConfiguration) {
    this.billingConfiguration = billingConfiguration;
  }


  public CustomerObjectExtended metadata(List<CustomerMetadata> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public CustomerObjectExtended addMetadataItem(CustomerMetadata metadataItem) {
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
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CustomerMetadata> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(List<CustomerMetadata> metadata) {
    this.metadata = metadata;
  }


  public CustomerObjectExtended taxes(List<TaxObject> taxes) {
    
    this.taxes = taxes;
    return this;
  }

  public CustomerObjectExtended addTaxesItem(TaxObject taxesItem) {
    if (this.taxes == null) {
      this.taxes = new ArrayList<>();
    }
    this.taxes.add(taxesItem);
    return this;
  }

   /**
   * List of customer taxes
   * @return taxes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TaxObject> getTaxes() {
    return taxes;
  }


  @JsonProperty(JSON_PROPERTY_TAXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxes(List<TaxObject> taxes) {
    this.taxes = taxes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerObjectExtended customerObjectExtended = (CustomerObjectExtended) o;
    return Objects.equals(this.lagoId, customerObjectExtended.lagoId) &&
        Objects.equals(this.sequentialId, customerObjectExtended.sequentialId) &&
        Objects.equals(this.slug, customerObjectExtended.slug) &&
        Objects.equals(this.externalId, customerObjectExtended.externalId) &&
        equalsNullable(this.addressLine1, customerObjectExtended.addressLine1) &&
        equalsNullable(this.addressLine2, customerObjectExtended.addressLine2) &&
        Objects.equals(this.applicableTimezone, customerObjectExtended.applicableTimezone) &&
        equalsNullable(this.city, customerObjectExtended.city) &&
        Objects.equals(this.country, customerObjectExtended.country) &&
        Objects.equals(this.currency, customerObjectExtended.currency) &&
        equalsNullable(this.email, customerObjectExtended.email) &&
        equalsNullable(this.legalName, customerObjectExtended.legalName) &&
        equalsNullable(this.legalNumber, customerObjectExtended.legalNumber) &&
        equalsNullable(this.logoUrl, customerObjectExtended.logoUrl) &&
        equalsNullable(this.name, customerObjectExtended.name) &&
        equalsNullable(this.phone, customerObjectExtended.phone) &&
        equalsNullable(this.state, customerObjectExtended.state) &&
        equalsNullable(this.taxIdentificationNumber, customerObjectExtended.taxIdentificationNumber) &&
        Objects.equals(this.timezone, customerObjectExtended.timezone) &&
        equalsNullable(this.url, customerObjectExtended.url) &&
        equalsNullable(this.zipcode, customerObjectExtended.zipcode) &&
        equalsNullable(this.netPaymentTerm, customerObjectExtended.netPaymentTerm) &&
        Objects.equals(this.createdAt, customerObjectExtended.createdAt) &&
        Objects.equals(this.updatedAt, customerObjectExtended.updatedAt) &&
        Objects.equals(this.billingConfiguration, customerObjectExtended.billingConfiguration) &&
        Objects.equals(this.metadata, customerObjectExtended.metadata) &&
        Objects.equals(this.taxes, customerObjectExtended.taxes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(lagoId, sequentialId, slug, externalId, hashCodeNullable(addressLine1), hashCodeNullable(addressLine2), applicableTimezone, hashCodeNullable(city), country, currency, hashCodeNullable(email), hashCodeNullable(legalName), hashCodeNullable(legalNumber), hashCodeNullable(logoUrl), hashCodeNullable(name), hashCodeNullable(phone), hashCodeNullable(state), hashCodeNullable(taxIdentificationNumber), timezone, hashCodeNullable(url), hashCodeNullable(zipcode), hashCodeNullable(netPaymentTerm), createdAt, updatedAt, billingConfiguration, metadata, taxes);
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
    sb.append("class CustomerObjectExtended {\n");
    sb.append("    lagoId: ").append(toIndentedString(lagoId)).append("\n");
    sb.append("    sequentialId: ").append(toIndentedString(sequentialId)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    applicableTimezone: ").append(toIndentedString(applicableTimezone)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    legalNumber: ").append(toIndentedString(legalNumber)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    taxIdentificationNumber: ").append(toIndentedString(taxIdentificationNumber)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    netPaymentTerm: ").append(toIndentedString(netPaymentTerm)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    billingConfiguration: ").append(toIndentedString(billingConfiguration)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
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
