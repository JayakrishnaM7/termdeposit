package com.org.ibm.model.corporatetreasury;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.corporatetreasury.UpdateCorporateTreasuryManagementPlanRequestCorporateTreasuryManagementPlan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateCorporateTreasuryManagementPlanRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:37.114Z[GMT]")

public class UpdateCorporateTreasuryManagementPlanRequest   {
  @JsonProperty("CorporateTreasuryManagementPlan")
  private UpdateCorporateTreasuryManagementPlanRequestCorporateTreasuryManagementPlan corporateTreasuryManagementPlan;

  public UpdateCorporateTreasuryManagementPlanRequest corporateTreasuryManagementPlan(UpdateCorporateTreasuryManagementPlanRequestCorporateTreasuryManagementPlan corporateTreasuryManagementPlan) {
    this.corporateTreasuryManagementPlan = corporateTreasuryManagementPlan;
    return this;
  }

  /**
   * Get corporateTreasuryManagementPlan
   * @return corporateTreasuryManagementPlan
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateCorporateTreasuryManagementPlanRequestCorporateTreasuryManagementPlan getCorporateTreasuryManagementPlan() {
    return corporateTreasuryManagementPlan;
  }

  public void setCorporateTreasuryManagementPlan(UpdateCorporateTreasuryManagementPlanRequestCorporateTreasuryManagementPlan corporateTreasuryManagementPlan) {
    this.corporateTreasuryManagementPlan = corporateTreasuryManagementPlan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCorporateTreasuryManagementPlanRequest updateCorporateTreasuryManagementPlanRequest = (UpdateCorporateTreasuryManagementPlanRequest) o;
    return Objects.equals(this.corporateTreasuryManagementPlan, updateCorporateTreasuryManagementPlanRequest.corporateTreasuryManagementPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporateTreasuryManagementPlan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCorporateTreasuryManagementPlanRequest {\n");
    
    sb.append("    corporateTreasuryManagementPlan: ").append(toIndentedString(corporateTreasuryManagementPlan)).append("\n");
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

