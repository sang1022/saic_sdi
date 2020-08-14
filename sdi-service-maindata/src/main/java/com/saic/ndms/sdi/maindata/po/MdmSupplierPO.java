package com.saic.ndms.sdi.maindata.po;

/**
 * 
 * @author sangdeliang
 * @date 2020年3月9日
 * @remark 供应商信息对应数据库的PO
 */
public class MdmSupplierPO {
	//供应商ID，自增长序列
	private Long supplierId;
	//供应商DUNS号，业务唯一主键
	private String supplierDuns;
	//供应商名称
	private String supplierName;
	//供应商英文名称
	private String supplierEngName;
	//供应商地址
	private String supplierAddress;
	//供应商是否海外
	private String isOverSeasSupplier;
	public Long getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierDuns() {
		return supplierDuns;
	}
	public void setSupplierDuns(String supplierDuns) {
		this.supplierDuns = supplierDuns;
	}
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
