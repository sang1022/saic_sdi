package com.saic.ndms.sdi.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.saic.ndms.sdi.admin.dto.MdmSupplierReqDTO;
import com.saic.ndms.sdi.admin.service.IMdmSupplierService;
import com.saic.ndms.sdi.common.constants.AppCommonUtils;
import com.saic.ndms.sdi.common.constants.CommonAppConstants;
import com.saic.ndms.sdi.common.dto.ResultMessageDTO;

/**
 * 
 * @author sangdeliang
 * @date 2020年3月9日
 * @remark mdm供应商接口
 */
@RestController
@RequestMapping("/demo")
public class SupplierProviderController {
	private static final Log logger = LogFactory.getLog(SupplierProviderController.class);
	
	@Autowired
	private IMdmSupplierService mdmSupplierService;
	
	//@SentinelResource(value = "test",blockHandler = "exceptionHandler")
	@RequestMapping(value="/test", method=RequestMethod.GET, produces="application/json;charset=UTF-8")
    public String test(HttpServletRequest request,HttpServletResponse response) {
        return "hello beauty sdi system";

    }
	
	//@SentinelResource(value = "mergeSupplierInfo",blockHandler = "exceptionHandler")
	@RequestMapping(value="/supplier/{remark}", method=RequestMethod.POST, produces="application/json;charset=UTF-8")
    public @ResponseBody ResultMessageDTO  mergeSupplierInfo(@RequestBody MdmSupplierReqDTO supplierDTO,
    		@PathVariable String remark,
    		HttpServletRequest request,
    		HttpServletResponse response) {
        try {
        	logger.info("MERGER BEGIN" + remark);
            mdmSupplierService.mergeSupplierInfo(supplierDTO);
            logger.info("MERGER END" + remark);
        } catch (Exception ex) {
            logger.info(ex.getMessage(),ex);

            response.setStatus(CommonAppConstants.HTTP_RESPONSE_ERROR_PRECONDITION_FAILED);
            return AppCommonUtils.setEsbResult(CommonAppConstants.HTTP_RESPONSE_ERROR_PRECONDITION_FAILED,
                                                 ex.getMessage());
        }

        return AppCommonUtils.setEsbResult(CommonAppConstants.HTTP_RESPONSE_SUCCESS, "mergeStore success");

    }
	
	@RequestMapping(value="/supplier/{supplierDuns}", method=RequestMethod.DELETE, produces="application/json;charset=UTF-8")
    public @ResponseBody ResultMessageDTO deleteSupplierInfo(@PathVariable String supplierDuns,
    		HttpServletRequest request,
    		HttpServletResponse response) {
        try {
        	mdmSupplierService.deleteSupplierInfo(supplierDuns);
        	System.out.println();
        } catch (Exception ex) {
            logger.info(ex.getMessage(),ex);
            response.setStatus(CommonAppConstants.HTTP_RESPONSE_UNKNOWN_ERROR);
            return AppCommonUtils.setEsbResult(CommonAppConstants.HTTP_RESPONSE_UNKNOWN_ERROR, ex.getMessage());
        }

        return AppCommonUtils.setEsbResult(CommonAppConstants.HTTP_RESPONSE_SUCCESS,
        		CommonAppConstants.RESULT_DELETE_OK);
    }
	
	
}
