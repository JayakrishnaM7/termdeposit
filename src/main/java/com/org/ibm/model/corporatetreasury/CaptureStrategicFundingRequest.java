package com.org.ibm.model.corporatetreasury;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.corporatetreasury.CaptureStrategicFundingRequestStrategicFunding;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CaptureStrategicFundingRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:37.114Z[GMT]")

public class CaptureStrategicFundingRequest   {
  @JsonProperty("StrategicFunding")
  private CaptureStrategicFundingRequestStrategicFunding strategicFunding;

  public CaptureStrategicFundingRequest strategicFunding(CaptureStrategicFundingRequestStrategicFunding strategicFunding) {
    this.strategicFunding = strategicFunding;
    return this;
  }

  /**
   * Get strategicFunding
   * @return strategicFunding
  */
  @ApiModelProperty(value = "")

  @Valid

  public CaptureStrategicFundingRequestStrategicFunding getStrategicFunding() {
    return strategicFunding;
  }

  public void setStrategicFunding(CaptureStrategicFundingRequestStrategicFunding strategicFunding) {
    this.strategicFunding = strategicFunding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaptureStrategicFundingRequest captureStrategicFundingRequest = (CaptureStrategicFundingRequest) o;
    return Objects.equals(this.strategicFunding, captureStrategicFundingRequest.strategicFunding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strategicFunding);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaptureStrategicFundingRequest {\n");
    
    sb.append("    strategicFunding: ").append(toIndentedString(strategicFunding)).append("\n");
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

