package com.org.ibm.model.partylifecycle;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.partylifecycle.ExecuteDocumentationRequestDocumentation;
import com.org.ibm.model.partylifecycle.ExecuteDocumentationResponsePartyRelationshipProcedure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestDocumentationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:05.697Z[GMT]")

public class RequestDocumentationResponse   {
  @JsonProperty("PartyRelationshipProcedure")
  private ExecuteDocumentationResponsePartyRelationshipProcedure partyRelationshipProcedure;

  @JsonProperty("Documentation")
  private ExecuteDocumentationRequestDocumentation documentation;

  public RequestDocumentationResponse partyRelationshipProcedure(ExecuteDocumentationResponsePartyRelationshipProcedure partyRelationshipProcedure) {
    this.partyRelationshipProcedure = partyRelationshipProcedure;
    return this;
  }

  /**
   * Get partyRelationshipProcedure
   * @return partyRelationshipProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecuteDocumentationResponsePartyRelationshipProcedure getPartyRelationshipProcedure() {
    return partyRelationshipProcedure;
  }

  public void setPartyRelationshipProcedure(ExecuteDocumentationResponsePartyRelationshipProcedure partyRelationshipProcedure) {
    this.partyRelationshipProcedure = partyRelationshipProcedure;
  }

  public RequestDocumentationResponse documentation(ExecuteDocumentationRequestDocumentation documentation) {
    this.documentation = documentation;
    return this;
  }

  /**
   * Get documentation
   * @return documentation
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecuteDocumentationRequestDocumentation getDocumentation() {
    return documentation;
  }

  public void setDocumentation(ExecuteDocumentationRequestDocumentation documentation) {
    this.documentation = documentation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestDocumentationResponse requestDocumentationResponse = (RequestDocumentationResponse) o;
    return Objects.equals(this.partyRelationshipProcedure, requestDocumentationResponse.partyRelationshipProcedure) &&
        Objects.equals(this.documentation, requestDocumentationResponse.documentation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyRelationshipProcedure, documentation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestDocumentationResponse {\n");
    
    sb.append("    partyRelationshipProcedure: ").append(toIndentedString(partyRelationshipProcedure)).append("\n");
    sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
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

