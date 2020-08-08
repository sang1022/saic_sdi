
package com.saic.ndms.sdi.common.utils;

import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saic.ndms.sdi.common.constants.CookieConstant;
import com.saic.ndms.sdi.common.utils.CookieSecurityUtil;

public class CookieUtil {

    public static void setCookieInfo(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                /*
                 * cookie.setSecure(true); cookie.setHttpOnly(true);
                 */
                String maxageStr = "";
                if (cookie.getMaxAge() == 0) {
                    maxageStr = "Expires=Thu, 01 Jan 1970 00:00:00 GMT;";
                } else if (cookie.getMaxAge() > 0) {
                    maxageStr = "Max-Age=" + cookie.getMaxAge() + ";";
                }

                String domainStr = "domain=.saic-gm.com;";
                String pathStr = "path=/;";

                response.addHeader("Set-Cookie", cookie.getName() + "=" + cookie.getValue() + ";" + maxageStr
                                                 + domainStr + pathStr + "secure;HttpOnly;");
            }
        }
    }

    public static Long getUserId(HttpServletRequest request) throws Exception {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(CookieConstant.COOKIE_USER_ID)) {
                    return Long.parseLong(CookieSecurityUtil.decrypt(cookie.getValue()));
                }
            }
        }
        return null;
    }

    public static String getUserName(HttpServletRequest request) throws Exception {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(CookieConstant.COOKIE_USER_NAME)) {
                    return String.valueOf(CookieSecurityUtil.decrypt(cookie.getValue()));
                }
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
    	try {
    		System.out.println(new Date(System.currentTimeMillis()));
    		System.out.println(new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000));
    		System.out.println(System.currentTimeMillis() + 24 * 60 * 60 * 1000);
			System.out.println(CookieSecurityUtil.decrypt("2BCED1FE4A44E400C5C1F2E6A56819B42943AFA6AF84F2C289DCE37E4D3F0DA7"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public static String getUserAccount(HttpServletRequest request) throws Exception {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(CookieConstant.COOKIE_USER_ACCOUNT)) {
                    return String.valueOf(CookieSecurityUtil.decrypt(cookie.getValue()));
                }
            }
        }
        return null;
    }

    public static String getRoleCodes(HttpServletRequest request) throws Exception {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(CookieConstant.COOKIE_ROLE_CODE)) {
                    return String.valueOf(CookieSecurityUtil.decrypt(cookie.getValue()));
                }
            }
        }
        return null;
    }

    public static Long getUserType(HttpServletRequest request) throws Exception {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(CookieConstant.COOKIE_USER_TYPE)) {
                    return Long.parseLong(CookieSecurityUtil.decrypt(cookie.getValue()));
                }
            }
        }
        return null;
    }
    
    public static Long getExpiredTime(HttpServletRequest request) throws Exception {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("COOKIE_EXPIRED")) {
                    return Long.parseLong(CookieSecurityUtil.decrypt(cookie.getValue()));
                }
            }
        }
        return null;
    }
    

    public static void getCleanCookie(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 清空Cookie
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                Cookie newCookie = new Cookie(cookie.getName(), null);
                newCookie.setPath("/scs");
                newCookie.setMaxAge(0);
                response.addCookie(newCookie);
            }
        }
    }

    /**
     * 描述:设置Cookie secure属性
     * 
     * @param cookie
     * @param isSecureFlag
     * @throws Exception
     */
    public static void setCookieSecure(Cookie cookie, boolean isSecureFlag) throws Exception {

        if (cookie != null && isSecureFlag) {
            cookie.setSecure(true);
        }
    }
}
