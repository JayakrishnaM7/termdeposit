package com.org.ibm.model.corporatetreasury;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.corporatetreasury.RetrieveBankRatesResponseBankRates;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveBankRatesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:37.114Z[GMT]")

public class RetrieveBankRatesResponse   {
  @JsonProperty("BankRates")
  private RetrieveBankRatesResponseBankRates bankRates;

  public RetrieveBankRatesResponse bankRates(RetrieveBankRatesResponseBankRates bankRates) {
    this.bankRates = bankRates;
    return this;
  }

  /**
   * Get bankRates
   * @return bankRates
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveBankRatesResponseBankRates getBankRates() {
    return bankRates;
  }

  public void setBankRates(RetrieveBankRatesResponseBankRates bankRates) {
    this.bankRates = bankRates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveBankRatesResponse retrieveBankRatesResponse = (RetrieveBankRatesResponse) o;
    return Objects.equals(this.bankRates, retrieveBankRatesResponse.bankRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankRates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveBankRatesResponse {\n");
    
    sb.append("    bankRates: ").append(toIndentedString(bankRates)).append("\n");
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

