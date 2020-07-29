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

/** Reimbursements */
public class Reimbursements {
  StringUtil util = new StringUtil();

  @JsonProperty("pagination")
  private Pagination pagination;

  @JsonProperty("problem")
  private Problem problem;

  @JsonProperty("reimbursements")
  private List<Reimbursement> reimbursements = new ArrayList<Reimbursement>();

  public Reimbursements pagination(Pagination pagination) {
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

  public Reimbursements problem(Problem problem) {
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

  public Reimbursements reimbursements(List<Reimbursement> reimbursements) {
    this.reimbursements = reimbursements;
    return this;
  }

  public Reimbursements addReimbursementsItem(Reimbursement reimbursementsItem) {
    if (this.reimbursements == null) {
      this.reimbursements = new ArrayList<Reimbursement>();
    }
    this.reimbursements.add(reimbursementsItem);
    return this;
  }

  /**
   * Get reimbursements
   *
   * @return reimbursements
   */
  @ApiModelProperty(value = "")
  public List<Reimbursement> getReimbursements() {
    return reimbursements;
  }

  public void setReimbursements(List<Reimbursement> reimbursements) {
    this.reimbursements = reimbursements;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reimbursements reimbursements = (Reimbursements) o;
    return Objects.equals(this.pagination, reimbursements.pagination)
        && Objects.equals(this.problem, reimbursements.problem)
        && Objects.equals(this.reimbursements, reimbursements.reimbursements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, problem, reimbursements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reimbursements {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    reimbursements: ").append(toIndentedString(reimbursements)).append("\n");
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
