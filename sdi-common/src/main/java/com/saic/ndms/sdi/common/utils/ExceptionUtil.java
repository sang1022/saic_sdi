package com.saic.ndms.sdi.common.utils;

public class ExceptionUtil {

	/**
	 * @Description: 普通阻塞错误
	 * @param:
	 * @return:
	 * @author: fanjc
	 * @Date: 2019/5/10
	 */
	public static String exceptionHandler(Exception ex) {
		System.err.println("错误发生: " + ex.getClass().getCanonicalName());
		return "error";
	}
}
