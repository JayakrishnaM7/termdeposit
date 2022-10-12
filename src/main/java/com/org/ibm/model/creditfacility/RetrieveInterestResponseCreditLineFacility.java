package com.org.ibm.model.creditfacility;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveInterestResponseCreditLineFacility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:52.998Z[GMT]")

public class RetrieveInterestResponseCreditLineFacility   {
  @JsonProperty("ProductInstanceReference")
  private Object productInstanceReference;

  @JsonProperty("CreditFacilityNumber")
  private String creditFacilityNumber;

  @JsonProperty("CreditFacilityType")
  private String creditFacilityType;

  @JsonProperty("CreditFacilityAmount")
  private BigDecimal creditFacilityAmount;

  @JsonProperty("CreditFacilityCurrency")
  private String creditFacilityCurrency;

  @JsonProperty("CreditFacilityRateType")
  private String creditFacilityRateType;

  @JsonProperty("CreditFacilityApplicableRate")
  private Object creditFacilityApplicableRate;

  @JsonProperty("InterestType")
  private String interestType;

  @JsonProperty("InterestAccrualMethod")
  private String interestAccrualMethod;

  @JsonProperty("CreditFacilityOriginationDate")
  private String creditFacilityOriginationDate;

  @JsonProperty("CreditFacilityMaturityDate")
  private String creditFacilityMaturityDate;

  @JsonProperty("CreditFacilityOutstandingBalance")
  private String creditFacilityOutstandingBalance;

  @JsonProperty("DateType")
  private String dateType;

  public RetrieveInterestResponseCreditLineFacility productInstanceReference(Object productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
    return this;
  }

  /**
   * Get productInstanceReference
   * @return productInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(Object productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }

  public RetrieveInterestResponseCreditLineFacility creditFacilityNumber(String creditFacilityNumber) {
    this.creditFacilityNumber = creditFacilityNumber;
    return this;
  }

  /**
   * Get creditFacilityNumber
   * @return creditFacilityNumber
  */
  @ApiModelProperty(value = "")


  public String getCreditFacilityNumber() {
    return creditFacilityNumber;
  }

  public void setCreditFacilityNumber(String creditFacilityNumber) {
    this.creditFacilityNumber = creditFacilityNumber;
  }

  public RetrieveInterestResponseCreditLineFacility creditFacilityType(String creditFacilityType) {
    this.creditFacilityType = creditFacilityType;
    return this;
  }

  /**
   * Get creditFacilityType
   * @return creditFacilityType
  */
  @ApiModelProperty(value = "")


  public String getCreditFacilityType() {
    return creditFacilityType;
  }

  public void setCreditFacilityType(String creditFacilityType) {
    this.creditFacilityType = creditFacilityType;
  }

  public RetrieveInterestResponseCreditLineFacility creditFacilityAmount(BigDecimal creditFacilityAmount) {
    this.creditFacilityAmount = creditFacilityAmount;
    return this;
  }

  /**
   * Get creditFacilityAmount
   * @return creditFacilityAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getCreditFacilityAmount() {
    return creditFacilityAmount;
  }

  public void setCreditFacilityAmount(BigDecimal creditFacilityAmount) {
    this.creditFacilityAmount = creditFacilityAmount;
  }

  public RetrieveInterestResponseCreditLineFacility creditFacilityCurrency(String creditFacilityCurrency) {
    this.creditFacilityCurrency = creditFacilityCurrency;
    return this;
  }

  /**
   * Get creditFacilityCurrency
   * @return creditFacilityCurrency
  */
  @ApiModelProperty(value = "")


  public String getCreditFacilityCurrency() {
    return creditFacilityCurrency;
  }

  public void setCreditFacilityCurrency(String creditFacilityCurrency) {
    this.creditFacilityCurrency = creditFacilityCurrency;
  }

  public RetrieveInterestResponseCreditLineFacility creditFacilityRateType(String creditFacilityRateType) {
    this.creditFacilityRateType = creditFacilityRateType;
    return this;
  }

  /**
   * Get creditFacilityRateType
   * @return creditFacilityRateType
  */
  @ApiModelProperty(value = "")


  public String getCreditFacilityRateType() {
    return creditFacilityRateType;
  }

  public void setCreditFacilityRateType(String creditFacilityRateType) {
    this.creditFacilityRateType = creditFacilityRateType;
  }

  public RetrieveInterestResponseCreditLineFacility creditFacilityApplicableRate(Object creditFacilityApplicableRate) {
    this.creditFacilityApplicableRate = creditFacilityApplicableRate;
    return this;
  }

  /**
   * Get creditFacilityApplicableRate
   * @return creditFacilityApplicableRate
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCreditFacilityApplicableRate() {
    return creditFacilityApplicableRate;
  }

  public void setCreditFacilityApplicableRate(Object creditFacilityApplicableRate) {
    this.creditFacilityApplicableRate = creditFacilityApplicableRate;
  }

  public RetrieveInterestResponseCreditLineFacility interestType(String interestType) {
    this.interestType = interestType;
    return this;
  }

  /**
   * Get interestType
   * @return interestType
  */
  @ApiModelProperty(value = "")


  public String getInterestType() {
    return interestType;
  }

  public void setInterestType(String interestType) {
    this.interestType = interestType;
  }

  public RetrieveInterestResponseCreditLineFacility interestAccrualMethod(String interestAccrualMethod) {
    this.interestAccrualMethod = interestAccrualMethod;
    return this;
  }

  /**
   * Get interestAccrualMethod
   * @return interestAccrualMethod
  */
  @ApiModelProperty(value = "")


  public String getInterestAccrualMethod() {
    return interestAccrualMethod;
  }

