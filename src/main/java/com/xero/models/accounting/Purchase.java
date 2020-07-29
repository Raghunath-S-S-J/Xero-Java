/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.2.10
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.accounting;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Purchase */
public class Purchase {
  StringUtil util = new StringUtil();

  @JsonProperty("UnitPrice")
  private Double unitPrice;

  @JsonProperty("AccountCode")
  private String accountCode;

  @JsonProperty("COGSAccountCode")
  private String coGSAccountCode;

  @JsonProperty("TaxType")
  private String taxType;

  public Purchase unitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * Unit Price of the item. By default UnitPrice is rounded to two decimal places. You can use 4
   * decimal places by adding the unitdp&#x3D;4 querystring parameter to your request.
   *
   * @return unitPrice
   */
  @ApiModelProperty(
      value =
          "Unit Price of the item. By default UnitPrice is rounded to two decimal places. You can"
              + " use 4 decimal places by adding the unitdp=4 querystring parameter to your"
              + " request.")
  public Double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public Purchase accountCode(String accountCode) {
    this.accountCode = accountCode;
    return this;
  }

  /**
   * Default account code to be used for purchased/sale. Not applicable to the purchase details of
   * tracked items
   *
   * @return accountCode
   */
  @ApiModelProperty(
      value =
          "Default account code to be used for purchased/sale. Not applicable to the purchase"
              + " details of tracked items")
  public String getAccountCode() {
    return accountCode;
  }

  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }

  public Purchase coGSAccountCode(String coGSAccountCode) {
    this.coGSAccountCode = coGSAccountCode;
    return this;
  }

  /**
   * Cost of goods sold account. Only applicable to the purchase details of tracked items.
   *
   * @return coGSAccountCode
   */
  @ApiModelProperty(
      value =
          "Cost of goods sold account. Only applicable to the purchase details of tracked items.")
  public String getCoGSAccountCode() {
    return coGSAccountCode;
  }

  public void setCoGSAccountCode(String coGSAccountCode) {
    this.coGSAccountCode = coGSAccountCode;
  }

  public Purchase taxType(String taxType) {
    this.taxType = taxType;
    return this;
  }

  /**
   * The tax type from TaxRates
   *
   * @return taxType
   */
  @ApiModelProperty(value = "The tax type from TaxRates")
  public String getTaxType() {
    return taxType;
  }

  public void setTaxType(String taxType) {
    this.taxType = taxType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Purchase purchase = (Purchase) o;
    return Objects.equals(this.unitPrice, purchase.unitPrice)
        && Objects.equals(this.accountCode, purchase.accountCode)
        && Objects.equals(this.coGSAccountCode, purchase.coGSAccountCode)
        && Objects.equals(this.taxType, purchase.taxType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitPrice, accountCode, coGSAccountCode, taxType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Purchase {\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    coGSAccountCode: ").append(toIndentedString(coGSAccountCode)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
