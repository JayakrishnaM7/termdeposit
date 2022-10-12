package com.org.ibm.model.creditfacility;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.creditfacility.InitiateRestructuringRequestRestructuring;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestRestructuringRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:52.998Z[GMT]")

public class RequestRestructuringRequest   {
  @JsonProperty("Restructuring")
  private InitiateRestructuringRequestRestructuring restructuring;

  public RequestRestructuringRequest restructuring(InitiateRestructuringRequestRestructuring restructuring) {
    this.restructuring = restructuring;
    return this;
  }

  /**
   * Get restructuring
   * @return restructuring
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateRestructuringRequestRestructuring getRestructuring() {
    return restructuring;
  }

  public void setRestructuring(InitiateRestructuringRequestRestructuring restructuring) {
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
    RequestRestructuringRequest requestRestructuringRequest = (RequestRestructuringRequest) o;
    return Objects.equals(this.restructuring, requestRestructuringRequest.restructuring);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restructuring);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestRestructuringRequest {\n");
    
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

