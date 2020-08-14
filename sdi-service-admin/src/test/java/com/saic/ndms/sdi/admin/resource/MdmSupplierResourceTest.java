
package com.saic.ndms.sdi.admin.resource;

import static org.junit.Assert.assertEquals;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;

import com.saic.ndms.sdi.admin.BaseJunit4Test;
import com.saic.ndms.sdi.admin.dto.MdmSupplierDto;
import com.saic.ndms.sdi.admin.dto.MdmSupplierReqDTO;

/**
 * @author sangdeliang
 * @description 相关单元测试DEMO
 * @date 2020年8月5日
 */
public class MdmSupplierResourceTest extends BaseJunit4Test {

    @Value("${local.server.port}")
    private int                 port;

    private static final String ROOT_PATH_ADMIN      = "/sdi4admin/rest/demo";

    /**
     * @author sangdeliang
     * @description 合并供应商单元测试
     * @date 2020年8月5日
     */
    @Test
    public void testMergeHrmEmplInfo() {
    	MdmSupplierReqDTO supplierReqDto = new MdmSupplierReqDTO();
    	MdmSupplierDto supplierBizDto  = new MdmSupplierDto();
    	supplierReqDto.setActionType("testActionType");
    	supplierReqDto.setDataType("testDataType");
    	supplierReqDto.setTransactionID("testTransactionId");
    	
    	supplierReqDto.setSupplierInfo(supplierBizDto);
    	supplierBizDto.setSupplierDuns("1001");
    	supplierBizDto.setSupplierName("testSuppName");
    	supplierBizDto.setSupplierEngName("testSupplierEngName");
    	supplierBizDto.setSupplierAddress("testSupplierAddress");
    	supplierBizDto.setIsOverSeasSupplier("1");
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:" + port + ROOT_PATH_ADMIN + "/supplier");
        Response response = target.request(MediaType.APPLICATION_JSON).headers(BaseJunit4Test.getMockHeaders4test()).accept(MediaType.APPLICATION_JSON).put(Entity.entity(supplierReqDto,
                                                                                                                                                                           MediaType.APPLICATION_JSON));
        assertEquals(true, (Status.OK.getStatusCode() == response.getStatus()));
    }

    
    /**
     * 删除供应商的单元测试
     * @remark
     * @author sangdeliang
     * @date 2020年8月5日
     */
    @Test
    public void testDeleteHrmEmplInfo() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:" + port + ROOT_PATH_ADMIN + "/supplier/1001");
        Response response = target.request(MediaType.APPLICATION_JSON).headers(BaseJunit4Test.getMockHeaders4test()).accept(MediaType.APPLICATION_JSON).delete();
        assertEquals(true, (Status.OK.getStatusCode() == response.getStatus()));
    }

    
    



}
