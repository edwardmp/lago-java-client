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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The item attached to the credit.
 */
@JsonPropertyOrder({
  CreditObjectItem.JSON_PROPERTY_LAGO_ITEM_ID,
  CreditObjectItem.JSON_PROPERTY_TYPE,
  CreditObjectItem.JSON_PROPERTY_CODE,
  CreditObjectItem.JSON_PROPERTY_NAME
})
@JsonTypeName("CreditObject_item")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class CreditObjectItem {
  public static final String JSON_PROPERTY_LAGO_ITEM_ID = "lago_item_id";
  private UUID lagoItemId;

  /**
   * The type of credit applied. Possible values are &#x60;coupon&#x60; or &#x60;credit_note&#x60;.
   */
  public enum TypeEnum {
    COUPON("coupon"),
    
    CREDIT_NOTE("credit_note");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public CreditObjectItem() {
  }

  public CreditObjectItem lagoItemId(UUID lagoItemId) {
    
    this.lagoItemId = lagoItemId;
    return this;
  }

   /**
   * Unique identifier assigned to the credit item within the Lago application.
   * @return lagoItemId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAGO_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getLagoItemId() {
    return lagoItemId;
  }


  @JsonProperty(JSON_PROPERTY_LAGO_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLagoItemId(UUID lagoItemId) {
    this.lagoItemId = lagoItemId;
  }


  public CreditObjectItem type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of credit applied. Possible values are &#x60;coupon&#x60; or &#x60;credit_note&#x60;.
   * @return type
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CreditObjectItem code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The code of the credit applied. It can be the code of the coupon attached to the credit or the credit note&#39;s number.
   * @return code
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(String code) {
    this.code = code;
  }


  public CreditObjectItem name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the credit applied. It can be the name of the coupon attached to the credit or the initial invoice&#39;s number linked to the credit note.
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditObjectItem creditObjectItem = (CreditObjectItem) o;
    return Objects.equals(this.lagoItemId, creditObjectItem.lagoItemId) &&
        Objects.equals(this.type, creditObjectItem.type) &&
        Objects.equals(this.code, creditObjectItem.code) &&
        Objects.equals(this.name, creditObjectItem.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lagoItemId, type, code, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditObjectItem {\n");
    sb.append("    lagoItemId: ").append(toIndentedString(lagoItemId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

