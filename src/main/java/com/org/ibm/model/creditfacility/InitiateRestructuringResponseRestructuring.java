package com.org.ibm.model.creditfacility;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateRestructuringResponseRestructuring
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:52.998Z[GMT]")

public class InitiateRestructuringResponseRestructuring   {
  @JsonProperty("RestructuringTask")
  private String restructuringTask;

  @JsonProperty("RestructuringEvaluation")
  private String restructuringEvaluation;

  @JsonProperty("RestructuringWriteDown")
  private String restructuringWriteDown;

  public InitiateRestructuringResponseRestructuring restructuringTask(String restructuringTask) {
    this.restructuringTask = restructuringTask;
    return this;
  }

  /**
   * Get restructuringTask
   * @return restructuringTask
  */
  @ApiModelProperty(value = "")


  public String getRestructuringTask() {
    return restructuringTask;
  }

  public void setRestructuringTask(String restructuringTask) {
    this.restructuringTask = restructuringTask;
  }

  public InitiateRestructuringResponseRestructuring restructuringEvaluation(String restructuringEvaluation) {
    this.restructuringEvaluation = restructuringEvaluation;
    return this;
  }

  /**
   * Get restructuringEvaluation
   * @return restructuringEvaluation
  */
  @ApiModelProperty(value = "")


  public String getRestructuringEvaluation() {
    return restructuringEvaluation;
  }

  public void setRestructuringEvaluation(String restructuringEvaluation) {
    this.restructuringEvaluation = restructuringEvaluation;
  }

  public InitiateRestructuringResponseRestructuring restructuringWriteDown(String restructuringWriteDown) {
    this.restructuringWriteDown = restructuringWriteDown;
    return this;
  }

  /**
   * Get restructuringWriteDown
   * @return restructuringWriteDown
  */
  @ApiModelProperty(value = "")


  public String getRestructuringWriteDown() {
    return restructuringWriteDown;
  }

  public void setRestructuringWriteDown(String restructuringWriteDown) {
    this.restructuringWriteDown = restructuringWriteDown;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateRestructuringResponseRestructuring initiateRestructuringResponseRestructuring = (InitiateRestructuringResponseRestructuring) o;
    return Objects.equals(this.restructuringTask, initiateRestructuringResponseRestructuring.restructuringTask) &&
        Objects.equals(this.restructuringEvaluation, initiateRestructuringResponseRestructuring.restructuringEvaluation) &&
        Objects.equals(this.restructuringWriteDown, initiateRestructuringResponseRestructuring.restructuringWriteDown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restructuringTask, restructuringEvaluation, restructuringWriteDown);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateRestructuringResponseRestructuring {\n");
    
    sb.append("    restructuringTask: ").append(toIndentedString(restructuringTask)).append("\n");
    sb.append("    restructuringEvaluation: ").append(toIndentedString(restructuringEvaluation)).append("\n");
    sb.append("    restructuringWriteDown: ").append(toIndentedString(restructuringWriteDown)).append("\n");
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

