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
 * CreditLineFacility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:52.998Z[GMT]")

public class CreditLineFacility   {
  @JsonProperty("ProductInstanceReference")
  private Object productInstanceReference;

  @JsonProperty("CreditFacilityNumber")
  private String creditFacilityNumber;

  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("PartyReference")
  private Object partyReference;

  @JsonProperty("CustomerAgreementReference")
  private Object customerAgreementReference;

  @JsonProperty("CustomerCreditAssessmentReference")
  private Object customerCreditAssessmentReference;

  @JsonProperty("InsuranceReference")
  private Object insuranceReference;

  @JsonProperty("DelinquencyOrCollectionReference")
  private Object delinquencyOrCollectionReference;

  @JsonProperty("BankBranchOrLocationReference")
  private Object bankBranchOrLocationReference;

  @JsonProperty("BankAccountingUnitReference")
  private Object bankAccountingUnitReference;

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

  @JsonProperty("RepaymentType")
  private String repaymentType;

  @JsonProperty("InterestType")
  private String interestType;

  @JsonProperty("InterestAccrualMethod")
  private String interestAccrualMethod;

  @JsonProperty("CreditFacilityOriginationDate")
  private String creditFacilityOriginationDate;

  @JsonProperty("CreditFacilityMaturityDate")
  private String creditFacilityMaturityDate;

  @JsonProperty("CollateralReference")
  private Object collateralReference;

  @JsonProperty("CollateralAllocation")
  private String collateralAllocation;

  @JsonProperty("TaxReference")
  private Object taxReference;

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

  @JsonProperty("CreditFacilityRepaymentSchedule")
  private String creditFacilityRepaymentSchedule;

  @JsonProperty("StagedRepaymentStatement")
  private String stagedRepaymentStatement;

  @JsonProperty("CustomerCommentary")
  private String customerCommentary;

  @JsonProperty("CreditFacilityOutstandingBalance")
  private String creditFacilityOutstandingBalance;

  @JsonProperty("DateType")
  private String dateType;

  @JsonProperty("Date")
  private String date;

