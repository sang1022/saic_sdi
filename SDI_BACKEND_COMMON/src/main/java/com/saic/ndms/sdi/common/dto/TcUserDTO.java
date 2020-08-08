package com.saic.ndms.sdi.common.dto;

import java.util.Date;

import com.saic.ndms.sdi.common.dto.BaseDTO;

public class TcUserDTO extends BaseDTO{
    /**
     * 
     */
    private static final long serialVersionUID = -8525691702673514933L;

    private Long userId;

    private String customerId;

    private String customerCode;

    private String userAccount;

    private String portalUser;

    private String userName;

    private Integer gender;

    private String handPhone;

    private String phone;

    private String email;

    private Date birthday;

    private String addr;

    private String zipCode;

    private Integer userStatus;

    private Integer userType;

    private Date lastsigninTime;

    private Short portalUserStatus;

    private Date handlingTime;

    private String memo;

    private String password;

    
    public Long getUserId() {
        return userId;
    }

    
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    
    public String getCustomerId() {
        return customerId;
    }

    
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    
    public String getCustomerCode() {
        return customerCode;
    }

    
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    
    public String getUserAccount() {
        return userAccount;
    }

    
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    
    public String getPortalUser() {
        return portalUser;
    }

    
    public void setPortalUser(String portalUser) {
        this.portalUser = portalUser;
    }

    
    public String getUserName() {
        return userName;
    }

    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    
    public Integer getGender() {
        return gender;
    }

    
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    
    public String getHandPhone() {
        return handPhone;
    }

    
    public void setHandPhone(String handPhone) {
        this.handPhone = handPhone;
    }

    
    public String getPhone() {
        return phone;
    }

    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public Date getBirthday() {
        return birthday;
    }

    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    
    public String getAddr() {
        return addr;
    }

    
    public void setAddr(String addr) {
        this.addr = addr;
    }

    
    public String getZipCode() {
        return zipCode;
    }

    
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    
    public Integer getUserStatus() {
        return userStatus;
    }

    
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    
    public Integer getUserType() {
        return userType;
    }

    
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    
    public Date getLastsigninTime() {
        return lastsigninTime;
    }

    
    public void setLastsigninTime(Date lastsigninTime) {
        this.lastsigninTime = lastsigninTime;
    }

    
    public Short getPortalUserStatus() {
        return portalUserStatus;
    }

    
    public void setPortalUserStatus(Short portalUserStatus) {
        this.portalUserStatus = portalUserStatus;
    }

    
    public Date getHandlingTime() {
        return handlingTime;
    }

    
    public void setHandlingTime(Date handlingTime) {
        this.handlingTime = handlingTime;
    }

    
    public String getMemo() {
        return memo;
    }

    
    public void setMemo(String memo) {
        this.memo = memo;
    }

    
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }
    
    

}
