/*
 * Xero oAuth 2 identity service
 * This specifing endpoints related to managing authentication tokens and identity for Xero API
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.identity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.LocalDateTime;

/** Connection */
public class Connection {
  StringUtil util = new StringUtil();

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("tenantId")
  private UUID tenantId;

  @JsonProperty("authEventId")
  private UUID authEventId;

  @JsonProperty("tenantType")
  private String tenantType;

  @JsonProperty("tenantName")
  private String tenantName;

  @JsonProperty("createdDateUtc")
  private LocalDateTime createdDateUtc;

  @JsonProperty("updatedDateUtc")
  private LocalDateTime updatedDateUtc;

  public Connection id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Xero identifier
   *
   * @return id
   */
  @ApiModelProperty(value = "Xero identifier")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Connection tenantId(UUID tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Xero identifier of organisation
   *
   * @return tenantId
   */
  @ApiModelProperty(value = "Xero identifier of organisation")
  public UUID getTenantId() {
    return tenantId;
  }

  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }

  public Connection authEventId(UUID authEventId) {
    this.authEventId = authEventId;
    return this;
  }

  /**
   * Identifier shared across connections authorised at the same time
   *
   * @return authEventId
   */
  @ApiModelProperty(value = "Identifier shared across connections authorised at the same time")
  public UUID getAuthEventId() {
    return authEventId;
  }

  public void setAuthEventId(UUID authEventId) {
    this.authEventId = authEventId;
  }

  public Connection tenantType(String tenantType) {
    this.tenantType = tenantType;
    return this;
  }

  /**
   * Xero tenant type (i.e. ORGANISATION, PRACTICE)
   *
   * @return tenantType
   */
  @ApiModelProperty(value = "Xero tenant type (i.e. ORGANISATION, PRACTICE)")
  public String getTenantType() {
    return tenantType;
  }

  public void setTenantType(String tenantType) {
    this.tenantType = tenantType;
  }

  public Connection tenantName(String tenantName) {
    this.tenantName = tenantName;
    return this;
  }

  /**
   * Xero tenant name
   *
   * @return tenantName
   */
  @ApiModelProperty(value = "Xero tenant name")
  public String getTenantName() {
    return tenantName;
  }

  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  public Connection createdDateUtc(LocalDateTime createdDateUtc) {
    this.createdDateUtc = createdDateUtc;
    return this;
  }

  /**
   * The date when the user connected this tenant to your app
   *
   * @return createdDateUtc
   */
  @ApiModelProperty(value = "The date when the user connected this tenant to your app")
  public LocalDateTime getCreatedDateUtc() {
    return createdDateUtc;
  }

  public void setCreatedDateUtc(LocalDateTime createdDateUtc) {
    this.createdDateUtc = createdDateUtc;
  }

  public Connection updatedDateUtc(LocalDateTime updatedDateUtc) {
    this.updatedDateUtc = updatedDateUtc;
    return this;
  }

  /**
   * The date when the user most recently connected this tenant to your app. May differ to the
   * created date if the user has disconnected and subsequently reconnected this tenant to your app.
   *
   * @return updatedDateUtc
   */
  @ApiModelProperty(
      value =
          "The date when the user most recently connected this tenant to your app. May differ to"
              + " the created date if the user has disconnected and subsequently reconnected this"
              + " tenant to your app.")
  public LocalDateTime getUpdatedDateUtc() {
    return updatedDateUtc;
  }

  public void setUpdatedDateUtc(LocalDateTime updatedDateUtc) {
    this.updatedDateUtc = updatedDateUtc;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connection connection = (Connection) o;
    return Objects.equals(this.id, connection.id)
        && Objects.equals(this.tenantId, connection.tenantId)
        && Objects.equals(this.authEventId, connection.authEventId)
        && Objects.equals(this.tenantType, connection.tenantType)
        && Objects.equals(this.tenantName, connection.tenantName)
        && Objects.equals(this.createdDateUtc, connection.createdDateUtc)
        && Objects.equals(this.updatedDateUtc, connection.updatedDateUtc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        id, tenantId, authEventId, tenantType, tenantName, createdDateUtc, updatedDateUtc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connection {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    authEventId: ").append(toIndentedString(authEventId)).append("\n");
    sb.append("    tenantType: ").append(toIndentedString(tenantType)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
    sb.append("    createdDateUtc: ").append(toIndentedString(createdDateUtc)).append("\n");
    sb.append("    updatedDateUtc: ").append(toIndentedString(updatedDateUtc)).append("\n");
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
