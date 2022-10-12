package com.org.ibm.model.corporatetreasury;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateCorporateTreasuryManagementPlanRequestCorporateTreasuryManagementPlan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:37.114Z[GMT]")

public class UpdateCorporateTreasuryManagementPlanRequestCorporateTreasuryManagementPlan   {
  @JsonProperty("TreasuryPlanningPoliciesAndGuidelines")
  private String treasuryPlanningPoliciesAndGuidelines;

  @JsonProperty("TreasuryPlanOperatingParameters")
  private String treasuryPlanOperatingParameters;

  @JsonProperty("TreasuryPlanGoals")
  private String treasuryPlanGoals;

  public UpdateCorporateTreasuryManagementPlanRequestCorporateTreasuryManagementPlan treasuryPlanningPoliciesAndGuidelines(String treasuryPlanningPoliciesAndGuidelines) {
    this.treasuryPlanningPoliciesAndGuidelines = treasuryPlanningPoliciesAndGuidelines;
    return this;
  }

  /**
   * Get treasuryPlanningPoliciesAndGuidelines
   * @return treasuryPlanningPoliciesAndGuidelines
  */
  @ApiModelProperty(value = "")


  public String getTreasuryPlanningPoliciesAndGuidelines() {
    return treasuryPlanningPoliciesAndGuidelines;
  }

  public void setTreasuryPlanningPoliciesAndGuidelines(String treasuryPlanningPoliciesAndGuidelines) {
    this.treasuryPlanningPoliciesAndGuidelines = treasuryPlanningPoliciesAndGuidelines;
  }

  public UpdateCorporateTreasuryManagementPlanRequestCorporateTreasuryManagementPlan treasuryPlanOperatingParameters(String treasuryPlanOperatingParameters) {
    this.treasuryPlanOperatingParameters = treasuryPlanOperatingParameters;
    return this;
  }

  /**
   * Get treasuryPlanOperatingParameters
   * @return treasuryPlanOperatingParameters
  */
  @ApiModelProperty(value = "")


  public String getTreasuryPlanOperatingParameters() {
    return treasuryPlanOperatingParameters;
  }

  public void setTreasuryPlanOperatingParameters(String treasuryPlanOperatingParameters) {
    this.treasuryPlanOperatingParameters = treasuryPlanOperatingParameters;
  }

  public UpdateCorporateTreasuryManagementPlanRequestCorporateTreasuryManagementPlan treasuryPlanGoals(String treasuryPlanGoals) {
    this.treasuryPlanGoals = treasuryPlanGoals;
    return this;
  }

  /**
   * Get treasuryPlanGoals
   * @return treasuryPlanGoals
  */
  @ApiModelProperty(value = "")


  public String getTreasuryPlanGoals() {
    return treasuryPlanGoals;
  }

  public void setTreasuryPlanGoals(String treasuryPlanGoals) {
    this.treasuryPlanGoals = treasuryPlanGoals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCorporateTreasuryManagementPlanRequestCorporateTreasuryManagementPlan updateCorporateTreasuryManagementPlanRequestCorporateTreasuryManagementPlan = (UpdateCorporateTreasuryManagementPlanRequestCorporateTreasuryManagementPlan) o;
    return Objects.equals(this.treasuryPlanningPoliciesAndGuidelines, updateCorporateTreasuryManagementPlanRequestCorporateTreasuryManagementPlan.treasuryPlanningPoliciesAndGuidelines) &&
        Objects.equals(this.treasuryPlanOperatingParameters, updateCorporateTreasuryManagementPlanRequestCorporateTreasuryManagementPlan.treasuryPlanOperatingParameters) &&
        Objects.equals(this.treasuryPlanGoals, updateCorporateTreasuryManagementPlanRequestCorporateTreasuryManagementPlan.treasuryPlanGoals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(treasuryPlanningPoliciesAndGuidelines, treasuryPlanOperatingParameters, treasuryPlanGoals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCorporateTreasuryManagementPlanRequestCorporateTreasuryManagementPlan {\n");
    
    sb.append("    treasuryPlanningPoliciesAndGuidelines: ").append(toIndentedString(treasuryPlanningPoliciesAndGuidelines)).append("\n");
    sb.append("    treasuryPlanOperatingParameters: ").append(toIndentedString(treasuryPlanOperatingParameters)).append("\n");
    sb.append("    treasuryPlanGoals: ").append(toIndentedString(treasuryPlanGoals)).append("\n");
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

