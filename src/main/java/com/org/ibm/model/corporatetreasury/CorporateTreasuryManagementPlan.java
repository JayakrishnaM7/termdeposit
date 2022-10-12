package com.org.ibm.model.corporatetreasury;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CorporateTreasuryManagementPlan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:37.114Z[GMT]")

public class CorporateTreasuryManagementPlan   {
  @JsonProperty("TreasuryPlanningPoliciesAndGuidelines")
  private String treasuryPlanningPoliciesAndGuidelines;

  @JsonProperty("TreasuryPlanOperatingParameters")
  private String treasuryPlanOperatingParameters;

  @JsonProperty("TreasuryPlanGoals")
  private String treasuryPlanGoals;

  @JsonProperty("EnterpriseFinancialStatements")
  private String enterpriseFinancialStatements;

  @JsonProperty("EnterpriseBalanceSheetDetailedContent")
  private String enterpriseBalanceSheetDetailedContent;

  @JsonProperty("EnterpriseBankAccountingAndCashManagementRecords")
  private String enterpriseBankAccountingAndCashManagementRecords;

  @JsonProperty("CapitalOrWholesaleMarketTransactions")
  private String capitalOrWholesaleMarketTransactions;

  @JsonProperty("CurrencyandRateRiskAnalysis")
  private Object currencyandRateRiskAnalysis;

  public CorporateTreasuryManagementPlan treasuryPlanningPoliciesAndGuidelines(String treasuryPlanningPoliciesAndGuidelines) {
    this.treasuryPlanningPoliciesAndGuidelines = treasuryPlanningPoliciesAndGuidelines;
    return this;
  }

  /**
   * Get treasuryPlanningPoliciesAndGuidelines
   * @return treasuryPlanningPoliciesAndGuidelines
  */
  @ApiModelProperty(value = "")


  public String getTreasuryPlanningPoliciesAndGuidelines() {
    return treasuryPlanningPoliciesAndGuidelines;
  }

  public void setTreasuryPlanningPoliciesAndGuidelines(String treasuryPlanningPoliciesAndGuidelines) {
    this.treasuryPlanningPoliciesAndGuidelines = treasuryPlanningPoliciesAndGuidelines;
  }

  public CorporateTreasuryManagementPlan treasuryPlanOperatingParameters(String treasuryPlanOperatingParameters) {
    this.treasuryPlanOperatingParameters = treasuryPlanOperatingParameters;
    return this;
  }

  /**
   * Get treasuryPlanOperatingParameters
   * @return treasuryPlanOperatingParameters
  */
  @ApiModelProperty(value = "")


  public String getTreasuryPlanOperatingParameters() {
    return treasuryPlanOperatingParameters;
  }

  public void setTreasuryPlanOperatingParameters(String treasuryPlanOperatingParameters) {
    this.treasuryPlanOperatingParameters = treasuryPlanOperatingParameters;
  }

  public CorporateTreasuryManagementPlan treasuryPlanGoals(String treasuryPlanGoals) {
    this.treasuryPlanGoals = treasuryPlanGoals;
    return this;
  }

  /**
   * Get treasuryPlanGoals
   * @return treasuryPlanGoals
  */
  @ApiModelProperty(value = "")


  public String getTreasuryPlanGoals() {
    return treasuryPlanGoals;
  }

  public void setTreasuryPlanGoals(String treasuryPlanGoals) {
    this.treasuryPlanGoals = treasuryPlanGoals;
  }

  public CorporateTreasuryManagementPlan enterpriseFinancialStatements(String enterpriseFinancialStatements) {
    this.enterpriseFinancialStatements = enterpriseFinancialStatements;
    return this;
  }

  /**
   * Get enterpriseFinancialStatements
   * @return enterpriseFinancialStatements
  */
  @ApiModelProperty(value = "")


  public String getEnterpriseFinancialStatements() {
    return enterpriseFinancialStatements;
  }

  public void setEnterpriseFinancialStatements(String enterpriseFinancialStatements) {
    this.enterpriseFinancialStatements = enterpriseFinancialStatements;
  }

  public CorporateTreasuryManagementPlan enterpriseBalanceSheetDetailedContent(String enterpriseBalanceSheetDetailedContent) {
    this.enterpriseBalanceSheetDetailedContent = enterpriseBalanceSheetDetailedContent;
    return this;
  }

