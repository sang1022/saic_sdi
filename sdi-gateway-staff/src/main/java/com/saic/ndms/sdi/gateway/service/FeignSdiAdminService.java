package com.saic.ndms.sdi.gateway.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.saic.ndms.sdi.gateway.vo.MdmSupplierReqVO;

@FeignClient(value="sdi4admin")
public interface FeignSdiAdminService {
	@RequestMapping("/sdi4admin/demo/supplier/{remark}")
	public void mergeSupplier(@RequestBody MdmSupplierReqVO supplierDTO, @RequestParam String remark);
	
}
