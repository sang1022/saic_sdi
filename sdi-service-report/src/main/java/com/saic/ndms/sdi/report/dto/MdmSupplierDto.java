package com.saic.ndms.sdi.report.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MdmSupplierDto {
	//供应商名称
	@JsonProperty("CHN_NM")
	private String supplierName;
	//供应商英文名称
	@JsonProperty("ENG_NM")
	private String supplierEngName;
	//供应商DUNS号
	@JsonProperty("DUNS")
	private String supplierDuns;
	//供应商地址
	@JsonProperty("ADDR")
	private String supplierAddress;
	//供应商是否海外
	@JsonProperty("IS_OVERSEA")
	private String isOverSeasSupplier;


	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierEngName() {
		return supplierEngName;
	}

	public void setSupplierEngName(String supplierEngName) {
		this.supplierEngName = supplierEngName;
	}

	public String getSupplierDuns() {
		return supplierDuns;
	}

	public void setSupplierDuns(String supplierDuns) {
		this.supplierDuns = supplierDuns;
	}

	public String getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	public String getIsOverSeasSupplier() {
		return isOverSeasSupplier;
	}

	public void setIsOverSeasSupplier(String isOverSeasSupplier) {
		this.isOverSeasSupplier = isOverSeasSupplier;
	}
	
	
	
}
