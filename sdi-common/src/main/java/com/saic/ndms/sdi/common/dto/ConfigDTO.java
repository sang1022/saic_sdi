package com.saic.ndms.sdi.common.dto;

/**
 * 配置的DOT类,对应TC_CONFIG
 * @remark 
 * @author sangdeliang
 * @date 2020年3月19日
 */
public class ConfigDTO {
	private Long configId;
	private String configCode;
	private String configName;
	private String configValue;
	private Integer status;
	public Long getConfigId() {
		return configId;
	}
	public void setConfigId(Long configId) {
		this.configId = configId;
	}
	public String getConfigCode() {
		return configCode;
	}
	public void setConfigCode(String configCode) {
		this.configCode = configCode;
	}
	public String getConfigName() {
		return configName;
	}
	public void setConfigName(String configName) {
		this.configName = configName;
	}
	public String getConfigValue() {
		return configValue;
	}
	public void setConfigValue(String configValue) {
		this.configValue = configValue;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
}
