package com.org.ibm.model.corporatetreasury;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.corporatetreasury.CaptureLiquidityRequestLiquidity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CaptureLiquidityRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:37.114Z[GMT]")

public class CaptureLiquidityRequest   {
  @JsonProperty("Liquidity")
  private CaptureLiquidityRequestLiquidity liquidity;

  public CaptureLiquidityRequest liquidity(CaptureLiquidityRequestLiquidity liquidity) {
    this.liquidity = liquidity;
    return this;
  }

  /**
   * Get liquidity
   * @return liquidity
  */
  @ApiModelProperty(value = "")

  @Valid

  public CaptureLiquidityRequestLiquidity getLiquidity() {
    return liquidity;
  }

  public void setLiquidity(CaptureLiquidityRequestLiquidity liquidity) {
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
    CaptureLiquidityRequest captureLiquidityRequest = (CaptureLiquidityRequest) o;
    return Objects.equals(this.liquidity, captureLiquidityRequest.liquidity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(liquidity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaptureLiquidityRequest {\n");
    
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

