package com.saic.ndms.sdi.report.manage.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saic.ndms.sdi.common.config.BaseTransaction;
import com.saic.ndms.sdi.report.dto.MdmSupplierReqDTO;
import com.saic.ndms.sdi.report.manage.IMdmSupplierManager;
import com.saic.ndms.sdi.report.service.IMdmSupplierService;

/**
 * manage层：控制事务，可以引用多个SERVICE
 * @author sangdeliang
 *
 */
@Service
@BaseTransaction
public class MdmSupplierManagerImpl implements IMdmSupplierManager {

	@Autowired
	private IMdmSupplierService mdmSupplierService;

	/**
	 * 
	 * @remark:新增或者修改供应商信息
	 * @author sangdeliang
	 * @date 2020年3月9日
	 */
	@Override
	public void mergeSupplierInfo(MdmSupplierReqDTO supplierDTO) {
		mdmSupplierService.mergeSupplierInfo(supplierDTO);

	}

	/**
	 * 
	 * @remark:删除供应商信息
	 * @author sangdeliang
	 * @date 2020年3月9日
	 */
	@Override
	public void deleteSupplierInfo(String supplierDuns) {
		mdmSupplierService.deleteSupplierInfo(supplierDuns);

	}

}
