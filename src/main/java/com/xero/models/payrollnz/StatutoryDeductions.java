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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** StatutoryDeductions */
public class StatutoryDeductions {
  StringUtil util = new StringUtil();

  @JsonProperty("pagination")
  private Pagination pagination;

  @JsonProperty("problem")
  private Problem problem;

  @JsonProperty("statutoryDeductions")
  private List<StatutoryDeduction> statutoryDeductions = new ArrayList<StatutoryDeduction>();

  public StatutoryDeductions pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   *
   * @return pagination
   */
  @ApiModelProperty(value = "")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public StatutoryDeductions problem(Problem problem) {
    this.problem = problem;
    return this;
  }

  /**
   * Get problem
   *
   * @return problem
   */
  @ApiModelProperty(value = "")
  public Problem getProblem() {
    return problem;
  }

  public void setProblem(Problem problem) {
    this.problem = problem;
  }

  public StatutoryDeductions statutoryDeductions(List<StatutoryDeduction> statutoryDeductions) {
    this.statutoryDeductions = statutoryDeductions;
    return this;
  }

  public StatutoryDeductions addStatutoryDeductionsItem(
      StatutoryDeduction statutoryDeductionsItem) {
    if (this.statutoryDeductions == null) {
      this.statutoryDeductions = new ArrayList<StatutoryDeduction>();
    }
    this.statutoryDeductions.add(statutoryDeductionsItem);
    return this;
  }

  /**
   * Get statutoryDeductions
   *
   * @return statutoryDeductions
   */
  @ApiModelProperty(value = "")
  public List<StatutoryDeduction> getStatutoryDeductions() {
    return statutoryDeductions;
  }

  public void setStatutoryDeductions(List<StatutoryDeduction> statutoryDeductions) {
    this.statutoryDeductions = statutoryDeductions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatutoryDeductions statutoryDeductions = (StatutoryDeductions) o;
    return Objects.equals(this.pagination, statutoryDeductions.pagination)
        && Objects.equals(this.problem, statutoryDeductions.problem)
        && Objects.equals(this.statutoryDeductions, statutoryDeductions.statutoryDeductions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, problem, statutoryDeductions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatutoryDeductions {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    statutoryDeductions: ")
        .append(toIndentedString(statutoryDeductions))
        .append("\n");
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
