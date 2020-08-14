package com.saic.ndms.sdi.gateway.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 供应商信息最外层的DTO
 * @author sangdeliang
 * @date 2020年3月9日
 * @remark
 */
public class MdmSupplierReqVO {
	@JsonProperty("ActionType")
	private String actionType;
	
	@JsonProperty("TransactionID")
	private String transactionID;
	
	@JsonProperty("DomainType")
	private String domainType;
	
	@JsonProperty("DataType")
	private String dataType;
	
	//供应商的数据信息
	@JsonProperty("Supplier")
	private MdmSupplierVO supplierInfo;

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public String getDomainType() {
		return domainType;
	}

	public void setDomainType(String domainType) {
		this.domainType = domainType;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public MdmSupplierVO getSupplierInfo() {
		return supplierInfo;
	}

	public void setSupplierInfo(MdmSupplierVO supplierInfo) {
		this.supplierInfo = supplierInfo;
	}
	
	
}
