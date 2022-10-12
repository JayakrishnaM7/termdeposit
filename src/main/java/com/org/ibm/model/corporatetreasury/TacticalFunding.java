package com.org.ibm.model.corporatetreasury;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TacticalFunding
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:37.114Z[GMT]")

public class TacticalFunding   {
  @JsonProperty("CapitalAdequacyRequirements")
  private String capitalAdequacyRequirements;

  @JsonProperty("BankPositionsandHedgingRequirements")
  private String bankPositionsandHedgingRequirements;

  @JsonProperty("EnterpriseBalanceSheetPositions")
  private String enterpriseBalanceSheetPositions;

  @JsonProperty("TacticalFundingResolutionTask")
  private String tacticalFundingResolutionTask;

  public TacticalFunding capitalAdequacyRequirements(String capitalAdequacyRequirements) {
    this.capitalAdequacyRequirements = capitalAdequacyRequirements;
    return this;
  }

  /**
   * Get capitalAdequacyRequirements
   * @return capitalAdequacyRequirements
  */
  @ApiModelProperty(value = "")


  public String getCapitalAdequacyRequirements() {
    return capitalAdequacyRequirements;
  }

  public void setCapitalAdequacyRequirements(String capitalAdequacyRequirements) {
    this.capitalAdequacyRequirements = capitalAdequacyRequirements;
  }

  public TacticalFunding bankPositionsandHedgingRequirements(String bankPositionsandHedgingRequirements) {
    this.bankPositionsandHedgingRequirements = bankPositionsandHedgingRequirements;
    return this;
  }

  /**
   * Get bankPositionsandHedgingRequirements
   * @return bankPositionsandHedgingRequirements
  */
  @ApiModelProperty(value = "")


  public String getBankPositionsandHedgingRequirements() {
    return bankPositionsandHedgingRequirements;
  }

  public void setBankPositionsandHedgingRequirements(String bankPositionsandHedgingRequirements) {
    this.bankPositionsandHedgingRequirements = bankPositionsandHedgingRequirements;
  }

  public TacticalFunding enterpriseBalanceSheetPositions(String enterpriseBalanceSheetPositions) {
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

  public TacticalFunding tacticalFundingResolutionTask(String tacticalFundingResolutionTask) {
    this.tacticalFundingResolutionTask = tacticalFundingResolutionTask;
    return this;
  }

  /**
   * Get tacticalFundingResolutionTask
   * @return tacticalFundingResolutionTask
  */
  @ApiModelProperty(value = "")


  public String getTacticalFundingResolutionTask() {
    return tacticalFundingResolutionTask;
  }

  public void setTacticalFundingResolutionTask(String tacticalFundingResolutionTask) {
    this.tacticalFundingResolutionTask = tacticalFundingResolutionTask;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TacticalFunding tacticalFunding = (TacticalFunding) o;
    return Objects.equals(this.capitalAdequacyRequirements, tacticalFunding.capitalAdequacyRequirements) &&
        Objects.equals(this.bankPositionsandHedgingRequirements, tacticalFunding.bankPositionsandHedgingRequirements) &&
        Objects.equals(this.enterpriseBalanceSheetPositions, tacticalFunding.enterpriseBalanceSheetPositions) &&
        Objects.equals(this.tacticalFundingResolutionTask, tacticalFunding.tacticalFundingResolutionTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capitalAdequacyRequirements, bankPositionsandHedgingRequirements, enterpriseBalanceSheetPositions, tacticalFundingResolutionTask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TacticalFunding {\n");
    
    sb.append("    capitalAdequacyRequirements: ").append(toIndentedString(capitalAdequacyRequirements)).append("\n");
    sb.append("    bankPositionsandHedgingRequirements: ").append(toIndentedString(bankPositionsandHedgingRequirements)).append("\n");
    sb.append("    enterpriseBalanceSheetPositions: ").append(toIndentedString(enterpriseBalanceSheetPositions)).append("\n");
    sb.append("    tacticalFundingResolutionTask: ").append(toIndentedString(tacticalFundingResolutionTask)).append("\n");
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

