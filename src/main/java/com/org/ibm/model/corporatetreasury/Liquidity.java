package com.org.ibm.model.corporatetreasury;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Liquidity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:37.114Z[GMT]")

public class Liquidity   {
  @JsonProperty("EnterpriseLiquidity/CashManagementAnalysis")
  private String enterpriseLiquidityCashManagementAnalysis;

  @JsonProperty("EnterpriseLargePaymentTransactionRecords")
  private String enterpriseLargePaymentTransactionRecords;

  @JsonProperty("BusinessUnitFinancialReports")
  private String businessUnitFinancialReports;

  @JsonProperty("LiquidityResolutionTask")
  private String liquidityResolutionTask;

  public Liquidity enterpriseLiquidityCashManagementAnalysis(String enterpriseLiquidityCashManagementAnalysis) {
    this.enterpriseLiquidityCashManagementAnalysis = enterpriseLiquidityCashManagementAnalysis;
    return this;
  }

  /**
   * Get enterpriseLiquidityCashManagementAnalysis
   * @return enterpriseLiquidityCashManagementAnalysis
  */
  @ApiModelProperty(value = "")


  public String getEnterpriseLiquidityCashManagementAnalysis() {
    return enterpriseLiquidityCashManagementAnalysis;
  }

  public void setEnterpriseLiquidityCashManagementAnalysis(String enterpriseLiquidityCashManagementAnalysis) {
    this.enterpriseLiquidityCashManagementAnalysis = enterpriseLiquidityCashManagementAnalysis;
  }

  public Liquidity enterpriseLargePaymentTransactionRecords(String enterpriseLargePaymentTransactionRecords) {
    this.enterpriseLargePaymentTransactionRecords = enterpriseLargePaymentTransactionRecords;
    return this;
  }

  /**
   * Get enterpriseLargePaymentTransactionRecords
   * @return enterpriseLargePaymentTransactionRecords
  */
  @ApiModelProperty(value = "")


  public String getEnterpriseLargePaymentTransactionRecords() {
    return enterpriseLargePaymentTransactionRecords;
  }

  public void setEnterpriseLargePaymentTransactionRecords(String enterpriseLargePaymentTransactionRecords) {
    this.enterpriseLargePaymentTransactionRecords = enterpriseLargePaymentTransactionRecords;
  }

  public Liquidity businessUnitFinancialReports(String businessUnitFinancialReports) {
    this.businessUnitFinancialReports = businessUnitFinancialReports;
    return this;
  }

  /**
   * Get businessUnitFinancialReports
   * @return businessUnitFinancialReports
  */
  @ApiModelProperty(value = "")


  public String getBusinessUnitFinancialReports() {
    return businessUnitFinancialReports;
  }

  public void setBusinessUnitFinancialReports(String businessUnitFinancialReports) {
    this.businessUnitFinancialReports = businessUnitFinancialReports;
  }

  public Liquidity liquidityResolutionTask(String liquidityResolutionTask) {
    this.liquidityResolutionTask = liquidityResolutionTask;
    return this;
  }

  /**
   * Get liquidityResolutionTask
   * @return liquidityResolutionTask
  */
  @ApiModelProperty(value = "")


  public String getLiquidityResolutionTask() {
    return liquidityResolutionTask;
  }

  public void setLiquidityResolutionTask(String liquidityResolutionTask) {
    this.liquidityResolutionTask = liquidityResolutionTask;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Liquidity liquidity = (Liquidity) o;
    return Objects.equals(this.enterpriseLiquidityCashManagementAnalysis, liquidity.enterpriseLiquidityCashManagementAnalysis) &&
        Objects.equals(this.enterpriseLargePaymentTransactionRecords, liquidity.enterpriseLargePaymentTransactionRecords) &&
        Objects.equals(this.businessUnitFinancialReports, liquidity.businessUnitFinancialReports) &&
        Objects.equals(this.liquidityResolutionTask, liquidity.liquidityResolutionTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enterpriseLiquidityCashManagementAnalysis, enterpriseLargePaymentTransactionRecords, businessUnitFinancialReports, liquidityResolutionTask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Liquidity {\n");
    
    sb.append("    enterpriseLiquidityCashManagementAnalysis: ").append(toIndentedString(enterpriseLiquidityCashManagementAnalysis)).append("\n");
    sb.append("    enterpriseLargePaymentTransactionRecords: ").append(toIndentedString(enterpriseLargePaymentTransactionRecords)).append("\n");
    sb.append("    businessUnitFinancialReports: ").append(toIndentedString(businessUnitFinancialReports)).append("\n");
    sb.append("    liquidityResolutionTask: ").append(toIndentedString(liquidityResolutionTask)).append("\n");
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

