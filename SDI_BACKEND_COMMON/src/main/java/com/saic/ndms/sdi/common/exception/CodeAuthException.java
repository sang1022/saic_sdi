
package com.saic.ndms.sdi.common.exception;

/**
 * auth ex to return 401
*
* @author s86yv7
* TODO description
* @date 2016年4月21日
 */
public class CodeAuthException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public CodeAuthException(String msg) {
		super(msg);
	}

	public CodeAuthException(String msg, Throwable ex) {
		super(msg, ex);
	}

}
