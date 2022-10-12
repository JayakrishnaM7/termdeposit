package com.org.ibm.model.traderpositionmanagement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TradedPositionOperatingSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:34.801Z[GMT]")

public class TradedPositionOperatingSession   {
  @JsonProperty("TradedPositionOperatingSessionSchedule")
  private Object tradedPositionOperatingSessionSchedule;

  @JsonProperty("TradedPositionOperatingSessionStatus")
  private String tradedPositionOperatingSessionStatus;

  @JsonProperty("TradedPositionOperatingSessionUsageLog")
  private String tradedPositionOperatingSessionUsageLog;

  @JsonProperty("TradedPositionOperatingSessionAssociatedPartyReference")
  private Object tradedPositionOperatingSessionAssociatedPartyReference;

  @JsonProperty("TradedPositionOperatingSessionServiceProviderReference")
  private Object tradedPositionOperatingSessionServiceProviderReference;

  @JsonProperty("TradedPositionOperatingSessionType")
  private String tradedPositionOperatingSessionType;

  @JsonProperty("TradedPositionOperatingSessionServiceProviderSchedule")
  private Object tradedPositionOperatingSessionServiceProviderSchedule;

  @JsonProperty("TradedPositionOperatingSessionServiceType")
  private String tradedPositionOperatingSessionServiceType;

  @JsonProperty("TradedPositionOperatingSessionServiceConfiguration")
  private String tradedPositionOperatingSessionServiceConfiguration;

  @JsonProperty("TradedPositionOperatingSessionReference")
  private String tradedPositionOperatingSessionReference;

  public TradedPositionOperatingSession tradedPositionOperatingSessionSchedule(Object tradedPositionOperatingSessionSchedule) {
    this.tradedPositionOperatingSessionSchedule = tradedPositionOperatingSessionSchedule;
    return this;
  }

  /**
   * Get tradedPositionOperatingSessionSchedule
   * @return tradedPositionOperatingSessionSchedule
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getTradedPositionOperatingSessionSchedule() {
    return tradedPositionOperatingSessionSchedule;
  }

  public void setTradedPositionOperatingSessionSchedule(Object tradedPositionOperatingSessionSchedule) {
    this.tradedPositionOperatingSessionSchedule = tradedPositionOperatingSessionSchedule;
  }

  public TradedPositionOperatingSession tradedPositionOperatingSessionStatus(String tradedPositionOperatingSessionStatus) {
    this.tradedPositionOperatingSessionStatus = tradedPositionOperatingSessionStatus;
    return this;
  }

  /**
   * Get tradedPositionOperatingSessionStatus
   * @return tradedPositionOperatingSessionStatus
  */
  @ApiModelProperty(value = "")


  public String getTradedPositionOperatingSessionStatus() {
    return tradedPositionOperatingSessionStatus;
  }

  public void setTradedPositionOperatingSessionStatus(String tradedPositionOperatingSessionStatus) {
    this.tradedPositionOperatingSessionStatus = tradedPositionOperatingSessionStatus;
  }

  public TradedPositionOperatingSession tradedPositionOperatingSessionUsageLog(String tradedPositionOperatingSessionUsageLog) {
    this.tradedPositionOperatingSessionUsageLog = tradedPositionOperatingSessionUsageLog;
    return this;
  }

  /**
   * Get tradedPositionOperatingSessionUsageLog
   * @return tradedPositionOperatingSessionUsageLog
  */
  @ApiModelProperty(value = "")


  public String getTradedPositionOperatingSessionUsageLog() {
    return tradedPositionOperatingSessionUsageLog;
  }

  public void setTradedPositionOperatingSessionUsageLog(String tradedPositionOperatingSessionUsageLog) {
    this.tradedPositionOperatingSessionUsageLog = tradedPositionOperatingSessionUsageLog;
  }

  public TradedPositionOperatingSession tradedPositionOperatingSessionAssociatedPartyReference(Object tradedPositionOperatingSessionAssociatedPartyReference) {
    this.tradedPositionOperatingSessionAssociatedPartyReference = tradedPositionOperatingSessionAssociatedPartyReference;
    return this;
  }

