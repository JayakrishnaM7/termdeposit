package com.org.ibm.model.creditfacility;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCreditLineFacilityResponseCreditLineFacility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:52.998Z[GMT]")

public class InitiateCreditLineFacilityResponseCreditLineFacility   {
  @JsonProperty("ProductInstanceReference")
  private Object productInstanceReference;

  @JsonProperty("StagedRepaymentStatement")
  private String stagedRepaymentStatement;

  @JsonProperty("CustomerCommentary")
  private String customerCommentary;

  @JsonProperty("CreditFacilityOutstandingBalance")
  private String creditFacilityOutstandingBalance;

  @JsonProperty("DateType")
  private String dateType;

  public InitiateCreditLineFacilityResponseCreditLineFacility productInstanceReference(Object productInstanceReference) {
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

  public InitiateCreditLineFacilityResponseCreditLineFacility stagedRepaymentStatement(String stagedRepaymentStatement) {
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

  public InitiateCreditLineFacilityResponseCreditLineFacility customerCommentary(String customerCommentary) {
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

  public InitiateCreditLineFacilityResponseCreditLineFacility creditFacilityOutstandingBalance(String creditFacilityOutstandingBalance) {
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

  public InitiateCreditLineFacilityResponseCreditLineFacility dateType(String dateType) {
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
    InitiateCreditLineFacilityResponseCreditLineFacility initiateCreditLineFacilityResponseCreditLineFacility = (InitiateCreditLineFacilityResponseCreditLineFacility) o;
    return Objects.equals(this.productInstanceReference, initiateCreditLineFacilityResponseCreditLineFacility.productInstanceReference) &&
        Objects.equals(this.stagedRepaymentStatement, initiateCreditLineFacilityResponseCreditLineFacility.stagedRepaymentStatement) &&
        Objects.equals(this.customerCommentary, initiateCreditLineFacilityResponseCreditLineFacility.customerCommentary) &&
        Objects.equals(this.creditFacilityOutstandingBalance, initiateCreditLineFacilityResponseCreditLineFacility.creditFacilityOutstandingBalance) &&
        Objects.equals(this.dateType, initiateCreditLineFacilityResponseCreditLineFacility.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productInstanceReference, stagedRepaymentStatement, customerCommentary, creditFacilityOutstandingBalance, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCreditLineFacilityResponseCreditLineFacility {\n");
    
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
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

