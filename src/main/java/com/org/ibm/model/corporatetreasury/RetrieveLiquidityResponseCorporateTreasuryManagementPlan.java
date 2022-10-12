package com.org.ibm.model.corporatetreasury;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveLiquidityResponseCorporateTreasuryManagementPlan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:37.114Z[GMT]")

public class RetrieveLiquidityResponseCorporateTreasuryManagementPlan   {
  @JsonProperty("EnterpriseBankAccountingAndCashManagementRecords")
  private String enterpriseBankAccountingAndCashManagementRecords;

  @JsonProperty("CurrencyandRateRiskAnalysis")
  private Object currencyandRateRiskAnalysis;

  public RetrieveLiquidityResponseCorporateTreasuryManagementPlan enterpriseBankAccountingAndCashManagementRecords(String enterpriseBankAccountingAndCashManagementRecords) {
    this.enterpriseBankAccountingAndCashManagementRecords = enterpriseBankAccountingAndCashManagementRecords;
    return this;
  }

  /**
   * Get enterpriseBankAccountingAndCashManagementRecords
   * @return enterpriseBankAccountingAndCashManagementRecords
  */
  @ApiModelProperty(value = "")


  public String getEnterpriseBankAccountingAndCashManagementRecords() {
    return enterpriseBankAccountingAndCashManagementRecords;
  }

  public void setEnterpriseBankAccountingAndCashManagementRecords(String enterpriseBankAccountingAndCashManagementRecords) {
    this.enterpriseBankAccountingAndCashManagementRecords = enterpriseBankAccountingAndCashManagementRecords;
  }

  public RetrieveLiquidityResponseCorporateTreasuryManagementPlan currencyandRateRiskAnalysis(Object currencyandRateRiskAnalysis) {
    this.currencyandRateRiskAnalysis = currencyandRateRiskAnalysis;
    return this;
  }

  /**
   * Get currencyandRateRiskAnalysis
   * @return currencyandRateRiskAnalysis
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCurrencyandRateRiskAnalysis() {
    return currencyandRateRiskAnalysis;
  }

  public void setCurrencyandRateRiskAnalysis(Object currencyandRateRiskAnalysis) {
    this.currencyandRateRiskAnalysis = currencyandRateRiskAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveLiquidityResponseCorporateTreasuryManagementPlan retrieveLiquidityResponseCorporateTreasuryManagementPlan = (RetrieveLiquidityResponseCorporateTreasuryManagementPlan) o;
    return Objects.equals(this.enterpriseBankAccountingAndCashManagementRecords, retrieveLiquidityResponseCorporateTreasuryManagementPlan.enterpriseBankAccountingAndCashManagementRecords) &&
        Objects.equals(this.currencyandRateRiskAnalysis, retrieveLiquidityResponseCorporateTreasuryManagementPlan.currencyandRateRiskAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enterpriseBankAccountingAndCashManagementRecords, currencyandRateRiskAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveLiquidityResponseCorporateTreasuryManagementPlan {\n");
    
    sb.append("    enterpriseBankAccountingAndCashManagementRecords: ").append(toIndentedString(enterpriseBankAccountingAndCashManagementRecords)).append("\n");
    sb.append("    currencyandRateRiskAnalysis: ").append(toIndentedString(currencyandRateRiskAnalysis)).append("\n");
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

