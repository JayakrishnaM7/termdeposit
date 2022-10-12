package com.org.ibm.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.sessiondialogue.InitiateIntelligenceResponseIntelligence;
import com.org.ibm.model.sessiondialogue.UpdateQueryRequestCustomerContactSessionProcedure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateIntelligenceResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:23.701Z[GMT]")

public class UpdateIntelligenceResponse   {
  @JsonProperty("CustomerContactSessionProcedure")
  private UpdateQueryRequestCustomerContactSessionProcedure customerContactSessionProcedure;

  @JsonProperty("Intelligence")
  private InitiateIntelligenceResponseIntelligence intelligence;

  public UpdateIntelligenceResponse customerContactSessionProcedure(UpdateQueryRequestCustomerContactSessionProcedure customerContactSessionProcedure) {
    this.customerContactSessionProcedure = customerContactSessionProcedure;
    return this;
  }

  /**
   * Get customerContactSessionProcedure
   * @return customerContactSessionProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateQueryRequestCustomerContactSessionProcedure getCustomerContactSessionProcedure() {
    return customerContactSessionProcedure;
  }

  public void setCustomerContactSessionProcedure(UpdateQueryRequestCustomerContactSessionProcedure customerContactSessionProcedure) {
    this.customerContactSessionProcedure = customerContactSessionProcedure;
  }

  public UpdateIntelligenceResponse intelligence(InitiateIntelligenceResponseIntelligence intelligence) {
    this.intelligence = intelligence;
    return this;
  }

  /**
   * Get intelligence
   * @return intelligence
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateIntelligenceResponseIntelligence getIntelligence() {
    return intelligence;
  }

  public void setIntelligence(InitiateIntelligenceResponseIntelligence intelligence) {
    this.intelligence = intelligence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateIntelligenceResponse updateIntelligenceResponse = (UpdateIntelligenceResponse) o;
    return Objects.equals(this.customerContactSessionProcedure, updateIntelligenceResponse.customerContactSessionProcedure) &&
        Objects.equals(this.intelligence, updateIntelligenceResponse.intelligence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContactSessionProcedure, intelligence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateIntelligenceResponse {\n");
    
    sb.append("    customerContactSessionProcedure: ").append(toIndentedString(customerContactSessionProcedure)).append("\n");
    sb.append("    intelligence: ").append(toIndentedString(intelligence)).append("\n");
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

