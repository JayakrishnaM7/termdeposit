package com.org.ibm.model.customerworkbench;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.customerworkbench.InitiateSWUpdateRequestCustomerWorkbenchOperatingSession;
import com.org.ibm.model.customerworkbench.InitiateSWUpdateRequestSWUpdate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateSWUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:32.007Z[GMT]")

public class InitiateSWUpdateRequest   {
  @JsonProperty("CustomerWorkbenchOperatingSession")
  private InitiateSWUpdateRequestCustomerWorkbenchOperatingSession customerWorkbenchOperatingSession;

  @JsonProperty("SWUpdate")
  private InitiateSWUpdateRequestSWUpdate swUpdate;

  public InitiateSWUpdateRequest customerWorkbenchOperatingSession(InitiateSWUpdateRequestCustomerWorkbenchOperatingSession customerWorkbenchOperatingSession) {
    this.customerWorkbenchOperatingSession = customerWorkbenchOperatingSession;
    return this;
  }

  /**
   * Get customerWorkbenchOperatingSession
   * @return customerWorkbenchOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateSWUpdateRequestCustomerWorkbenchOperatingSession getCustomerWorkbenchOperatingSession() {
    return customerWorkbenchOperatingSession;
  }

  public void setCustomerWorkbenchOperatingSession(InitiateSWUpdateRequestCustomerWorkbenchOperatingSession customerWorkbenchOperatingSession) {
    this.customerWorkbenchOperatingSession = customerWorkbenchOperatingSession;
  }

  public InitiateSWUpdateRequest swUpdate(InitiateSWUpdateRequestSWUpdate swUpdate) {
    this.swUpdate = swUpdate;
    return this;
  }

  /**
   * Get swUpdate
   * @return swUpdate
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateSWUpdateRequestSWUpdate getSwUpdate() {
    return swUpdate;
  }

  public void setSwUpdate(InitiateSWUpdateRequestSWUpdate swUpdate) {
    this.swUpdate = swUpdate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateSWUpdateRequest initiateSWUpdateRequest = (InitiateSWUpdateRequest) o;
    return Objects.equals(this.customerWorkbenchOperatingSession, initiateSWUpdateRequest.customerWorkbenchOperatingSession) &&
        Objects.equals(this.swUpdate, initiateSWUpdateRequest.swUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerWorkbenchOperatingSession, swUpdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateSWUpdateRequest {\n");
    
    sb.append("    customerWorkbenchOperatingSession: ").append(toIndentedString(customerWorkbenchOperatingSession)).append("\n");
    sb.append("    swUpdate: ").append(toIndentedString(swUpdate)).append("\n");
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

