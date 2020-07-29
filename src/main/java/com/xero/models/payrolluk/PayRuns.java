/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * The version of the OpenAPI document: 2.2.10
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrolluk;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** PayRuns */
public class PayRuns {
  StringUtil util = new StringUtil();

  @JsonProperty("pagination")
  private Pagination pagination;

  @JsonProperty("problem")
  private Problem problem;

  @JsonProperty("payRuns")
  private List<PayRun> payRuns = new ArrayList<PayRun>();

  public PayRuns pagination(Pagination pagination) {
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

  public PayRuns problem(Problem problem) {
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

  public PayRuns payRuns(List<PayRun> payRuns) {
    this.payRuns = payRuns;
    return this;
  }

  public PayRuns addPayRunsItem(PayRun payRunsItem) {
    if (this.payRuns == null) {
      this.payRuns = new ArrayList<PayRun>();
    }
    this.payRuns.add(payRunsItem);
    return this;
  }

  /**
   * Get payRuns
   *
   * @return payRuns
   */
  @ApiModelProperty(value = "")
  public List<PayRun> getPayRuns() {
    return payRuns;
  }

  public void setPayRuns(List<PayRun> payRuns) {
    this.payRuns = payRuns;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayRuns payRuns = (PayRuns) o;
    return Objects.equals(this.pagination, payRuns.pagination)
        && Objects.equals(this.problem, payRuns.problem)
        && Objects.equals(this.payRuns, payRuns.payRuns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, problem, payRuns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayRuns {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    payRuns: ").append(toIndentedString(payRuns)).append("\n");
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
