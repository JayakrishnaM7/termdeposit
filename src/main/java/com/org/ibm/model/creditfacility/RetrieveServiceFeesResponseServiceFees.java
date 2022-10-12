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
 * RetrieveServiceFeesResponseServiceFees
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:52.998Z[GMT]")

public class RetrieveServiceFeesResponseServiceFees   {
  @JsonProperty("FeeConfigurationProfile")
  private String feeConfigurationProfile;

  @JsonProperty("FeeType")
  private String feeType;

  @JsonProperty("FeeDefinition")
  private String feeDefinition;

  @JsonProperty("FeeApplicationRecord")
  private String feeApplicationRecord;

  @JsonProperty("FeeTransaction")
  private String feeTransaction;

  @JsonProperty("TransactionDescription")
  private String transactionDescription;

  @JsonProperty("TransactionFeeType")
  private String transactionFeeType;

  @JsonProperty("TransactionFeeCharge")
  private String transactionFeeCharge;

  @JsonProperty("FeeProjectionsandCommitments")
  private String feeProjectionsandCommitments;

  @JsonProperty("ProjectedTransactionDescription")
  private String projectedTransactionDescription;

  @JsonProperty("ProjectedTransactionFeeType")
  private String projectedTransactionFeeType;

  @JsonProperty("ProjectedTransactionFeeCharge")
  private String projectedTransactionFeeCharge;

  @JsonProperty("FeeAccrualAmount")
  private BigDecimal feeAccrualAmount;

  @JsonProperty("AccrualFeeType")
  private String accrualFeeType;

  @JsonProperty("AccrualFeeCharge")
  private String accrualFeeCharge;

  public RetrieveServiceFeesResponseServiceFees feeConfigurationProfile(String feeConfigurationProfile) {
    this.feeConfigurationProfile = feeConfigurationProfile;
    return this;
  }

  /**
   * Get feeConfigurationProfile
   * @return feeConfigurationProfile
  */
  @ApiModelProperty(value = "")


  public String getFeeConfigurationProfile() {
    return feeConfigurationProfile;
  }

  public void setFeeConfigurationProfile(String feeConfigurationProfile) {
    this.feeConfigurationProfile = feeConfigurationProfile;
  }

  public RetrieveServiceFeesResponseServiceFees feeType(String feeType) {
    this.feeType = feeType;
    return this;
  }

  /**
   * Get feeType
   * @return feeType
  */
  @ApiModelProperty(value = "")


  public String getFeeType() {
    return feeType;
  }

  public void setFeeType(String feeType) {
    this.feeType = feeType;
  }

  public RetrieveServiceFeesResponseServiceFees feeDefinition(String feeDefinition) {
    this.feeDefinition = feeDefinition;
    return this;
  }

  /**
   * Get feeDefinition
   * @return feeDefinition
  */
  @ApiModelProperty(value = "")


  public String getFeeDefinition() {
    return feeDefinition;
  }

  public void setFeeDefinition(String feeDefinition) {
    this.feeDefinition = feeDefinition;
  }

  public RetrieveServiceFeesResponseServiceFees feeApplicationRecord(String feeApplicationRecord) {
    this.feeApplicationRecord = feeApplicationRecord;
    return this;
  }

  /**
   * Get feeApplicationRecord
   * @return feeApplicationRecord
  */
  @ApiModelProperty(value = "")


  public String getFeeApplicationRecord() {
    return feeApplicationRecord;
  }

  public void setFeeApplicationRecord(String feeApplicationRecord) {
    this.feeApplicationRecord = feeApplicationRecord;
  }

  public RetrieveServiceFeesResponseServiceFees feeTransaction(String feeTransaction) {
    this.feeTransaction = feeTransaction;
    return this;
  }

  /**
   * Get feeTransaction
   * @return feeTransaction
  */
  @ApiModelProperty(value = "")


  public String getFeeTransaction() {
    return feeTransaction;
  }

  public void setFeeTransaction(String feeTransaction) {
    this.feeTransaction = feeTransaction;
  }

  public RetrieveServiceFeesResponseServiceFees transactionDescription(String transactionDescription) {
    this.transactionDescription = transactionDescription;
    return this;
  }

  /**
   * Get transactionDescription
   * @return transactionDescription
  */
  @ApiModelProperty(value = "")


  public String getTransactionDescription() {
    return transactionDescription;
  }

  public void setTransactionDescription(String transactionDescription) {
    this.transactionDescription = transactionDescription;
  }

