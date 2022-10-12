package com.org.ibm.model.corporatetreasury;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.corporatetreasury.RetrieveLiquidityResponseCorporateTreasuryManagementPlan;
import com.org.ibm.model.corporatetreasury.RetrieveLiquidityResponseLiquidity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveLiquidityResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:37.114Z[GMT]")

public class RetrieveLiquidityResponse   {
  @JsonProperty("CorporateTreasuryManagementPlan")
  private RetrieveLiquidityResponseCorporateTreasuryManagementPlan corporateTreasuryManagementPlan;

  @JsonProperty("Liquidity")
  private RetrieveLiquidityResponseLiquidity liquidity;

  public RetrieveLiquidityResponse corporateTreasuryManagementPlan(RetrieveLiquidityResponseCorporateTreasuryManagementPlan corporateTreasuryManagementPlan) {
    this.corporateTreasuryManagementPlan = corporateTreasuryManagementPlan;
    return this;
  }

  /**
   * Get corporateTreasuryManagementPlan
   * @return corporateTreasuryManagementPlan
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveLiquidityResponseCorporateTreasuryManagementPlan getCorporateTreasuryManagementPlan() {
    return corporateTreasuryManagementPlan;
  }

  public void setCorporateTreasuryManagementPlan(RetrieveLiquidityResponseCorporateTreasuryManagementPlan corporateTreasuryManagementPlan) {
    this.corporateTreasuryManagementPlan = corporateTreasuryManagementPlan;
  }

  public RetrieveLiquidityResponse liquidity(RetrieveLiquidityResponseLiquidity liquidity) {
    this.liquidity = liquidity;
    return this;
  }

  /**
   * Get liquidity
   * @return liquidity
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveLiquidityResponseLiquidity getLiquidity() {
    return liquidity;
  }

  public void setLiquidity(RetrieveLiquidityResponseLiquidity liquidity) {
    this.liquidity = liquidity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveLiquidityResponse retrieveLiquidityResponse = (RetrieveLiquidityResponse) o;
    return Objects.equals(this.corporateTreasuryManagementPlan, retrieveLiquidityResponse.corporateTreasuryManagementPlan) &&
        Objects.equals(this.liquidity, retrieveLiquidityResponse.liquidity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporateTreasuryManagementPlan, liquidity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveLiquidityResponse {\n");
    
    sb.append("    corporateTreasuryManagementPlan: ").append(toIndentedString(corporateTreasuryManagementPlan)).append("\n");
    sb.append("    liquidity: ").append(toIndentedString(liquidity)).append("\n");
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

