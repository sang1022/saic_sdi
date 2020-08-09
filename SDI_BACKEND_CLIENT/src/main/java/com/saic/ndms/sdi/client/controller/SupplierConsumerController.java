package com.saic.ndms.sdi.client.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.saic.ndms.sdi.client.dto.MdmSupplierReqDTO;
import com.saic.ndms.sdi.client.service.FeignSdiAdminService;
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
public class SupplierConsumerController {
	private static final Log logger = LogFactory.getLog(SupplierConsumerController.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
	private FeignSdiAdminService feignSdiAdminService;
	
	@RequestMapping(value="/test", method=RequestMethod.GET, produces="application/json;charset=UTF-8")
    public String test(HttpServletRequest request,HttpServletResponse response) {
        return "hello beauty sdi system for client";

    }
	
	@RequestMapping(value="/supplier", method=RequestMethod.POST, produces="application/json;charset=UTF-8")
    public @ResponseBody ResultMessageDTO mergeSupplierInfo(@RequestBody MdmSupplierReqDTO supplierDTO, HttpServletRequest request,HttpServletResponse response) {
        try {
            logger.info("mergeSupplierInfo="+supplierDTO.getActionType());
            
            //使用最简单的POST调用
            logger.info("normol post begin");
            String remark = "normalPost";
            restTemplate.postForEntity("http://127.0.0.1:8081/sdi4admin/demo/supplier/" + remark, supplierDTO, MdmSupplierReqDTO.class);
            logger.info("normol post end");
            
            //使用discoveryClient调用
            logger.info("discoveryClient post begin");
            remark = "discoveryClientPost";
            List<ServiceInstance> instanceList = discoveryClient.getInstances("sdi4admin");
            if (instanceList == null || instanceList.size() == 0) {
            	//抛出自定义异常(nacos服务为空)
            }
            ServiceInstance instance = instanceList.get(0);
            String host = instance.getHost();
            int port = instance.getPort();
            String nacosUrl ="http://" + host +  ":" + port + "/sdi4admin/demo/supplier/" + remark;
            logger.info(nacosUrl);
            restTemplate.postForEntity(nacosUrl, supplierDTO, MdmSupplierReqDTO.class);
            logger.info("discoveryClient post end");
            
            //使用ribbon结合discoveryClient调用
//            logger.info("ribbon post begin");
//            String ribbonUrl ="http://sdi4admin/sdi4admin/demo/supplier";
//            restTemplate.postForEntity(ribbonUrl, supplierDTO, MdmSupplierReqDTO.class);
//            logger.info("ribbon post end");
            
            //使用feign结合discoveryClient调用
            remark = "feign post";
            logger.info("feign post begin");
            feignSdiAdminService.mergeSupplier(supplierDTO, remark);
            logger.info("feign post end");
            
            System.out.println();
        } catch (Exception ex) {
            logger.info(ex.getMessage(),ex);

            response.setStatus(CommonAppConstants.HTTP_RESPONSE_ERROR_PRECONDITION_FAILED);
            return AppCommonUtils.setEsbResult(CommonAppConstants.HTTP_RESPONSE_ERROR_PRECONDITION_FAILED,
                                                 ex.getMessage());
        }

        return AppCommonUtils.setEsbResult(CommonAppConstants.HTTP_RESPONSE_SUCCESS, "mergeStore success");
    }

	
}
