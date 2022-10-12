package com.org.ibm.model.creditfacility;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateRestructuringRequestRestructuring
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:52.998Z[GMT]")

public class InitiateRestructuringRequestRestructuring   {
  @JsonProperty("RestructuringTask")
  private String restructuringTask;

  public InitiateRestructuringRequestRestructuring restructuringTask(String restructuringTask) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateRestructuringRequestRestructuring initiateRestructuringRequestRestructuring = (InitiateRestructuringRequestRestructuring) o;
    return Objects.equals(this.restructuringTask, initiateRestructuringRequestRestructuring.restructuringTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restructuringTask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateRestructuringRequestRestructuring {\n");
    
    sb.append("    restructuringTask: ").append(toIndentedString(restructuringTask)).append("\n");
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

