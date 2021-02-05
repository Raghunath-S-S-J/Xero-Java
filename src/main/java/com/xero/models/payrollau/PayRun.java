/*
 * Xero Payroll AU API
 * This is the Xero Payroll API for orgs in Australia region.
 *
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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneId;

/** PayRun */
public class PayRun {
  StringUtil util = new StringUtil();

  @JsonProperty("PayrollCalendarID")
  private UUID payrollCalendarID;

  @JsonProperty("PayRunID")
  private UUID payRunID;

  @JsonProperty("PayRunPeriodStartDate")
  private String payRunPeriodStartDate;

  @JsonProperty("PayRunPeriodEndDate")
  private String payRunPeriodEndDate;

  @JsonProperty("PayRunStatus")
  private PayRunStatus payRunStatus;

  @JsonProperty("PaymentDate")
  private String paymentDate;

  @JsonProperty("PayslipMessage")
  private String payslipMessage;

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  @JsonProperty("Payslips")
  private List<PayslipSummary> payslips = new ArrayList<PayslipSummary>();

  @JsonProperty("Wages")
  private Double wages;

  @JsonProperty("Deductions")
  private Double deductions;

  @JsonProperty("Tax")
  private Double tax;

  @JsonProperty("Super")
  private Double _super;

  @JsonProperty("Reimbursement")
  private Double reimbursement;

  @JsonProperty("NetPay")
  private Double netPay;

  @JsonProperty("ValidationErrors")
  private List<ValidationError> validationErrors = new ArrayList<ValidationError>();

  public PayRun payrollCalendarID(UUID payrollCalendarID) {
    this.payrollCalendarID = payrollCalendarID;
    return this;
  }

  /**
   * Xero identifier for pay run
   *
   * @return payrollCalendarID
   */
  @ApiModelProperty(
      example = "bfac31bd-ea62-4fc8-a5e7-7965d9504b15",
      required = true,
      value = "Xero identifier for pay run")
  public UUID getPayrollCalendarID() {
    return payrollCalendarID;
  }

  public void setPayrollCalendarID(UUID payrollCalendarID) {
    this.payrollCalendarID = payrollCalendarID;
  }

  public PayRun payRunID(UUID payRunID) {
    this.payRunID = payRunID;
    return this;
  }

  /**
   * Xero identifier for pay run
   *
   * @return payRunID
   */
  @ApiModelProperty(
      example = "bba1d10f-63b1-4692-b5c5-a99f869523a4",
      value = "Xero identifier for pay run")
  public UUID getPayRunID() {
    return payRunID;
  }

  public void setPayRunID(UUID payRunID) {
    this.payRunID = payRunID;
  }

  public PayRun payRunPeriodStartDate(String payRunPeriodStartDate) {
    this.payRunPeriodStartDate = payRunPeriodStartDate;
    return this;
  }

  /**
   * Period Start Date for the PayRun (YYYY-MM-DD)
   *
   * @return payRunPeriodStartDate
   */
  @ApiModelProperty(
      example = "/Date(322560000000+0000)/",
      value = "Period Start Date for the PayRun (YYYY-MM-DD)")
  public String getPayRunPeriodStartDate() {
    return payRunPeriodStartDate;
  }

