package com.saic.ndms.sdi.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则验证工具类
 * 
 * @author duyimin
 *
 */
public class MatcherUtil {
	/**
	 * 
	 * @param data
	 *            校验数据
	 * @param regex
	 *            正则表达式
	 * @return
	 */
	public static boolean checkData(String data, String regex) {
		if (CommonsUtils.isEmpty(data)) {
			return false;
		}
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(data);
		return m.matches();
	}

}
