package com.org.ibm.model.traderpositionmanagement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TradeCaptureandReportingFunction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:34.801Z[GMT]")

public class TradeCaptureandReportingFunction   {
  @JsonProperty("Preconditions")
  private Object preconditions;

  @JsonProperty("Schedule")
  private Object schedule;

  @JsonProperty("BusinessService")
  private Object businessService;

  @JsonProperty("TradedPositionOperatingSessionReference")
  private String tradedPositionOperatingSessionReference;

  @JsonProperty("TradeCaptureandReportingFunctionReference")
  private String tradeCaptureandReportingFunctionReference;

  @JsonProperty("TradeCaptureandReportingFunctionType")
  private String tradeCaptureandReportingFunctionType;

  public TradeCaptureandReportingFunction preconditions(Object preconditions) {
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

  public TradeCaptureandReportingFunction schedule(Object schedule) {
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

  public TradeCaptureandReportingFunction businessService(Object businessService) {
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

  public TradeCaptureandReportingFunction tradedPositionOperatingSessionReference(String tradedPositionOperatingSessionReference) {
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

  public TradeCaptureandReportingFunction tradeCaptureandReportingFunctionReference(String tradeCaptureandReportingFunctionReference) {
    this.tradeCaptureandReportingFunctionReference = tradeCaptureandReportingFunctionReference;
    return this;
  }

  /**
   * Get tradeCaptureandReportingFunctionReference
   * @return tradeCaptureandReportingFunctionReference
  */
  @ApiModelProperty(value = "")


  public String getTradeCaptureandReportingFunctionReference() {
    return tradeCaptureandReportingFunctionReference;
  }

  public void setTradeCaptureandReportingFunctionReference(String tradeCaptureandReportingFunctionReference) {
    this.tradeCaptureandReportingFunctionReference = tradeCaptureandReportingFunctionReference;
  }

  public TradeCaptureandReportingFunction tradeCaptureandReportingFunctionType(String tradeCaptureandReportingFunctionType) {
    this.tradeCaptureandReportingFunctionType = tradeCaptureandReportingFunctionType;
    return this;
  }

  /**
   * Get tradeCaptureandReportingFunctionType
   * @return tradeCaptureandReportingFunctionType
  */
  @ApiModelProperty(value = "")


  public String getTradeCaptureandReportingFunctionType() {
    return tradeCaptureandReportingFunctionType;
  }

  public void setTradeCaptureandReportingFunctionType(String tradeCaptureandReportingFunctionType) {
    this.tradeCaptureandReportingFunctionType = tradeCaptureandReportingFunctionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeCaptureandReportingFunction tradeCaptureandReportingFunction = (TradeCaptureandReportingFunction) o;
    return Objects.equals(this.preconditions, tradeCaptureandReportingFunction.preconditions) &&
        Objects.equals(this.schedule, tradeCaptureandReportingFunction.schedule) &&
        Objects.equals(this.businessService, tradeCaptureandReportingFunction.businessService) &&
        Objects.equals(this.tradedPositionOperatingSessionReference, tradeCaptureandReportingFunction.tradedPositionOperatingSessionReference) &&
        Objects.equals(this.tradeCaptureandReportingFunctionReference, tradeCaptureandReportingFunction.tradeCaptureandReportingFunctionReference) &&
        Objects.equals(this.tradeCaptureandReportingFunctionType, tradeCaptureandReportingFunction.tradeCaptureandReportingFunctionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preconditions, schedule, businessService, tradedPositionOperatingSessionReference, tradeCaptureandReportingFunctionReference, tradeCaptureandReportingFunctionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeCaptureandReportingFunction {\n");
    
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    tradedPositionOperatingSessionReference: ").append(toIndentedString(tradedPositionOperatingSessionReference)).append("\n");
    sb.append("    tradeCaptureandReportingFunctionReference: ").append(toIndentedString(tradeCaptureandReportingFunctionReference)).append("\n");
    sb.append("    tradeCaptureandReportingFunctionType: ").append(toIndentedString(tradeCaptureandReportingFunctionType)).append("\n");
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

