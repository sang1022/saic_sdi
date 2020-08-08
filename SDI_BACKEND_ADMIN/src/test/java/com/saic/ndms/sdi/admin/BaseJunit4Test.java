
package com.saic.ndms.sdi.admin;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



/**
*
* @author sangdeliang
* BaseJunit4Test
* @date 2020年3月19日
*/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ScsAdminApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext(methodMode  = DirtiesContext.MethodMode.BEFORE_METHOD)
@ActiveProfiles("test")
@Ignore
public class BaseJunit4Test {

    private static final MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();


    //session.setGroupId(httpServletRequest.getHeader(AuthConstant.DEALER_CODE));
    //session.setPositionId(httpServletRequest.getHeader(AuthConstant.POSITION_CODE));
    //session.setUserId(httpServletRequest.getHeader(AuthConstant.USER_CODE));
    //service.setTrackId(httpServletRequest.getHeader(AuthConstant.TRACK_ID));
    //service.setResource(httpServletRequest.getHeader(AuthConstant.RESOURCE_CODE));

    static {
//        headers.add(AuthConstant.APP_ID,RestApplication.APP);
//        headers.add(AuthConstant.DEALER_CODE,"2100005");
//        headers.add(AuthConstant.POSITION_CODE,"SO_2999");
//        headers.add(AuthConstant.USER_CODE,"test123456");
//        headers.add(AuthConstant.TRACK_ID, UUID.randomUUID().toString().replaceAll("-",""));
//        headers.add(AuthConstant.RESOURCE_CODE, "junit");
//        
//        headers.add("x-track-code", "flag");
//        headers.add("x-resource-code", "x-resource-code");
//        headers.add("x-app-code", "flag4admin");
//        headers.add("x-position-code", "D_PO_1037");
//        headers.add("x-dealer-code", "CD1000");
//        headers.add("x-user-code", "d03fqf");

    }


    public static MultivaluedMap<String, Object> getMockHeaders4test(){
        return headers;
    }

}
