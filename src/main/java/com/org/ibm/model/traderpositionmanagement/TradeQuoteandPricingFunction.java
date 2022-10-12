package com.org.ibm.model.traderpositionmanagement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TradeQuoteandPricingFunction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:34.801Z[GMT]")

public class TradeQuoteandPricingFunction   {
  @JsonProperty("Preconditions")
  private Object preconditions;

  @JsonProperty("Schedule")
  private Object schedule;

  @JsonProperty("BusinessService")
  private Object businessService;

  @JsonProperty("TradedPositionOperatingSessionReference")
  private String tradedPositionOperatingSessionReference;

  @JsonProperty("TradeQuoteandPricingFunctionReference")
  private String tradeQuoteandPricingFunctionReference;

  @JsonProperty("TradeQuoteandPricingFunctionType")
  private String tradeQuoteandPricingFunctionType;

  public TradeQuoteandPricingFunction preconditions(Object preconditions) {
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

  public TradeQuoteandPricingFunction schedule(Object schedule) {
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

  public TradeQuoteandPricingFunction businessService(Object businessService) {
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

  public TradeQuoteandPricingFunction tradedPositionOperatingSessionReference(String tradedPositionOperatingSessionReference) {
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

  public TradeQuoteandPricingFunction tradeQuoteandPricingFunctionReference(String tradeQuoteandPricingFunctionReference) {
    this.tradeQuoteandPricingFunctionReference = tradeQuoteandPricingFunctionReference;
    return this;
  }

  /**
   * Get tradeQuoteandPricingFunctionReference
   * @return tradeQuoteandPricingFunctionReference
  */
  @ApiModelProperty(value = "")


  public String getTradeQuoteandPricingFunctionReference() {
    return tradeQuoteandPricingFunctionReference;
  }

  public void setTradeQuoteandPricingFunctionReference(String tradeQuoteandPricingFunctionReference) {
    this.tradeQuoteandPricingFunctionReference = tradeQuoteandPricingFunctionReference;
  }

  public TradeQuoteandPricingFunction tradeQuoteandPricingFunctionType(String tradeQuoteandPricingFunctionType) {
    this.tradeQuoteandPricingFunctionType = tradeQuoteandPricingFunctionType;
    return this;
  }

  /**
   * Get tradeQuoteandPricingFunctionType
   * @return tradeQuoteandPricingFunctionType
  */
  @ApiModelProperty(value = "")


  public String getTradeQuoteandPricingFunctionType() {
    return tradeQuoteandPricingFunctionType;
  }

  public void setTradeQuoteandPricingFunctionType(String tradeQuoteandPricingFunctionType) {
    this.tradeQuoteandPricingFunctionType = tradeQuoteandPricingFunctionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeQuoteandPricingFunction tradeQuoteandPricingFunction = (TradeQuoteandPricingFunction) o;
    return Objects.equals(this.preconditions, tradeQuoteandPricingFunction.preconditions) &&
        Objects.equals(this.schedule, tradeQuoteandPricingFunction.schedule) &&
        Objects.equals(this.businessService, tradeQuoteandPricingFunction.businessService) &&
        Objects.equals(this.tradedPositionOperatingSessionReference, tradeQuoteandPricingFunction.tradedPositionOperatingSessionReference) &&
        Objects.equals(this.tradeQuoteandPricingFunctionReference, tradeQuoteandPricingFunction.tradeQuoteandPricingFunctionReference) &&
        Objects.equals(this.tradeQuoteandPricingFunctionType, tradeQuoteandPricingFunction.tradeQuoteandPricingFunctionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preconditions, schedule, businessService, tradedPositionOperatingSessionReference, tradeQuoteandPricingFunctionReference, tradeQuoteandPricingFunctionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeQuoteandPricingFunction {\n");
    
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    tradedPositionOperatingSessionReference: ").append(toIndentedString(tradedPositionOperatingSessionReference)).append("\n");
    sb.append("    tradeQuoteandPricingFunctionReference: ").append(toIndentedString(tradeQuoteandPricingFunctionReference)).append("\n");
    sb.append("    tradeQuoteandPricingFunctionType: ").append(toIndentedString(tradeQuoteandPricingFunctionType)).append("\n");
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

