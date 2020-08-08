
package com.saic.ndms.sdi.common.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
*
* @author LiuJun
* @description 流程所有者DTO
* @date 2017年10月13日
*/

public class FlowCommonTaskOwnerDTO extends BaseDTO {
    private static final long serialVersionUID = 5419281986333893121L;

    /**
     * 主键ID
     */
    private Long taskOwnerId;

    /**
     * 任务所有者ID
     */
    private String ownerId;

    /**
     * 代理人ID
     */
    private String agentId;

    /**
     * 处理状态
     */
    private Integer handleStatus;

    /**
     * 任务实例ID
     */
    private Long taskRunId;

    /**
     * 完成者ID
     */
    private String finisherId;

    /**
     * 任务审核意见或评论
     */
    private String comments;

    private String appoverPersonalName;// 审批人名称

    private String handleStatusName;// 处理状态中文名称

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp appoverDate;// 审批时间

    private String appoverTypeName;// 审批类型名称，单项变更审批、协议审批

    private String approveRoleName;// 审批角色名称

    public Long getTaskOwnerId() {
        return taskOwnerId;
    }

    public void setTaskOwnerId(Long taskOwnerId) {
        this.taskOwnerId = taskOwnerId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public Integer getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(Integer handleStatus) {
        this.handleStatus = handleStatus;
    }

    public Long getTaskRunId() {
        return taskRunId;
    }

    public void setTaskRunId(Long taskRunId) {
        this.taskRunId = taskRunId;
    }

    public String getFinisherId() {
        return finisherId;
    }

    public void setFinisherId(String finisherId) {
        this.finisherId = finisherId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getAppoverPersonalName() {
        return appoverPersonalName;
    }

    public void setAppoverPersonalName(String appoverPersonalName) {
        this.appoverPersonalName = appoverPersonalName;
    }

    public String getHandleStatusName() {
        return handleStatusName;
    }

    public void setHandleStatusName(String handleStatusName) {
        this.handleStatusName = handleStatusName;
    }

    public Timestamp getAppoverDate() {
        return appoverDate;
    }

    public void setAppoverDate(Timestamp appoverDate) {
        this.appoverDate = appoverDate;
    }

    public String getAppoverTypeName() {
        return appoverTypeName;
    }

    public void setAppoverTypeName(String appoverTypeName) {
        this.appoverTypeName = appoverTypeName;
    }

    public String getApproveRoleName() {
        return approveRoleName;
    }

    public void setApproveRoleName(String approveRoleName) {
        this.approveRoleName = approveRoleName;
    }

}
