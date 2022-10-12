package com.org.ibm.model.creditfacility;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.creditfacility.RetrieveRepaymentResponseCreditLineFacility;
import com.org.ibm.model.creditfacility.UpdateRepaymentRequestRepayment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveRepaymentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:52.998Z[GMT]")

public class RetrieveRepaymentResponse   {
  @JsonProperty("CreditLineFacility")
  private RetrieveRepaymentResponseCreditLineFacility creditLineFacility;

  @JsonProperty("Repayment")
  private UpdateRepaymentRequestRepayment repayment;

  public RetrieveRepaymentResponse creditLineFacility(RetrieveRepaymentResponseCreditLineFacility creditLineFacility) {
    this.creditLineFacility = creditLineFacility;
    return this;
  }

  /**
   * Get creditLineFacility
   * @return creditLineFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveRepaymentResponseCreditLineFacility getCreditLineFacility() {
    return creditLineFacility;
  }

  public void setCreditLineFacility(RetrieveRepaymentResponseCreditLineFacility creditLineFacility) {
    this.creditLineFacility = creditLineFacility;
  }

  public RetrieveRepaymentResponse repayment(UpdateRepaymentRequestRepayment repayment) {
    this.repayment = repayment;
    return this;
  }

  /**
   * Get repayment
   * @return repayment
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateRepaymentRequestRepayment getRepayment() {
    return repayment;
  }

  public void setRepayment(UpdateRepaymentRequestRepayment repayment) {
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
    RetrieveRepaymentResponse retrieveRepaymentResponse = (RetrieveRepaymentResponse) o;
    return Objects.equals(this.creditLineFacility, retrieveRepaymentResponse.creditLineFacility) &&
        Objects.equals(this.repayment, retrieveRepaymentResponse.repayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditLineFacility, repayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveRepaymentResponse {\n");
    
    sb.append("    creditLineFacility: ").append(toIndentedString(creditLineFacility)).append("\n");
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

