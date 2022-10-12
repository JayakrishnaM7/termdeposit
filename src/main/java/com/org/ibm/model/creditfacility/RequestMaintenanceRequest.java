package com.org.ibm.model.creditfacility;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.creditfacility.RequestMaintenanceRequestMaintenance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestMaintenanceRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:52.998Z[GMT]")

public class RequestMaintenanceRequest   {
  @JsonProperty("Maintenance")
  private RequestMaintenanceRequestMaintenance maintenance;

  public RequestMaintenanceRequest maintenance(RequestMaintenanceRequestMaintenance maintenance) {
    this.maintenance = maintenance;
    return this;
  }

  /**
   * Get maintenance
   * @return maintenance
  */
  @ApiModelProperty(value = "")

  @Valid

  public RequestMaintenanceRequestMaintenance getMaintenance() {
    return maintenance;
  }

  public void setMaintenance(RequestMaintenanceRequestMaintenance maintenance) {
    this.maintenance = maintenance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestMaintenanceRequest requestMaintenanceRequest = (RequestMaintenanceRequest) o;
    return Objects.equals(this.maintenance, requestMaintenanceRequest.maintenance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maintenance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestMaintenanceRequest {\n");
    
    sb.append("    maintenance: ").append(toIndentedString(maintenance)).append("\n");
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

