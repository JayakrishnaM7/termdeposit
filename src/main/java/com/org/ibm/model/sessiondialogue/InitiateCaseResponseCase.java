package com.org.ibm.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCaseResponseCase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:23.701Z[GMT]")

public class InitiateCaseResponseCase   {
  @JsonProperty("CaseTaskResult")
  private String caseTaskResult;

  public InitiateCaseResponseCase caseTaskResult(String caseTaskResult) {
    this.caseTaskResult = caseTaskResult;
    return this;
  }

  /**
   * Get caseTaskResult
   * @return caseTaskResult
  */
  @ApiModelProperty(value = "")


  public String getCaseTaskResult() {
    return caseTaskResult;
  }

  public void setCaseTaskResult(String caseTaskResult) {
    this.caseTaskResult = caseTaskResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCaseResponseCase initiateCaseResponseCase = (InitiateCaseResponseCase) o;
    return Objects.equals(this.caseTaskResult, initiateCaseResponseCase.caseTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCaseResponseCase {\n");
    
    sb.append("    caseTaskResult: ").append(toIndentedString(caseTaskResult)).append("\n");
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

