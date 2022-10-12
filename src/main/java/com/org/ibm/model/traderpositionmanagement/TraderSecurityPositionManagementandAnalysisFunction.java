package com.org.ibm.model.traderpositionmanagement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TraderSecurityPositionManagementandAnalysisFunction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:34.801Z[GMT]")

public class TraderSecurityPositionManagementandAnalysisFunction   {
  @JsonProperty("Preconditions")
  private Object preconditions;

  @JsonProperty("Schedule")
  private Object schedule;

  @JsonProperty("BusinessService")
  private Object businessService;

  @JsonProperty("TradedPositionOperatingSessionReference")
  private String tradedPositionOperatingSessionReference;

  @JsonProperty("TraderSecurityPositionManagementandAnalysisFunctionReference")
  private String traderSecurityPositionManagementandAnalysisFunctionReference;

  @JsonProperty("TraderSecurityPositionManagementandAnalysisFunctionType")
  private String traderSecurityPositionManagementandAnalysisFunctionType;

  public TraderSecurityPositionManagementandAnalysisFunction preconditions(Object preconditions) {
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

  public TraderSecurityPositionManagementandAnalysisFunction schedule(Object schedule) {
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

  public TraderSecurityPositionManagementandAnalysisFunction businessService(Object businessService) {
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

  public TraderSecurityPositionManagementandAnalysisFunction tradedPositionOperatingSessionReference(String tradedPositionOperatingSessionReference) {
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

  public TraderSecurityPositionManagementandAnalysisFunction traderSecurityPositionManagementandAnalysisFunctionReference(String traderSecurityPositionManagementandAnalysisFunctionReference) {
    this.traderSecurityPositionManagementandAnalysisFunctionReference = traderSecurityPositionManagementandAnalysisFunctionReference;
    return this;
  }

  /**
   * Get traderSecurityPositionManagementandAnalysisFunctionReference
   * @return traderSecurityPositionManagementandAnalysisFunctionReference
  */
  @ApiModelProperty(value = "")


  public String getTraderSecurityPositionManagementandAnalysisFunctionReference() {
    return traderSecurityPositionManagementandAnalysisFunctionReference;
  }

  public void setTraderSecurityPositionManagementandAnalysisFunctionReference(String traderSecurityPositionManagementandAnalysisFunctionReference) {
    this.traderSecurityPositionManagementandAnalysisFunctionReference = traderSecurityPositionManagementandAnalysisFunctionReference;
  }

  public TraderSecurityPositionManagementandAnalysisFunction traderSecurityPositionManagementandAnalysisFunctionType(String traderSecurityPositionManagementandAnalysisFunctionType) {
    this.traderSecurityPositionManagementandAnalysisFunctionType = traderSecurityPositionManagementandAnalysisFunctionType;
    return this;
  }

  /**
   * Get traderSecurityPositionManagementandAnalysisFunctionType
   * @return traderSecurityPositionManagementandAnalysisFunctionType
  */
  @ApiModelProperty(value = "")


  public String getTraderSecurityPositionManagementandAnalysisFunctionType() {
    return traderSecurityPositionManagementandAnalysisFunctionType;
  }

  public void setTraderSecurityPositionManagementandAnalysisFunctionType(String traderSecurityPositionManagementandAnalysisFunctionType) {
    this.traderSecurityPositionManagementandAnalysisFunctionType = traderSecurityPositionManagementandAnalysisFunctionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TraderSecurityPositionManagementandAnalysisFunction traderSecurityPositionManagementandAnalysisFunction = (TraderSecurityPositionManagementandAnalysisFunction) o;
    return Objects.equals(this.preconditions, traderSecurityPositionManagementandAnalysisFunction.preconditions) &&
        Objects.equals(this.schedule, traderSecurityPositionManagementandAnalysisFunction.schedule) &&
        Objects.equals(this.businessService, traderSecurityPositionManagementandAnalysisFunction.businessService) &&
        Objects.equals(this.tradedPositionOperatingSessionReference, traderSecurityPositionManagementandAnalysisFunction.tradedPositionOperatingSessionReference) &&
        Objects.equals(this.traderSecurityPositionManagementandAnalysisFunctionReference, traderSecurityPositionManagementandAnalysisFunction.traderSecurityPositionManagementandAnalysisFunctionReference) &&
        Objects.equals(this.traderSecurityPositionManagementandAnalysisFunctionType, traderSecurityPositionManagementandAnalysisFunction.traderSecurityPositionManagementandAnalysisFunctionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preconditions, schedule, businessService, tradedPositionOperatingSessionReference, traderSecurityPositionManagementandAnalysisFunctionReference, traderSecurityPositionManagementandAnalysisFunctionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TraderSecurityPositionManagementandAnalysisFunction {\n");
    
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    tradedPositionOperatingSessionReference: ").append(toIndentedString(tradedPositionOperatingSessionReference)).append("\n");
    sb.append("    traderSecurityPositionManagementandAnalysisFunctionReference: ").append(toIndentedString(traderSecurityPositionManagementandAnalysisFunctionReference)).append("\n");
    sb.append("    traderSecurityPositionManagementandAnalysisFunctionType: ").append(toIndentedString(traderSecurityPositionManagementandAnalysisFunctionType)).append("\n");
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

