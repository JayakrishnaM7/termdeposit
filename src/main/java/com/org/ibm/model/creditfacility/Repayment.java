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
 * Repayment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:52.998Z[GMT]")

public class Repayment   {
  @JsonProperty("RepaymentTransactionType")
  private String repaymentTransactionType;

  @JsonProperty("RepaymentTransactionPayerReference")
  private Object repaymentTransactionPayerReference;

  @JsonProperty("RepaymentTransactionPayerProductInstanceReference")
  private Object repaymentTransactionPayerProductInstanceReference;

  @JsonProperty("RepaymentTransactionPayerBankReference")
  private Object repaymentTransactionPayerBankReference;

  @JsonProperty("RepaymentTransactionAmount")
  private BigDecimal repaymentTransactionAmount;

  @JsonProperty("RepaymentTransactionCurrency")
  private String repaymentTransactionCurrency;

  @JsonProperty("RepaymentTransactionValueDate")
  private String repaymentTransactionValueDate;

  public Repayment repaymentTransactionType(String repaymentTransactionType) {
    this.repaymentTransactionType = repaymentTransactionType;
    return this;
  }

  /**
   * Get repaymentTransactionType
   * @return repaymentTransactionType
  */
  @ApiModelProperty(value = "")


  public String getRepaymentTransactionType() {
    return repaymentTransactionType;
  }

  public void setRepaymentTransactionType(String repaymentTransactionType) {
    this.repaymentTransactionType = repaymentTransactionType;
  }

  public Repayment repaymentTransactionPayerReference(Object repaymentTransactionPayerReference) {
    this.repaymentTransactionPayerReference = repaymentTransactionPayerReference;
    return this;
  }

  /**
   * Get repaymentTransactionPayerReference
   * @return repaymentTransactionPayerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getRepaymentTransactionPayerReference() {
    return repaymentTransactionPayerReference;
  }

  public void setRepaymentTransactionPayerReference(Object repaymentTransactionPayerReference) {
    this.repaymentTransactionPayerReference = repaymentTransactionPayerReference;
  }

  public Repayment repaymentTransactionPayerProductInstanceReference(Object repaymentTransactionPayerProductInstanceReference) {
    this.repaymentTransactionPayerProductInstanceReference = repaymentTransactionPayerProductInstanceReference;
    return this;
  }

  /**
   * Get repaymentTransactionPayerProductInstanceReference
   * @return repaymentTransactionPayerProductInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getRepaymentTransactionPayerProductInstanceReference() {
    return repaymentTransactionPayerProductInstanceReference;
  }

  public void setRepaymentTransactionPayerProductInstanceReference(Object repaymentTransactionPayerProductInstanceReference) {
    this.repaymentTransactionPayerProductInstanceReference = repaymentTransactionPayerProductInstanceReference;
  }

  public Repayment repaymentTransactionPayerBankReference(Object repaymentTransactionPayerBankReference) {
    this.repaymentTransactionPayerBankReference = repaymentTransactionPayerBankReference;
    return this;
  }

  /**
   * Get repaymentTransactionPayerBankReference
   * @return repaymentTransactionPayerBankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getRepaymentTransactionPayerBankReference() {
    return repaymentTransactionPayerBankReference;
  }

  public void setRepaymentTransactionPayerBankReference(Object repaymentTransactionPayerBankReference) {
    this.repaymentTransactionPayerBankReference = repaymentTransactionPayerBankReference;
  }

  public Repayment repaymentTransactionAmount(BigDecimal repaymentTransactionAmount) {
    this.repaymentTransactionAmount = repaymentTransactionAmount;
    return this;
  }

  /**
   * Get repaymentTransactionAmount
   * @return repaymentTransactionAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getRepaymentTransactionAmount() {
    return repaymentTransactionAmount;
  }

  public void setRepaymentTransactionAmount(BigDecimal repaymentTransactionAmount) {
    this.repaymentTransactionAmount = repaymentTransactionAmount;
  }

  public Repayment repaymentTransactionCurrency(String repaymentTransactionCurrency) {
    this.repaymentTransactionCurrency = repaymentTransactionCurrency;
    return this;
  }

  /**
   * Get repaymentTransactionCurrency
   * @return repaymentTransactionCurrency
  */
  @ApiModelProperty(value = "")


  public String getRepaymentTransactionCurrency() {
    return repaymentTransactionCurrency;
  }

  public void setRepaymentTransactionCurrency(String repaymentTransactionCurrency) {
    this.repaymentTransactionCurrency = repaymentTransactionCurrency;
  }

  public Repayment repaymentTransactionValueDate(String repaymentTransactionValueDate) {
    this.repaymentTransactionValueDate = repaymentTransactionValueDate;
    return this;
  }

  /**
   * Get repaymentTransactionValueDate
   * @return repaymentTransactionValueDate
  */
  @ApiModelProperty(value = "")


  public String getRepaymentTransactionValueDate() {
    return repaymentTransactionValueDate;
  }

  public void setRepaymentTransactionValueDate(String repaymentTransactionValueDate) {
    this.repaymentTransactionValueDate = repaymentTransactionValueDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Repayment repayment = (Repayment) o;
    return Objects.equals(this.repaymentTransactionType, repayment.repaymentTransactionType) &&
        Objects.equals(this.repaymentTransactionPayerReference, repayment.repaymentTransactionPayerReference) &&
        Objects.equals(this.repaymentTransactionPayerProductInstanceReference, repayment.repaymentTransactionPayerProductInstanceReference) &&
        Objects.equals(this.repaymentTransactionPayerBankReference, repayment.repaymentTransactionPayerBankReference) &&
        Objects.equals(this.repaymentTransactionAmount, repayment.repaymentTransactionAmount) &&
        Objects.equals(this.repaymentTransactionCurrency, repayment.repaymentTransactionCurrency) &&
        Objects.equals(this.repaymentTransactionValueDate, repayment.repaymentTransactionValueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repaymentTransactionType, repaymentTransactionPayerReference, repaymentTransactionPayerProductInstanceReference, repaymentTransactionPayerBankReference, repaymentTransactionAmount, repaymentTransactionCurrency, repaymentTransactionValueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Repayment {\n");
    
    sb.append("    repaymentTransactionType: ").append(toIndentedString(repaymentTransactionType)).append("\n");
    sb.append("    repaymentTransactionPayerReference: ").append(toIndentedString(repaymentTransactionPayerReference)).append("\n");
    sb.append("    repaymentTransactionPayerProductInstanceReference: ").append(toIndentedString(repaymentTransactionPayerProductInstanceReference)).append("\n");
    sb.append("    repaymentTransactionPayerBankReference: ").append(toIndentedString(repaymentTransactionPayerBankReference)).append("\n");
    sb.append("    repaymentTransactionAmount: ").append(toIndentedString(repaymentTransactionAmount)).append("\n");
    sb.append("    repaymentTransactionCurrency: ").append(toIndentedString(repaymentTransactionCurrency)).append("\n");
    sb.append("    repaymentTransactionValueDate: ").append(toIndentedString(repaymentTransactionValueDate)).append("\n");
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

