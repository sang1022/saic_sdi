
package com.saic.ndms.sdi.common.dto;


/**
*
* @author LiuJun
* @description 流程定义DTO
* @date 2017年10月13日
*/
public class FlowCommonProccessDefDTO extends BaseDTO{
    private static final long serialVersionUID = -8381003061247200311L;

    /**
     * 流程定义ID
     */
    private Long procDefId;

    /**
     * 流程定义名称
     */
    private String procDefName;

    /**
     * 流程定义编码，所有流程 流程编码是唯一的
     */
    private String procCode;

    /**
     * 备注
     */
    private String procRemark;

    /**
     * 是否可编辑
     */
    private Long isEditable;

    /**
     * 流程定义状态
     */
    private Long procDefStatus;

    /**
     * 流程定义版本号
     */
    private String procVersion;

    public Long getProcDefId() {
        return procDefId;
    }

    public void setProcDefId(Long procDefId) {
        this.procDefId = procDefId;
    }

    public String getProcDefName() {
        return procDefName;
    }

    public void setProcDefName(String procDefName) {
        this.procDefName = procDefName;
    }

    public String getProcCode() {
        return procCode;
    }

    public void setProcCode(String procCode) {
        this.procCode = procCode;
    }

    public String getProcRemark() {
        return procRemark;
    }

    public void setProcRemark(String procRemark) {
        this.procRemark = procRemark;
    }

    public Long getIsEditable() {
        return isEditable;
    }

    public void setIsEditable(Long isEditable) {
        this.isEditable = isEditable;
    }

    public Long getProcDefStatus() {
        return procDefStatus;
    }

    public void setProcDefStatus(Long procDefStatus) {
        this.procDefStatus = procDefStatus;
    }

    public String getProcVersion() {
        return procVersion;
    }

    public void setProcVersion(String procVersion) {
        this.procVersion = procVersion;
    }

}
