package com.org.ibm.model.creditfacility;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateRestructuringResponseCreditLineFacility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:52.998Z[GMT]")

public class InitiateRestructuringResponseCreditLineFacility   {
  @JsonProperty("StagedRepaymentStatement")
  private String stagedRepaymentStatement;

  @JsonProperty("CustomerCommentary")
  private String customerCommentary;

  @JsonProperty("CreditFacilityOutstandingBalance")
  private String creditFacilityOutstandingBalance;

  @JsonProperty("DateType")
  private String dateType;

  public InitiateRestructuringResponseCreditLineFacility stagedRepaymentStatement(String stagedRepaymentStatement) {
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

  public InitiateRestructuringResponseCreditLineFacility customerCommentary(String customerCommentary) {
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

  public InitiateRestructuringResponseCreditLineFacility creditFacilityOutstandingBalance(String creditFacilityOutstandingBalance) {
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

  public InitiateRestructuringResponseCreditLineFacility dateType(String dateType) {
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
    InitiateRestructuringResponseCreditLineFacility initiateRestructuringResponseCreditLineFacility = (InitiateRestructuringResponseCreditLineFacility) o;
    return Objects.equals(this.stagedRepaymentStatement, initiateRestructuringResponseCreditLineFacility.stagedRepaymentStatement) &&
        Objects.equals(this.customerCommentary, initiateRestructuringResponseCreditLineFacility.customerCommentary) &&
        Objects.equals(this.creditFacilityOutstandingBalance, initiateRestructuringResponseCreditLineFacility.creditFacilityOutstandingBalance) &&
        Objects.equals(this.dateType, initiateRestructuringResponseCreditLineFacility.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stagedRepaymentStatement, customerCommentary, creditFacilityOutstandingBalance, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateRestructuringResponseCreditLineFacility {\n");
    
    sb.append("    stagedRepaymentStatement: ").append(toIndentedString(stagedRepaymentStatement)).append("\n");
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

