package com.saic.ndms.sdi.maindata.dao;

import com.saic.ndms.sdi.maindata.po.MdmSupplierPO;

public interface MdmSupplierDao {
	/**
	 * 
	 * @remark:新增或者修改供应商信息
	 * @author sangdeliang
	 * @date 2020年3月9日
	 */
	public void mergeSupplierInfo(MdmSupplierPO supplierDTO);

	/**
	 * 
	 * @remark:删除供应商信息
	 * @author sangdeliang
	 * @date 2020年3月9日
	 */
	public void deleteSupplierInfo(String supplierDuns);
	
	/**
	 * 根据供应商DUNS获取数据库中已经存在
	 * @param supplierDuns
	 * @return
	 */
	public Long findSupplierCounts();
}
