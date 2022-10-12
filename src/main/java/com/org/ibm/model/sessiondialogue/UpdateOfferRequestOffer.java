package com.org.ibm.model.sessiondialogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateOfferRequestOffer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:58:23.701Z[GMT]")

public class UpdateOfferRequestOffer   {
  @JsonProperty("ProductandServiceType")
  private String productandServiceType;

  @JsonProperty("OfferTaskResult")
  private String offerTaskResult;

  public UpdateOfferRequestOffer productandServiceType(String productandServiceType) {
    this.productandServiceType = productandServiceType;
    return this;
  }

  /**
   * Get productandServiceType
   * @return productandServiceType
  */
  @ApiModelProperty(value = "")


  public String getProductandServiceType() {
    return productandServiceType;
  }

  public void setProductandServiceType(String productandServiceType) {
    this.productandServiceType = productandServiceType;
  }

  public UpdateOfferRequestOffer offerTaskResult(String offerTaskResult) {
    this.offerTaskResult = offerTaskResult;
    return this;
  }

  /**
   * Get offerTaskResult
   * @return offerTaskResult
  */
  @ApiModelProperty(value = "")


  public String getOfferTaskResult() {
    return offerTaskResult;
  }

  public void setOfferTaskResult(String offerTaskResult) {
    this.offerTaskResult = offerTaskResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOfferRequestOffer updateOfferRequestOffer = (UpdateOfferRequestOffer) o;
    return Objects.equals(this.productandServiceType, updateOfferRequestOffer.productandServiceType) &&
        Objects.equals(this.offerTaskResult, updateOfferRequestOffer.offerTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productandServiceType, offerTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferRequestOffer {\n");
    
    sb.append("    productandServiceType: ").append(toIndentedString(productandServiceType)).append("\n");
    sb.append("    offerTaskResult: ").append(toIndentedString(offerTaskResult)).append("\n");
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