  public CreditLineFacility productInstanceReference(Object productInstanceReference) {
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

  public CreditLineFacility creditFacilityNumber(String creditFacilityNumber) {
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

  public CreditLineFacility customerReference(Object customerReference) {
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

  public CreditLineFacility partyReference(Object partyReference) {
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

  public CreditLineFacility customerAgreementReference(Object customerAgreementReference) {
    this.customerAgreementReference = customerAgreementReference;
    return this;
  }

  /**
   * Get customerAgreementReference
   * @return customerAgreementReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerAgreementReference() {
    return customerAgreementReference;
  }

  public void setCustomerAgreementReference(Object customerAgreementReference) {
    this.customerAgreementReference = customerAgreementReference;
  }

  public CreditLineFacility customerCreditAssessmentReference(Object customerCreditAssessmentReference) {
    this.customerCreditAssessmentReference = customerCreditAssessmentReference;
    return this;
  }

  /**
   * Get customerCreditAssessmentReference
   * @return customerCreditAssessmentReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerCreditAssessmentReference() {
    return customerCreditAssessmentReference;
  }

  public void setCustomerCreditAssessmentReference(Object customerCreditAssessmentReference) {
    this.customerCreditAssessmentReference = customerCreditAssessmentReference;
  }

  public CreditLineFacility insuranceReference(Object insuranceReference) {
    this.insuranceReference = insuranceReference;
    return this;
  }

  /**
   * Get insuranceReference
   * @return insuranceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getInsuranceReference() {
    return insuranceReference;
  }

  public void setInsuranceReference(Object insuranceReference) {
    this.insuranceReference = insuranceReference;
  }

  public CreditLineFacility delinquencyOrCollectionReference(Object delinquencyOrCollectionReference) {
    this.delinquencyOrCollectionReference = delinquencyOrCollectionReference;
    return this;
  }

  /**
   * Get delinquencyOrCollectionReference
   * @return delinquencyOrCollectionReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getDelinquencyOrCollectionReference() {
    return delinquencyOrCollectionReference;
  }

  public void setDelinquencyOrCollectionReference(Object delinquencyOrCollectionReference) {
    this.delinquencyOrCollectionReference = delinquencyOrCollectionReference;
  }

  public CreditLineFacility bankBranchOrLocationReference(Object bankBranchOrLocationReference) {
    this.bankBranchOrLocationReference = bankBranchOrLocationReference;
    return this;
  }

  /**
   * Get bankBranchOrLocationReference
   * @return bankBranchOrLocationReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBankBranchOrLocationReference() {
    return bankBranchOrLocationReference;
  }

  public void setBankBranchOrLocationReference(Object bankBranchOrLocationReference) {
    this.bankBranchOrLocationReference = bankBranchOrLocationReference;
  }

  public CreditLineFacility bankAccountingUnitReference(Object bankAccountingUnitReference) {
    this.bankAccountingUnitReference = bankAccountingUnitReference;
    return this;
  }

  /**
   * Get bankAccountingUnitReference
   * @return bankAccountingUnitReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBankAccountingUnitReference() {
    return bankAccountingUnitReference;
  }

  public void setBankAccountingUnitReference(Object bankAccountingUnitReference) {
    this.bankAccountingUnitReference = bankAccountingUnitReference;
  }

  public CreditLineFacility creditFacilityType(String creditFacilityType) {
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

  public CreditLineFacility creditFacilityAmount(BigDecimal creditFacilityAmount) {
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

  public CreditLineFacility creditFacilityCurrency(String creditFacilityCurrency) {
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

  public CreditLineFacility creditFacilityRateType(String creditFacilityRateType) {
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

  public CreditLineFacility creditFacilityApplicableRate(Object creditFacilityApplicableRate) {
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

  public CreditLineFacility repaymentType(String repaymentType) {
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

  public CreditLineFacility interestType(String interestType) {
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

  public CreditLineFacility interestAccrualMethod(String interestAccrualMethod) {
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

  public CreditLineFacility creditFacilityOriginationDate(String creditFacilityOriginationDate) {
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

  public CreditLineFacility creditFacilityMaturityDate(String creditFacilityMaturityDate) {
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

  public CreditLineFacility collateralReference(Object collateralReference) {
    this.collateralReference = collateralReference;
    return this;
  }

  /**
   * Get collateralReference
   * @return collateralReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCollateralReference() {
    return collateralReference;
  }

  public void setCollateralReference(Object collateralReference) {
    this.collateralReference = collateralReference;
  }

  public CreditLineFacility collateralAllocation(String collateralAllocation) {
    this.collateralAllocation = collateralAllocation;
    return this;
  }

  /**
   * Get collateralAllocation
   * @return collateralAllocation
  */
  @ApiModelProperty(value = "")


  public String getCollateralAllocation() {
    return collateralAllocation;
  }

  public void setCollateralAllocation(String collateralAllocation) {
    this.collateralAllocation = collateralAllocation;
  }

  public CreditLineFacility taxReference(Object taxReference) {
    this.taxReference = taxReference;
    return this;
  }

  /**
   * Get taxReference
   * @return taxReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(Object taxReference) {
    this.taxReference = taxReference;
  }

  public CreditLineFacility creditFacilityAccessTerms(String creditFacilityAccessTerms) {
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

  public CreditLineFacility creditFacilityUnderlyingDrawdown(String creditFacilityUnderlyingDrawdown) {
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

  public CreditLineFacility drawdownReference(Object drawdownReference) {
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

  public CreditLineFacility drawdownRecord(String drawdownRecord) {
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

  public CreditLineFacility drawdownLoanTransaction(String drawdownLoanTransaction) {
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

  public CreditLineFacility entitlementOptionDefinition(String entitlementOptionDefinition) {
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

  public CreditLineFacility entitlementOptionSetting(String entitlementOptionSetting) {
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

  public CreditLineFacility restrictionOptionDefinition(String restrictionOptionDefinition) {
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

  public CreditLineFacility restrictionOptionSetting(String restrictionOptionSetting) {
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

  public CreditLineFacility associations(String associations) {
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

  public CreditLineFacility associationType(String associationType) {
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

  public CreditLineFacility associationObligationOrEntitlement(String associationObligationOrEntitlement) {
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

  public CreditLineFacility associationReference(Object associationReference) {
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

  public CreditLineFacility creditFacilityRepaymentSchedule(String creditFacilityRepaymentSchedule) {
    this.creditFacilityRepaymentSchedule = creditFacilityRepaymentSchedule;
    return this;
  }

  /**
   * Get creditFacilityRepaymentSchedule
   * @return creditFacilityRepaymentSchedule
  */
  @ApiModelProperty(value = "")


  public String getCreditFacilityRepaymentSchedule() {
    return creditFacilityRepaymentSchedule;
  }

  public void setCreditFacilityRepaymentSchedule(String creditFacilityRepaymentSchedule) {
    this.creditFacilityRepaymentSchedule = creditFacilityRepaymentSchedule;
  }

  public CreditLineFacility stagedRepaymentStatement(String stagedRepaymentStatement) {
    this.stagedRepaymentStatement = stagedRepaymentStatement;
    return this;
  }

  /**
   * Get stagedRepaymentStatement
   * @return stagedRepaymentStatement
  */
  @ApiModelProperty(value = "")


  public String getStagedRepaymentStatement() {
    return stagedRepaymentStatement;
  }

  public void setStagedRepaymentStatement(String stagedRepaymentStatement) {
    this.stagedRepaymentStatement = stagedRepaymentStatement;
  }

  public CreditLineFacility customerCommentary(String customerCommentary) {
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

  public CreditLineFacility creditFacilityOutstandingBalance(String creditFacilityOutstandingBalance) {
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

  public CreditLineFacility dateType(String dateType) {
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

  public CreditLineFacility date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @ApiModelProperty(value = "")


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditLineFacility creditLineFacility = (CreditLineFacility) o;
    return Objects.equals(this.productInstanceReference, creditLineFacility.productInstanceReference) &&
        Objects.equals(this.creditFacilityNumber, creditLineFacility.creditFacilityNumber) &&
        Objects.equals(this.customerReference, creditLineFacility.customerReference) &&
        Objects.equals(this.partyReference, creditLineFacility.partyReference) &&
        Objects.equals(this.customerAgreementReference, creditLineFacility.customerAgreementReference) &&
        Objects.equals(this.customerCreditAssessmentReference, creditLineFacility.customerCreditAssessmentReference) &&
        Objects.equals(this.insuranceReference, creditLineFacility.insuranceReference) &&
        Objects.equals(this.delinquencyOrCollectionReference, creditLineFacility.delinquencyOrCollectionReference) &&
        Objects.equals(this.bankBranchOrLocationReference, creditLineFacility.bankBranchOrLocationReference) &&
        Objects.equals(this.bankAccountingUnitReference, creditLineFacility.bankAccountingUnitReference) &&
        Objects.equals(this.creditFacilityType, creditLineFacility.creditFacilityType) &&
        Objects.equals(this.creditFacilityAmount, creditLineFacility.creditFacilityAmount) &&
        Objects.equals(this.creditFacilityCurrency, creditLineFacility.creditFacilityCurrency) &&
        Objects.equals(this.creditFacilityRateType, creditLineFacility.creditFacilityRateType) &&
        Objects.equals(this.creditFacilityApplicableRate, creditLineFacility.creditFacilityApplicableRate) &&
        Objects.equals(this.repaymentType, creditLineFacility.repaymentType) &&
        Objects.equals(this.interestType, creditLineFacility.interestType) &&
        Objects.equals(this.interestAccrualMethod, creditLineFacility.interestAccrualMethod) &&
        Objects.equals(this.creditFacilityOriginationDate, creditLineFacility.creditFacilityOriginationDate) &&
        Objects.equals(this.creditFacilityMaturityDate, creditLineFacility.creditFacilityMaturityDate) &&
        Objects.equals(this.collateralReference, creditLineFacility.collateralReference) &&
        Objects.equals(this.collateralAllocation, creditLineFacility.collateralAllocation) &&
        Objects.equals(this.taxReference, creditLineFacility.taxReference) &&
        Objects.equals(this.creditFacilityAccessTerms, creditLineFacility.creditFacilityAccessTerms) &&
        Objects.equals(this.creditFacilityUnderlyingDrawdown, creditLineFacility.creditFacilityUnderlyingDrawdown) &&
        Objects.equals(this.drawdownReference, creditLineFacility.drawdownReference) &&
        Objects.equals(this.drawdownRecord, creditLineFacility.drawdownRecord) &&
        Objects.equals(this.drawdownLoanTransaction, creditLineFacility.drawdownLoanTransaction) &&
        Objects.equals(this.entitlementOptionDefinition, creditLineFacility.entitlementOptionDefinition) &&
        Objects.equals(this.entitlementOptionSetting, creditLineFacility.entitlementOptionSetting) &&
        Objects.equals(this.restrictionOptionDefinition, creditLineFacility.restrictionOptionDefinition) &&
        Objects.equals(this.restrictionOptionSetting, creditLineFacility.restrictionOptionSetting) &&
        Objects.equals(this.associations, creditLineFacility.associations) &&
        Objects.equals(this.associationType, creditLineFacility.associationType) &&
        Objects.equals(this.associationObligationOrEntitlement, creditLineFacility.associationObligationOrEntitlement) &&
        Objects.equals(this.associationReference, creditLineFacility.associationReference) &&
        Objects.equals(this.creditFacilityRepaymentSchedule, creditLineFacility.creditFacilityRepaymentSchedule) &&
        Objects.equals(this.stagedRepaymentStatement, creditLineFacility.stagedRepaymentStatement) &&
        Objects.equals(this.customerCommentary, creditLineFacility.customerCommentary) &&
        Objects.equals(this.creditFacilityOutstandingBalance, creditLineFacility.creditFacilityOutstandingBalance) &&
        Objects.equals(this.dateType, creditLineFacility.dateType) &&
        Objects.equals(this.date, creditLineFacility.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productInstanceReference, creditFacilityNumber, customerReference, partyReference, customerAgreementReference, customerCreditAssessmentReference, insuranceReference, delinquencyOrCollectionReference, bankBranchOrLocationReference, bankAccountingUnitReference, creditFacilityType, creditFacilityAmount, creditFacilityCurrency, creditFacilityRateType, creditFacilityApplicableRate, repaymentType, interestType, interestAccrualMethod, creditFacilityOriginationDate, creditFacilityMaturityDate, collateralReference, collateralAllocation, taxReference, creditFacilityAccessTerms, creditFacilityUnderlyingDrawdown, drawdownReference, drawdownRecord, drawdownLoanTransaction, entitlementOptionDefinition, entitlementOptionSetting, restrictionOptionDefinition, restrictionOptionSetting, associations, associationType, associationObligationOrEntitlement, associationReference, creditFacilityRepaymentSchedule, stagedRepaymentStatement, customerCommentary, creditFacilityOutstandingBalance, dateType, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditLineFacility {\n");
    
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    creditFacilityNumber: ").append(toIndentedString(creditFacilityNumber)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    partyReference: ").append(toIndentedString(partyReference)).append("\n");
    sb.append("    customerAgreementReference: ").append(toIndentedString(customerAgreementReference)).append("\n");
    sb.append("    customerCreditAssessmentReference: ").append(toIndentedString(customerCreditAssessmentReference)).append("\n");
    sb.append("    insuranceReference: ").append(toIndentedString(insuranceReference)).append("\n");
    sb.append("    delinquencyOrCollectionReference: ").append(toIndentedString(delinquencyOrCollectionReference)).append("\n");
    sb.append("    bankBranchOrLocationReference: ").append(toIndentedString(bankBranchOrLocationReference)).append("\n");
    sb.append("    bankAccountingUnitReference: ").append(toIndentedString(bankAccountingUnitReference)).append("\n");
    sb.append("    creditFacilityType: ").append(toIndentedString(creditFacilityType)).append("\n");
    sb.append("    creditFacilityAmount: ").append(toIndentedString(creditFacilityAmount)).append("\n");
    sb.append("    creditFacilityCurrency: ").append(toIndentedString(creditFacilityCurrency)).append("\n");
    sb.append("    creditFacilityRateType: ").append(toIndentedString(creditFacilityRateType)).append("\n");
    sb.append("    creditFacilityApplicableRate: ").append(toIndentedString(creditFacilityApplicableRate)).append("\n");
    sb.append("    repaymentType: ").append(toIndentedString(repaymentType)).append("\n");
    sb.append("    interestType: ").append(toIndentedString(interestType)).append("\n");
    sb.append("    interestAccrualMethod: ").append(toIndentedString(interestAccrualMethod)).append("\n");
    sb.append("    creditFacilityOriginationDate: ").append(toIndentedString(creditFacilityOriginationDate)).append("\n");
    sb.append("    creditFacilityMaturityDate: ").append(toIndentedString(creditFacilityMaturityDate)).append("\n");
    sb.append("    collateralReference: ").append(toIndentedString(collateralReference)).append("\n");
    sb.append("    collateralAllocation: ").append(toIndentedString(collateralAllocation)).append("\n");
    sb.append("    taxReference: ").append(toIndentedString(taxReference)).append("\n");
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
    sb.append("    creditFacilityRepaymentSchedule: ").append(toIndentedString(creditFacilityRepaymentSchedule)).append("\n");
    sb.append("    stagedRepaymentStatement: ").append(toIndentedString(stagedRepaymentStatement)).append("\n");
    sb.append("    customerCommentary: ").append(toIndentedString(customerCommentary)).append("\n");
    sb.append("    creditFacilityOutstandingBalance: ").append(toIndentedString(creditFacilityOutstandingBalance)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

