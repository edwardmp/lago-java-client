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
import org.openapitools.client.model.WalletUpdateInputWalletRecurringTransactionRulesInner;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * WalletUpdateInputWallet
 */
@JsonPropertyOrder({
  WalletUpdateInputWallet.JSON_PROPERTY_NAME,
  WalletUpdateInputWallet.JSON_PROPERTY_EXPIRATION_AT,
  WalletUpdateInputWallet.JSON_PROPERTY_RECURRING_TRANSACTION_RULES
})
@JsonTypeName("WalletUpdateInput_wallet")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class WalletUpdateInputWallet {
  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXPIRATION_AT = "expiration_at";
  private JsonNullable<OffsetDateTime> expirationAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_RECURRING_TRANSACTION_RULES = "recurring_transaction_rules";
  private List<WalletUpdateInputWalletRecurringTransactionRulesInner> recurringTransactionRules;

  public WalletUpdateInputWallet() {
  }

  public WalletUpdateInputWallet name(String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

   /**
   * The name of the wallet.
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


  public WalletUpdateInputWallet expirationAt(OffsetDateTime expirationAt) {
    this.expirationAt = JsonNullable.<OffsetDateTime>of(expirationAt);
    
    return this;
  }

   /**
   * The date and time that determines when the wallet will expire. It follows the ISO 8601 datetime format and is expressed in Coordinated Universal Time (UTC).
   * @return expirationAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getExpirationAt() {
        return expirationAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPIRATION_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getExpirationAt_JsonNullable() {
    return expirationAt;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPIRATION_AT)
  public void setExpirationAt_JsonNullable(JsonNullable<OffsetDateTime> expirationAt) {
    this.expirationAt = expirationAt;
  }

  public void setExpirationAt(OffsetDateTime expirationAt) {
    this.expirationAt = JsonNullable.<OffsetDateTime>of(expirationAt);
  }


  public WalletUpdateInputWallet recurringTransactionRules(List<WalletUpdateInputWalletRecurringTransactionRulesInner> recurringTransactionRules) {
    
    this.recurringTransactionRules = recurringTransactionRules;
    return this;
  }

  public WalletUpdateInputWallet addRecurringTransactionRulesItem(WalletUpdateInputWalletRecurringTransactionRulesInner recurringTransactionRulesItem) {
    if (this.recurringTransactionRules == null) {
      this.recurringTransactionRules = new ArrayList<>();
    }
    this.recurringTransactionRules.add(recurringTransactionRulesItem);
    return this;
  }

   /**
   * List of recurring transaction rules. Currently, we only allow one recurring rule per wallet.
   * @return recurringTransactionRules
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECURRING_TRANSACTION_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WalletUpdateInputWalletRecurringTransactionRulesInner> getRecurringTransactionRules() {
    return recurringTransactionRules;
  }


  @JsonProperty(JSON_PROPERTY_RECURRING_TRANSACTION_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringTransactionRules(List<WalletUpdateInputWalletRecurringTransactionRulesInner> recurringTransactionRules) {
    this.recurringTransactionRules = recurringTransactionRules;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletUpdateInputWallet walletUpdateInputWallet = (WalletUpdateInputWallet) o;
    return equalsNullable(this.name, walletUpdateInputWallet.name) &&
        equalsNullable(this.expirationAt, walletUpdateInputWallet.expirationAt) &&
        Objects.equals(this.recurringTransactionRules, walletUpdateInputWallet.recurringTransactionRules);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(expirationAt), recurringTransactionRules);
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
    sb.append("class WalletUpdateInputWallet {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    expirationAt: ").append(toIndentedString(expirationAt)).append("\n");
    sb.append("    recurringTransactionRules: ").append(toIndentedString(recurringTransactionRules)).append("\n");
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

