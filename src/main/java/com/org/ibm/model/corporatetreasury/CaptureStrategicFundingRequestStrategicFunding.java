package com.org.ibm.model.corporatetreasury;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CaptureStrategicFundingRequestStrategicFunding
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:37.114Z[GMT]")

public class CaptureStrategicFundingRequestStrategicFunding   {
  @JsonProperty("ECMAndDCMMarketTransactions")
  private String ecMAndDCMMarketTransactions;

  @JsonProperty("StrategicInvestmentHoldingsOrTransactions")
  private String strategicInvestmentHoldingsOrTransactions;

  public CaptureStrategicFundingRequestStrategicFunding ecMAndDCMMarketTransactions(String ecMAndDCMMarketTransactions) {
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

  public CaptureStrategicFundingRequestStrategicFunding strategicInvestmentHoldingsOrTransactions(String strategicInvestmentHoldingsOrTransactions) {
    this.strategicInvestmentHoldingsOrTransactions = strategicInvestmentHoldingsOrTransactions;
    return this;
  }

  /**
   * Get strategicInvestmentHoldingsOrTransactions
   * @return strategicInvestmentHoldingsOrTransactions
  */
  @ApiModelProperty(value = "")


  public String getStrategicInvestmentHoldingsOrTransactions() {
    return strategicInvestmentHoldingsOrTransactions;
  }

  public void setStrategicInvestmentHoldingsOrTransactions(String strategicInvestmentHoldingsOrTransactions) {
    this.strategicInvestmentHoldingsOrTransactions = strategicInvestmentHoldingsOrTransactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaptureStrategicFundingRequestStrategicFunding captureStrategicFundingRequestStrategicFunding = (CaptureStrategicFundingRequestStrategicFunding) o;
    return Objects.equals(this.ecMAndDCMMarketTransactions, captureStrategicFundingRequestStrategicFunding.ecMAndDCMMarketTransactions) &&
        Objects.equals(this.strategicInvestmentHoldingsOrTransactions, captureStrategicFundingRequestStrategicFunding.strategicInvestmentHoldingsOrTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ecMAndDCMMarketTransactions, strategicInvestmentHoldingsOrTransactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaptureStrategicFundingRequestStrategicFunding {\n");
    
    sb.append("    ecMAndDCMMarketTransactions: ").append(toIndentedString(ecMAndDCMMarketTransactions)).append("\n");
    sb.append("    strategicInvestmentHoldingsOrTransactions: ").append(toIndentedString(strategicInvestmentHoldingsOrTransactions)).append("\n");
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

