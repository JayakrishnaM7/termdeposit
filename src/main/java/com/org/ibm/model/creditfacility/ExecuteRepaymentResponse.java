package com.org.ibm.model.creditfacility;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.creditfacility.ExecuteRepaymentResponseRepayment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteRepaymentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:52.998Z[GMT]")

public class ExecuteRepaymentResponse   {
  @JsonProperty("Repayment")
  private ExecuteRepaymentResponseRepayment repayment;

  public ExecuteRepaymentResponse repayment(ExecuteRepaymentResponseRepayment repayment) {
    this.repayment = repayment;
    return this;
  }

  /**
   * Get repayment
   * @return repayment
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecuteRepaymentResponseRepayment getRepayment() {
    return repayment;
  }

  public void setRepayment(ExecuteRepaymentResponseRepayment repayment) {
    this.repayment = repayment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteRepaymentResponse executeRepaymentResponse = (ExecuteRepaymentResponse) o;
    return Objects.equals(this.repayment, executeRepaymentResponse.repayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteRepaymentResponse {\n");
    
    sb.append("    repayment: ").append(toIndentedString(repayment)).append("\n");
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

