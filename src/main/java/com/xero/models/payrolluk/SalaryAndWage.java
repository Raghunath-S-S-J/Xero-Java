/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrolluk;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/** SalaryAndWage */
public class SalaryAndWage {
  StringUtil util = new StringUtil();

  @JsonProperty("salaryAndWagesID")
  private UUID salaryAndWagesID;

  @JsonProperty("earningsRateID")
  private UUID earningsRateID;

  @JsonProperty("numberOfUnitsPerWeek")
  private Double numberOfUnitsPerWeek;

  @JsonProperty("ratePerUnit")
  private Double ratePerUnit;

  @JsonProperty("numberOfUnitsPerDay")
  private Double numberOfUnitsPerDay;

  @JsonProperty("effectiveFrom")
  private LocalDate effectiveFrom;

  @JsonProperty("annualSalary")
  private Double annualSalary;
  /** The current status of the corresponding salary and wages */
  public enum StatusEnum {
    ACTIVE("Active"),

    PENDING("Pending"),

    HISTORY("History");

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

  @JsonProperty("status")
  private StatusEnum status;
  /** The type of the payment of the corresponding salary and wages */
  public enum PaymentTypeEnum {
    SALARY("Salary");

    private String value;

    PaymentTypeEnum(String value) {
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
    public static PaymentTypeEnum fromValue(String value) {
      for (PaymentTypeEnum b : PaymentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("paymentType")
  private PaymentTypeEnum paymentType;

  public SalaryAndWage salaryAndWagesID(UUID salaryAndWagesID) {
    this.salaryAndWagesID = salaryAndWagesID;
    return this;
  }

  /**
   * Xero unique identifier for a salary and wages record
   *
   * @return salaryAndWagesID
   */
  @ApiModelProperty(value = "Xero unique identifier for a salary and wages record")
  public UUID getSalaryAndWagesID() {
    return salaryAndWagesID;
  }

  public void setSalaryAndWagesID(UUID salaryAndWagesID) {
    this.salaryAndWagesID = salaryAndWagesID;
  }

  public SalaryAndWage earningsRateID(UUID earningsRateID) {
    this.earningsRateID = earningsRateID;
    return this;
  }

  /**
   * Xero unique identifier for an earnings rate
   *
   * @return earningsRateID
   */
  @ApiModelProperty(required = true, value = "Xero unique identifier for an earnings rate")
  public UUID getEarningsRateID() {
    return earningsRateID;
  }

  public void setEarningsRateID(UUID earningsRateID) {
    this.earningsRateID = earningsRateID;
  }

  public SalaryAndWage numberOfUnitsPerWeek(Double numberOfUnitsPerWeek) {
    this.numberOfUnitsPerWeek = numberOfUnitsPerWeek;
    return this;
  }

  /**
   * The Number of Units per week for the corresponding salary and wages
   *
   * @return numberOfUnitsPerWeek
   */
  @ApiModelProperty(
      required = true,
      value = "The Number of Units per week for the corresponding salary and wages")
  public Double getNumberOfUnitsPerWeek() {
    return numberOfUnitsPerWeek;
  }

  public void setNumberOfUnitsPerWeek(Double numberOfUnitsPerWeek) {
    this.numberOfUnitsPerWeek = numberOfUnitsPerWeek;
  }

  public SalaryAndWage ratePerUnit(Double ratePerUnit) {
    this.ratePerUnit = ratePerUnit;
    return this;
  }

  /**
   * The rate of each unit for the corresponding salary and wages
   *
   * @return ratePerUnit
   */
  @ApiModelProperty(value = "The rate of each unit for the corresponding salary and wages")
  public Double getRatePerUnit() {
    return ratePerUnit;
  }

  public void setRatePerUnit(Double ratePerUnit) {
    this.ratePerUnit = ratePerUnit;
  }

  public SalaryAndWage numberOfUnitsPerDay(Double numberOfUnitsPerDay) {
    this.numberOfUnitsPerDay = numberOfUnitsPerDay;
    return this;
  }

  /**
   * The Number of Units per day for the corresponding salary and wages
   *
   * @return numberOfUnitsPerDay
   */
  @ApiModelProperty(value = "The Number of Units per day for the corresponding salary and wages")
  public Double getNumberOfUnitsPerDay() {
    return numberOfUnitsPerDay;
  }

  public void setNumberOfUnitsPerDay(Double numberOfUnitsPerDay) {
    this.numberOfUnitsPerDay = numberOfUnitsPerDay;
  }

  public SalaryAndWage effectiveFrom(LocalDate effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
    return this;
  }

  /**
   * The effective date of the corresponding salary and wages
   *
   * @return effectiveFrom
   */
  @ApiModelProperty(
      required = true,
      value = "The effective date of the corresponding salary and wages")
  public LocalDate getEffectiveFrom() {
    return effectiveFrom;
  }

  public void setEffectiveFrom(LocalDate effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
  }

  public SalaryAndWage annualSalary(Double annualSalary) {
    this.annualSalary = annualSalary;
    return this;
  }

  /**
   * The annual salary
   *
   * @return annualSalary
   */
  @ApiModelProperty(required = true, value = "The annual salary")
  public Double getAnnualSalary() {
    return annualSalary;
  }

  public void setAnnualSalary(Double annualSalary) {
    this.annualSalary = annualSalary;
  }

  public SalaryAndWage status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The current status of the corresponding salary and wages
   *
   * @return status
   */
  @ApiModelProperty(
      required = true,
      value = "The current status of the corresponding salary and wages")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public SalaryAndWage paymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * The type of the payment of the corresponding salary and wages
   *
   * @return paymentType
   */
  @ApiModelProperty(
      required = true,
      value = "The type of the payment of the corresponding salary and wages")
  public PaymentTypeEnum getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalaryAndWage salaryAndWage = (SalaryAndWage) o;
    return Objects.equals(this.salaryAndWagesID, salaryAndWage.salaryAndWagesID)
        && Objects.equals(this.earningsRateID, salaryAndWage.earningsRateID)
        && Objects.equals(this.numberOfUnitsPerWeek, salaryAndWage.numberOfUnitsPerWeek)
        && Objects.equals(this.ratePerUnit, salaryAndWage.ratePerUnit)
        && Objects.equals(this.numberOfUnitsPerDay, salaryAndWage.numberOfUnitsPerDay)
        && Objects.equals(this.effectiveFrom, salaryAndWage.effectiveFrom)
        && Objects.equals(this.annualSalary, salaryAndWage.annualSalary)
        && Objects.equals(this.status, salaryAndWage.status)
        && Objects.equals(this.paymentType, salaryAndWage.paymentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        salaryAndWagesID,
        earningsRateID,
        numberOfUnitsPerWeek,
        ratePerUnit,
        numberOfUnitsPerDay,
        effectiveFrom,
        annualSalary,
        status,
        paymentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalaryAndWage {\n");
    sb.append("    salaryAndWagesID: ").append(toIndentedString(salaryAndWagesID)).append("\n");
    sb.append("    earningsRateID: ").append(toIndentedString(earningsRateID)).append("\n");
    sb.append("    numberOfUnitsPerWeek: ")
        .append(toIndentedString(numberOfUnitsPerWeek))
        .append("\n");
    sb.append("    ratePerUnit: ").append(toIndentedString(ratePerUnit)).append("\n");
    sb.append("    numberOfUnitsPerDay: ")
        .append(toIndentedString(numberOfUnitsPerDay))
        .append("\n");
    sb.append("    effectiveFrom: ").append(toIndentedString(effectiveFrom)).append("\n");
    sb.append("    annualSalary: ").append(toIndentedString(annualSalary)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
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
