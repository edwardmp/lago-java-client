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
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This field represents additional properties associated with the event, which are utilized in the calculation of the final fee. This object becomes mandatory when the targeted billable metric employs a &#x60;sum_agg&#x60;, &#x60;max_agg&#x60;, or &#x60;unique_count_agg&#x60; aggregation method. However, when using a simple &#x60;count_agg&#x60;, this object is not required.
 */
@JsonPropertyOrder({
  EventObjectProperties.JSON_PROPERTY_OPERATION_TYPE
})
@JsonTypeName("EventObject_properties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class EventObjectProperties extends HashMap<String, String> {
  /**
   * The &#x60;operation_type&#x60; field is only necessary when adding or removing a specific unit when the targeted billable metric adopts a &#x60;unique_count_agg&#x60; aggregation method. In other cases, the &#x60;operation_type&#x60; field is not required. The valid values for the &#x60;operation_type&#x60; field are &#x60;add&#x60; or &#x60;remove&#x60;, which indicate whether the unit is being added or removed from the unique count aggregation, respectively.
   */
  public enum OperationTypeEnum {
    ADD("add"),
    
    REMOVE("remove");

    private String value;

    OperationTypeEnum(String value) {
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
    public static OperationTypeEnum fromValue(String value) {
      for (OperationTypeEnum b : OperationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_OPERATION_TYPE = "operation_type";
  private OperationTypeEnum operationType;

  public EventObjectProperties() {

  }

  public EventObjectProperties operationType(OperationTypeEnum operationType) {
    
    this.operationType = operationType;
    return this;
  }

   /**
   * The &#x60;operation_type&#x60; field is only necessary when adding or removing a specific unit when the targeted billable metric adopts a &#x60;unique_count_agg&#x60; aggregation method. In other cases, the &#x60;operation_type&#x60; field is not required. The valid values for the &#x60;operation_type&#x60; field are &#x60;add&#x60; or &#x60;remove&#x60;, which indicate whether the unit is being added or removed from the unique count aggregation, respectively.
   * @return operationType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OperationTypeEnum getOperationType() {
    return operationType;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperationType(OperationTypeEnum operationType) {
    this.operationType = operationType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventObjectProperties eventObjectProperties = (EventObjectProperties) o;
    return Objects.equals(this.operationType, eventObjectProperties.operationType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventObjectProperties {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
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

