package com.saic.ndms.sdi.common.exception;

/**
 * Created by LuZhen on 2015-09-29.
 * Service层异常统一封装的程序运行异常，不做异常捕捉与处理
 */
public class ScsAppException extends  RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3670997804305708052L;

	public ScsAppException(String msg,Throwable cause) {
        super(msg,cause);
    }

    public ScsAppException(String msg) {
        super(msg);
    }
}
