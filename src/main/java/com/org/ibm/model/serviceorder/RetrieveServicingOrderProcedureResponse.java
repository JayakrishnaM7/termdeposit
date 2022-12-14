package com.org.ibm.model.serviceorder;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.serviceorder.RetrieveServicingOrderProcedureResponseServicingOrderProcedure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveServicingOrderProcedureResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:19.198Z[GMT]")

public class RetrieveServicingOrderProcedureResponse   {
  @JsonProperty("ServicingOrderProcedure")
  private RetrieveServicingOrderProcedureResponseServicingOrderProcedure servicingOrderProcedure;

  public RetrieveServicingOrderProcedureResponse servicingOrderProcedure(RetrieveServicingOrderProcedureResponseServicingOrderProcedure servicingOrderProcedure) {
    this.servicingOrderProcedure = servicingOrderProcedure;
    return this;
  }

  /**
   * Get servicingOrderProcedure
   * @return servicingOrderProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveServicingOrderProcedureResponseServicingOrderProcedure getServicingOrderProcedure() {
    return servicingOrderProcedure;
  }

  public void setServicingOrderProcedure(RetrieveServicingOrderProcedureResponseServicingOrderProcedure servicingOrderProcedure) {
    this.servicingOrderProcedure = servicingOrderProcedure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveServicingOrderProcedureResponse retrieveServicingOrderProcedureResponse = (RetrieveServicingOrderProcedureResponse) o;
    return Objects.equals(this.servicingOrderProcedure, retrieveServicingOrderProcedureResponse.servicingOrderProcedure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicingOrderProcedure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveServicingOrderProcedureResponse {\n");
    
    sb.append("    servicingOrderProcedure: ").append(toIndentedString(servicingOrderProcedure)).append("\n");
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

