
package com.saic.ndms.sdi.common.exception;

/**
 * auth ex to return 401
*
* @author s86yv7
* TODO description
* @date 2016年4月21日
 */
public class AuthException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public AuthException(String msg) {
		super(msg);
	}

	public AuthException(String msg, Throwable ex) {
		super(msg, ex);
	}

}