  /**
   * Get tradedPositionOperatingSessionAssociatedPartyReference
   * @return tradedPositionOperatingSessionAssociatedPartyReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getTradedPositionOperatingSessionAssociatedPartyReference() {
    return tradedPositionOperatingSessionAssociatedPartyReference;
  }

  public void setTradedPositionOperatingSessionAssociatedPartyReference(Object tradedPositionOperatingSessionAssociatedPartyReference) {
    this.tradedPositionOperatingSessionAssociatedPartyReference = tradedPositionOperatingSessionAssociatedPartyReference;
  }

  public TradedPositionOperatingSession tradedPositionOperatingSessionServiceProviderReference(Object tradedPositionOperatingSessionServiceProviderReference) {
    this.tradedPositionOperatingSessionServiceProviderReference = tradedPositionOperatingSessionServiceProviderReference;
    return this;
  }

  /**
   * Get tradedPositionOperatingSessionServiceProviderReference
   * @return tradedPositionOperatingSessionServiceProviderReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getTradedPositionOperatingSessionServiceProviderReference() {
    return tradedPositionOperatingSessionServiceProviderReference;
  }

  public void setTradedPositionOperatingSessionServiceProviderReference(Object tradedPositionOperatingSessionServiceProviderReference) {
    this.tradedPositionOperatingSessionServiceProviderReference = tradedPositionOperatingSessionServiceProviderReference;
  }

  public TradedPositionOperatingSession tradedPositionOperatingSessionType(String tradedPositionOperatingSessionType) {
    this.tradedPositionOperatingSessionType = tradedPositionOperatingSessionType;
    return this;
  }

  /**
   * Get tradedPositionOperatingSessionType
   * @return tradedPositionOperatingSessionType
  */
  @ApiModelProperty(value = "")


  public String getTradedPositionOperatingSessionType() {
    return tradedPositionOperatingSessionType;
  }

  public void setTradedPositionOperatingSessionType(String tradedPositionOperatingSessionType) {
    this.tradedPositionOperatingSessionType = tradedPositionOperatingSessionType;
  }

  public TradedPositionOperatingSession tradedPositionOperatingSessionServiceProviderSchedule(Object tradedPositionOperatingSessionServiceProviderSchedule) {
    this.tradedPositionOperatingSessionServiceProviderSchedule = tradedPositionOperatingSessionServiceProviderSchedule;
    return this;
  }

  /**
   * Get tradedPositionOperatingSessionServiceProviderSchedule
   * @return tradedPositionOperatingSessionServiceProviderSchedule
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getTradedPositionOperatingSessionServiceProviderSchedule() {
    return tradedPositionOperatingSessionServiceProviderSchedule;
  }

  public void setTradedPositionOperatingSessionServiceProviderSchedule(Object tradedPositionOperatingSessionServiceProviderSchedule) {
    this.tradedPositionOperatingSessionServiceProviderSchedule = tradedPositionOperatingSessionServiceProviderSchedule;
  }

  public TradedPositionOperatingSession tradedPositionOperatingSessionServiceType(String tradedPositionOperatingSessionServiceType) {
    this.tradedPositionOperatingSessionServiceType = tradedPositionOperatingSessionServiceType;
    return this;
  }

  /**
   * Get tradedPositionOperatingSessionServiceType
   * @return tradedPositionOperatingSessionServiceType
  */
  @ApiModelProperty(value = "")


  public String getTradedPositionOperatingSessionServiceType() {
    return tradedPositionOperatingSessionServiceType;
  }

  public void setTradedPositionOperatingSessionServiceType(String tradedPositionOperatingSessionServiceType) {
    this.tradedPositionOperatingSessionServiceType = tradedPositionOperatingSessionServiceType;
  }

  public TradedPositionOperatingSession tradedPositionOperatingSessionServiceConfiguration(String tradedPositionOperatingSessionServiceConfiguration) {
    this.tradedPositionOperatingSessionServiceConfiguration = tradedPositionOperatingSessionServiceConfiguration;
    return this;
  }

  /**
   * Get tradedPositionOperatingSessionServiceConfiguration
   * @return tradedPositionOperatingSessionServiceConfiguration
  */
  @ApiModelProperty(value = "")


  public String getTradedPositionOperatingSessionServiceConfiguration() {
    return tradedPositionOperatingSessionServiceConfiguration;
  }