  /**
   * Get enterpriseBalanceSheetDetailedContent
   * @return enterpriseBalanceSheetDetailedContent
  */
  @ApiModelProperty(value = "")


  public String getEnterpriseBalanceSheetDetailedContent() {
    return enterpriseBalanceSheetDetailedContent;
  }

  public void setEnterpriseBalanceSheetDetailedContent(String enterpriseBalanceSheetDetailedContent) {
    this.enterpriseBalanceSheetDetailedContent = enterpriseBalanceSheetDetailedContent;
  }

  public CorporateTreasuryManagementPlan enterpriseBankAccountingAndCashManagementRecords(String enterpriseBankAccountingAndCashManagementRecords) {
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

  public CorporateTreasuryManagementPlan capitalOrWholesaleMarketTransactions(String capitalOrWholesaleMarketTransactions) {
    this.capitalOrWholesaleMarketTransactions = capitalOrWholesaleMarketTransactions;
    return this;
  }

  /**
   * Get capitalOrWholesaleMarketTransactions
   * @return capitalOrWholesaleMarketTransactions
  */
  @ApiModelProperty(value = "")


  public String getCapitalOrWholesaleMarketTransactions() {
    return capitalOrWholesaleMarketTransactions;
  }

  public void setCapitalOrWholesaleMarketTransactions(String capitalOrWholesaleMarketTransactions) {
    this.capitalOrWholesaleMarketTransactions = capitalOrWholesaleMarketTransactions;
  }

  public CorporateTreasuryManagementPlan currencyandRateRiskAnalysis(Object currencyandRateRiskAnalysis) {
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
    CorporateTreasuryManagementPlan corporateTreasuryManagementPlan = (CorporateTreasuryManagementPlan) o;
    return Objects.equals(this.treasuryPlanningPoliciesAndGuidelines, corporateTreasuryManagementPlan.treasuryPlanningPoliciesAndGuidelines) &&
        Objects.equals(this.treasuryPlanOperatingParameters, corporateTreasuryManagementPlan.treasuryPlanOperatingParameters) &&
        Objects.equals(this.treasuryPlanGoals, corporateTreasuryManagementPlan.treasuryPlanGoals) &&
        Objects.equals(this.enterpriseFinancialStatements, corporateTreasuryManagementPlan.enterpriseFinancialStatements) &&
        Objects.equals(this.enterpriseBalanceSheetDetailedContent, corporateTreasuryManagementPlan.enterpriseBalanceSheetDetailedContent) &&
        Objects.equals(this.enterpriseBankAccountingAndCashManagementRecords, corporateTreasuryManagementPlan.enterpriseBankAccountingAndCashManagementRecords) &&
        Objects.equals(this.capitalOrWholesaleMarketTransactions, corporateTreasuryManagementPlan.capitalOrWholesaleMarketTransactions) &&
        Objects.equals(this.currencyandRateRiskAnalysis, corporateTreasuryManagementPlan.currencyandRateRiskAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(treasuryPlanningPoliciesAndGuidelines, treasuryPlanOperatingParameters, treasuryPlanGoals, enterpriseFinancialStatements, enterpriseBalanceSheetDetailedContent, enterpriseBankAccountingAndCashManagementRecords, capitalOrWholesaleMarketTransactions, currencyandRateRiskAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorporateTreasuryManagementPlan {\n");
    
    sb.append("    treasuryPlanningPoliciesAndGuidelines: ").append(toIndentedString(treasuryPlanningPoliciesAndGuidelines)).append("\n");
    sb.append("    treasuryPlanOperatingParameters: ").append(toIndentedString(treasuryPlanOperatingParameters)).append("\n");
    sb.append("    treasuryPlanGoals: ").append(toIndentedString(treasuryPlanGoals)).append("\n");
    sb.append("    enterpriseFinancialStatements: ").append(toIndentedString(enterpriseFinancialStatements)).append("\n");
    sb.append("    enterpriseBalanceSheetDetailedContent: ").append(toIndentedString(enterpriseBalanceSheetDetailedContent)).append("\n");
    sb.append("    enterpriseBankAccountingAndCashManagementRecords: ").append(toIndentedString(enterpriseBankAccountingAndCashManagementRecords)).append("\n");
    sb.append("    capitalOrWholesaleMarketTransactions: ").append(toIndentedString(capitalOrWholesaleMarketTransactions)).append("\n");
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

