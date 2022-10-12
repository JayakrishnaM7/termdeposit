package com.org.ibm.model.traderpositionmanagement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TraderPositionOperationsOutcome
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:34.801Z[GMT]")

public class TraderPositionOperationsOutcome   {
  @JsonProperty("TraderPositionOperationsIncident")
  private String traderPositionOperationsIncident;

  @JsonProperty("TraderPositionOperationsProvision")
  private String traderPositionOperationsProvision;

  public TraderPositionOperationsOutcome traderPositionOperationsIncident(String traderPositionOperationsIncident) {
    this.traderPositionOperationsIncident = traderPositionOperationsIncident;
    return this;
  }

  /**
   * Get traderPositionOperationsIncident
   * @return traderPositionOperationsIncident
  */
  @ApiModelProperty(value = "")


  public String getTraderPositionOperationsIncident() {
    return traderPositionOperationsIncident;
  }

  public void setTraderPositionOperationsIncident(String traderPositionOperationsIncident) {
    this.traderPositionOperationsIncident = traderPositionOperationsIncident;
  }

  public TraderPositionOperationsOutcome traderPositionOperationsProvision(String traderPositionOperationsProvision) {
    this.traderPositionOperationsProvision = traderPositionOperationsProvision;
    return this;
  }

  /**
   * Get traderPositionOperationsProvision
   * @return traderPositionOperationsProvision
  */
  @ApiModelProperty(value = "")


  public String getTraderPositionOperationsProvision() {
    return traderPositionOperationsProvision;
  }

  public void setTraderPositionOperationsProvision(String traderPositionOperationsProvision) {
    this.traderPositionOperationsProvision = traderPositionOperationsProvision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TraderPositionOperationsOutcome traderPositionOperationsOutcome = (TraderPositionOperationsOutcome) o;
    return Objects.equals(this.traderPositionOperationsIncident, traderPositionOperationsOutcome.traderPositionOperationsIncident) &&
        Objects.equals(this.traderPositionOperationsProvision, traderPositionOperationsOutcome.traderPositionOperationsProvision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(traderPositionOperationsIncident, traderPositionOperationsProvision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TraderPositionOperationsOutcome {\n");
    
    sb.append("    traderPositionOperationsIncident: ").append(toIndentedString(traderPositionOperationsIncident)).append("\n");
    sb.append("    traderPositionOperationsProvision: ").append(toIndentedString(traderPositionOperationsProvision)).append("\n");
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

