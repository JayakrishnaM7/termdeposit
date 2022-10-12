package com.org.ibm.model.creditfacility;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveRepaymentResponseCreditLineFacility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:52.998Z[GMT]")

public class RetrieveRepaymentResponseCreditLineFacility   {
  @JsonProperty("ProductInstanceReference")
  private Object productInstanceReference;

  @JsonProperty("CreditFacilityNumber")
  private String creditFacilityNumber;

  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("PartyReference")
  private Object partyReference;

  @JsonProperty("RepaymentType")
  private String repaymentType;

  @JsonProperty("CreditFacilityAccessTerms")
  private String creditFacilityAccessTerms;

  @JsonProperty("CreditFacilityUnderlyingDrawdown")
  private String creditFacilityUnderlyingDrawdown;

  @JsonProperty("DrawdownReference")
  private Object drawdownReference;

  @JsonProperty("DrawdownRecord")
  private String drawdownRecord;

  @JsonProperty("DrawdownLoanTransaction")
  private String drawdownLoanTransaction;

  @JsonProperty("EntitlementOptionDefinition")
  private String entitlementOptionDefinition;

  @JsonProperty("EntitlementOptionSetting")
  private String entitlementOptionSetting;

  @JsonProperty("RestrictionOptionDefinition")
  private String restrictionOptionDefinition;

  @JsonProperty("RestrictionOptionSetting")
  private String restrictionOptionSetting;

  @JsonProperty("CreditFacilityOutstandingBalance")
  private String creditFacilityOutstandingBalance;

  @JsonProperty("DateType")
  private String dateType;

  public RetrieveRepaymentResponseCreditLineFacility productInstanceReference(Object productInstanceReference) {
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

  public RetrieveRepaymentResponseCreditLineFacility creditFacilityNumber(String creditFacilityNumber) {
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

  public RetrieveRepaymentResponseCreditLineFacility customerReference(Object customerReference) {
    this.customerReference = customerReference;
    return this;
  }

  /**
   * Get customerReference
   * @return customerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(Object customerReference) {
    this.customerReference = customerReference;
  }

  public RetrieveRepaymentResponseCreditLineFacility partyReference(Object partyReference) {
    this.partyReference = partyReference;
    return this;
  }

  /**
   * Get partyReference
   * @return partyReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(Object partyReference) {
    this.partyReference = partyReference;
  }

  public RetrieveRepaymentResponseCreditLineFacility repaymentType(String repaymentType) {
    this.repaymentType = repaymentType;
    return this;
  }

  /**
   * Get repaymentType
   * @return repaymentType
  */
  @ApiModelProperty(value = "")


  public String getRepaymentType() {
    return repaymentType;
  }

  public void setRepaymentType(String repaymentType) {
    this.repaymentType = repaymentType;
  }

  public RetrieveRepaymentResponseCreditLineFacility creditFacilityAccessTerms(String creditFacilityAccessTerms) {
    this.creditFacilityAccessTerms = creditFacilityAccessTerms;
    return this;
  }

  /**
   * Get creditFacilityAccessTerms
   * @return creditFacilityAccessTerms
  */
  @ApiModelProperty(value = "")


  public String getCreditFacilityAccessTerms() {
    return creditFacilityAccessTerms;
  }

  public void setCreditFacilityAccessTerms(String creditFacilityAccessTerms) {
    this.creditFacilityAccessTerms = creditFacilityAccessTerms;
  }

  public RetrieveRepaymentResponseCreditLineFacility creditFacilityUnderlyingDrawdown(String creditFacilityUnderlyingDrawdown) {
    this.creditFacilityUnderlyingDrawdown = creditFacilityUnderlyingDrawdown;
    return this;
  }

  /**
   * Get creditFacilityUnderlyingDrawdown
   * @return creditFacilityUnderlyingDrawdown
  */
  @ApiModelProperty(value = "")


  public String getCreditFacilityUnderlyingDrawdown() {
    return creditFacilityUnderlyingDrawdown;
  }

  public void setCreditFacilityUnderlyingDrawdown(String creditFacilityUnderlyingDrawdown) {
    this.creditFacilityUnderlyingDrawdown = creditFacilityUnderlyingDrawdown;
  }

  public RetrieveRepaymentResponseCreditLineFacility drawdownReference(Object drawdownReference) {
    this.drawdownReference = drawdownReference;
    return this;
  }

  /**
   * Get drawdownReference
   * @return drawdownReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getDrawdownReference() {
    return drawdownReference;
  }

  public void setDrawdownReference(Object drawdownReference) {
    this.drawdownReference = drawdownReference;
  }

  public RetrieveRepaymentResponseCreditLineFacility drawdownRecord(String drawdownRecord) {
    this.drawdownRecord = drawdownRecord;
    return this;
  }

  /**
   * Get drawdownRecord
   * @return drawdownRecord
  */
  @ApiModelProperty(value = "")


  public String getDrawdownRecord() {
    return drawdownRecord;
  }

  public void setDrawdownRecord(String drawdownRecord) {
    this.drawdownRecord = drawdownRecord;
  }

  public RetrieveRepaymentResponseCreditLineFacility drawdownLoanTransaction(String drawdownLoanTransaction) {
    this.drawdownLoanTransaction = drawdownLoanTransaction;
    return this;
  }

  /**
   * Get drawdownLoanTransaction
   * @return drawdownLoanTransaction
  */
  @ApiModelProperty(value = "")


  public String getDrawdownLoanTransaction() {
    return drawdownLoanTransaction;
  }

  public void setDrawdownLoanTransaction(String drawdownLoanTransaction) {
    this.drawdownLoanTransaction = drawdownLoanTransaction;
  }

  public RetrieveRepaymentResponseCreditLineFacility entitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
    return this;
  }

  /**
   * Get entitlementOptionDefinition
   * @return entitlementOptionDefinition
  */
  @ApiModelProperty(value = "")


  public String getEntitlementOptionDefinition() {
    return entitlementOptionDefinition;
  }

  public void setEntitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
  }

