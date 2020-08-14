package com.saic.ndms.sdi.client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.saic.ndms.sdi.client.dto.MdmSupplierReqDTO;

@FeignClient(value="sdi-service-admin")
public interface FeignSdiAdminService {
	@RequestMapping("/sdi4admin/demo/supplier/{remark}")
	public void mergeSupplier(@RequestBody MdmSupplierReqDTO supplierDTO, @RequestParam String remark);
	
}
