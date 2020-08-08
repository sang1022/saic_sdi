package com.saic.ndms.sdi.common.exception;

/**
 * Created by LuZhen on 2015-09-29.
 * Service层异常统一封装的业务异常，一般无法直接处理
 */
public class ScsBizException extends  RuntimeException{

	private static final long serialVersionUID = -6477573700601292423L;

	public ScsBizException(String msg,Throwable t) {
        super(msg,t);
    }
    
    public ScsBizException(String msg) {
        super(msg);
    }   
    
}
