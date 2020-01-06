/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.accounting;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.accounting.Receipt;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Receipts
 */

public class Receipts {

  
  @JsonProperty("Receipts")
  private List<Receipt> receipts = new ArrayList<Receipt>();
  public Receipts receipts(List<Receipt> receipts) {
    this.receipts = receipts;
    return this;
  }

  public Receipts addReceiptsItem(Receipt receiptsItem) {
    if (this.receipts == null) {
      this.receipts = new ArrayList<Receipt>();
    }
    this.receipts.add(receiptsItem);
    return this;
  }

   /**
   * Get receipts
   * @return receipts
  **/
  @ApiModelProperty(value = "")
  public List<Receipt> getReceipts() {
    return receipts;
  }

  public void setReceipts(List<Receipt> receipts) {
    this.receipts = receipts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Receipts receipts = (Receipts) o;
    return Objects.equals(this.receipts, receipts.receipts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(receipts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Receipts {\n");
    sb.append("    receipts: ").append(toIndentedString(receipts)).append("\n");
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

