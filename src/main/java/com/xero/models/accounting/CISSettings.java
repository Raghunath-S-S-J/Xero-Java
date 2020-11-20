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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** CISSettings */
public class CISSettings {
  StringUtil util = new StringUtil();

  @JsonProperty("CISSettings")
  private List<CISSetting> ciSSettings = new ArrayList<CISSetting>();

  public CISSettings ciSSettings(List<CISSetting> ciSSettings) {
    this.ciSSettings = ciSSettings;
    return this;
  }

  public CISSettings addCiSSettingsItem(CISSetting ciSSettingsItem) {
    if (this.ciSSettings == null) {
      this.ciSSettings = new ArrayList<CISSetting>();
    }
    this.ciSSettings.add(ciSSettingsItem);
    return this;
  }

  /**
   * Get ciSSettings
   *
   * @return ciSSettings
   */
  @ApiModelProperty(value = "")
  public List<CISSetting> getCiSSettings() {
    return ciSSettings;
  }

  public void setCiSSettings(List<CISSetting> ciSSettings) {
    this.ciSSettings = ciSSettings;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CISSettings ciSSettings = (CISSettings) o;
    return Objects.equals(this.ciSSettings, ciSSettings.ciSSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ciSSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CISSettings {\n");
    sb.append("    ciSSettings: ").append(toIndentedString(ciSSettings)).append("\n");
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
