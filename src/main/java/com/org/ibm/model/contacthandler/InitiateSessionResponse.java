package com.org.ibm.model.contacthandler;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.contacthandler.InitiateSessionResponseCustomerContactOperatingSession;
import com.org.ibm.model.contacthandler.InitiateSessionResponseSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateSessionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:29.200Z[GMT]")

public class InitiateSessionResponse   {
  @JsonProperty("CustomerContactOperatingSession")
  private InitiateSessionResponseCustomerContactOperatingSession customerContactOperatingSession;

  @JsonProperty("Session")
  private InitiateSessionResponseSession session;

  public InitiateSessionResponse customerContactOperatingSession(InitiateSessionResponseCustomerContactOperatingSession customerContactOperatingSession) {
    this.customerContactOperatingSession = customerContactOperatingSession;
    return this;
  }

  /**
   * Get customerContactOperatingSession
   * @return customerContactOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateSessionResponseCustomerContactOperatingSession getCustomerContactOperatingSession() {
    return customerContactOperatingSession;
  }

  public void setCustomerContactOperatingSession(InitiateSessionResponseCustomerContactOperatingSession customerContactOperatingSession) {
    this.customerContactOperatingSession = customerContactOperatingSession;
  }

  public InitiateSessionResponse session(InitiateSessionResponseSession session) {
    this.session = session;
    return this;
  }

  /**
   * Get session
   * @return session
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateSessionResponseSession getSession() {
    return session;
  }

  public void setSession(InitiateSessionResponseSession session) {
    this.session = session;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateSessionResponse initiateSessionResponse = (InitiateSessionResponse) o;
    return Objects.equals(this.customerContactOperatingSession, initiateSessionResponse.customerContactOperatingSession) &&
        Objects.equals(this.session, initiateSessionResponse.session);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContactOperatingSession, session);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateSessionResponse {\n");
    
    sb.append("    customerContactOperatingSession: ").append(toIndentedString(customerContactOperatingSession)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
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

