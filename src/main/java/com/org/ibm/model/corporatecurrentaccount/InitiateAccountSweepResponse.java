package com.org.ibm.model.corporatecurrentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.corporatecurrentaccount.InitiateAccountSweepResponseAccountSweep;
import com.org.ibm.model.corporatecurrentaccount.InitiateServiceFeesResponseCorporateCurrentAccountFacility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateAccountSweepResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:45.001Z[GMT]")

public class InitiateAccountSweepResponse   {
  @JsonProperty("CorporateCurrentAccountFacility")
  private InitiateServiceFeesResponseCorporateCurrentAccountFacility corporateCurrentAccountFacility;

  @JsonProperty("AccountSweep")
  private InitiateAccountSweepResponseAccountSweep accountSweep;

  public InitiateAccountSweepResponse corporateCurrentAccountFacility(InitiateServiceFeesResponseCorporateCurrentAccountFacility corporateCurrentAccountFacility) {
    this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
    return this;
  }

  /**
   * Get corporateCurrentAccountFacility
   * @return corporateCurrentAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateServiceFeesResponseCorporateCurrentAccountFacility getCorporateCurrentAccountFacility() {
    return corporateCurrentAccountFacility;
  }

  public void setCorporateCurrentAccountFacility(InitiateServiceFeesResponseCorporateCurrentAccountFacility corporateCurrentAccountFacility) {
    this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
  }

  public InitiateAccountSweepResponse accountSweep(InitiateAccountSweepResponseAccountSweep accountSweep) {
    this.accountSweep = accountSweep;
    return this;
  }

  /**
   * Get accountSweep
   * @return accountSweep
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateAccountSweepResponseAccountSweep getAccountSweep() {
    return accountSweep;
  }

  public void setAccountSweep(InitiateAccountSweepResponseAccountSweep accountSweep) {
    this.accountSweep = accountSweep;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateAccountSweepResponse initiateAccountSweepResponse = (InitiateAccountSweepResponse) o;
    return Objects.equals(this.corporateCurrentAccountFacility, initiateAccountSweepResponse.corporateCurrentAccountFacility) &&
        Objects.equals(this.accountSweep, initiateAccountSweepResponse.accountSweep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporateCurrentAccountFacility, accountSweep);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateAccountSweepResponse {\n");
    
    sb.append("    corporateCurrentAccountFacility: ").append(toIndentedString(corporateCurrentAccountFacility)).append("\n");
    sb.append("    accountSweep: ").append(toIndentedString(accountSweep)).append("\n");
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

