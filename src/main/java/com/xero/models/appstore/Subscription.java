/*
 * Xero AppStore API
 * These endpoints are for Xero Partners to interact with the App Store Billing platform
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.appstore;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.LocalDateTime;

/** Subscription */
public class Subscription {
  StringUtil util = new StringUtil();

  @JsonProperty("currentPeriodEnd")
  private LocalDateTime currentPeriodEnd;

  @JsonProperty("endDate")
  private LocalDateTime endDate;

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("organisationId")
  private UUID organisationId;

  @JsonProperty("plans")
  private List<Plan> plans = new ArrayList<Plan>();

  @JsonProperty("startDate")
  private LocalDateTime startDate;
  /** Status of the subscription. Available statuses are ACTIVE, CANCELED, and PAST_DUE. */
  public enum StatusEnum {
    /** ACTIVE */
    ACTIVE("ACTIVE"),

    /** CANCELED */
    CANCELED("CANCELED"),

    /** PAST_DUE */
    PAST_DUE("PAST_DUE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    /**
     * getValue
     *
     * @return String value
     */
    @JsonValue
    public String getValue() {
      return value;
    }

    /**
     * toString
     *
     * @return String value
     */
    @Override
    public String toString() {
      return String.valueOf(value);
    }

    /**
     * fromValue
     *
     * @param value String
     */
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

  @JsonProperty("testMode")
  private Boolean testMode;
  /**
   * End of the current period that the subscription has been invoiced for.
   *
   * @param currentPeriodEnd LocalDateTime
   * @return Subscription
   */
  public Subscription currentPeriodEnd(LocalDateTime currentPeriodEnd) {
    this.currentPeriodEnd = currentPeriodEnd;
    return this;
  }

  /**
   * End of the current period that the subscription has been invoiced for.
   *
   * @return currentPeriodEnd
   */
  @ApiModelProperty(
      required = true,
      value = "End of the current period that the subscription has been invoiced for. ")
  /**
   * End of the current period that the subscription has been invoiced for.
   *
   * @return currentPeriodEnd LocalDateTime
   */
  public LocalDateTime getCurrentPeriodEnd() {
    return currentPeriodEnd;
  }

  /**
   * End of the current period that the subscription has been invoiced for.
   *
   * @param currentPeriodEnd LocalDateTime
   */
  public void setCurrentPeriodEnd(LocalDateTime currentPeriodEnd) {
    this.currentPeriodEnd = currentPeriodEnd;
  }

  /**
   * If the subscription has been canceled, this is the date when the subscription ends. If null,
   * the subscription is active and has not been cancelled
   *
   * @param endDate LocalDateTime
   * @return Subscription
   */
  public Subscription endDate(LocalDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * If the subscription has been canceled, this is the date when the subscription ends. If null,
   * the subscription is active and has not been cancelled
   *
   * @return endDate
   */
  @ApiModelProperty(
      value =
          "If the subscription has been canceled, this is the date when the subscription ends. If"
              + " null, the subscription is active and has not been cancelled")
  /**
   * If the subscription has been canceled, this is the date when the subscription ends. If null,
   * the subscription is active and has not been cancelled
   *
   * @return endDate LocalDateTime
   */
  public LocalDateTime getEndDate() {
    return endDate;
  }

  /**
   * If the subscription has been canceled, this is the date when the subscription ends. If null,
   * the subscription is active and has not been cancelled
   *
   * @param endDate LocalDateTime
   */
  public void setEndDate(LocalDateTime endDate) {
    this.endDate = endDate;
  }

  /**
   * The unique identifier of the subscription
   *
   * @param id UUID
   * @return Subscription
   */
  public Subscription id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the subscription
   *
   * @return id
   */
  @ApiModelProperty(required = true, value = "The unique identifier of the subscription")
  /**
   * The unique identifier of the subscription
   *
   * @return id UUID
   */
  public UUID getId() {
    return id;
  }

  /**
   * The unique identifier of the subscription
   *
   * @param id UUID
   */
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   * The Xero generated unique identifier for the organisation
   *
   * @param organisationId UUID
   * @return Subscription
   */
  public Subscription organisationId(UUID organisationId) {
    this.organisationId = organisationId;
    return this;
  }

  /**
   * The Xero generated unique identifier for the organisation
   *
   * @return organisationId
   */
  @ApiModelProperty(
      required = true,
      value = "The Xero generated unique identifier for the organisation")
  /**
   * The Xero generated unique identifier for the organisation
   *
   * @return organisationId UUID
   */
  public UUID getOrganisationId() {
    return organisationId;
  }

  /**
   * The Xero generated unique identifier for the organisation
   *
   * @param organisationId UUID
   */
  public void setOrganisationId(UUID organisationId) {
    this.organisationId = organisationId;
  }

  /**
   * List of plans for the subscription.
   *
   * @param plans List&lt;Plan&gt;
   * @return Subscription
   */
  public Subscription plans(List<Plan> plans) {
    this.plans = plans;
    return this;
  }

  /**
   * List of plans for the subscription.
   *
   * @param plansItem Plan
   * @return Subscription
   */
  public Subscription addPlansItem(Plan plansItem) {
    this.plans.add(plansItem);
    return this;
  }

  /**
   * List of plans for the subscription.
   *
   * @return plans
   */
  @ApiModelProperty(required = true, value = "List of plans for the subscription.")
  /**
   * List of plans for the subscription.
   *
   * @return plans List<Plan>
   */
  public List<Plan> getPlans() {
    return plans;
  }

  /**
   * List of plans for the subscription.
   *
   * @param plans List&lt;Plan&gt;
   */
  public void setPlans(List<Plan> plans) {
    this.plans = plans;
  }

  /**
   * Date when the subscription was first created.
   *
   * @param startDate LocalDateTime
   * @return Subscription
   */
  public Subscription startDate(LocalDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Date when the subscription was first created.
   *
   * @return startDate
   */
  @ApiModelProperty(required = true, value = "Date when the subscription was first created.")
  /**
   * Date when the subscription was first created.
   *
   * @return startDate LocalDateTime
   */
  public LocalDateTime getStartDate() {
    return startDate;
  }

  /**
   * Date when the subscription was first created.
   *
   * @param startDate LocalDateTime
   */
  public void setStartDate(LocalDateTime startDate) {
    this.startDate = startDate;
  }

  /**
   * Status of the subscription. Available statuses are ACTIVE, CANCELED, and PAST_DUE.
   *
   * @param status StatusEnum
   * @return Subscription
   */
  public Subscription status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the subscription. Available statuses are ACTIVE, CANCELED, and PAST_DUE.
   *
   * @return status
   */
  @ApiModelProperty(
      required = true,
      value = "Status of the subscription. Available statuses are ACTIVE, CANCELED, and PAST_DUE.")
  /**
   * Status of the subscription. Available statuses are ACTIVE, CANCELED, and PAST_DUE.
   *
   * @return status StatusEnum
   */
  public StatusEnum getStatus() {
    return status;
  }

  /**
   * Status of the subscription. Available statuses are ACTIVE, CANCELED, and PAST_DUE.
   *
   * @param status StatusEnum
   */
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * Boolean used to indicate if the subscription is in test mode
   *
   * @param testMode Boolean
   * @return Subscription
   */
  public Subscription testMode(Boolean testMode) {
    this.testMode = testMode;
    return this;
  }

  /**
   * Boolean used to indicate if the subscription is in test mode
   *
   * @return testMode
   */
  @ApiModelProperty(value = "Boolean used to indicate if the subscription is in test mode")
  /**
   * Boolean used to indicate if the subscription is in test mode
   *
   * @return testMode Boolean
   */
  public Boolean getTestMode() {
    return testMode;
  }

  /**
   * Boolean used to indicate if the subscription is in test mode
   *
   * @param testMode Boolean
   */
  public void setTestMode(Boolean testMode) {
    this.testMode = testMode;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.currentPeriodEnd, subscription.currentPeriodEnd)
        && Objects.equals(this.endDate, subscription.endDate)
        && Objects.equals(this.id, subscription.id)
        && Objects.equals(this.organisationId, subscription.organisationId)
        && Objects.equals(this.plans, subscription.plans)
        && Objects.equals(this.startDate, subscription.startDate)
        && Objects.equals(this.status, subscription.status)
        && Objects.equals(this.testMode, subscription.testMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        currentPeriodEnd, endDate, id, organisationId, plans, startDate, status, testMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    sb.append("    currentPeriodEnd: ").append(toIndentedString(currentPeriodEnd)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    testMode: ").append(toIndentedString(testMode)).append("\n");
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
