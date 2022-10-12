package com.org.ibm.model.corporatetreasury;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StrategicFunding
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:37.114Z[GMT]")

public class StrategicFunding   {
  @JsonProperty("FinancialPerformanceandBalanceSheetProjections")
  private String financialPerformanceandBalanceSheetProjections;

  @JsonProperty("ECMAndDCMMarketTransactions")
  private String ecMAndDCMMarketTransactions;

  @JsonProperty("StrategicInvestmentHoldings/Transactions")
  private String strategicInvestmentHoldingsTransactions;

  @JsonProperty("EnterpriseBalanceSheetPositions")
  private String enterpriseBalanceSheetPositions;

  @JsonProperty("StrategicFundingResolutionTask")
  private String strategicFundingResolutionTask;

  public StrategicFunding financialPerformanceandBalanceSheetProjections(String financialPerformanceandBalanceSheetProjections) {
    this.financialPerformanceandBalanceSheetProjections = financialPerformanceandBalanceSheetProjections;
    return this;
  }

  /**
   * Get financialPerformanceandBalanceSheetProjections
   * @return financialPerformanceandBalanceSheetProjections
  */
  @ApiModelProperty(value = "")


  public String getFinancialPerformanceandBalanceSheetProjections() {
    return financialPerformanceandBalanceSheetProjections;
  }

  public void setFinancialPerformanceandBalanceSheetProjections(String financialPerformanceandBalanceSheetProjections) {
    this.financialPerformanceandBalanceSheetProjections = financialPerformanceandBalanceSheetProjections;
  }

  public StrategicFunding ecMAndDCMMarketTransactions(String ecMAndDCMMarketTransactions) {
    this.ecMAndDCMMarketTransactions = ecMAndDCMMarketTransactions;
    return this;
  }

  /**
   * Get ecMAndDCMMarketTransactions
   * @return ecMAndDCMMarketTransactions
  */
  @ApiModelProperty(value = "")


  public String getEcMAndDCMMarketTransactions() {
    return ecMAndDCMMarketTransactions;
  }

  public void setEcMAndDCMMarketTransactions(String ecMAndDCMMarketTransactions) {
    this.ecMAndDCMMarketTransactions = ecMAndDCMMarketTransactions;
  }

  public StrategicFunding strategicInvestmentHoldingsTransactions(String strategicInvestmentHoldingsTransactions) {
    this.strategicInvestmentHoldingsTransactions = strategicInvestmentHoldingsTransactions;
    return this;
  }

  /**
   * Get strategicInvestmentHoldingsTransactions
   * @return strategicInvestmentHoldingsTransactions
  */
  @ApiModelProperty(value = "")


  public String getStrategicInvestmentHoldingsTransactions() {
    return strategicInvestmentHoldingsTransactions;
  }

  public void setStrategicInvestmentHoldingsTransactions(String strategicInvestmentHoldingsTransactions) {
    this.strategicInvestmentHoldingsTransactions = strategicInvestmentHoldingsTransactions;
  }

  public StrategicFunding enterpriseBalanceSheetPositions(String enterpriseBalanceSheetPositions) {
    this.enterpriseBalanceSheetPositions = enterpriseBalanceSheetPositions;
    return this;
  }

  /**
   * Get enterpriseBalanceSheetPositions
   * @return enterpriseBalanceSheetPositions
  */
  @ApiModelProperty(value = "")


  public String getEnterpriseBalanceSheetPositions() {
    return enterpriseBalanceSheetPositions;
  }

  public void setEnterpriseBalanceSheetPositions(String enterpriseBalanceSheetPositions) {
    this.enterpriseBalanceSheetPositions = enterpriseBalanceSheetPositions;
  }

  public StrategicFunding strategicFundingResolutionTask(String strategicFundingResolutionTask) {
    this.strategicFundingResolutionTask = strategicFundingResolutionTask;
    return this;
  }

  /**
   * Get strategicFundingResolutionTask
   * @return strategicFundingResolutionTask
  */
  @ApiModelProperty(value = "")


  public String getStrategicFundingResolutionTask() {
    return strategicFundingResolutionTask;
  }

  public void setStrategicFundingResolutionTask(String strategicFundingResolutionTask) {
    this.strategicFundingResolutionTask = strategicFundingResolutionTask;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StrategicFunding strategicFunding = (StrategicFunding) o;
    return Objects.equals(this.financialPerformanceandBalanceSheetProjections, strategicFunding.financialPerformanceandBalanceSheetProjections) &&
        Objects.equals(this.ecMAndDCMMarketTransactions, strategicFunding.ecMAndDCMMarketTransactions) &&
        Objects.equals(this.strategicInvestmentHoldingsTransactions, strategicFunding.strategicInvestmentHoldingsTransactions) &&
        Objects.equals(this.enterpriseBalanceSheetPositions, strategicFunding.enterpriseBalanceSheetPositions) &&
        Objects.equals(this.strategicFundingResolutionTask, strategicFunding.strategicFundingResolutionTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialPerformanceandBalanceSheetProjections, ecMAndDCMMarketTransactions, strategicInvestmentHoldingsTransactions, enterpriseBalanceSheetPositions, strategicFundingResolutionTask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StrategicFunding {\n");
    
    sb.append("    financialPerformanceandBalanceSheetProjections: ").append(toIndentedString(financialPerformanceandBalanceSheetProjections)).append("\n");
    sb.append("    ecMAndDCMMarketTransactions: ").append(toIndentedString(ecMAndDCMMarketTransactions)).append("\n");
    sb.append("    strategicInvestmentHoldingsTransactions: ").append(toIndentedString(strategicInvestmentHoldingsTransactions)).append("\n");
    sb.append("    enterpriseBalanceSheetPositions: ").append(toIndentedString(enterpriseBalanceSheetPositions)).append("\n");
    sb.append("    strategicFundingResolutionTask: ").append(toIndentedString(strategicFundingResolutionTask)).append("\n");
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

