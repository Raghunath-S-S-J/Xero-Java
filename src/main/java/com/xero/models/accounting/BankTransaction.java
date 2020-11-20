/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.5.0
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
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneId;

/** BankTransaction */
public class BankTransaction {
  StringUtil util = new StringUtil();
  /** See Bank Transaction Types */
  public enum TypeEnum {
    RECEIVE("RECEIVE"),

    RECEIVE_OVERPAYMENT("RECEIVE-OVERPAYMENT"),

    RECEIVE_PREPAYMENT("RECEIVE-PREPAYMENT"),

    SPEND("SPEND"),

    SPEND_OVERPAYMENT("SPEND-OVERPAYMENT"),

    SPEND_PREPAYMENT("SPEND-PREPAYMENT"),

    RECEIVE_TRANSFER("RECEIVE-TRANSFER"),

    SPEND_TRANSFER("SPEND-TRANSFER");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Type")
  private TypeEnum type;

  @JsonProperty("Contact")
  private Contact contact;

  @JsonProperty("LineItems")
  private List<LineItem> lineItems = new ArrayList<LineItem>();

  @JsonProperty("BankAccount")
  private Account bankAccount;

  @JsonProperty("IsReconciled")
  private Boolean isReconciled;

  @JsonProperty("Date")
  private String date;

  @JsonProperty("Reference")
  private String reference;

  @JsonProperty("CurrencyCode")
  private CurrencyCode currencyCode;

  @JsonProperty("CurrencyRate")
  private Double currencyRate;

  @JsonProperty("Url")
  private String url;
  /** See Bank Transaction Status Codes */
  public enum StatusEnum {
    AUTHORISED("AUTHORISED"),

    DELETED("DELETED"),

    VOIDED("VOIDED");

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

  @JsonProperty("LineAmountTypes")
  private LineAmountTypes lineAmountTypes;

  @JsonProperty("SubTotal")
  private Double subTotal;

  @JsonProperty("TotalTax")
  private Double totalTax;

  @JsonProperty("Total")
  private Double total;

  @JsonProperty("BankTransactionID")
  private UUID bankTransactionID;

  @JsonProperty("PrepaymentID")
  private UUID prepaymentID;

  @JsonProperty("OverpaymentID")
  private UUID overpaymentID;

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  @JsonProperty("HasAttachments")
  private Boolean hasAttachments = false;

  @JsonProperty("StatusAttributeString")
  private String statusAttributeString;

  @JsonProperty("ValidationErrors")
  private List<ValidationError> validationErrors = new ArrayList<ValidationError>();

