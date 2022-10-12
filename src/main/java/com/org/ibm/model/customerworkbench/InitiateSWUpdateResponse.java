package com.org.ibm.model.customerworkbench;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.customerworkbench.InitiateSWUpdateResponseCustomerWorkbenchOperatingSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateSWUpdateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:32.007Z[GMT]")

public class InitiateSWUpdateResponse   {
  @JsonProperty("CustomerWorkbenchOperatingSession")
  private InitiateSWUpdateResponseCustomerWorkbenchOperatingSession customerWorkbenchOperatingSession;

  public InitiateSWUpdateResponse customerWorkbenchOperatingSession(InitiateSWUpdateResponseCustomerWorkbenchOperatingSession customerWorkbenchOperatingSession) {
    this.customerWorkbenchOperatingSession = customerWorkbenchOperatingSession;
    return this;
  }

  /**
   * Get customerWorkbenchOperatingSession
   * @return customerWorkbenchOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateSWUpdateResponseCustomerWorkbenchOperatingSession getCustomerWorkbenchOperatingSession() {
    return customerWorkbenchOperatingSession;
  }

  public void setCustomerWorkbenchOperatingSession(InitiateSWUpdateResponseCustomerWorkbenchOperatingSession customerWorkbenchOperatingSession) {
    this.customerWorkbenchOperatingSession = customerWorkbenchOperatingSession;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateSWUpdateResponse initiateSWUpdateResponse = (InitiateSWUpdateResponse) o;
    return Objects.equals(this.customerWorkbenchOperatingSession, initiateSWUpdateResponse.customerWorkbenchOperatingSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerWorkbenchOperatingSession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateSWUpdateResponse {\n");
    
    sb.append("    customerWorkbenchOperatingSession: ").append(toIndentedString(customerWorkbenchOperatingSession)).append("\n");
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

