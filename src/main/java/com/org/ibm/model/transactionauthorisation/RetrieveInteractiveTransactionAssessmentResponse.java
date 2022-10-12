package com.org.ibm.model.transactionauthorisation;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.transactionauthorisation.RetrieveInteractiveTransactionAssessmentResponseInteractiveTransactionAssessment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveInteractiveTransactionAssessmentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:07.909Z[GMT]")

public class RetrieveInteractiveTransactionAssessmentResponse   {
  @JsonProperty("InteractiveTransactionAssessment")
  private RetrieveInteractiveTransactionAssessmentResponseInteractiveTransactionAssessment interactiveTransactionAssessment;

  public RetrieveInteractiveTransactionAssessmentResponse interactiveTransactionAssessment(RetrieveInteractiveTransactionAssessmentResponseInteractiveTransactionAssessment interactiveTransactionAssessment) {
    this.interactiveTransactionAssessment = interactiveTransactionAssessment;
    return this;
  }

  /**
   * Get interactiveTransactionAssessment
   * @return interactiveTransactionAssessment
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveInteractiveTransactionAssessmentResponseInteractiveTransactionAssessment getInteractiveTransactionAssessment() {
    return interactiveTransactionAssessment;
  }

  public void setInteractiveTransactionAssessment(RetrieveInteractiveTransactionAssessmentResponseInteractiveTransactionAssessment interactiveTransactionAssessment) {
    this.interactiveTransactionAssessment = interactiveTransactionAssessment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveInteractiveTransactionAssessmentResponse retrieveInteractiveTransactionAssessmentResponse = (RetrieveInteractiveTransactionAssessmentResponse) o;
    return Objects.equals(this.interactiveTransactionAssessment, retrieveInteractiveTransactionAssessmentResponse.interactiveTransactionAssessment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interactiveTransactionAssessment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveInteractiveTransactionAssessmentResponse {\n");
    
    sb.append("    interactiveTransactionAssessment: ").append(toIndentedString(interactiveTransactionAssessment)).append("\n");
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