  public void setInterestAccrualMethod(String interestAccrualMethod) {
    this.interestAccrualMethod = interestAccrualMethod;
  }

  public RetrieveInterestResponseCreditLineFacility creditFacilityOriginationDate(String creditFacilityOriginationDate) {
    this.creditFacilityOriginationDate = creditFacilityOriginationDate;
    return this;
  }

  /**
   * Get creditFacilityOriginationDate
   * @return creditFacilityOriginationDate
  */
  @ApiModelProperty(value = "")


  public String getCreditFacilityOriginationDate() {
    return creditFacilityOriginationDate;
  }

  public void setCreditFacilityOriginationDate(String creditFacilityOriginationDate) {
    this.creditFacilityOriginationDate = creditFacilityOriginationDate;
  }

  public RetrieveInterestResponseCreditLineFacility creditFacilityMaturityDate(String creditFacilityMaturityDate) {
    this.creditFacilityMaturityDate = creditFacilityMaturityDate;
    return this;
  }

  /**
   * Get creditFacilityMaturityDate
   * @return creditFacilityMaturityDate
  */
  @ApiModelProperty(value = "")


  public String getCreditFacilityMaturityDate() {
    return creditFacilityMaturityDate;
  }

  public void setCreditFacilityMaturityDate(String creditFacilityMaturityDate) {
    this.creditFacilityMaturityDate = creditFacilityMaturityDate;
  }

  public RetrieveInterestResponseCreditLineFacility creditFacilityOutstandingBalance(String creditFacilityOutstandingBalance) {
    this.creditFacilityOutstandingBalance = creditFacilityOutstandingBalance;
    return this;
  }

  /**
   * Get creditFacilityOutstandingBalance
   * @return creditFacilityOutstandingBalance
  */
  @ApiModelProperty(value = "")


  public String getCreditFacilityOutstandingBalance() {
    return creditFacilityOutstandingBalance;
  }

  public void setCreditFacilityOutstandingBalance(String creditFacilityOutstandingBalance) {
    this.creditFacilityOutstandingBalance = creditFacilityOutstandingBalance;
  }

  public RetrieveInterestResponseCreditLineFacility dateType(String dateType) {
    this.dateType = dateType;
    return this;
  }

  /**
   * Get dateType
   * @return dateType
  */
  @ApiModelProperty(value = "")


  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveInterestResponseCreditLineFacility retrieveInterestResponseCreditLineFacility = (RetrieveInterestResponseCreditLineFacility) o;
    return Objects.equals(this.productInstanceReference, retrieveInterestResponseCreditLineFacility.productInstanceReference) &&
        Objects.equals(this.creditFacilityNumber, retrieveInterestResponseCreditLineFacility.creditFacilityNumber) &&
        Objects.equals(this.creditFacilityType, retrieveInterestResponseCreditLineFacility.creditFacilityType) &&
        Objects.equals(this.creditFacilityAmount, retrieveInterestResponseCreditLineFacility.creditFacilityAmount) &&
        Objects.equals(this.creditFacilityCurrency, retrieveInterestResponseCreditLineFacility.creditFacilityCurrency) &&
        Objects.equals(this.creditFacilityRateType, retrieveInterestResponseCreditLineFacility.creditFacilityRateType) &&
        Objects.equals(this.creditFacilityApplicableRate, retrieveInterestResponseCreditLineFacility.creditFacilityApplicableRate) &&
        Objects.equals(this.interestType, retrieveInterestResponseCreditLineFacility.interestType) &&
        Objects.equals(this.interestAccrualMethod, retrieveInterestResponseCreditLineFacility.interestAccrualMethod) &&
        Objects.equals(this.creditFacilityOriginationDate, retrieveInterestResponseCreditLineFacility.creditFacilityOriginationDate) &&
        Objects.equals(this.creditFacilityMaturityDate, retrieveInterestResponseCreditLineFacility.creditFacilityMaturityDate) &&
        Objects.equals(this.creditFacilityOutstandingBalance, retrieveInterestResponseCreditLineFacility.creditFacilityOutstandingBalance) &&
        Objects.equals(this.dateType, retrieveInterestResponseCreditLineFacility.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productInstanceReference, creditFacilityNumber, creditFacilityType, creditFacilityAmount, creditFacilityCurrency, creditFacilityRateType, creditFacilityApplicableRate, interestType, interestAccrualMethod, creditFacilityOriginationDate, creditFacilityMaturityDate, creditFacilityOutstandingBalance, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveInterestResponseCreditLineFacility {\n");
    
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    creditFacilityNumber: ").append(toIndentedString(creditFacilityNumber)).append("\n");
    sb.append("    creditFacilityType: ").append(toIndentedString(creditFacilityType)).append("\n");
    sb.append("    creditFacilityAmount: ").append(toIndentedString(creditFacilityAmount)).append("\n");
    sb.append("    creditFacilityCurrency: ").append(toIndentedString(creditFacilityCurrency)).append("\n");
    sb.append("    creditFacilityRateType: ").append(toIndentedString(creditFacilityRateType)).append("\n");
    sb.append("    creditFacilityApplicableRate: ").append(toIndentedString(creditFacilityApplicableRate)).append("\n");
    sb.append("    interestType: ").append(toIndentedString(interestType)).append("\n");
    sb.append("    interestAccrualMethod: ").append(toIndentedString(interestAccrualMethod)).append("\n");
    sb.append("    creditFacilityOriginationDate: ").append(toIndentedString(creditFacilityOriginationDate)).append("\n");
    sb.append("    creditFacilityMaturityDate: ").append(toIndentedString(creditFacilityMaturityDate)).append("\n");
    sb.append("    creditFacilityOutstandingBalance: ").append(toIndentedString(creditFacilityOutstandingBalance)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
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