  public BankTransaction type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * See Bank Transaction Types
   *
   * @return type
   */
  @ApiModelProperty(required = true, value = "See Bank Transaction Types")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public BankTransaction contact(Contact contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   *
   * @return contact
   */
  @ApiModelProperty(value = "")
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public BankTransaction lineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public BankTransaction addLineItemsItem(LineItem lineItemsItem) {
    this.lineItems.add(lineItemsItem);
    return this;
  }

  /**
   * See LineItems
   *
   * @return lineItems
   */
  @ApiModelProperty(required = true, value = "See LineItems")
  public List<LineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public BankTransaction bankAccount(Account bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

  /**
   * Get bankAccount
   *
   * @return bankAccount
   */
  @ApiModelProperty(required = true, value = "")
  public Account getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(Account bankAccount) {
    this.bankAccount = bankAccount;
  }

  public BankTransaction isReconciled(Boolean isReconciled) {
    this.isReconciled = isReconciled;
    return this;
  }

  /**
   * Boolean to show if transaction is reconciled
   *
   * @return isReconciled
   */
  @ApiModelProperty(value = "Boolean to show if transaction is reconciled")
  public Boolean getIsReconciled() {
    return isReconciled;
  }

  public void setIsReconciled(Boolean isReconciled) {
    this.isReconciled = isReconciled;
  }

  public BankTransaction date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Date of transaction – YYYY-MM-DD
   *
   * @return date
   */
  @ApiModelProperty(value = "Date of transaction – YYYY-MM-DD")
  public String getDate() {
    return date;
  }

  public LocalDate getDateAsDate() {
    if (this.date != null) {
      try {
        return util.convertStringToDate(this.date);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public void setDate(LocalDate date) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = date.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.date = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  public BankTransaction reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Reference for the transaction. Only supported for SPEND and RECEIVE transactions.
   *
   * @return reference
   */
  @ApiModelProperty(
      value = "Reference for the transaction. Only supported for SPEND and RECEIVE transactions.")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public BankTransaction currencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   *
   * @return currencyCode
   */
  @ApiModelProperty(value = "")
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  public BankTransaction currencyRate(Double currencyRate) {
    this.currencyRate = currencyRate;
    return this;
  }

  /**
   * Exchange rate to base currency when money is spent or received. e.g.0.7500 Only used for bank
   * transactions in non base currency. If this isn’t specified for non base currency accounts then
   * either the user-defined rate (preference) or the XE.com day rate will be used. Setting currency
   * is only supported on overpayments.
   *
   * @return currencyRate
   */
  @ApiModelProperty(
      value =
          "Exchange rate to base currency when money is spent or received. e.g.0.7500 Only used"
              + " for bank transactions in non base currency. If this isn’t specified for non base"
              + " currency accounts then either the user-defined rate (preference) or the XE.com"
              + " day rate will be used. Setting currency is only supported on overpayments.")
  public Double getCurrencyRate() {
    return currencyRate;
  }

  public void setCurrencyRate(Double currencyRate) {
    this.currencyRate = currencyRate;
  }

  public BankTransaction url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL link to a source document – shown as “Go to App Name”
   *
   * @return url
   */
  @ApiModelProperty(value = "URL link to a source document – shown as “Go to App Name”")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public BankTransaction status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * See Bank Transaction Status Codes
   *
   * @return status
   */
  @ApiModelProperty(value = "See Bank Transaction Status Codes")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public BankTransaction lineAmountTypes(LineAmountTypes lineAmountTypes) {
    this.lineAmountTypes = lineAmountTypes;
    return this;
  }

  /**
   * Get lineAmountTypes
   *
   * @return lineAmountTypes
   */
  @ApiModelProperty(value = "")
  public LineAmountTypes getLineAmountTypes() {
    return lineAmountTypes;
  }

  public void setLineAmountTypes(LineAmountTypes lineAmountTypes) {
    this.lineAmountTypes = lineAmountTypes;
  }

  public BankTransaction subTotal(Double subTotal) {
    this.subTotal = subTotal;
    return this;
  }

  /**
   * Total of bank transaction excluding taxes
   *
   * @return subTotal
   */
  @ApiModelProperty(value = "Total of bank transaction excluding taxes")
  public Double getSubTotal() {
    return subTotal;
  }

  public void setSubTotal(Double subTotal) {
    this.subTotal = subTotal;
  }

  public BankTransaction totalTax(Double totalTax) {
    this.totalTax = totalTax;
    return this;
  }

  /**
   * Total tax on bank transaction
   *
   * @return totalTax
   */
  @ApiModelProperty(value = "Total tax on bank transaction")
  public Double getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(Double totalTax) {
    this.totalTax = totalTax;
  }

  public BankTransaction total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * Total of bank transaction tax inclusive
   *
   * @return total
   */
  @ApiModelProperty(value = "Total of bank transaction tax inclusive")
  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }

  public BankTransaction bankTransactionID(UUID bankTransactionID) {
    this.bankTransactionID = bankTransactionID;
    return this;
  }

  /**
   * Xero generated unique identifier for bank transaction
   *
   * @return bankTransactionID
   */
  @ApiModelProperty(
      example = "00000000-0000-0000-0000-000000000000",
      value = "Xero generated unique identifier for bank transaction")
  public UUID getBankTransactionID() {
    return bankTransactionID;
  }

  public void setBankTransactionID(UUID bankTransactionID) {
    this.bankTransactionID = bankTransactionID;
  }

  /**
   * Xero generated unique identifier for a Prepayment. This will be returned on BankTransactions
   * with a Type of SPEND-PREPAYMENT or RECEIVE-PREPAYMENT
   *
   * @return prepaymentID
   */
  @ApiModelProperty(
      example = "00000000-0000-0000-0000-000000000000",
      value =
          "Xero generated unique identifier for a Prepayment. This will be returned on"
              + " BankTransactions with a Type of SPEND-PREPAYMENT or RECEIVE-PREPAYMENT")
  public UUID getPrepaymentID() {
    return prepaymentID;
  }

  /**
   * Xero generated unique identifier for an Overpayment. This will be returned on BankTransactions
   * with a Type of SPEND-OVERPAYMENT or RECEIVE-OVERPAYMENT
   *
   * @return overpaymentID
   */
  @ApiModelProperty(
      example = "00000000-0000-0000-0000-000000000000",
      value =
          "Xero generated unique identifier for an Overpayment. This will be returned on"
              + " BankTransactions with a Type of SPEND-OVERPAYMENT or RECEIVE-OVERPAYMENT")
  public UUID getOverpaymentID() {
    return overpaymentID;
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
   * Boolean to indicate if a bank transaction has an attachment
   *
   * @return hasAttachments
   */
  @ApiModelProperty(
      example = "false",
      value = "Boolean to indicate if a bank transaction has an attachment")
  public Boolean getHasAttachments() {
    return hasAttachments;
  }

  public BankTransaction statusAttributeString(String statusAttributeString) {
    this.statusAttributeString = statusAttributeString;
    return this;
  }

  /**
   * A string to indicate if a invoice status
   *
   * @return statusAttributeString
   */
  @ApiModelProperty(value = "A string to indicate if a invoice status")
  public String getStatusAttributeString() {
    return statusAttributeString;
  }

  public void setStatusAttributeString(String statusAttributeString) {
    this.statusAttributeString = statusAttributeString;
  }

  public BankTransaction validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public BankTransaction addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    BankTransaction bankTransaction = (BankTransaction) o;
    return Objects.equals(this.type, bankTransaction.type)
        && Objects.equals(this.contact, bankTransaction.contact)
        && Objects.equals(this.lineItems, bankTransaction.lineItems)
        && Objects.equals(this.bankAccount, bankTransaction.bankAccount)
        && Objects.equals(this.isReconciled, bankTransaction.isReconciled)
        && Objects.equals(this.date, bankTransaction.date)
        && Objects.equals(this.reference, bankTransaction.reference)
        && Objects.equals(this.currencyCode, bankTransaction.currencyCode)
        && Objects.equals(this.currencyRate, bankTransaction.currencyRate)
        && Objects.equals(this.url, bankTransaction.url)
        && Objects.equals(this.status, bankTransaction.status)
        && Objects.equals(this.lineAmountTypes, bankTransaction.lineAmountTypes)
        && Objects.equals(this.subTotal, bankTransaction.subTotal)
        && Objects.equals(this.totalTax, bankTransaction.totalTax)
        && Objects.equals(this.total, bankTransaction.total)
        && Objects.equals(this.bankTransactionID, bankTransaction.bankTransactionID)
        && Objects.equals(this.prepaymentID, bankTransaction.prepaymentID)
        && Objects.equals(this.overpaymentID, bankTransaction.overpaymentID)
        && Objects.equals(this.updatedDateUTC, bankTransaction.updatedDateUTC)
        && Objects.equals(this.hasAttachments, bankTransaction.hasAttachments)
        && Objects.equals(this.statusAttributeString, bankTransaction.statusAttributeString)
        && Objects.equals(this.validationErrors, bankTransaction.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        type,
        contact,
        lineItems,
        bankAccount,
        isReconciled,
        date,
        reference,
        currencyCode,
        currencyRate,
        url,
        status,
        lineAmountTypes,
        subTotal,
        totalTax,
        total,
        bankTransactionID,
        prepaymentID,
        overpaymentID,
        updatedDateUTC,
        hasAttachments,
        statusAttributeString,
        validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransaction {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    isReconciled: ").append(toIndentedString(isReconciled)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currencyRate: ").append(toIndentedString(currencyRate)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lineAmountTypes: ").append(toIndentedString(lineAmountTypes)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    bankTransactionID: ").append(toIndentedString(bankTransactionID)).append("\n");
    sb.append("    prepaymentID: ").append(toIndentedString(prepaymentID)).append("\n");
    sb.append("    overpaymentID: ").append(toIndentedString(overpaymentID)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    hasAttachments: ").append(toIndentedString(hasAttachments)).append("\n");
    sb.append("    statusAttributeString: ")
        .append(toIndentedString(statusAttributeString))
        .append("\n");
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
