package com.org.ibm.model.corporatetreasury;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BankRates
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:37.114Z[GMT]")

public class BankRates   {
  @JsonProperty("BankRateType")
  private String bankRateType;

  @JsonProperty("BankRateValue")
  private Object bankRateValue;

  @JsonProperty("BankRateValueDate")
  private String bankRateValueDate;

  @JsonProperty("BankRateValueHistory")
  private Object bankRateValueHistory;

  @JsonProperty("BankRateRecordReference")
  private Object bankRateRecordReference;

  @JsonProperty("BankRateRecord")
  private Object bankRateRecord;

  @JsonProperty("BankRateRecordDate")
  private String bankRateRecordDate;

  public BankRates bankRateType(String bankRateType) {
    this.bankRateType = bankRateType;
    return this;
  }

  /**
   * Get bankRateType
   * @return bankRateType
  */
  @ApiModelProperty(value = "")


  public String getBankRateType() {
    return bankRateType;
  }

  public void setBankRateType(String bankRateType) {
    this.bankRateType = bankRateType;
  }

  public BankRates bankRateValue(Object bankRateValue) {
    this.bankRateValue = bankRateValue;
    return this;
  }

  /**
   * Get bankRateValue
   * @return bankRateValue
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBankRateValue() {
    return bankRateValue;
  }

  public void setBankRateValue(Object bankRateValue) {
    this.bankRateValue = bankRateValue;
  }

  public BankRates bankRateValueDate(String bankRateValueDate) {
    this.bankRateValueDate = bankRateValueDate;
    return this;
  }

  /**
   * Get bankRateValueDate
   * @return bankRateValueDate
  */
  @ApiModelProperty(value = "")


  public String getBankRateValueDate() {
    return bankRateValueDate;
  }

  public void setBankRateValueDate(String bankRateValueDate) {
    this.bankRateValueDate = bankRateValueDate;
  }

  public BankRates bankRateValueHistory(Object bankRateValueHistory) {
    this.bankRateValueHistory = bankRateValueHistory;
    return this;
  }

  /**
   * Get bankRateValueHistory
   * @return bankRateValueHistory
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBankRateValueHistory() {
    return bankRateValueHistory;
  }

  public void setBankRateValueHistory(Object bankRateValueHistory) {
    this.bankRateValueHistory = bankRateValueHistory;
  }

  public BankRates bankRateRecordReference(Object bankRateRecordReference) {
    this.bankRateRecordReference = bankRateRecordReference;
    return this;
  }

  /**
   * Get bankRateRecordReference
   * @return bankRateRecordReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBankRateRecordReference() {
    return bankRateRecordReference;
  }

  public void setBankRateRecordReference(Object bankRateRecordReference) {
    this.bankRateRecordReference = bankRateRecordReference;
  }

  public BankRates bankRateRecord(Object bankRateRecord) {
    this.bankRateRecord = bankRateRecord;
    return this;
  }

  /**
   * Get bankRateRecord
   * @return bankRateRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBankRateRecord() {
    return bankRateRecord;
  }

  public void setBankRateRecord(Object bankRateRecord) {
    this.bankRateRecord = bankRateRecord;
  }

  public BankRates bankRateRecordDate(String bankRateRecordDate) {
    this.bankRateRecordDate = bankRateRecordDate;
    return this;
  }

  /**
   * Get bankRateRecordDate
   * @return bankRateRecordDate
  */
  @ApiModelProperty(value = "")


  public String getBankRateRecordDate() {
    return bankRateRecordDate;
  }

  public void setBankRateRecordDate(String bankRateRecordDate) {
    this.bankRateRecordDate = bankRateRecordDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankRates bankRates = (BankRates) o;
    return Objects.equals(this.bankRateType, bankRates.bankRateType) &&
        Objects.equals(this.bankRateValue, bankRates.bankRateValue) &&
        Objects.equals(this.bankRateValueDate, bankRates.bankRateValueDate) &&
        Objects.equals(this.bankRateValueHistory, bankRates.bankRateValueHistory) &&
        Objects.equals(this.bankRateRecordReference, bankRates.bankRateRecordReference) &&
        Objects.equals(this.bankRateRecord, bankRates.bankRateRecord) &&
        Objects.equals(this.bankRateRecordDate, bankRates.bankRateRecordDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankRateType, bankRateValue, bankRateValueDate, bankRateValueHistory, bankRateRecordReference, bankRateRecord, bankRateRecordDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankRates {\n");
    
    sb.append("    bankRateType: ").append(toIndentedString(bankRateType)).append("\n");
    sb.append("    bankRateValue: ").append(toIndentedString(bankRateValue)).append("\n");
    sb.append("    bankRateValueDate: ").append(toIndentedString(bankRateValueDate)).append("\n");
    sb.append("    bankRateValueHistory: ").append(toIndentedString(bankRateValueHistory)).append("\n");
    sb.append("    bankRateRecordReference: ").append(toIndentedString(bankRateRecordReference)).append("\n");
    sb.append("    bankRateRecord: ").append(toIndentedString(bankRateRecord)).append("\n");
    sb.append("    bankRateRecordDate: ").append(toIndentedString(bankRateRecordDate)).append("\n");
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

