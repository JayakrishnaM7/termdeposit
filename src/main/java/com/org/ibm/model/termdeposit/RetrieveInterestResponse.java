package com.org.ibm.model.termdeposit;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.termdeposit.RetrieveInterestResponseCreditLineFacility;
import com.org.ibm.model.termdeposit.RetrieveInterestResponseInterest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveInterestResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:52.998Z[GMT]")

public class RetrieveInterestResponse   {
  @JsonProperty("CreditLineFacility")
  private RetrieveInterestResponseCreditLineFacility creditLineFacility;

  @JsonProperty("Interest")
  private RetrieveInterestResponseInterest interest;

  public RetrieveInterestResponse creditLineFacility(RetrieveInterestResponseCreditLineFacility creditLineFacility) {
    this.creditLineFacility = creditLineFacility;
    return this;
  }

  /**
   * Get creditLineFacility
   * @return creditLineFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveInterestResponseCreditLineFacility getCreditLineFacility() {
    return creditLineFacility;
  }

  public void setCreditLineFacility(RetrieveInterestResponseCreditLineFacility creditLineFacility) {
    this.creditLineFacility = creditLineFacility;
  }

  public RetrieveInterestResponse interest(RetrieveInterestResponseInterest interest) {
    this.interest = interest;
    return this;
  }

  /**
   * Get interest
   * @return interest
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveInterestResponseInterest getInterest() {
    return interest;
  }

  public void setInterest(RetrieveInterestResponseInterest interest) {
    this.interest = interest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveInterestResponse retrieveInterestResponse = (RetrieveInterestResponse) o;
    return Objects.equals(this.creditLineFacility, retrieveInterestResponse.creditLineFacility) &&
        Objects.equals(this.interest, retrieveInterestResponse.interest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditLineFacility, interest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveInterestResponse {\n");
    
    sb.append("    creditLineFacility: ").append(toIndentedString(creditLineFacility)).append("\n");
    sb.append("    interest: ").append(toIndentedString(interest)).append("\n");
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

