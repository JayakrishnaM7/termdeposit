package com.org.ibm.model.creditfacility;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestMaintenanceResponseMaintenance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:52.998Z[GMT]")

public class RequestMaintenanceResponseMaintenance   {
  @JsonProperty("CreditFacilityTaxReport")
  private String creditFacilityTaxReport;

  @JsonProperty("CreditFacilityFeeType")
  private String creditFacilityFeeType;

  @JsonProperty("CreditFacilityFees")
  private String creditFacilityFees;

  @JsonProperty("CreditFacilityPenalties")
  private String creditFacilityPenalties;

  @JsonProperty("CreditFacilityCollateralValuation")
  private String creditFacilityCollateralValuation;

  public RequestMaintenanceResponseMaintenance creditFacilityTaxReport(String creditFacilityTaxReport) {
    this.creditFacilityTaxReport = creditFacilityTaxReport;
    return this;
  }

  /**
   * Get creditFacilityTaxReport
   * @return creditFacilityTaxReport
  */
  @ApiModelProperty(value = "")


  public String getCreditFacilityTaxReport() {
    return creditFacilityTaxReport;
  }

  public void setCreditFacilityTaxReport(String creditFacilityTaxReport) {
    this.creditFacilityTaxReport = creditFacilityTaxReport;
  }

  public RequestMaintenanceResponseMaintenance creditFacilityFeeType(String creditFacilityFeeType) {
    this.creditFacilityFeeType = creditFacilityFeeType;
    return this;
  }

  /**
   * Get creditFacilityFeeType
   * @return creditFacilityFeeType
  */
  @ApiModelProperty(value = "")


  public String getCreditFacilityFeeType() {
    return creditFacilityFeeType;
  }

  public void setCreditFacilityFeeType(String creditFacilityFeeType) {
    this.creditFacilityFeeType = creditFacilityFeeType;
  }

  public RequestMaintenanceResponseMaintenance creditFacilityFees(String creditFacilityFees) {
    this.creditFacilityFees = creditFacilityFees;
    return this;
  }

  /**
   * Get creditFacilityFees
   * @return creditFacilityFees
  */
  @ApiModelProperty(value = "")


  public String getCreditFacilityFees() {
    return creditFacilityFees;
  }

  public void setCreditFacilityFees(String creditFacilityFees) {
    this.creditFacilityFees = creditFacilityFees;
  }

  public RequestMaintenanceResponseMaintenance creditFacilityPenalties(String creditFacilityPenalties) {
    this.creditFacilityPenalties = creditFacilityPenalties;
    return this;
  }

  /**
   * Get creditFacilityPenalties
   * @return creditFacilityPenalties
  */
  @ApiModelProperty(value = "")


  public String getCreditFacilityPenalties() {
    return creditFacilityPenalties;
  }

  public void setCreditFacilityPenalties(String creditFacilityPenalties) {
    this.creditFacilityPenalties = creditFacilityPenalties;
  }

  public RequestMaintenanceResponseMaintenance creditFacilityCollateralValuation(String creditFacilityCollateralValuation) {
    this.creditFacilityCollateralValuation = creditFacilityCollateralValuation;
    return this;
  }

  /**
   * Get creditFacilityCollateralValuation
   * @return creditFacilityCollateralValuation
  */
  @ApiModelProperty(value = "")


  public String getCreditFacilityCollateralValuation() {
    return creditFacilityCollateralValuation;
  }

  public void setCreditFacilityCollateralValuation(String creditFacilityCollateralValuation) {
    this.creditFacilityCollateralValuation = creditFacilityCollateralValuation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestMaintenanceResponseMaintenance requestMaintenanceResponseMaintenance = (RequestMaintenanceResponseMaintenance) o;
    return Objects.equals(this.creditFacilityTaxReport, requestMaintenanceResponseMaintenance.creditFacilityTaxReport) &&
        Objects.equals(this.creditFacilityFeeType, requestMaintenanceResponseMaintenance.creditFacilityFeeType) &&
        Objects.equals(this.creditFacilityFees, requestMaintenanceResponseMaintenance.creditFacilityFees) &&
        Objects.equals(this.creditFacilityPenalties, requestMaintenanceResponseMaintenance.creditFacilityPenalties) &&
        Objects.equals(this.creditFacilityCollateralValuation, requestMaintenanceResponseMaintenance.creditFacilityCollateralValuation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditFacilityTaxReport, creditFacilityFeeType, creditFacilityFees, creditFacilityPenalties, creditFacilityCollateralValuation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestMaintenanceResponseMaintenance {\n");
    
    sb.append("    creditFacilityTaxReport: ").append(toIndentedString(creditFacilityTaxReport)).append("\n");
    sb.append("    creditFacilityFeeType: ").append(toIndentedString(creditFacilityFeeType)).append("\n");
    sb.append("    creditFacilityFees: ").append(toIndentedString(creditFacilityFees)).append("\n");
    sb.append("    creditFacilityPenalties: ").append(toIndentedString(creditFacilityPenalties)).append("\n");
    sb.append("    creditFacilityCollateralValuation: ").append(toIndentedString(creditFacilityCollateralValuation)).append("\n");
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

