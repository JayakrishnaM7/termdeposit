package com.org.ibm.model.creditfacility;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.creditfacility.RetrieveServiceFeesResponseCreditLineFacility;
import com.org.ibm.model.creditfacility.RetrieveServiceFeesResponseServiceFees;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveServiceFeesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:52.998Z[GMT]")

public class RetrieveServiceFeesResponse   {
  @JsonProperty("CreditLineFacility")
  private RetrieveServiceFeesResponseCreditLineFacility creditLineFacility;

  @JsonProperty("ServiceFees")
  private RetrieveServiceFeesResponseServiceFees serviceFees;

  public RetrieveServiceFeesResponse creditLineFacility(RetrieveServiceFeesResponseCreditLineFacility creditLineFacility) {
    this.creditLineFacility = creditLineFacility;
    return this;
  }

  /**
   * Get creditLineFacility
   * @return creditLineFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveServiceFeesResponseCreditLineFacility getCreditLineFacility() {
    return creditLineFacility;
  }

  public void setCreditLineFacility(RetrieveServiceFeesResponseCreditLineFacility creditLineFacility) {
    this.creditLineFacility = creditLineFacility;
  }

  public RetrieveServiceFeesResponse serviceFees(RetrieveServiceFeesResponseServiceFees serviceFees) {
    this.serviceFees = serviceFees;
    return this;
  }

  /**
   * Get serviceFees
   * @return serviceFees
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveServiceFeesResponseServiceFees getServiceFees() {
    return serviceFees;
  }

  public void setServiceFees(RetrieveServiceFeesResponseServiceFees serviceFees) {
    this.serviceFees = serviceFees;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveServiceFeesResponse retrieveServiceFeesResponse = (RetrieveServiceFeesResponse) o;
    return Objects.equals(this.creditLineFacility, retrieveServiceFeesResponse.creditLineFacility) &&
        Objects.equals(this.serviceFees, retrieveServiceFeesResponse.serviceFees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditLineFacility, serviceFees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveServiceFeesResponse {\n");
    
    sb.append("    creditLineFacility: ").append(toIndentedString(creditLineFacility)).append("\n");
    sb.append("    serviceFees: ").append(toIndentedString(serviceFees)).append("\n");
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

