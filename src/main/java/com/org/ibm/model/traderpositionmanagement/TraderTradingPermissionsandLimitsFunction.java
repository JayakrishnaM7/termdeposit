package com.org.ibm.model.traderpositionmanagement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TraderTradingPermissionsandLimitsFunction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:34.801Z[GMT]")

public class TraderTradingPermissionsandLimitsFunction   {
  @JsonProperty("Preconditions")
  private Object preconditions;

  @JsonProperty("Schedule")
  private Object schedule;

  @JsonProperty("BusinessService")
  private Object businessService;

  @JsonProperty("TradedPositionOperatingSessionReference")
  private String tradedPositionOperatingSessionReference;

  @JsonProperty("TraderTradingPermissionsandLimitsFunctionReference")
  private String traderTradingPermissionsandLimitsFunctionReference;

  @JsonProperty("TraderTradingPermissionsandLimitsFunctionType")
  private String traderTradingPermissionsandLimitsFunctionType;

  public TraderTradingPermissionsandLimitsFunction preconditions(Object preconditions) {
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

  public TraderTradingPermissionsandLimitsFunction schedule(Object schedule) {
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

  public TraderTradingPermissionsandLimitsFunction businessService(Object businessService) {
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

  public TraderTradingPermissionsandLimitsFunction tradedPositionOperatingSessionReference(String tradedPositionOperatingSessionReference) {
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

  public TraderTradingPermissionsandLimitsFunction traderTradingPermissionsandLimitsFunctionReference(String traderTradingPermissionsandLimitsFunctionReference) {
    this.traderTradingPermissionsandLimitsFunctionReference = traderTradingPermissionsandLimitsFunctionReference;
    return this;
  }

  /**
   * Get traderTradingPermissionsandLimitsFunctionReference
   * @return traderTradingPermissionsandLimitsFunctionReference
  */
  @ApiModelProperty(value = "")


  public String getTraderTradingPermissionsandLimitsFunctionReference() {
    return traderTradingPermissionsandLimitsFunctionReference;
  }

  public void setTraderTradingPermissionsandLimitsFunctionReference(String traderTradingPermissionsandLimitsFunctionReference) {
    this.traderTradingPermissionsandLimitsFunctionReference = traderTradingPermissionsandLimitsFunctionReference;
  }

  public TraderTradingPermissionsandLimitsFunction traderTradingPermissionsandLimitsFunctionType(String traderTradingPermissionsandLimitsFunctionType) {
    this.traderTradingPermissionsandLimitsFunctionType = traderTradingPermissionsandLimitsFunctionType;
    return this;
  }

  /**
   * Get traderTradingPermissionsandLimitsFunctionType
   * @return traderTradingPermissionsandLimitsFunctionType
  */
  @ApiModelProperty(value = "")


  public String getTraderTradingPermissionsandLimitsFunctionType() {
    return traderTradingPermissionsandLimitsFunctionType;
  }

  public void setTraderTradingPermissionsandLimitsFunctionType(String traderTradingPermissionsandLimitsFunctionType) {
    this.traderTradingPermissionsandLimitsFunctionType = traderTradingPermissionsandLimitsFunctionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TraderTradingPermissionsandLimitsFunction traderTradingPermissionsandLimitsFunction = (TraderTradingPermissionsandLimitsFunction) o;
    return Objects.equals(this.preconditions, traderTradingPermissionsandLimitsFunction.preconditions) &&
        Objects.equals(this.schedule, traderTradingPermissionsandLimitsFunction.schedule) &&
        Objects.equals(this.businessService, traderTradingPermissionsandLimitsFunction.businessService) &&
        Objects.equals(this.tradedPositionOperatingSessionReference, traderTradingPermissionsandLimitsFunction.tradedPositionOperatingSessionReference) &&
        Objects.equals(this.traderTradingPermissionsandLimitsFunctionReference, traderTradingPermissionsandLimitsFunction.traderTradingPermissionsandLimitsFunctionReference) &&
        Objects.equals(this.traderTradingPermissionsandLimitsFunctionType, traderTradingPermissionsandLimitsFunction.traderTradingPermissionsandLimitsFunctionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preconditions, schedule, businessService, tradedPositionOperatingSessionReference, traderTradingPermissionsandLimitsFunctionReference, traderTradingPermissionsandLimitsFunctionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TraderTradingPermissionsandLimitsFunction {\n");
    
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    tradedPositionOperatingSessionReference: ").append(toIndentedString(tradedPositionOperatingSessionReference)).append("\n");
    sb.append("    traderTradingPermissionsandLimitsFunctionReference: ").append(toIndentedString(traderTradingPermissionsandLimitsFunctionReference)).append("\n");
    sb.append("    traderTradingPermissionsandLimitsFunctionType: ").append(toIndentedString(traderTradingPermissionsandLimitsFunctionType)).append("\n");
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

