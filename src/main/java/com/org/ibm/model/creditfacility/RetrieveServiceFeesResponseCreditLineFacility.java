package com.org.ibm.model.creditfacility;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveServiceFeesResponseCreditLineFacility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:52.998Z[GMT]")

public class RetrieveServiceFeesResponseCreditLineFacility   {
  @JsonProperty("ProductInstanceReference")
  private Object productInstanceReference;

  @JsonProperty("CreditFacilityNumber")
  private String creditFacilityNumber;

  @JsonProperty("CustomerReference")
  private Object customerReference;

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

  @JsonProperty("Associations")
  private String associations;

  @JsonProperty("AssociationType")
  private String associationType;

  @JsonProperty("AssociationObligationOrEntitlement")
  private String associationObligationOrEntitlement;

  @JsonProperty("AssociationReference")
  private Object associationReference;

  @JsonProperty("CustomerCommentary")
  private String customerCommentary;

  @JsonProperty("CreditFacilityOutstandingBalance")
  private String creditFacilityOutstandingBalance;

  @JsonProperty("DateType")
  private String dateType;

  public RetrieveServiceFeesResponseCreditLineFacility productInstanceReference(Object productInstanceReference) {
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

  public RetrieveServiceFeesResponseCreditLineFacility creditFacilityNumber(String creditFacilityNumber) {
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

  public RetrieveServiceFeesResponseCreditLineFacility customerReference(Object customerReference) {
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

  public RetrieveServiceFeesResponseCreditLineFacility creditFacilityAccessTerms(String creditFacilityAccessTerms) {
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

  public RetrieveServiceFeesResponseCreditLineFacility creditFacilityUnderlyingDrawdown(String creditFacilityUnderlyingDrawdown) {
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

  public RetrieveServiceFeesResponseCreditLineFacility drawdownReference(Object drawdownReference) {
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

  public RetrieveServiceFeesResponseCreditLineFacility drawdownRecord(String drawdownRecord) {
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

  public RetrieveServiceFeesResponseCreditLineFacility drawdownLoanTransaction(String drawdownLoanTransaction) {
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

  public RetrieveServiceFeesResponseCreditLineFacility entitlementOptionDefinition(String entitlementOptionDefinition) {
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

  public RetrieveServiceFeesResponseCreditLineFacility entitlementOptionSetting(String entitlementOptionSetting) {
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

  public RetrieveServiceFeesResponseCreditLineFacility restrictionOptionDefinition(String restrictionOptionDefinition) {
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

  public RetrieveServiceFeesResponseCreditLineFacility restrictionOptionSetting(String restrictionOptionSetting) {
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

  public RetrieveServiceFeesResponseCreditLineFacility associations(String associations) {
    this.associations = associations;
    return this;
  }

  /**
   * Get associations
   * @return associations
  */
  @ApiModelProperty(value = "")


  public String getAssociations() {
    return associations;
  }

  public void setAssociations(String associations) {
    this.associations = associations;
  }

  public RetrieveServiceFeesResponseCreditLineFacility associationType(String associationType) {
    this.associationType = associationType;
    return this;
  }

  /**
   * Get associationType
   * @return associationType
  */
  @ApiModelProperty(value = "")


  public String getAssociationType() {
    return associationType;
  }

  public void setAssociationType(String associationType) {
    this.associationType = associationType;
  }

  public RetrieveServiceFeesResponseCreditLineFacility associationObligationOrEntitlement(String associationObligationOrEntitlement) {
    this.associationObligationOrEntitlement = associationObligationOrEntitlement;
    return this;
  }

  /**
   * Get associationObligationOrEntitlement
   * @return associationObligationOrEntitlement
  */
  @ApiModelProperty(value = "")


  public String getAssociationObligationOrEntitlement() {
    return associationObligationOrEntitlement;
  }

  public void setAssociationObligationOrEntitlement(String associationObligationOrEntitlement) {
    this.associationObligationOrEntitlement = associationObligationOrEntitlement;
  }

  public RetrieveServiceFeesResponseCreditLineFacility associationReference(Object associationReference) {
    this.associationReference = associationReference;
    return this;
  }

  /**
   * Get associationReference
   * @return associationReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getAssociationReference() {
    return associationReference;
  }

  public void setAssociationReference(Object associationReference) {
    this.associationReference = associationReference;
  }

  public RetrieveServiceFeesResponseCreditLineFacility customerCommentary(String customerCommentary) {
    this.customerCommentary = customerCommentary;
    return this;
  }

  /**
   * Get customerCommentary
   * @return customerCommentary
  */
  @ApiModelProperty(value = "")


  public String getCustomerCommentary() {
    return customerCommentary;
  }

  public void setCustomerCommentary(String customerCommentary) {
    this.customerCommentary = customerCommentary;
  }

  public RetrieveServiceFeesResponseCreditLineFacility creditFacilityOutstandingBalance(String creditFacilityOutstandingBalance) {
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

  public RetrieveServiceFeesResponseCreditLineFacility dateType(String dateType) {
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
    RetrieveServiceFeesResponseCreditLineFacility retrieveServiceFeesResponseCreditLineFacility = (RetrieveServiceFeesResponseCreditLineFacility) o;
    return Objects.equals(this.productInstanceReference, retrieveServiceFeesResponseCreditLineFacility.productInstanceReference) &&
        Objects.equals(this.creditFacilityNumber, retrieveServiceFeesResponseCreditLineFacility.creditFacilityNumber) &&
        Objects.equals(this.customerReference, retrieveServiceFeesResponseCreditLineFacility.customerReference) &&
        Objects.equals(this.creditFacilityAccessTerms, retrieveServiceFeesResponseCreditLineFacility.creditFacilityAccessTerms) &&
        Objects.equals(this.creditFacilityUnderlyingDrawdown, retrieveServiceFeesResponseCreditLineFacility.creditFacilityUnderlyingDrawdown) &&
        Objects.equals(this.drawdownReference, retrieveServiceFeesResponseCreditLineFacility.drawdownReference) &&
        Objects.equals(this.drawdownRecord, retrieveServiceFeesResponseCreditLineFacility.drawdownRecord) &&
        Objects.equals(this.drawdownLoanTransaction, retrieveServiceFeesResponseCreditLineFacility.drawdownLoanTransaction) &&
        Objects.equals(this.entitlementOptionDefinition, retrieveServiceFeesResponseCreditLineFacility.entitlementOptionDefinition) &&
        Objects.equals(this.entitlementOptionSetting, retrieveServiceFeesResponseCreditLineFacility.entitlementOptionSetting) &&
        Objects.equals(this.restrictionOptionDefinition, retrieveServiceFeesResponseCreditLineFacility.restrictionOptionDefinition) &&
        Objects.equals(this.restrictionOptionSetting, retrieveServiceFeesResponseCreditLineFacility.restrictionOptionSetting) &&
        Objects.equals(this.associations, retrieveServiceFeesResponseCreditLineFacility.associations) &&
        Objects.equals(this.associationType, retrieveServiceFeesResponseCreditLineFacility.associationType) &&
        Objects.equals(this.associationObligationOrEntitlement, retrieveServiceFeesResponseCreditLineFacility.associationObligationOrEntitlement) &&
        Objects.equals(this.associationReference, retrieveServiceFeesResponseCreditLineFacility.associationReference) &&
        Objects.equals(this.customerCommentary, retrieveServiceFeesResponseCreditLineFacility.customerCommentary) &&
        Objects.equals(this.creditFacilityOutstandingBalance, retrieveServiceFeesResponseCreditLineFacility.creditFacilityOutstandingBalance) &&
        Objects.equals(this.dateType, retrieveServiceFeesResponseCreditLineFacility.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productInstanceReference, creditFacilityNumber, customerReference, creditFacilityAccessTerms, creditFacilityUnderlyingDrawdown, drawdownReference, drawdownRecord, drawdownLoanTransaction, entitlementOptionDefinition, entitlementOptionSetting, restrictionOptionDefinition, restrictionOptionSetting, associations, associationType, associationObligationOrEntitlement, associationReference, customerCommentary, creditFacilityOutstandingBalance, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveServiceFeesResponseCreditLineFacility {\n");
    
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    creditFacilityNumber: ").append(toIndentedString(creditFacilityNumber)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    creditFacilityAccessTerms: ").append(toIndentedString(creditFacilityAccessTerms)).append("\n");
    sb.append("    creditFacilityUnderlyingDrawdown: ").append(toIndentedString(creditFacilityUnderlyingDrawdown)).append("\n");
    sb.append("    drawdownReference: ").append(toIndentedString(drawdownReference)).append("\n");
    sb.append("    drawdownRecord: ").append(toIndentedString(drawdownRecord)).append("\n");
    sb.append("    drawdownLoanTransaction: ").append(toIndentedString(drawdownLoanTransaction)).append("\n");
    sb.append("    entitlementOptionDefinition: ").append(toIndentedString(entitlementOptionDefinition)).append("\n");
    sb.append("    entitlementOptionSetting: ").append(toIndentedString(entitlementOptionSetting)).append("\n");
    sb.append("    restrictionOptionDefinition: ").append(toIndentedString(restrictionOptionDefinition)).append("\n");
    sb.append("    restrictionOptionSetting: ").append(toIndentedString(restrictionOptionSetting)).append("\n");
    sb.append("    associations: ").append(toIndentedString(associations)).append("\n");
    sb.append("    associationType: ").append(toIndentedString(associationType)).append("\n");
    sb.append("    associationObligationOrEntitlement: ").append(toIndentedString(associationObligationOrEntitlement)).append("\n");
    sb.append("    associationReference: ").append(toIndentedString(associationReference)).append("\n");
    sb.append("    customerCommentary: ").append(toIndentedString(customerCommentary)).append("\n");
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