  public RetrieveServiceFeesResponseServiceFees transactionFeeType(String transactionFeeType) {
    this.transactionFeeType = transactionFeeType;
    return this;
  }

  /**
   * Get transactionFeeType
   * @return transactionFeeType
  */
  @ApiModelProperty(value = "")


  public String getTransactionFeeType() {
    return transactionFeeType;
  }

  public void setTransactionFeeType(String transactionFeeType) {
    this.transactionFeeType = transactionFeeType;
  }

  public RetrieveServiceFeesResponseServiceFees transactionFeeCharge(String transactionFeeCharge) {
    this.transactionFeeCharge = transactionFeeCharge;
    return this;
  }

  /**
   * Get transactionFeeCharge
   * @return transactionFeeCharge
  */
  @ApiModelProperty(value = "")


  public String getTransactionFeeCharge() {
    return transactionFeeCharge;
  }

  public void setTransactionFeeCharge(String transactionFeeCharge) {
    this.transactionFeeCharge = transactionFeeCharge;
  }

  public RetrieveServiceFeesResponseServiceFees feeProjectionsandCommitments(String feeProjectionsandCommitments) {
    this.feeProjectionsandCommitments = feeProjectionsandCommitments;
    return this;
  }

  /**
   * Get feeProjectionsandCommitments
   * @return feeProjectionsandCommitments
  */
  @ApiModelProperty(value = "")


  public String getFeeProjectionsandCommitments() {
    return feeProjectionsandCommitments;
  }

  public void setFeeProjectionsandCommitments(String feeProjectionsandCommitments) {
    this.feeProjectionsandCommitments = feeProjectionsandCommitments;
  }

  public RetrieveServiceFeesResponseServiceFees projectedTransactionDescription(String projectedTransactionDescription) {
    this.projectedTransactionDescription = projectedTransactionDescription;
    return this;
  }

  /**
   * Get projectedTransactionDescription
   * @return projectedTransactionDescription
  */
  @ApiModelProperty(value = "")


  public String getProjectedTransactionDescription() {
    return projectedTransactionDescription;
  }

  public void setProjectedTransactionDescription(String projectedTransactionDescription) {
    this.projectedTransactionDescription = projectedTransactionDescription;
  }

  public RetrieveServiceFeesResponseServiceFees projectedTransactionFeeType(String projectedTransactionFeeType) {
    this.projectedTransactionFeeType = projectedTransactionFeeType;
    return this;
  }

  /**
   * Get projectedTransactionFeeType
   * @return projectedTransactionFeeType
  */
  @ApiModelProperty(value = "")


  public String getProjectedTransactionFeeType() {
    return projectedTransactionFeeType;
  }

  public void setProjectedTransactionFeeType(String projectedTransactionFeeType) {
    this.projectedTransactionFeeType = projectedTransactionFeeType;
  }

  public RetrieveServiceFeesResponseServiceFees projectedTransactionFeeCharge(String projectedTransactionFeeCharge) {
    this.projectedTransactionFeeCharge = projectedTransactionFeeCharge;
    return this;
  }

  /**
   * Get projectedTransactionFeeCharge
   * @return projectedTransactionFeeCharge
  */
  @ApiModelProperty(value = "")


  public String getProjectedTransactionFeeCharge() {
    return projectedTransactionFeeCharge;
  }

  public void setProjectedTransactionFeeCharge(String projectedTransactionFeeCharge) {
    this.projectedTransactionFeeCharge = projectedTransactionFeeCharge;
  }

  public RetrieveServiceFeesResponseServiceFees feeAccrualAmount(BigDecimal feeAccrualAmount) {
    this.feeAccrualAmount = feeAccrualAmount;
    return this;
  }

  /**
   * Get feeAccrualAmount
   * @return feeAccrualAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getFeeAccrualAmount() {
    return feeAccrualAmount;
  }

  public void setFeeAccrualAmount(BigDecimal feeAccrualAmount) {
    this.feeAccrualAmount = feeAccrualAmount;
  }

  public RetrieveServiceFeesResponseServiceFees accrualFeeType(String accrualFeeType) {
    this.accrualFeeType = accrualFeeType;
    return this;
  }

  /**
   * Get accrualFeeType
   * @return accrualFeeType
  */
  @ApiModelProperty(value = "")


  public String getAccrualFeeType() {
    return accrualFeeType;
  }

  public void setAccrualFeeType(String accrualFeeType) {
    this.accrualFeeType = accrualFeeType;
  }

