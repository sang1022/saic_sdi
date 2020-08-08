package com.saic.ndms.sdi.admin.service;

import com.saic.ndms.sdi.admin.dto.MdmSupplierReqDTO;

public interface IMdmSupplierService {
	/**
	 * 
	 * @remark:新增或者修改供应商信息
	 * @author sangdeliang
	 * @date 2020年3月9日
	 */
	public void mergeSupplierInfo(MdmSupplierReqDTO supplierDTO);
	
	/**
	 * 
	 * @remark:删除供应商信息
	 * @author sangdeliang
	 * @date 2020年3月9日
	 */
	public void deleteSupplierInfo(String supplierDuns);
}
