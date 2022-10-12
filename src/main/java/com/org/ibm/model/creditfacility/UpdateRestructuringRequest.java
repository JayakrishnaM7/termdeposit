package com.org.ibm.model.creditfacility;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.creditfacility.InitiateRestructuringResponseRestructuring;
import com.org.ibm.model.creditfacility.UpdateCreditLineFacilityRequestCreditLineFacility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateRestructuringRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:52.998Z[GMT]")

public class UpdateRestructuringRequest   {
  @JsonProperty("CreditLineFacility")
  private UpdateCreditLineFacilityRequestCreditLineFacility creditLineFacility;

  @JsonProperty("Restructuring")
  private InitiateRestructuringResponseRestructuring restructuring;

  public UpdateRestructuringRequest creditLineFacility(UpdateCreditLineFacilityRequestCreditLineFacility creditLineFacility) {
    this.creditLineFacility = creditLineFacility;
    return this;
  }

  /**
   * Get creditLineFacility
   * @return creditLineFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateCreditLineFacilityRequestCreditLineFacility getCreditLineFacility() {
    return creditLineFacility;
  }

  public void setCreditLineFacility(UpdateCreditLineFacilityRequestCreditLineFacility creditLineFacility) {
    this.creditLineFacility = creditLineFacility;
  }

  public UpdateRestructuringRequest restructuring(InitiateRestructuringResponseRestructuring restructuring) {
    this.restructuring = restructuring;
    return this;
  }

  /**
   * Get restructuring
   * @return restructuring
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateRestructuringResponseRestructuring getRestructuring() {
    return restructuring;
  }

  public void setRestructuring(InitiateRestructuringResponseRestructuring restructuring) {
    this.restructuring = restructuring;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRestructuringRequest updateRestructuringRequest = (UpdateRestructuringRequest) o;
    return Objects.equals(this.creditLineFacility, updateRestructuringRequest.creditLineFacility) &&
        Objects.equals(this.restructuring, updateRestructuringRequest.restructuring);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditLineFacility, restructuring);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRestructuringRequest {\n");
    
    sb.append("    creditLineFacility: ").append(toIndentedString(creditLineFacility)).append("\n");
    sb.append("    restructuring: ").append(toIndentedString(restructuring)).append("\n");
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

