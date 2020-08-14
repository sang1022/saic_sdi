package com.saic.ndms.sdi.client.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saic.ndms.sdi.client.dao.MdmSupplierDao;
import com.saic.ndms.sdi.client.dto.MdmSupplierDto;
import com.saic.ndms.sdi.client.dto.MdmSupplierReqDTO;
import com.saic.ndms.sdi.client.po.MdmSupplierPO;
import com.saic.ndms.sdi.client.service.IMdmSupplierService;

@Service
public class MdmSupplierServiceImpl implements IMdmSupplierService {

	@Autowired
	private MdmSupplierDao supplierDao;

	/**
	 * 
	 * @remark:新增或者修改供应商信息
	 * @author sangdeliang
	 * @date 2020年3月9日
	 */
	@Override
	public void mergeSupplierInfo(MdmSupplierReqDTO supplierDTO) {
		if (supplierDTO != null && supplierDTO.getSupplierInfo() != null) {
			MdmSupplierDto mdmSupplier = supplierDTO.getSupplierInfo();
			String supplierDuns = mdmSupplier.getSupplierDuns();

			MdmSupplierPO supplierPo = new MdmSupplierPO();
			supplierPo.setSupplierDuns(supplierDuns);
			supplierPo.setSupplierName(mdmSupplier.getSupplierName());
			supplierPo.setSupplierAddress(mdmSupplier.getSupplierAddress());
			supplierDao.mergeSupplierInfo(supplierPo);

		}

	}

	/**
	 * 
	 * @remark:删除供应商信息
	 * @author sangdeliang
	 * @date 2020年3月9日
	 */
	@Override
	public void deleteSupplierInfo(String supplierDuns) {
		supplierDao.deleteSupplierInfo(supplierDuns);

	}

}