  public LocalDate getPayRunPeriodStartDateAsDate() {
    if (this.payRunPeriodStartDate != null) {
      try {
        return util.convertStringToDate(this.payRunPeriodStartDate);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public void setPayRunPeriodStartDate(String payRunPeriodStartDate) {
    this.payRunPeriodStartDate = payRunPeriodStartDate;
  }

  public void setPayRunPeriodStartDate(LocalDate payRunPeriodStartDate) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = payRunPeriodStartDate.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.payRunPeriodStartDate = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  public PayRun payRunPeriodEndDate(String payRunPeriodEndDate) {
    this.payRunPeriodEndDate = payRunPeriodEndDate;
    return this;
  }

  /**
   * Period End Date for the PayRun (YYYY-MM-DD)
   *
   * @return payRunPeriodEndDate
   */
  @ApiModelProperty(
      example = "/Date(322560000000+0000)/",
      value = "Period End Date for the PayRun (YYYY-MM-DD)")
  public String getPayRunPeriodEndDate() {
    return payRunPeriodEndDate;
  }

  public LocalDate getPayRunPeriodEndDateAsDate() {
    if (this.payRunPeriodEndDate != null) {
      try {
        return util.convertStringToDate(this.payRunPeriodEndDate);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public void setPayRunPeriodEndDate(String payRunPeriodEndDate) {
    this.payRunPeriodEndDate = payRunPeriodEndDate;
  }

  public void setPayRunPeriodEndDate(LocalDate payRunPeriodEndDate) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = payRunPeriodEndDate.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.payRunPeriodEndDate = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  public PayRun payRunStatus(PayRunStatus payRunStatus) {
    this.payRunStatus = payRunStatus;
    return this;
  }

  /**
   * Get payRunStatus
   *
   * @return payRunStatus
   */
  @ApiModelProperty(value = "")
  public PayRunStatus getPayRunStatus() {
    return payRunStatus;
  }

  public void setPayRunStatus(PayRunStatus payRunStatus) {
    this.payRunStatus = payRunStatus;
  }

  public PayRun paymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

  /**
   * Payment Date for the PayRun (YYYY-MM-DD)
   *
   * @return paymentDate
   */
  @ApiModelProperty(
      example = "/Date(322560000000+0000)/",
      value = "Payment Date for the PayRun (YYYY-MM-DD)")
  public String getPaymentDate() {
    return paymentDate;
  }

  public LocalDate getPaymentDateAsDate() {
    if (this.paymentDate != null) {
      try {
        return util.convertStringToDate(this.paymentDate);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
  }

  public void setPaymentDate(LocalDate paymentDate) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = paymentDate.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.paymentDate = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  public PayRun payslipMessage(String payslipMessage) {
    this.payslipMessage = payslipMessage;
    return this;
  }

  /**
   * Payslip message for the PayRun
   *
   * @return payslipMessage
   */
  @ApiModelProperty(example = "Thanks for being awesome", value = "Payslip message for the PayRun")
  public String getPayslipMessage() {
    return payslipMessage;
  }

  public void setPayslipMessage(String payslipMessage) {
    this.payslipMessage = payslipMessage;
  }

  /**
   * Last modified timestamp
   *
   * @return updatedDateUTC
   */
  @ApiModelProperty(example = "/Date(1583967733054+0000)/", value = "Last modified timestamp")
  public String getUpdatedDateUTC() {
    return updatedDateUTC;
  }

  public OffsetDateTime getUpdatedDateUTCAsDate() {
    if (this.updatedDateUTC != null) {
      try {
        return util.convertStringToOffsetDateTime(this.updatedDateUTC);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public PayRun payslips(List<PayslipSummary> payslips) {
    this.payslips = payslips;
    return this;
  }

  public PayRun addPayslipsItem(PayslipSummary payslipsItem) {
    if (this.payslips == null) {
      this.payslips = new ArrayList<PayslipSummary>();
    }
    this.payslips.add(payslipsItem);
    return this;
  }

  /**
   * The payslips in the payrun
   *
   * @return payslips
   */
  @ApiModelProperty(value = "The payslips in the payrun")
  public List<PayslipSummary> getPayslips() {
    return payslips;
  }

  public void setPayslips(List<PayslipSummary> payslips) {
    this.payslips = payslips;
  }

  public PayRun wages(Double wages) {
    this.wages = wages;
    return this;
  }

  /**
   * The total Wages for the Payrun
   *
   * @return wages
   */
  @ApiModelProperty(example = "1060.5", value = "The total Wages for the Payrun")
  public Double getWages() {
    return wages;
  }

  public void setWages(Double wages) {
    this.wages = wages;
  }

  public PayRun deductions(Double deductions) {
    this.deductions = deductions;
    return this;
  }

  /**
   * The total Deductions for the Payrun
   *
   * @return deductions
   */
  @ApiModelProperty(example = "0.0", value = "The total Deductions for the Payrun")
  public Double getDeductions() {
    return deductions;
  }

  public void setDeductions(Double deductions) {
    this.deductions = deductions;
  }

  public PayRun tax(Double tax) {
    this.tax = tax;
    return this;
  }

  /**
   * The total Tax for the Payrun
   *
   * @return tax
   */
  @ApiModelProperty(example = "198.0", value = "The total Tax for the Payrun")
  public Double getTax() {
    return tax;
  }

  public void setTax(Double tax) {
    this.tax = tax;
  }

  public PayRun _super(Double _super) {
    this._super = _super;
    return this;
  }

  /**
   * The total Super for the Payrun
   *
   * @return _super
   */
  @ApiModelProperty(example = "75.6", value = "The total Super for the Payrun")
  public Double getSuper() {
    return _super;
  }

  public void setSuper(Double _super) {
    this._super = _super;
  }

  public PayRun reimbursement(Double reimbursement) {
    this.reimbursement = reimbursement;
    return this;
  }

  /**
   * The total Reimbursements for the Payrun
   *
   * @return reimbursement
   */
  @ApiModelProperty(example = "0.0", value = "The total Reimbursements for the Payrun")
  public Double getReimbursement() {
    return reimbursement;
  }

  public void setReimbursement(Double reimbursement) {
    this.reimbursement = reimbursement;
  }

  public PayRun netPay(Double netPay) {
    this.netPay = netPay;
    return this;
  }

  /**
   * The total NetPay for the Payrun
   *
   * @return netPay
   */
  @ApiModelProperty(example = "862.5", value = "The total NetPay for the Payrun")
  public Double getNetPay() {
    return netPay;
  }

  public void setNetPay(Double netPay) {
    this.netPay = netPay;
  }

  public PayRun validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public PayRun addValidationErrorsItem(ValidationError validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<ValidationError>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

  /**
   * Displays array of validation error messages from the API
   *
   * @return validationErrors
   */
  @ApiModelProperty(value = "Displays array of validation error messages from the API")
  public List<ValidationError> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayRun payRun = (PayRun) o;
    return Objects.equals(this.payrollCalendarID, payRun.payrollCalendarID)
        && Objects.equals(this.payRunID, payRun.payRunID)
        && Objects.equals(this.payRunPeriodStartDate, payRun.payRunPeriodStartDate)
        && Objects.equals(this.payRunPeriodEndDate, payRun.payRunPeriodEndDate)
        && Objects.equals(this.payRunStatus, payRun.payRunStatus)
        && Objects.equals(this.paymentDate, payRun.paymentDate)
        && Objects.equals(this.payslipMessage, payRun.payslipMessage)
        && Objects.equals(this.updatedDateUTC, payRun.updatedDateUTC)
        && Objects.equals(this.payslips, payRun.payslips)
        && Objects.equals(this.wages, payRun.wages)
        && Objects.equals(this.deductions, payRun.deductions)
        && Objects.equals(this.tax, payRun.tax)
        && Objects.equals(this._super, payRun._super)
        && Objects.equals(this.reimbursement, payRun.reimbursement)
        && Objects.equals(this.netPay, payRun.netPay)
        && Objects.equals(this.validationErrors, payRun.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        payrollCalendarID,
        payRunID,
        payRunPeriodStartDate,
        payRunPeriodEndDate,
        payRunStatus,
        paymentDate,
        payslipMessage,
        updatedDateUTC,
        payslips,
        wages,
        deductions,
        tax,
        _super,
        reimbursement,
        netPay,
        validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayRun {\n");
    sb.append("    payrollCalendarID: ").append(toIndentedString(payrollCalendarID)).append("\n");
    sb.append("    payRunID: ").append(toIndentedString(payRunID)).append("\n");
    sb.append("    payRunPeriodStartDate: ")
        .append(toIndentedString(payRunPeriodStartDate))
        .append("\n");
    sb.append("    payRunPeriodEndDate: ")
        .append(toIndentedString(payRunPeriodEndDate))
        .append("\n");
    sb.append("    payRunStatus: ").append(toIndentedString(payRunStatus)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    payslipMessage: ").append(toIndentedString(payslipMessage)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    payslips: ").append(toIndentedString(payslips)).append("\n");
    sb.append("    wages: ").append(toIndentedString(wages)).append("\n");
    sb.append("    deductions: ").append(toIndentedString(deductions)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    _super: ").append(toIndentedString(_super)).append("\n");
    sb.append("    reimbursement: ").append(toIndentedString(reimbursement)).append("\n");
    sb.append("    netPay: ").append(toIndentedString(netPay)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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
