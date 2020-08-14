
package com.saic.ndms.sdi.common.exception;

/**
 * 
 * @author 
 * @description 工具异常类
 * @date 2017年10月25日
 */

public class UtilException extends RuntimeException {


    private static final long serialVersionUID = -5620134357529456759L;

    public UtilException(Exception e){
        super(e);
    }

    public UtilException(String msg){
        super(msg);
    }

    public UtilException(String msg, Exception e){
        super(msg, e);
    }

}
