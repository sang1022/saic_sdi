/**
* Copyright 2019 SAIC General Motors Corporation Ltd. All Rights Reserved.
*
* This software is published under the terms of the SGM Software
* License version 1.0, a copy of which has been included with this
* distribution in the LICENSE.txt file.
*
* @Project Name : flag.agent
*
* @File name : CommonAgentUtils.java
*
* @Author : SANGDELIANG
*
* @Date : 2019年7月11日
*
----------------------------------------------------------------------------------
*     Date       Who       Version     Comments
* 1. 2019年7月11日    SANGDELIANG    1.0
*
*
*
*
----------------------------------------------------------------------------------
*/

package com.saic.ndms.sdi.admin.utils;

import javax.ws.rs.core.Response;

import com.saic.ndms.sdi.admin.dto.ResultMessageDTO;
import com.saic.ndms.sdi.common.utils.SerializeUtils;

/**
 * @author SANGDELIANG 
 * @description CommonAgentUtils
 * @date 2020年7月11日
 */
public class CommonAdminUtils {
    
    public static final String APPLICATION_JSON_UTF8 = "application/json;charset=UTF-8";


    /**
     * @description 描述:java对象返回Json格式错误消息
     * 
     * @return
     */
    public static String getJsonMessage(String code, String msg) {
        ResultMessageDTO errorMsgVO = new ResultMessageDTO();
        errorMsgVO.setCode(code);
        errorMsgVO.setMsg(msg);
        return SerializeUtils.serialize(errorMsgVO);
    }

    /**
     * @description 描述:java对象返回Json格式错误消息
     * @return
     */
    public static String getJsonMessage(int code, String msg) {
        return getJsonMessage(String.valueOf(code), msg);
    }
    
    
    /**
    *
    * @author 
    * @description esb返回结果
    * @date 2020年7月11日
    * @param code
    * @param msg
    * @return
    */
    public static Response setEsbResult(int code, String msg){
        ResultMessageDTO resultMessageDTO = new ResultMessageDTO();
        resultMessageDTO.setCode(String.valueOf(code));
        resultMessageDTO.setMsg(msg);
        
        return Response.status(code).entity(resultMessageDTO).type(APPLICATION_JSON_UTF8).build();

    }
    
   

}