  public void setTradedPositionOperatingSessionServiceConfiguration(String tradedPositionOperatingSessionServiceConfiguration) {
    this.tradedPositionOperatingSessionServiceConfiguration = tradedPositionOperatingSessionServiceConfiguration;
  }

  public TradedPositionOperatingSession tradedPositionOperatingSessionReference(String tradedPositionOperatingSessionReference) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradedPositionOperatingSession tradedPositionOperatingSession = (TradedPositionOperatingSession) o;
    return Objects.equals(this.tradedPositionOperatingSessionSchedule, tradedPositionOperatingSession.tradedPositionOperatingSessionSchedule) &&
        Objects.equals(this.tradedPositionOperatingSessionStatus, tradedPositionOperatingSession.tradedPositionOperatingSessionStatus) &&
        Objects.equals(this.tradedPositionOperatingSessionUsageLog, tradedPositionOperatingSession.tradedPositionOperatingSessionUsageLog) &&
        Objects.equals(this.tradedPositionOperatingSessionAssociatedPartyReference, tradedPositionOperatingSession.tradedPositionOperatingSessionAssociatedPartyReference) &&
        Objects.equals(this.tradedPositionOperatingSessionServiceProviderReference, tradedPositionOperatingSession.tradedPositionOperatingSessionServiceProviderReference) &&
        Objects.equals(this.tradedPositionOperatingSessionType, tradedPositionOperatingSession.tradedPositionOperatingSessionType) &&
        Objects.equals(this.tradedPositionOperatingSessionServiceProviderSchedule, tradedPositionOperatingSession.tradedPositionOperatingSessionServiceProviderSchedule) &&
        Objects.equals(this.tradedPositionOperatingSessionServiceType, tradedPositionOperatingSession.tradedPositionOperatingSessionServiceType) &&
        Objects.equals(this.tradedPositionOperatingSessionServiceConfiguration, tradedPositionOperatingSession.tradedPositionOperatingSessionServiceConfiguration) &&
        Objects.equals(this.tradedPositionOperatingSessionReference, tradedPositionOperatingSession.tradedPositionOperatingSessionReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tradedPositionOperatingSessionSchedule, tradedPositionOperatingSessionStatus, tradedPositionOperatingSessionUsageLog, tradedPositionOperatingSessionAssociatedPartyReference, tradedPositionOperatingSessionServiceProviderReference, tradedPositionOperatingSessionType, tradedPositionOperatingSessionServiceProviderSchedule, tradedPositionOperatingSessionServiceType, tradedPositionOperatingSessionServiceConfiguration, tradedPositionOperatingSessionReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradedPositionOperatingSession {\n");
    
    sb.append("    tradedPositionOperatingSessionSchedule: ").append(toIndentedString(tradedPositionOperatingSessionSchedule)).append("\n");
    sb.append("    tradedPositionOperatingSessionStatus: ").append(toIndentedString(tradedPositionOperatingSessionStatus)).append("\n");
    sb.append("    tradedPositionOperatingSessionUsageLog: ").append(toIndentedString(tradedPositionOperatingSessionUsageLog)).append("\n");
    sb.append("    tradedPositionOperatingSessionAssociatedPartyReference: ").append(toIndentedString(tradedPositionOperatingSessionAssociatedPartyReference)).append("\n");
    sb.append("    tradedPositionOperatingSessionServiceProviderReference: ").append(toIndentedString(tradedPositionOperatingSessionServiceProviderReference)).append("\n");
    sb.append("    tradedPositionOperatingSessionType: ").append(toIndentedString(tradedPositionOperatingSessionType)).append("\n");
    sb.append("    tradedPositionOperatingSessionServiceProviderSchedule: ").append(toIndentedString(tradedPositionOperatingSessionServiceProviderSchedule)).append("\n");
    sb.append("    tradedPositionOperatingSessionServiceType: ").append(toIndentedString(tradedPositionOperatingSessionServiceType)).append("\n");
    sb.append("    tradedPositionOperatingSessionServiceConfiguration: ").append(toIndentedString(tradedPositionOperatingSessionServiceConfiguration)).append("\n");
    sb.append("    tradedPositionOperatingSessionReference: ").append(toIndentedString(tradedPositionOperatingSessionReference)).append("\n");
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

