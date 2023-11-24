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
import org.openapitools.client.model.WalletCreateInputWallet;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * WalletCreateInput
 */
@JsonPropertyOrder({
  WalletCreateInput.JSON_PROPERTY_WALLET
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:46:07.416771019Z[Etc/UTC]")
public class WalletCreateInput {
  public static final String JSON_PROPERTY_WALLET = "wallet";
  private WalletCreateInputWallet wallet;

  public WalletCreateInput() {
  }

  public WalletCreateInput wallet(WalletCreateInputWallet wallet) {
    
    this.wallet = wallet;
    return this;
  }

   /**
   * Get wallet
   * @return wallet
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WALLET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WalletCreateInputWallet getWallet() {
    return wallet;
  }


  @JsonProperty(JSON_PROPERTY_WALLET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWallet(WalletCreateInputWallet wallet) {
    this.wallet = wallet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletCreateInput walletCreateInput = (WalletCreateInput) o;
    return Objects.equals(this.wallet, walletCreateInput.wallet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wallet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletCreateInput {\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
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
