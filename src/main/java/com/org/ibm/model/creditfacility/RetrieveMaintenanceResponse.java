package com.org.ibm.model.creditfacility;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.creditfacility.RetrieveMaintenanceResponseMaintenance;
import com.org.ibm.model.creditfacility.UpdateCreditLineFacilityRequestCreditLineFacility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveMaintenanceResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:52.998Z[GMT]")

public class RetrieveMaintenanceResponse   {
  @JsonProperty("CreditLineFacility")
  private UpdateCreditLineFacilityRequestCreditLineFacility creditLineFacility;

  @JsonProperty("Maintenance")
  private RetrieveMaintenanceResponseMaintenance maintenance;

  public RetrieveMaintenanceResponse creditLineFacility(UpdateCreditLineFacilityRequestCreditLineFacility creditLineFacility) {
    this.creditLineFacility = creditLineFacility;
    return this;
  }

  /**
   * Get creditLineFacility
   * @return creditLineFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateCreditLineFacilityRequestCreditLineFacility getCreditLineFacility() {
    return creditLineFacility;
  }

  public void setCreditLineFacility(UpdateCreditLineFacilityRequestCreditLineFacility creditLineFacility) {
    this.creditLineFacility = creditLineFacility;
  }

  public RetrieveMaintenanceResponse maintenance(RetrieveMaintenanceResponseMaintenance maintenance) {
    this.maintenance = maintenance;
    return this;
  }

  /**
   * Get maintenance
   * @return maintenance
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveMaintenanceResponseMaintenance getMaintenance() {
    return maintenance;
  }

  public void setMaintenance(RetrieveMaintenanceResponseMaintenance maintenance) {
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
    RetrieveMaintenanceResponse retrieveMaintenanceResponse = (RetrieveMaintenanceResponse) o;
    return Objects.equals(this.creditLineFacility, retrieveMaintenanceResponse.creditLineFacility) &&
        Objects.equals(this.maintenance, retrieveMaintenanceResponse.maintenance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditLineFacility, maintenance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveMaintenanceResponse {\n");
    
    sb.append("    creditLineFacility: ").append(toIndentedString(creditLineFacility)).append("\n");
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

