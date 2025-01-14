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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Configuration specific to the payment provider, utilized for billing the customer. This object contains settings and parameters necessary for processing payments and invoicing the customer.
 */
@JsonPropertyOrder({
  CustomerBillingConfiguration.JSON_PROPERTY_INVOICE_GRACE_PERIOD,
  CustomerBillingConfiguration.JSON_PROPERTY_PAYMENT_PROVIDER,
  CustomerBillingConfiguration.JSON_PROPERTY_PROVIDER_CUSTOMER_ID,
  CustomerBillingConfiguration.JSON_PROPERTY_SYNC,
  CustomerBillingConfiguration.JSON_PROPERTY_SYNC_WITH_PROVIDER,
  CustomerBillingConfiguration.JSON_PROPERTY_DOCUMENT_LOCALE,
  CustomerBillingConfiguration.JSON_PROPERTY_PROVIDER_PAYMENT_METHODS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class CustomerBillingConfiguration {
  public static final String JSON_PROPERTY_INVOICE_GRACE_PERIOD = "invoice_grace_period";
  private Integer invoiceGracePeriod;

  /**
   * The payment provider utilized to initiate payments for invoices issued by Lago. Accepted values: &#x60;stripe&#x60;, &#x60;adyen&#x60;, &#x60;gocardless&#x60; or null. This field is required if you intend to assign a &#x60;provider_customer_id&#x60;.
   */
  public enum PaymentProviderEnum {
    STRIPE("stripe"),
    
    ADYEN("adyen"),
    
    GOCARDLESS("gocardless");

    private String value;

    PaymentProviderEnum(String value) {
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
    public static PaymentProviderEnum fromValue(String value) {
      for (PaymentProviderEnum b : PaymentProviderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PAYMENT_PROVIDER = "payment_provider";
  private PaymentProviderEnum paymentProvider;

  public static final String JSON_PROPERTY_PROVIDER_CUSTOMER_ID = "provider_customer_id";
  private String providerCustomerId;

  public static final String JSON_PROPERTY_SYNC = "sync";
  private Boolean sync;

  public static final String JSON_PROPERTY_SYNC_WITH_PROVIDER = "sync_with_provider";
  private Boolean syncWithProvider;

  public static final String JSON_PROPERTY_DOCUMENT_LOCALE = "document_locale";
  private String documentLocale;

  public static final String JSON_PROPERTY_PROVIDER_PAYMENT_METHODS = "provider_payment_methods";
  private JsonNullable<List<String>> providerPaymentMethods = JsonNullable.<List<String>>undefined();

  public CustomerBillingConfiguration() {
  }

  public CustomerBillingConfiguration invoiceGracePeriod(Integer invoiceGracePeriod) {
    
    this.invoiceGracePeriod = invoiceGracePeriod;
    return this;
  }

   /**
   * The grace period, expressed in days, for the invoice. This period refers to the additional time granted to the customer beyond the invoice due date to adjust usage and line items
   * @return invoiceGracePeriod
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVOICE_GRACE_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInvoiceGracePeriod() {
    return invoiceGracePeriod;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_GRACE_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceGracePeriod(Integer invoiceGracePeriod) {
    this.invoiceGracePeriod = invoiceGracePeriod;
  }


  public CustomerBillingConfiguration paymentProvider(PaymentProviderEnum paymentProvider) {
    
    this.paymentProvider = paymentProvider;
    return this;
  }

   /**
   * The payment provider utilized to initiate payments for invoices issued by Lago. Accepted values: &#x60;stripe&#x60;, &#x60;adyen&#x60;, &#x60;gocardless&#x60; or null. This field is required if you intend to assign a &#x60;provider_customer_id&#x60;.
   * @return paymentProvider
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentProviderEnum getPaymentProvider() {
    return paymentProvider;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentProvider(PaymentProviderEnum paymentProvider) {
    this.paymentProvider = paymentProvider;
  }


  public CustomerBillingConfiguration providerCustomerId(String providerCustomerId) {
    
    this.providerCustomerId = providerCustomerId;
    return this;
  }

   /**
   * The customer ID within the payment provider&#39;s system. If this field is not provided, Lago has the option to create a new customer record within the payment provider&#39;s system on behalf of the customer
   * @return providerCustomerId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProviderCustomerId() {
    return providerCustomerId;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProviderCustomerId(String providerCustomerId) {
    this.providerCustomerId = providerCustomerId;
  }


  public CustomerBillingConfiguration sync(Boolean sync) {
    
    this.sync = sync;
    return this;
  }

   /**
   * Set this field to &#x60;true&#x60; if you want to create the customer in the payment provider synchronously with the customer creation process in Lago. This option is applicable only when the &#x60;provider_customer_id&#x60; is &#x60;null&#x60; and the customer is automatically created in the payment provider through Lago. By default, the value is set to &#x60;false&#x60;
   * @return sync
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSync() {
    return sync;
  }


  @JsonProperty(JSON_PROPERTY_SYNC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSync(Boolean sync) {
    this.sync = sync;
  }


  public CustomerBillingConfiguration syncWithProvider(Boolean syncWithProvider) {
    
    this.syncWithProvider = syncWithProvider;
    return this;
  }

   /**
   * Set this field to &#x60;true&#x60; if you want to create a customer record in the payment provider&#39;s system. This option is applicable only when the &#x60;provider_customer_id&#x60; is null and the &#x60;sync_with_provider&#x60; field is set to &#x60;true&#x60;. By default, the value is set to &#x60;false&#x60;
   * @return syncWithProvider
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNC_WITH_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSyncWithProvider() {
    return syncWithProvider;
  }


  @JsonProperty(JSON_PROPERTY_SYNC_WITH_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSyncWithProvider(Boolean syncWithProvider) {
    this.syncWithProvider = syncWithProvider;
  }


  public CustomerBillingConfiguration documentLocale(String documentLocale) {
    
    this.documentLocale = documentLocale;
    return this;
  }

   /**
   * The document locale, specified in the ISO 639-1 format. This field represents the language or locale used for the documents issued by Lago
   * @return documentLocale
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDocumentLocale() {
    return documentLocale;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentLocale(String documentLocale) {
    this.documentLocale = documentLocale;
  }


  public CustomerBillingConfiguration providerPaymentMethods(List<String> providerPaymentMethods) {
    this.providerPaymentMethods = JsonNullable.<List<String>>of(providerPaymentMethods);
    
    return this;
  }

  public CustomerBillingConfiguration addProviderPaymentMethodsItem(String providerPaymentMethodsItem) {
    if (this.providerPaymentMethods == null || !this.providerPaymentMethods.isPresent()) {
      this.providerPaymentMethods = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.providerPaymentMethods.get().add(providerPaymentMethodsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Specifies the available payment methods that can be used for this customer when &#x60;payment_provider&#x60; is set to &#x60;stripe&#x60;. The &#x60;provider_payment_methods&#x60; field is an array that allows multiple payment options to be defined. If this field is not explicitly set, all the payment methods are selected. For now, possible values are &#x60;card&#x60; and &#x60;sepa_debit&#x60;.
   * @return providerPaymentMethods
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public List<String> getProviderPaymentMethods() {
        return providerPaymentMethods.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROVIDER_PAYMENT_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getProviderPaymentMethods_JsonNullable() {
    return providerPaymentMethods;
  }
  
  @JsonProperty(JSON_PROPERTY_PROVIDER_PAYMENT_METHODS)
  public void setProviderPaymentMethods_JsonNullable(JsonNullable<List<String>> providerPaymentMethods) {
    this.providerPaymentMethods = providerPaymentMethods;
  }

  public void setProviderPaymentMethods(List<String> providerPaymentMethods) {
    this.providerPaymentMethods = JsonNullable.<List<String>>of(providerPaymentMethods);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerBillingConfiguration customerBillingConfiguration = (CustomerBillingConfiguration) o;
    return Objects.equals(this.invoiceGracePeriod, customerBillingConfiguration.invoiceGracePeriod) &&
        Objects.equals(this.paymentProvider, customerBillingConfiguration.paymentProvider) &&
        Objects.equals(this.providerCustomerId, customerBillingConfiguration.providerCustomerId) &&
        Objects.equals(this.sync, customerBillingConfiguration.sync) &&
        Objects.equals(this.syncWithProvider, customerBillingConfiguration.syncWithProvider) &&
        Objects.equals(this.documentLocale, customerBillingConfiguration.documentLocale) &&
        equalsNullable(this.providerPaymentMethods, customerBillingConfiguration.providerPaymentMethods);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceGracePeriod, paymentProvider, providerCustomerId, sync, syncWithProvider, documentLocale, hashCodeNullable(providerPaymentMethods));
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
    sb.append("class CustomerBillingConfiguration {\n");
    sb.append("    invoiceGracePeriod: ").append(toIndentedString(invoiceGracePeriod)).append("\n");
    sb.append("    paymentProvider: ").append(toIndentedString(paymentProvider)).append("\n");
    sb.append("    providerCustomerId: ").append(toIndentedString(providerCustomerId)).append("\n");
    sb.append("    sync: ").append(toIndentedString(sync)).append("\n");
    sb.append("    syncWithProvider: ").append(toIndentedString(syncWithProvider)).append("\n");
    sb.append("    documentLocale: ").append(toIndentedString(documentLocale)).append("\n");
    sb.append("    providerPaymentMethods: ").append(toIndentedString(providerPaymentMethods)).append("\n");
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

