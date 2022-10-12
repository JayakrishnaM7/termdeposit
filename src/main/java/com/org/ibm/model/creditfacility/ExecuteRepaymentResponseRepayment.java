package com.org.ibm.model.creditfacility;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteRepaymentResponseRepayment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:52.998Z[GMT]")

public class ExecuteRepaymentResponseRepayment   {
  @JsonProperty("RepaymentTransactionValueDate")
  private String repaymentTransactionValueDate;

  public ExecuteRepaymentResponseRepayment repaymentTransactionValueDate(String repaymentTransactionValueDate) {
    this.repaymentTransactionValueDate = repaymentTransactionValueDate;
    return this;
  }

  /**
   * Get repaymentTransactionValueDate
   * @return repaymentTransactionValueDate
  */
  @ApiModelProperty(value = "")


  public String getRepaymentTransactionValueDate() {
    return repaymentTransactionValueDate;
  }

  public void setRepaymentTransactionValueDate(String repaymentTransactionValueDate) {
    this.repaymentTransactionValueDate = repaymentTransactionValueDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteRepaymentResponseRepayment executeRepaymentResponseRepayment = (ExecuteRepaymentResponseRepayment) o;
    return Objects.equals(this.repaymentTransactionValueDate, executeRepaymentResponseRepayment.repaymentTransactionValueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repaymentTransactionValueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteRepaymentResponseRepayment {\n");
    
    sb.append("    repaymentTransactionValueDate: ").append(toIndentedString(repaymentTransactionValueDate)).append("\n");
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

