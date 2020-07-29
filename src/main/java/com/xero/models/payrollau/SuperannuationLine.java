/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 2.2.10
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollau;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.ZoneId;

/** SuperannuationLine */
public class SuperannuationLine {
  StringUtil util = new StringUtil();

  @JsonProperty("SuperMembershipID")
  private UUID superMembershipID;

  @JsonProperty("ContributionType")
  private SuperannuationContributionType contributionType;

  @JsonProperty("CalculationType")
  private SuperannuationCalculationType calculationType;

  @JsonProperty("MinimumMonthlyEarnings")
  private Double minimumMonthlyEarnings;

  @JsonProperty("ExpenseAccountCode")
  private String expenseAccountCode;

  @JsonProperty("LiabilityAccountCode")
  private String liabilityAccountCode;

  @JsonProperty("PaymentDateForThisPeriod")
  private String paymentDateForThisPeriod;

  @JsonProperty("Percentage")
  private Double percentage;

  @JsonProperty("Amount")
  private Double amount;

  public SuperannuationLine superMembershipID(UUID superMembershipID) {
    this.superMembershipID = superMembershipID;
    return this;
  }

  /**
   * Xero identifier for payroll super fund membership ID.
   *
   * @return superMembershipID
   */
  @ApiModelProperty(
      example = "e0eb6747-7c17-4075-b804-989f8d4e5d39",
      value = "Xero identifier for payroll super fund membership ID.")
  public UUID getSuperMembershipID() {
    return superMembershipID;
  }

  public void setSuperMembershipID(UUID superMembershipID) {
    this.superMembershipID = superMembershipID;
  }

  public SuperannuationLine contributionType(SuperannuationContributionType contributionType) {
    this.contributionType = contributionType;
    return this;
  }

  /**
   * Get contributionType
   *
   * @return contributionType
   */
  @ApiModelProperty(value = "")
  public SuperannuationContributionType getContributionType() {
    return contributionType;
  }

  public void setContributionType(SuperannuationContributionType contributionType) {
    this.contributionType = contributionType;
  }

  public SuperannuationLine calculationType(SuperannuationCalculationType calculationType) {
    this.calculationType = calculationType;
    return this;
  }

  /**
   * Get calculationType
   *
   * @return calculationType
   */
  @ApiModelProperty(value = "")
  public SuperannuationCalculationType getCalculationType() {
    return calculationType;
  }

  public void setCalculationType(SuperannuationCalculationType calculationType) {
    this.calculationType = calculationType;
  }

  public SuperannuationLine minimumMonthlyEarnings(Double minimumMonthlyEarnings) {
    this.minimumMonthlyEarnings = minimumMonthlyEarnings;
    return this;
  }

  /**
   * Superannuation minimum monthly earnings.
   *
   * @return minimumMonthlyEarnings
   */
  @ApiModelProperty(example = "100.5", value = "Superannuation minimum monthly earnings.")
  public Double getMinimumMonthlyEarnings() {
    return minimumMonthlyEarnings;
  }

  public void setMinimumMonthlyEarnings(Double minimumMonthlyEarnings) {
    this.minimumMonthlyEarnings = minimumMonthlyEarnings;
  }

  public SuperannuationLine expenseAccountCode(String expenseAccountCode) {
    this.expenseAccountCode = expenseAccountCode;
    return this;
  }

  /**
   * Superannuation expense account code.
   *
   * @return expenseAccountCode
   */
  @ApiModelProperty(example = "450", value = "Superannuation expense account code.")
  public String getExpenseAccountCode() {
    return expenseAccountCode;
  }

  public void setExpenseAccountCode(String expenseAccountCode) {
    this.expenseAccountCode = expenseAccountCode;
  }

  public SuperannuationLine liabilityAccountCode(String liabilityAccountCode) {
    this.liabilityAccountCode = liabilityAccountCode;
    return this;
  }

  /**
   * Superannuation liability account code
   *
   * @return liabilityAccountCode
   */
  @ApiModelProperty(example = "650", value = "Superannuation liability account code")
  public String getLiabilityAccountCode() {
    return liabilityAccountCode;
  }

  public void setLiabilityAccountCode(String liabilityAccountCode) {
    this.liabilityAccountCode = liabilityAccountCode;
  }

  public SuperannuationLine paymentDateForThisPeriod(String paymentDateForThisPeriod) {
    this.paymentDateForThisPeriod = paymentDateForThisPeriod;
    return this;
  }

  /**
   * Superannuation payment date for the current period (YYYY-MM-DD)
   *
   * @return paymentDateForThisPeriod
   */
  @ApiModelProperty(
      example = "/Date(322560000000+0000)/",
      value = "Superannuation payment date for the current period (YYYY-MM-DD)")
  public String getPaymentDateForThisPeriod() {
    return paymentDateForThisPeriod;
  }

  public LocalDate getPaymentDateForThisPeriodAsDate() {
    if (this.paymentDateForThisPeriod != null) {
      try {
        return util.convertStringToDate(this.paymentDateForThisPeriod);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public void setPaymentDateForThisPeriod(String paymentDateForThisPeriod) {
    this.paymentDateForThisPeriod = paymentDateForThisPeriod;
  }

  public void setPaymentDateForThisPeriod(LocalDate paymentDateForThisPeriod) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant =
        paymentDateForThisPeriod.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.paymentDateForThisPeriod = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  public SuperannuationLine percentage(Double percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Superannuation percentage
   *
   * @return percentage
   */
  @ApiModelProperty(example = "4.0", value = "Superannuation percentage")
  public Double getPercentage() {
    return percentage;
  }

  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }

  public SuperannuationLine amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Superannuation amount
   *
   * @return amount
   */
  @ApiModelProperty(example = "10.5", value = "Superannuation amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuperannuationLine superannuationLine = (SuperannuationLine) o;
    return Objects.equals(this.superMembershipID, superannuationLine.superMembershipID)
        && Objects.equals(this.contributionType, superannuationLine.contributionType)
        && Objects.equals(this.calculationType, superannuationLine.calculationType)
        && Objects.equals(this.minimumMonthlyEarnings, superannuationLine.minimumMonthlyEarnings)
        && Objects.equals(this.expenseAccountCode, superannuationLine.expenseAccountCode)
        && Objects.equals(this.liabilityAccountCode, superannuationLine.liabilityAccountCode)
        && Objects.equals(
            this.paymentDateForThisPeriod, superannuationLine.paymentDateForThisPeriod)
        && Objects.equals(this.percentage, superannuationLine.percentage)
        && Objects.equals(this.amount, superannuationLine.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        superMembershipID,
        contributionType,
        calculationType,
        minimumMonthlyEarnings,
        expenseAccountCode,
        liabilityAccountCode,
        paymentDateForThisPeriod,
        percentage,
        amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuperannuationLine {\n");
    sb.append("    superMembershipID: ").append(toIndentedString(superMembershipID)).append("\n");
    sb.append("    contributionType: ").append(toIndentedString(contributionType)).append("\n");
    sb.append("    calculationType: ").append(toIndentedString(calculationType)).append("\n");
    sb.append("    minimumMonthlyEarnings: ")
        .append(toIndentedString(minimumMonthlyEarnings))
        .append("\n");
    sb.append("    expenseAccountCode: ").append(toIndentedString(expenseAccountCode)).append("\n");
    sb.append("    liabilityAccountCode: ")
        .append(toIndentedString(liabilityAccountCode))
        .append("\n");
    sb.append("    paymentDateForThisPeriod: ")
        .append(toIndentedString(paymentDateForThisPeriod))
        .append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
