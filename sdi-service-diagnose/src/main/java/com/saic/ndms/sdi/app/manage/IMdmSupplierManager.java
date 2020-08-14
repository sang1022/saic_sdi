package com.saic.ndms.sdi.app.manage;

import com.saic.ndms.sdi.app.dto.MdmSupplierReqDTO;

/**
 * MANAGER接口
 * @author Administrator
 *
 */
public interface IMdmSupplierManager {
	/**
	 * 
	 * @remark:新增或者修改供应商信息
	 * @author sangdeliang
	 * @date 2020年7月5日
	 */
	public void mergeSupplierInfo(MdmSupplierReqDTO supplierDTO);
	
	/**
	 * 
	 * @remark:删除供应商信息
	 * @author sangdeliang
	 * @date 2020年7月5日
	 */
	public void deleteSupplierInfo(String supplierDuns);
}
