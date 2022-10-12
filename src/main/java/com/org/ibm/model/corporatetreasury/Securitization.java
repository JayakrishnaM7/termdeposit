package com.org.ibm.model.corporatetreasury;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Securitization
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:37.114Z[GMT]")

public class Securitization   {
  @JsonProperty("BankSecuritizationPoliciesandguidelines")
  private String bankSecuritizationPoliciesandguidelines;

  @JsonProperty("SecuritizationTrancheReference")
  private Object securitizationTrancheReference;

  @JsonProperty("SecuritizationTrancheRecord")
  private String securitizationTrancheRecord;

  @JsonProperty("SecuritizationTask")
  private String securitizationTask;

  public Securitization bankSecuritizationPoliciesandguidelines(String bankSecuritizationPoliciesandguidelines) {
    this.bankSecuritizationPoliciesandguidelines = bankSecuritizationPoliciesandguidelines;
    return this;
  }

  /**
   * Get bankSecuritizationPoliciesandguidelines
   * @return bankSecuritizationPoliciesandguidelines
  */
  @ApiModelProperty(value = "")


  public String getBankSecuritizationPoliciesandguidelines() {
    return bankSecuritizationPoliciesandguidelines;
  }

  public void setBankSecuritizationPoliciesandguidelines(String bankSecuritizationPoliciesandguidelines) {
    this.bankSecuritizationPoliciesandguidelines = bankSecuritizationPoliciesandguidelines;
  }

  public Securitization securitizationTrancheReference(Object securitizationTrancheReference) {
    this.securitizationTrancheReference = securitizationTrancheReference;
    return this;
  }

  /**
   * Get securitizationTrancheReference
   * @return securitizationTrancheReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getSecuritizationTrancheReference() {
    return securitizationTrancheReference;
  }

  public void setSecuritizationTrancheReference(Object securitizationTrancheReference) {
    this.securitizationTrancheReference = securitizationTrancheReference;
  }

  public Securitization securitizationTrancheRecord(String securitizationTrancheRecord) {
    this.securitizationTrancheRecord = securitizationTrancheRecord;
    return this;
  }

  /**
   * Get securitizationTrancheRecord
   * @return securitizationTrancheRecord
  */
  @ApiModelProperty(value = "")


  public String getSecuritizationTrancheRecord() {
    return securitizationTrancheRecord;
  }

  public void setSecuritizationTrancheRecord(String securitizationTrancheRecord) {
    this.securitizationTrancheRecord = securitizationTrancheRecord;
  }

  public Securitization securitizationTask(String securitizationTask) {
    this.securitizationTask = securitizationTask;
    return this;
  }

  /**
   * Get securitizationTask
   * @return securitizationTask
  */
  @ApiModelProperty(value = "")


  public String getSecuritizationTask() {
    return securitizationTask;
  }

  public void setSecuritizationTask(String securitizationTask) {
    this.securitizationTask = securitizationTask;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Securitization securitization = (Securitization) o;
    return Objects.equals(this.bankSecuritizationPoliciesandguidelines, securitization.bankSecuritizationPoliciesandguidelines) &&
        Objects.equals(this.securitizationTrancheReference, securitization.securitizationTrancheReference) &&
        Objects.equals(this.securitizationTrancheRecord, securitization.securitizationTrancheRecord) &&
        Objects.equals(this.securitizationTask, securitization.securitizationTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankSecuritizationPoliciesandguidelines, securitizationTrancheReference, securitizationTrancheRecord, securitizationTask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Securitization {\n");
    
    sb.append("    bankSecuritizationPoliciesandguidelines: ").append(toIndentedString(bankSecuritizationPoliciesandguidelines)).append("\n");
    sb.append("    securitizationTrancheReference: ").append(toIndentedString(securitizationTrancheReference)).append("\n");
    sb.append("    securitizationTrancheRecord: ").append(toIndentedString(securitizationTrancheRecord)).append("\n");
    sb.append("    securitizationTask: ").append(toIndentedString(securitizationTask)).append("\n");
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

