package com.org.ibm.model.creditfacility;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.creditfacility.InitiateCreditLineFacilityRequestCreditLineFacility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCreditLineFacilityRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:52.998Z[GMT]")

public class InitiateCreditLineFacilityRequest   {
  @JsonProperty("CreditLineFacility")
  private InitiateCreditLineFacilityRequestCreditLineFacility creditLineFacility;

  public InitiateCreditLineFacilityRequest creditLineFacility(InitiateCreditLineFacilityRequestCreditLineFacility creditLineFacility) {
    this.creditLineFacility = creditLineFacility;
    return this;
  }

  /**
   * Get creditLineFacility
   * @return creditLineFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateCreditLineFacilityRequestCreditLineFacility getCreditLineFacility() {
    return creditLineFacility;
  }

  public void setCreditLineFacility(InitiateCreditLineFacilityRequestCreditLineFacility creditLineFacility) {
    this.creditLineFacility = creditLineFacility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCreditLineFacilityRequest initiateCreditLineFacilityRequest = (InitiateCreditLineFacilityRequest) o;
    return Objects.equals(this.creditLineFacility, initiateCreditLineFacilityRequest.creditLineFacility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditLineFacility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCreditLineFacilityRequest {\n");
    
    sb.append("    creditLineFacility: ").append(toIndentedString(creditLineFacility)).append("\n");
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