  public RetrieveServiceFeesResponseServiceFees accrualFeeCharge(String accrualFeeCharge) {
    this.accrualFeeCharge = accrualFeeCharge;
    return this;
  }

  /**
   * Get accrualFeeCharge
   * @return accrualFeeCharge
  */
  @ApiModelProperty(value = "")


  public String getAccrualFeeCharge() {
    return accrualFeeCharge;
  }

  public void setAccrualFeeCharge(String accrualFeeCharge) {
    this.accrualFeeCharge = accrualFeeCharge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveServiceFeesResponseServiceFees retrieveServiceFeesResponseServiceFees = (RetrieveServiceFeesResponseServiceFees) o;
    return Objects.equals(this.feeConfigurationProfile, retrieveServiceFeesResponseServiceFees.feeConfigurationProfile) &&
        Objects.equals(this.feeType, retrieveServiceFeesResponseServiceFees.feeType) &&
        Objects.equals(this.feeDefinition, retrieveServiceFeesResponseServiceFees.feeDefinition) &&
        Objects.equals(this.feeApplicationRecord, retrieveServiceFeesResponseServiceFees.feeApplicationRecord) &&
        Objects.equals(this.feeTransaction, retrieveServiceFeesResponseServiceFees.feeTransaction) &&
        Objects.equals(this.transactionDescription, retrieveServiceFeesResponseServiceFees.transactionDescription) &&
        Objects.equals(this.transactionFeeType, retrieveServiceFeesResponseServiceFees.transactionFeeType) &&
        Objects.equals(this.transactionFeeCharge, retrieveServiceFeesResponseServiceFees.transactionFeeCharge) &&
        Objects.equals(this.feeProjectionsandCommitments, retrieveServiceFeesResponseServiceFees.feeProjectionsandCommitments) &&
        Objects.equals(this.projectedTransactionDescription, retrieveServiceFeesResponseServiceFees.projectedTransactionDescription) &&
        Objects.equals(this.projectedTransactionFeeType, retrieveServiceFeesResponseServiceFees.projectedTransactionFeeType) &&
        Objects.equals(this.projectedTransactionFeeCharge, retrieveServiceFeesResponseServiceFees.projectedTransactionFeeCharge) &&
        Objects.equals(this.feeAccrualAmount, retrieveServiceFeesResponseServiceFees.feeAccrualAmount) &&
        Objects.equals(this.accrualFeeType, retrieveServiceFeesResponseServiceFees.accrualFeeType) &&
        Objects.equals(this.accrualFeeCharge, retrieveServiceFeesResponseServiceFees.accrualFeeCharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeConfigurationProfile, feeType, feeDefinition, feeApplicationRecord, feeTransaction, transactionDescription, transactionFeeType, transactionFeeCharge, feeProjectionsandCommitments, projectedTransactionDescription, projectedTransactionFeeType, projectedTransactionFeeCharge, feeAccrualAmount, accrualFeeType, accrualFeeCharge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveServiceFeesResponseServiceFees {\n");
    
    sb.append("    feeConfigurationProfile: ").append(toIndentedString(feeConfigurationProfile)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    feeDefinition: ").append(toIndentedString(feeDefinition)).append("\n");
    sb.append("    feeApplicationRecord: ").append(toIndentedString(feeApplicationRecord)).append("\n");
    sb.append("    feeTransaction: ").append(toIndentedString(feeTransaction)).append("\n");
    sb.append("    transactionDescription: ").append(toIndentedString(transactionDescription)).append("\n");
    sb.append("    transactionFeeType: ").append(toIndentedString(transactionFeeType)).append("\n");
    sb.append("    transactionFeeCharge: ").append(toIndentedString(transactionFeeCharge)).append("\n");
    sb.append("    feeProjectionsandCommitments: ").append(toIndentedString(feeProjectionsandCommitments)).append("\n");
    sb.append("    projectedTransactionDescription: ").append(toIndentedString(projectedTransactionDescription)).append("\n");
    sb.append("    projectedTransactionFeeType: ").append(toIndentedString(projectedTransactionFeeType)).append("\n");
    sb.append("    projectedTransactionFeeCharge: ").append(toIndentedString(projectedTransactionFeeCharge)).append("\n");
    sb.append("    feeAccrualAmount: ").append(toIndentedString(feeAccrualAmount)).append("\n");
    sb.append("    accrualFeeType: ").append(toIndentedString(accrualFeeType)).append("\n");
    sb.append("    accrualFeeCharge: ").append(toIndentedString(accrualFeeCharge)).append("\n");
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