  public RetrieveRepaymentResponseCreditLineFacility entitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
    return this;
  }

  /**
   * Get entitlementOptionSetting
   * @return entitlementOptionSetting
  */
  @ApiModelProperty(value = "")


  public String getEntitlementOptionSetting() {
    return entitlementOptionSetting;
  }

  public void setEntitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
  }

  public RetrieveRepaymentResponseCreditLineFacility restrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
    return this;
  }

  /**
   * Get restrictionOptionDefinition
   * @return restrictionOptionDefinition
  */
  @ApiModelProperty(value = "")


  public String getRestrictionOptionDefinition() {
    return restrictionOptionDefinition;
  }

  public void setRestrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
  }

  public RetrieveRepaymentResponseCreditLineFacility restrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
    return this;
  }

  /**
   * Get restrictionOptionSetting
   * @return restrictionOptionSetting
  */
  @ApiModelProperty(value = "")


  public String getRestrictionOptionSetting() {
    return restrictionOptionSetting;
  }

  public void setRestrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
  }

  public RetrieveRepaymentResponseCreditLineFacility creditFacilityOutstandingBalance(String creditFacilityOutstandingBalance) {
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

  public RetrieveRepaymentResponseCreditLineFacility dateType(String dateType) {
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
    RetrieveRepaymentResponseCreditLineFacility retrieveRepaymentResponseCreditLineFacility = (RetrieveRepaymentResponseCreditLineFacility) o;
    return Objects.equals(this.productInstanceReference, retrieveRepaymentResponseCreditLineFacility.productInstanceReference) &&
        Objects.equals(this.creditFacilityNumber, retrieveRepaymentResponseCreditLineFacility.creditFacilityNumber) &&
        Objects.equals(this.customerReference, retrieveRepaymentResponseCreditLineFacility.customerReference) &&
        Objects.equals(this.partyReference, retrieveRepaymentResponseCreditLineFacility.partyReference) &&
        Objects.equals(this.repaymentType, retrieveRepaymentResponseCreditLineFacility.repaymentType) &&
        Objects.equals(this.creditFacilityAccessTerms, retrieveRepaymentResponseCreditLineFacility.creditFacilityAccessTerms) &&
        Objects.equals(this.creditFacilityUnderlyingDrawdown, retrieveRepaymentResponseCreditLineFacility.creditFacilityUnderlyingDrawdown) &&
        Objects.equals(this.drawdownReference, retrieveRepaymentResponseCreditLineFacility.drawdownReference) &&
        Objects.equals(this.drawdownRecord, retrieveRepaymentResponseCreditLineFacility.drawdownRecord) &&
        Objects.equals(this.drawdownLoanTransaction, retrieveRepaymentResponseCreditLineFacility.drawdownLoanTransaction) &&
        Objects.equals(this.entitlementOptionDefinition, retrieveRepaymentResponseCreditLineFacility.entitlementOptionDefinition) &&
        Objects.equals(this.entitlementOptionSetting, retrieveRepaymentResponseCreditLineFacility.entitlementOptionSetting) &&
        Objects.equals(this.restrictionOptionDefinition, retrieveRepaymentResponseCreditLineFacility.restrictionOptionDefinition) &&
        Objects.equals(this.restrictionOptionSetting, retrieveRepaymentResponseCreditLineFacility.restrictionOptionSetting) &&
        Objects.equals(this.creditFacilityOutstandingBalance, retrieveRepaymentResponseCreditLineFacility.creditFacilityOutstandingBalance) &&
        Objects.equals(this.dateType, retrieveRepaymentResponseCreditLineFacility.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productInstanceReference, creditFacilityNumber, customerReference, partyReference, repaymentType, creditFacilityAccessTerms, creditFacilityUnderlyingDrawdown, drawdownReference, drawdownRecord, drawdownLoanTransaction, entitlementOptionDefinition, entitlementOptionSetting, restrictionOptionDefinition, restrictionOptionSetting, creditFacilityOutstandingBalance, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveRepaymentResponseCreditLineFacility {\n");
    
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    creditFacilityNumber: ").append(toIndentedString(creditFacilityNumber)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    partyReference: ").append(toIndentedString(partyReference)).append("\n");
    sb.append("    repaymentType: ").append(toIndentedString(repaymentType)).append("\n");
    sb.append("    creditFacilityAccessTerms: ").append(toIndentedString(creditFacilityAccessTerms)).append("\n");
    sb.append("    creditFacilityUnderlyingDrawdown: ").append(toIndentedString(creditFacilityUnderlyingDrawdown)).append("\n");
    sb.append("    drawdownReference: ").append(toIndentedString(drawdownReference)).append("\n");
    sb.append("    drawdownRecord: ").append(toIndentedString(drawdownRecord)).append("\n");
    sb.append("    drawdownLoanTransaction: ").append(toIndentedString(drawdownLoanTransaction)).append("\n");
    sb.append("    entitlementOptionDefinition: ").append(toIndentedString(entitlementOptionDefinition)).append("\n");
    sb.append("    entitlementOptionSetting: ").append(toIndentedString(entitlementOptionSetting)).append("\n");
    sb.append("    restrictionOptionDefinition: ").append(toIndentedString(restrictionOptionDefinition)).append("\n");
    sb.append("    restrictionOptionSetting: ").append(toIndentedString(restrictionOptionSetting)).append("\n");
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

