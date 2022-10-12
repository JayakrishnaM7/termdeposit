package com.org.ibm.model.contacthandler;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.contacthandler.UpdateCustomerContactOperatingSessionRequestCustomerContactOperatingSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateCustomerContactOperatingSessionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:29.200Z[GMT]")

public class UpdateCustomerContactOperatingSessionRequest   {
  @JsonProperty("CustomerContactOperatingSession")
  private UpdateCustomerContactOperatingSessionRequestCustomerContactOperatingSession customerContactOperatingSession;

  public UpdateCustomerContactOperatingSessionRequest customerContactOperatingSession(UpdateCustomerContactOperatingSessionRequestCustomerContactOperatingSession customerContactOperatingSession) {
    this.customerContactOperatingSession = customerContactOperatingSession;
    return this;
  }

  /**
   * Get customerContactOperatingSession
   * @return customerContactOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateCustomerContactOperatingSessionRequestCustomerContactOperatingSession getCustomerContactOperatingSession() {
    return customerContactOperatingSession;
  }

  public void setCustomerContactOperatingSession(UpdateCustomerContactOperatingSessionRequestCustomerContactOperatingSession customerContactOperatingSession) {
    this.customerContactOperatingSession = customerContactOperatingSession;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomerContactOperatingSessionRequest updateCustomerContactOperatingSessionRequest = (UpdateCustomerContactOperatingSessionRequest) o;
    return Objects.equals(this.customerContactOperatingSession, updateCustomerContactOperatingSessionRequest.customerContactOperatingSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContactOperatingSession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomerContactOperatingSessionRequest {\n");
    
    sb.append("    customerContactOperatingSession: ").append(toIndentedString(customerContactOperatingSession)).append("\n");
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

