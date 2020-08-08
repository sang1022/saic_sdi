

package com.saic.ndms.sdi.common.dto;

/**
 *
 * @author LiuJun 
 * @description userDTO
 * @date 2017年10月16日
 */
public class FLowCommonUserDTO {

	private Long userId;
	private String account;
	private Integer accountType;
	private String userName;
	private String email;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Integer getAccountType() {
		return accountType;
	}

	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
