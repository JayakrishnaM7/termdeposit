package com.org.ibm.model.traderpositionmanagement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TradeDealBlotterFunction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:34.801Z[GMT]")

public class TradeDealBlotterFunction   {
  @JsonProperty("Preconditions")
  private Object preconditions;

  @JsonProperty("Schedule")
  private Object schedule;

  @JsonProperty("BusinessService")
  private Object businessService;

  @JsonProperty("TradedPositionOperatingSessionReference")
  private String tradedPositionOperatingSessionReference;

  @JsonProperty("TradeDealBlotterFunctionReference")
  private String tradeDealBlotterFunctionReference;

  @JsonProperty("TradeDealBlotterFunctionType")
  private String tradeDealBlotterFunctionType;

  public TradeDealBlotterFunction preconditions(Object preconditions) {
    this.preconditions = preconditions;
    return this;
  }

  /**
   * Get preconditions
   * @return preconditions
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPreconditions() {
    return preconditions;
  }

  public void setPreconditions(Object preconditions) {
    this.preconditions = preconditions;
  }

  public TradeDealBlotterFunction schedule(Object schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Get schedule
   * @return schedule
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getSchedule() {
    return schedule;
  }

  public void setSchedule(Object schedule) {
    this.schedule = schedule;
  }

  public TradeDealBlotterFunction businessService(Object businessService) {
    this.businessService = businessService;
    return this;
  }

  /**
   * Get businessService
   * @return businessService
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBusinessService() {
    return businessService;
  }

  public void setBusinessService(Object businessService) {
    this.businessService = businessService;
  }

  public TradeDealBlotterFunction tradedPositionOperatingSessionReference(String tradedPositionOperatingSessionReference) {
    this.tradedPositionOperatingSessionReference = tradedPositionOperatingSessionReference;
    return this;
  }

  /**
   * Get tradedPositionOperatingSessionReference
   * @return tradedPositionOperatingSessionReference
  */
  @ApiModelProperty(value = "")


  public String getTradedPositionOperatingSessionReference() {
    return tradedPositionOperatingSessionReference;
  }

  public void setTradedPositionOperatingSessionReference(String tradedPositionOperatingSessionReference) {
    this.tradedPositionOperatingSessionReference = tradedPositionOperatingSessionReference;
  }

  public TradeDealBlotterFunction tradeDealBlotterFunctionReference(String tradeDealBlotterFunctionReference) {
    this.tradeDealBlotterFunctionReference = tradeDealBlotterFunctionReference;
    return this;
  }

  /**
   * Get tradeDealBlotterFunctionReference
   * @return tradeDealBlotterFunctionReference
  */
  @ApiModelProperty(value = "")


  public String getTradeDealBlotterFunctionReference() {
    return tradeDealBlotterFunctionReference;
  }

  public void setTradeDealBlotterFunctionReference(String tradeDealBlotterFunctionReference) {
    this.tradeDealBlotterFunctionReference = tradeDealBlotterFunctionReference;
  }

  public TradeDealBlotterFunction tradeDealBlotterFunctionType(String tradeDealBlotterFunctionType) {
    this.tradeDealBlotterFunctionType = tradeDealBlotterFunctionType;
    return this;
  }

  /**
   * Get tradeDealBlotterFunctionType
   * @return tradeDealBlotterFunctionType
  */
  @ApiModelProperty(value = "")


  public String getTradeDealBlotterFunctionType() {
    return tradeDealBlotterFunctionType;
  }

  public void setTradeDealBlotterFunctionType(String tradeDealBlotterFunctionType) {
    this.tradeDealBlotterFunctionType = tradeDealBlotterFunctionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeDealBlotterFunction tradeDealBlotterFunction = (TradeDealBlotterFunction) o;
    return Objects.equals(this.preconditions, tradeDealBlotterFunction.preconditions) &&
        Objects.equals(this.schedule, tradeDealBlotterFunction.schedule) &&
        Objects.equals(this.businessService, tradeDealBlotterFunction.businessService) &&
        Objects.equals(this.tradedPositionOperatingSessionReference, tradeDealBlotterFunction.tradedPositionOperatingSessionReference) &&
        Objects.equals(this.tradeDealBlotterFunctionReference, tradeDealBlotterFunction.tradeDealBlotterFunctionReference) &&
        Objects.equals(this.tradeDealBlotterFunctionType, tradeDealBlotterFunction.tradeDealBlotterFunctionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preconditions, schedule, businessService, tradedPositionOperatingSessionReference, tradeDealBlotterFunctionReference, tradeDealBlotterFunctionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeDealBlotterFunction {\n");
    
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    tradedPositionOperatingSessionReference: ").append(toIndentedString(tradedPositionOperatingSessionReference)).append("\n");
    sb.append("    tradeDealBlotterFunctionReference: ").append(toIndentedString(tradeDealBlotterFunctionReference)).append("\n");
    sb.append("    tradeDealBlotterFunctionType: ").append(toIndentedString(tradeDealBlotterFunctionType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

