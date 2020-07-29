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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/** ExpenseClaim */
public class ExpenseClaim {
  StringUtil util = new StringUtil();

  @JsonProperty("ExpenseClaimID")
  private UUID expenseClaimID;
  /** Current status of an expense claim – see status types */
  public enum StatusEnum {
    SUBMITTED("SUBMITTED"),

    AUTHORISED("AUTHORISED"),

    PAID("PAID"),

    VOIDED("VOIDED"),

    DELETED("DELETED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Status")
  private StatusEnum status;

  @JsonProperty("Payments")
  private List<Payment> payments = new ArrayList<Payment>();

  @JsonProperty("User")
  private User user;

  @JsonProperty("Receipts")
  private List<Receipt> receipts = new ArrayList<Receipt>();

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  @JsonProperty("Total")
  private Double total;

  @JsonProperty("AmountDue")
  private Double amountDue;

  @JsonProperty("AmountPaid")
  private Double amountPaid;

  @JsonProperty("PaymentDueDate")
  private String paymentDueDate;

  @JsonProperty("ReportingDate")
  private String reportingDate;

  @JsonProperty("ReceiptID")
  private UUID receiptID;

  public ExpenseClaim expenseClaimID(UUID expenseClaimID) {
    this.expenseClaimID = expenseClaimID;
    return this;
  }

  /**
   * Xero generated unique identifier for an expense claim
   *
   * @return expenseClaimID
   */
  @ApiModelProperty(value = "Xero generated unique identifier for an expense claim")
  public UUID getExpenseClaimID() {
    return expenseClaimID;
  }

  public void setExpenseClaimID(UUID expenseClaimID) {
    this.expenseClaimID = expenseClaimID;
  }

  public ExpenseClaim status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Current status of an expense claim – see status types
   *
   * @return status
   */
  @ApiModelProperty(value = "Current status of an expense claim – see status types")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ExpenseClaim payments(List<Payment> payments) {
    this.payments = payments;
    return this;
  }

  public ExpenseClaim addPaymentsItem(Payment paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<Payment>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

  /**
   * See Payments
   *
   * @return payments
   */
  @ApiModelProperty(value = "See Payments")
  public List<Payment> getPayments() {
    return payments;
  }

  public void setPayments(List<Payment> payments) {
    this.payments = payments;
  }

  public ExpenseClaim user(User user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   *
   * @return user
   */
  @ApiModelProperty(value = "")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public ExpenseClaim receipts(List<Receipt> receipts) {
    this.receipts = receipts;
    return this;
  }

  public ExpenseClaim addReceiptsItem(Receipt receiptsItem) {
    if (this.receipts == null) {
      this.receipts = new ArrayList<Receipt>();
    }
    this.receipts.add(receiptsItem);
    return this;
  }

  /**
   * Get receipts
   *
   * @return receipts
   */
  @ApiModelProperty(value = "")
  public List<Receipt> getReceipts() {
    return receipts;
  }

  public void setReceipts(List<Receipt> receipts) {
    this.receipts = receipts;
  }

  /**
   * Last modified date UTC format
   *
   * @return updatedDateUTC
   */
  @ApiModelProperty(example = "/Date(1573755038314)/", value = "Last modified date UTC format")
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

  /**
   * The total of an expense claim being paid
   *
   * @return total
   */
  @ApiModelProperty(value = "The total of an expense claim being paid")
  public Double getTotal() {
    return total;
  }

  /**
   * The amount due to be paid for an expense claim
   *
   * @return amountDue
   */
  @ApiModelProperty(value = "The amount due to be paid for an expense claim")
  public Double getAmountDue() {
    return amountDue;
  }

  /**
   * The amount still to pay for an expense claim
   *
   * @return amountPaid
   */
  @ApiModelProperty(value = "The amount still to pay for an expense claim")
  public Double getAmountPaid() {
    return amountPaid;
  }

  /**
   * The date when the expense claim is due to be paid YYYY-MM-DD
   *
   * @return paymentDueDate
   */
  @ApiModelProperty(value = "The date when the expense claim is due to be paid YYYY-MM-DD")
  public String getPaymentDueDate() {
    return paymentDueDate;
  }

  public LocalDate getPaymentDueDateAsDate() {
    if (this.paymentDueDate != null) {
      try {
        return util.convertStringToDate(this.paymentDueDate);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  /**
   * The date the expense claim will be reported in Xero YYYY-MM-DD
   *
   * @return reportingDate
   */
  @ApiModelProperty(value = "The date the expense claim will be reported in Xero YYYY-MM-DD")
  public String getReportingDate() {
    return reportingDate;
  }

  public LocalDate getReportingDateAsDate() {
    if (this.reportingDate != null) {
      try {
        return util.convertStringToDate(this.reportingDate);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public ExpenseClaim receiptID(UUID receiptID) {
    this.receiptID = receiptID;
    return this;
  }

  /**
   * The Xero identifier for the Receipt e.g. e59a2c7f-1306-4078-a0f3-73537afcbba9
   *
   * @return receiptID
   */
  @ApiModelProperty(
      value = "The Xero identifier for the Receipt e.g.  e59a2c7f-1306-4078-a0f3-73537afcbba9")
  public UUID getReceiptID() {
    return receiptID;
  }

  public void setReceiptID(UUID receiptID) {
    this.receiptID = receiptID;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpenseClaim expenseClaim = (ExpenseClaim) o;
    return Objects.equals(this.expenseClaimID, expenseClaim.expenseClaimID)
        && Objects.equals(this.status, expenseClaim.status)
        && Objects.equals(this.payments, expenseClaim.payments)
        && Objects.equals(this.user, expenseClaim.user)
        && Objects.equals(this.receipts, expenseClaim.receipts)
        && Objects.equals(this.updatedDateUTC, expenseClaim.updatedDateUTC)
        && Objects.equals(this.total, expenseClaim.total)
        && Objects.equals(this.amountDue, expenseClaim.amountDue)
        && Objects.equals(this.amountPaid, expenseClaim.amountPaid)
        && Objects.equals(this.paymentDueDate, expenseClaim.paymentDueDate)
        && Objects.equals(this.reportingDate, expenseClaim.reportingDate)
        && Objects.equals(this.receiptID, expenseClaim.receiptID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        expenseClaimID,
        status,
        payments,
        user,
        receipts,
        updatedDateUTC,
        total,
        amountDue,
        amountPaid,
        paymentDueDate,
        reportingDate,
        receiptID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpenseClaim {\n");
    sb.append("    expenseClaimID: ").append(toIndentedString(expenseClaimID)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    receipts: ").append(toIndentedString(receipts)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    amountDue: ").append(toIndentedString(amountDue)).append("\n");
    sb.append("    amountPaid: ").append(toIndentedString(amountPaid)).append("\n");
    sb.append("    paymentDueDate: ").append(toIndentedString(paymentDueDate)).append("\n");
    sb.append("    reportingDate: ").append(toIndentedString(reportingDate)).append("\n");
    sb.append("    receiptID: ").append(toIndentedString(receiptID)).append("\n");
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
