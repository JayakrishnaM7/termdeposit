package com.org.ibm.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.sessiondialogue.InitiateQueryRequestQuery;
import com.org.ibm.model.sessiondialogue.UpdateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateQueryRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:23.701Z[GMT]")

public class InitiateQueryRequest   {
  @JsonProperty("CustomerContactSessionProcedure")
  private UpdateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure customerContactSessionProcedure;

  @JsonProperty("Query")
  private InitiateQueryRequestQuery query;

  public InitiateQueryRequest customerContactSessionProcedure(UpdateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure customerContactSessionProcedure) {
    this.customerContactSessionProcedure = customerContactSessionProcedure;
    return this;
  }

  /**
   * Get customerContactSessionProcedure
   * @return customerContactSessionProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure getCustomerContactSessionProcedure() {
    return customerContactSessionProcedure;
  }

  public void setCustomerContactSessionProcedure(UpdateCustomerContactSessionProcedureRequestCustomerContactSessionProcedure customerContactSessionProcedure) {
    this.customerContactSessionProcedure = customerContactSessionProcedure;
  }

  public InitiateQueryRequest query(InitiateQueryRequestQuery query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateQueryRequestQuery getQuery() {
    return query;
  }

  public void setQuery(InitiateQueryRequestQuery query) {
    this.query = query;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateQueryRequest initiateQueryRequest = (InitiateQueryRequest) o;
    return Objects.equals(this.customerContactSessionProcedure, initiateQueryRequest.customerContactSessionProcedure) &&
        Objects.equals(this.query, initiateQueryRequest.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContactSessionProcedure, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateQueryRequest {\n");
    
    sb.append("    customerContactSessionProcedure: ").append(toIndentedString(customerContactSessionProcedure)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

