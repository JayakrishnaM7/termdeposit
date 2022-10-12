package com.org.ibm.model.corporatetreasury;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.corporatetreasury.UpdateSecuritizationRequestSecuritization;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateSecuritizationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:37.114Z[GMT]")

public class UpdateSecuritizationRequest   {
  @JsonProperty("Securitization")
  private UpdateSecuritizationRequestSecuritization securitization;

  public UpdateSecuritizationRequest securitization(UpdateSecuritizationRequestSecuritization securitization) {
    this.securitization = securitization;
    return this;
  }

  /**
   * Get securitization
   * @return securitization
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateSecuritizationRequestSecuritization getSecuritization() {
    return securitization;
  }

  public void setSecuritization(UpdateSecuritizationRequestSecuritization securitization) {
    this.securitization = securitization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSecuritizationRequest updateSecuritizationRequest = (UpdateSecuritizationRequest) o;
    return Objects.equals(this.securitization, updateSecuritizationRequest.securitization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securitization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSecuritizationRequest {\n");
    
    sb.append("    securitization: ").append(toIndentedString(securitization)).append("\n");
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

