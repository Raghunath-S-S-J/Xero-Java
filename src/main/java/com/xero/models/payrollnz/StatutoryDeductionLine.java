/*
 * Xero Payroll NZ
 * This is the Xero Payroll API for orgs in the NZ region.
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollnz;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;

/** StatutoryDeductionLine */
public class StatutoryDeductionLine {
  StringUtil util = new StringUtil();

  @JsonProperty("statutoryDeductionTypeID")
  private UUID statutoryDeductionTypeID;

  @JsonProperty("amount")
  private Double amount;

  @JsonProperty("fixedAmount")
  private Double fixedAmount;

  @JsonProperty("manualAdjustment")
  private Boolean manualAdjustment;

  public StatutoryDeductionLine statutoryDeductionTypeID(UUID statutoryDeductionTypeID) {
    this.statutoryDeductionTypeID = statutoryDeductionTypeID;
    return this;
  }

  /**
   * Xero identifier for payroll statutory deduction type
   *
   * @return statutoryDeductionTypeID
   */
  @ApiModelProperty(value = "Xero identifier for payroll statutory deduction type")
  public UUID getStatutoryDeductionTypeID() {
    return statutoryDeductionTypeID;
  }

  public void setStatutoryDeductionTypeID(UUID statutoryDeductionTypeID) {
    this.statutoryDeductionTypeID = statutoryDeductionTypeID;
  }

  public StatutoryDeductionLine amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the statutory deduction line
   *
   * @return amount
   */
  @ApiModelProperty(value = "The amount of the statutory deduction line")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public StatutoryDeductionLine fixedAmount(Double fixedAmount) {
    this.fixedAmount = fixedAmount;
    return this;
  }

  /**
   * Fixed Amount
   *
   * @return fixedAmount
   */
  @ApiModelProperty(value = "Fixed Amount")
  public Double getFixedAmount() {
    return fixedAmount;
  }

  public void setFixedAmount(Double fixedAmount) {
    this.fixedAmount = fixedAmount;
  }

  public StatutoryDeductionLine manualAdjustment(Boolean manualAdjustment) {
    this.manualAdjustment = manualAdjustment;
    return this;
  }

  /**
   * Identifies if the tax line is a manual adjustment
   *
   * @return manualAdjustment
   */
  @ApiModelProperty(value = "Identifies if the tax line is a manual adjustment")
  public Boolean getManualAdjustment() {
    return manualAdjustment;
  }

  public void setManualAdjustment(Boolean manualAdjustment) {
    this.manualAdjustment = manualAdjustment;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatutoryDeductionLine statutoryDeductionLine = (StatutoryDeductionLine) o;
    return Objects.equals(
            this.statutoryDeductionTypeID, statutoryDeductionLine.statutoryDeductionTypeID)
        && Objects.equals(this.amount, statutoryDeductionLine.amount)
        && Objects.equals(this.fixedAmount, statutoryDeductionLine.fixedAmount)
        && Objects.equals(this.manualAdjustment, statutoryDeductionLine.manualAdjustment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statutoryDeductionTypeID, amount, fixedAmount, manualAdjustment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatutoryDeductionLine {\n");
    sb.append("    statutoryDeductionTypeID: ")
        .append(toIndentedString(statutoryDeductionTypeID))
        .append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    fixedAmount: ").append(toIndentedString(fixedAmount)).append("\n");
    sb.append("    manualAdjustment: ").append(toIndentedString(manualAdjustment)).append("\n");
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
