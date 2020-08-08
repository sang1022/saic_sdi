
package com.saic.ndms.sdi.common.dto;

import java.io.Serializable;

/**
*
* @author LiuJun
* 系统异常DTO
* @date 2017年12月13日
*/
public class ExMessageDTO implements Serializable{

    private static final long serialVersionUID = -2172008320135606736L;
    
    private String errorCode;
    private String errorMsg;
    private String remind;
    private Integer responseCode;
    
    public String getErrorCode() {
        return errorCode;
    }
    
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    
    public String getErrorMsg() {
        return errorMsg;
    }
    
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
    
    public String getRemind() {
        return remind;
    }
    
    public void setRemind(String remind) {
        this.remind = remind;
    }
    
    public Integer getResponseCode() {
        return responseCode;
    }
    
    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }
    
    
    

}
