package com.org.ibm.model.creditfacility;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.creditfacility.InitiateCreditLineFacilityResponseCreditLineFacility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCreditLineFacilityResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:52.998Z[GMT]")

public class InitiateCreditLineFacilityResponse   {
  @JsonProperty("CreditLineFacility")
  private InitiateCreditLineFacilityResponseCreditLineFacility creditLineFacility;

  public InitiateCreditLineFacilityResponse creditLineFacility(InitiateCreditLineFacilityResponseCreditLineFacility creditLineFacility) {
    this.creditLineFacility = creditLineFacility;
    return this;
  }

  /**
   * Get creditLineFacility
   * @return creditLineFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateCreditLineFacilityResponseCreditLineFacility getCreditLineFacility() {
    return creditLineFacility;
  }

  public void setCreditLineFacility(InitiateCreditLineFacilityResponseCreditLineFacility creditLineFacility) {
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
    InitiateCreditLineFacilityResponse initiateCreditLineFacilityResponse = (InitiateCreditLineFacilityResponse) o;
    return Objects.equals(this.creditLineFacility, initiateCreditLineFacilityResponse.creditLineFacility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditLineFacility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCreditLineFacilityResponse {\n");
    
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

