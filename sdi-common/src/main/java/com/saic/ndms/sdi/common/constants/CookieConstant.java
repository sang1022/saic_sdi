package com.saic.ndms.sdi.common.constants;

public class CookieConstant {
	/** Cookie键: UserId */
	public static final String COOKIE_USER_ID = "COOKIE_SCS_USER_ID";
	/** Cookie键: UserType */
	public static final String COOKIE_USER_TYPE = "COOKIE_SCS_USER_TYPE";
	/** Cookie键: account */
	public static final String COOKIE_USER_ACCOUNT = "COOKIE_SCS_USER_ACCOUNT";
	/** Cookie键: account num */
	public static final String COOKIE_USER_NAME = "COOKIE_SCS_USER_NAME";
	
	/** Cookie键: positionId */
	public static final String COOKIE_POSITION_ID = "COOKIE_SCS_POSITION_ID";
	/** Cookie键: positionId */
	public static final String COOKIE_POSITION_CODE = "COOKIE_SCS_POSITION_CODE";

	/** Cookie键: roleId-数组结构，以#@#分分隔 */ 
	public static final String COOKIE_ROLE_ID = "COOKIE_SCS_ROLE_ID";
	/** Cookie键: roleCode-数组结构，以#@#分分隔 */
	public static final String COOKIE_ROLE_CODE = "COOKIE_SCS_ROLE_CODE";
	
	//过期时间
	public static final String COOKIE_EXPIRED = "COOKIE_SECU";
	
	 //COOKIE中的有效时间为4小时，4小时之后，该COOKIE会失效。用户登录之后，有效时间会增加4小时，重新生成COOKIE
	 public static final Long expiredTime = 4 * 60 * 60 * 1000L;
	 
	 public static final String INVALID_USER = "INVALID";

}
