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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.Country;
import org.openapitools.client.model.Currency;
import org.openapitools.client.model.OrganizationBillingConfiguration;
import org.openapitools.client.model.TaxObject;
import org.openapitools.client.model.Timezone;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OrganizationObject
 */
@JsonPropertyOrder({
  OrganizationObject.JSON_PROPERTY_LAGO_ID,
  OrganizationObject.JSON_PROPERTY_NAME,
  OrganizationObject.JSON_PROPERTY_CREATED_AT,
  OrganizationObject.JSON_PROPERTY_WEBHOOK_URL,
  OrganizationObject.JSON_PROPERTY_WEBHOOK_URLS,
  OrganizationObject.JSON_PROPERTY_COUNTRY,
  OrganizationObject.JSON_PROPERTY_DEFAULT_CURRENCY,
  OrganizationObject.JSON_PROPERTY_ADDRESS_LINE1,
  OrganizationObject.JSON_PROPERTY_ADDRESS_LINE2,
  OrganizationObject.JSON_PROPERTY_STATE,
  OrganizationObject.JSON_PROPERTY_ZIPCODE,
  OrganizationObject.JSON_PROPERTY_EMAIL,
  OrganizationObject.JSON_PROPERTY_CITY,
  OrganizationObject.JSON_PROPERTY_LEGAL_NAME,
  OrganizationObject.JSON_PROPERTY_LEGAL_NUMBER,
  OrganizationObject.JSON_PROPERTY_NET_PAYMENT_TERM,
  OrganizationObject.JSON_PROPERTY_TAX_IDENTIFICATION_NUMBER,
  OrganizationObject.JSON_PROPERTY_TIMEZONE,
  OrganizationObject.JSON_PROPERTY_BILLING_CONFIGURATION,
  OrganizationObject.JSON_PROPERTY_TAXES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class OrganizationObject {
  public static final String JSON_PROPERTY_LAGO_ID = "lago_id";
  private UUID lagoId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_WEBHOOK_URL = "webhook_url";
  private JsonNullable<String> webhookUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_WEBHOOK_URLS = "webhook_urls";
  private JsonNullable<List<String>> webhookUrls = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private Country country;

  public static final String JSON_PROPERTY_DEFAULT_CURRENCY = "default_currency";
  private Currency defaultCurrency;

  public static final String JSON_PROPERTY_ADDRESS_LINE1 = "address_line1";
  private JsonNullable<String> addressLine1 = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ADDRESS_LINE2 = "address_line2";
  private JsonNullable<String> addressLine2 = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATE = "state";
  private JsonNullable<String> state = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ZIPCODE = "zipcode";
  private JsonNullable<String> zipcode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EMAIL = "email";
  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CITY = "city";
  private JsonNullable<String> city = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LEGAL_NAME = "legal_name";
  private JsonNullable<String> legalName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LEGAL_NUMBER = "legal_number";
  private JsonNullable<String> legalNumber = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NET_PAYMENT_TERM = "net_payment_term";
  private Integer netPaymentTerm;

  public static final String JSON_PROPERTY_TAX_IDENTIFICATION_NUMBER = "tax_identification_number";
  private JsonNullable<String> taxIdentificationNumber = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private Timezone timezone;

  public static final String JSON_PROPERTY_BILLING_CONFIGURATION = "billing_configuration";
  private OrganizationBillingConfiguration billingConfiguration;

  public static final String JSON_PROPERTY_TAXES = "taxes";
  private List<TaxObject> taxes;

  public OrganizationObject() {
  }

  public OrganizationObject lagoId(UUID lagoId) {
    
    this.lagoId = lagoId;
    return this;
  }

   /**
   * Unique identifier assigned to the organization within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the organization&#39;s record within the Lago system
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


  public OrganizationObject name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of your organization.
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


  public OrganizationObject createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date of creation of your organization, represented in ISO 8601 datetime format and expressed in Coordinated Universal Time (UTC).
   * @return createdAt
  **/
  @javax.annotation.Nullable
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


  public OrganizationObject webhookUrl(String webhookUrl) {
    this.webhookUrl = JsonNullable.<String>of(webhookUrl);
    
    return this;
  }

   /**
   * The URL of your newest updated webhook endpoint. This URL allows your organization to receive important messages, notifications, or data from the Lago system. By configuring your webhook endpoint to this URL, you can ensure that your organization stays informed and receives relevant information in a timely manner.
   * @return webhookUrl
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getWebhookUrl() {
        return webhookUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getWebhookUrl_JsonNullable() {
    return webhookUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
  public void setWebhookUrl_JsonNullable(JsonNullable<String> webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = JsonNullable.<String>of(webhookUrl);
  }


  public OrganizationObject webhookUrls(List<String> webhookUrls) {
    this.webhookUrls = JsonNullable.<List<String>>of(webhookUrls);
    
    return this;
  }

  public OrganizationObject addWebhookUrlsItem(String webhookUrlsItem) {
    if (this.webhookUrls == null || !this.webhookUrls.isPresent()) {
      this.webhookUrls = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.webhookUrls.get().add(webhookUrlsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * The array containing your webhooks URLs.
   * @return webhookUrls
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public List<String> getWebhookUrls() {
        return webhookUrls.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getWebhookUrls_JsonNullable() {
    return webhookUrls;
  }
  
  @JsonProperty(JSON_PROPERTY_WEBHOOK_URLS)
  public void setWebhookUrls_JsonNullable(JsonNullable<List<String>> webhookUrls) {
    this.webhookUrls = webhookUrls;
  }

  public void setWebhookUrls(List<String> webhookUrls) {
    this.webhookUrls = JsonNullable.<List<String>>of(webhookUrls);
  }


  public OrganizationObject country(Country country) {
    
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


  public OrganizationObject defaultCurrency(Currency defaultCurrency) {
    
    this.defaultCurrency = defaultCurrency;
    return this;
  }

   /**
   * Get defaultCurrency
   * @return defaultCurrency
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Currency getDefaultCurrency() {
    return defaultCurrency;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultCurrency(Currency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }


  public OrganizationObject addressLine1(String addressLine1) {
    this.addressLine1 = JsonNullable.<String>of(addressLine1);
    
    return this;
  }

   /**
   * The first line of your organization’s billing address.
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


  public OrganizationObject addressLine2(String addressLine2) {
    this.addressLine2 = JsonNullable.<String>of(addressLine2);
    
    return this;
  }

   /**
   * The second line of your organization’s billing address.
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


  public OrganizationObject state(String state) {
    this.state = JsonNullable.<String>of(state);
    
    return this;
  }

   /**
   * The state of your organization’s billing address.
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


  public OrganizationObject zipcode(String zipcode) {
    this.zipcode = JsonNullable.<String>of(zipcode);
    
    return this;
  }

   /**
   * The zipcode of your organization’s billing address.
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


  public OrganizationObject email(String email) {
    this.email = JsonNullable.<String>of(email);
    
    return this;
  }

   /**
   * The email address of your organization used to bill your customers.
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


  public OrganizationObject city(String city) {
    this.city = JsonNullable.<String>of(city);
    
    return this;
  }

   /**
   * The city of your organization’s billing address.
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


  public OrganizationObject legalName(String legalName) {
    this.legalName = JsonNullable.<String>of(legalName);
    
    return this;
  }

   /**
   * The legal name of your organization.
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


  public OrganizationObject legalNumber(String legalNumber) {
    this.legalNumber = JsonNullable.<String>of(legalNumber);
    
    return this;
  }

   /**
   * The legal number of your organization.
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


  public OrganizationObject netPaymentTerm(Integer netPaymentTerm) {
    
    this.netPaymentTerm = netPaymentTerm;
    return this;
  }

   /**
   * The net payment term, expressed in days, specifies the duration within which a customer is expected to remit payment after the invoice is finalized.
   * @return netPaymentTerm
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NET_PAYMENT_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNetPaymentTerm() {
    return netPaymentTerm;
  }


  @JsonProperty(JSON_PROPERTY_NET_PAYMENT_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetPaymentTerm(Integer netPaymentTerm) {
    this.netPaymentTerm = netPaymentTerm;
  }


  public OrganizationObject taxIdentificationNumber(String taxIdentificationNumber) {
    this.taxIdentificationNumber = JsonNullable.<String>of(taxIdentificationNumber);
    
    return this;
  }

   /**
   * The tax identification number of your organization.
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


  public OrganizationObject timezone(Timezone timezone) {
    
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


  public OrganizationObject billingConfiguration(OrganizationBillingConfiguration billingConfiguration) {
    
    this.billingConfiguration = billingConfiguration;
    return this;
  }

   /**
   * Get billingConfiguration
   * @return billingConfiguration
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BILLING_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OrganizationBillingConfiguration getBillingConfiguration() {
    return billingConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBillingConfiguration(OrganizationBillingConfiguration billingConfiguration) {
    this.billingConfiguration = billingConfiguration;
  }


  public OrganizationObject taxes(List<TaxObject> taxes) {
    
    this.taxes = taxes;
    return this;
  }

  public OrganizationObject addTaxesItem(TaxObject taxesItem) {
    if (this.taxes == null) {
      this.taxes = new ArrayList<>();
    }
    this.taxes.add(taxesItem);
    return this;
  }

   /**
   * List of default organization taxes
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
    OrganizationObject organizationObject = (OrganizationObject) o;
    return Objects.equals(this.lagoId, organizationObject.lagoId) &&
        Objects.equals(this.name, organizationObject.name) &&
        Objects.equals(this.createdAt, organizationObject.createdAt) &&
        equalsNullable(this.webhookUrl, organizationObject.webhookUrl) &&
        equalsNullable(this.webhookUrls, organizationObject.webhookUrls) &&
        Objects.equals(this.country, organizationObject.country) &&
        Objects.equals(this.defaultCurrency, organizationObject.defaultCurrency) &&
        equalsNullable(this.addressLine1, organizationObject.addressLine1) &&
        equalsNullable(this.addressLine2, organizationObject.addressLine2) &&
        equalsNullable(this.state, organizationObject.state) &&
        equalsNullable(this.zipcode, organizationObject.zipcode) &&
        equalsNullable(this.email, organizationObject.email) &&
        equalsNullable(this.city, organizationObject.city) &&
        equalsNullable(this.legalName, organizationObject.legalName) &&
        equalsNullable(this.legalNumber, organizationObject.legalNumber) &&
        Objects.equals(this.netPaymentTerm, organizationObject.netPaymentTerm) &&
        equalsNullable(this.taxIdentificationNumber, organizationObject.taxIdentificationNumber) &&
        Objects.equals(this.timezone, organizationObject.timezone) &&
        Objects.equals(this.billingConfiguration, organizationObject.billingConfiguration) &&
        Objects.equals(this.taxes, organizationObject.taxes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(lagoId, name, createdAt, hashCodeNullable(webhookUrl), hashCodeNullable(webhookUrls), country, defaultCurrency, hashCodeNullable(addressLine1), hashCodeNullable(addressLine2), hashCodeNullable(state), hashCodeNullable(zipcode), hashCodeNullable(email), hashCodeNullable(city), hashCodeNullable(legalName), hashCodeNullable(legalNumber), netPaymentTerm, hashCodeNullable(taxIdentificationNumber), timezone, billingConfiguration, taxes);
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
    sb.append("class OrganizationObject {\n");
    sb.append("    lagoId: ").append(toIndentedString(lagoId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    webhookUrls: ").append(toIndentedString(webhookUrls)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    legalNumber: ").append(toIndentedString(legalNumber)).append("\n");
    sb.append("    netPaymentTerm: ").append(toIndentedString(netPaymentTerm)).append("\n");
    sb.append("    taxIdentificationNumber: ").append(toIndentedString(taxIdentificationNumber)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    billingConfiguration: ").append(toIndentedString(billingConfiguration)).append("\n");
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

