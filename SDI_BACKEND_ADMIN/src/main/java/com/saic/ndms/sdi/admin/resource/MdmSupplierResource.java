package com.saic.ndms.sdi.admin.resource;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.saic.ndms.sdi.admin.config.CommonAdminConstants;
import com.saic.ndms.sdi.admin.dto.MdmSupplierReqDTO;
import com.saic.ndms.sdi.admin.service.IMdmSupplierService;
import com.saic.ndms.sdi.admin.utils.CommonAdminUtils;
import com.saic.ndms.sdi.common.utils.SerializeUtils;

/**
 * 
 * @author sangdeliang
 * @date 2020年3月9日
 * @remark mdm供应商接口
 */
@Path(value = "/demo")
public class MdmSupplierResource {
	private static final Log logger = LogFactory.getLog(MdmSupplierResource.class);
	
	@Autowired
	private IMdmSupplierService mdmSupplierService;
	
	@GET
    @Path("/test")
    public String test(String supplierJson,
                                     @Context HttpServletRequest request, @Context HttpServletResponse response) {
        return "hello beauty sdi system";

    }
	
	@PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/supplier")
    public Response mergeSupplierInfo(String supplierJson,
                                     @Context HttpServletRequest request, @Context HttpServletResponse response) {
        try {
            logger.info("mergeSupplierInfo="+supplierJson);
            MdmSupplierReqDTO supplierDTO = SerializeUtils.deserialize(supplierJson, MdmSupplierReqDTO.class);
            mdmSupplierService.mergeSupplierInfo(supplierDTO);
            System.out.println();
        } catch (Exception ex) {
            logger.info(ex.getMessage(),ex);

            response.setStatus(CommonAdminConstants.HTTP_RESPONSE_ERROR_PRECONDITION_FAILED);
            return CommonAdminUtils.setEsbResult(CommonAdminConstants.HTTP_RESPONSE_ERROR_PRECONDITION_FAILED,
                                                 ex.getMessage());
        }

        return CommonAdminUtils.setEsbResult(CommonAdminConstants.HTTP_RESPONSE_SUCCESS, "mergeStore success");

    }
	
    @DELETE
    @Path("/supplier/{supplierDuns}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteSupplierInfo(@PathParam("supplierDuns") String supplierDuns,
                                           @Context HttpServletRequest request, @Context HttpServletResponse response) {
        try {
        	mdmSupplierService.deleteSupplierInfo(supplierDuns);
        	System.out.println();
        } catch (Exception ex) {
            logger.info(ex.getMessage(),ex);
            response.setStatus(CommonAdminConstants.HTTP_RESPONSE_UNKNOWN_ERROR);
            return CommonAdminUtils.setEsbResult(CommonAdminConstants.HTTP_RESPONSE_UNKNOWN_ERROR, ex.getMessage());
        }

        return CommonAdminUtils.setEsbResult(CommonAdminConstants.HTTP_RESPONSE_SUCCESS,
                                             CommonAdminConstants.RESULT_DELETE_OK);
    }
	
	
}
