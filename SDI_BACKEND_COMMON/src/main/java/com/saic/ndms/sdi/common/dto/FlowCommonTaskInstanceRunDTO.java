
package com.saic.ndms.sdi.common.dto;

import java.util.Date;

/**
 * @author LiuJun 
 * @description 流程任务实例DTO
 * @date 2017年10月13日
 */

public class FlowCommonTaskInstanceRunDTO extends BaseDTO {

    private static final long serialVersionUID = -7394147772449685332L;

    /**
     * 任务实例ID
     */
    private Long taskRunId;

    /**
     * 流程定义主键
     */
    private Long procDefId;

    /**
     * 流程定义版本号
     */
    private String procDefVersion;

    /**
     * 流程实例主键
     */
    private Long procInstId;

    /**
     * 节点定义主键
     */
    private Long nodeDefId;

    /**
     * 任务实例主题
     */
    private String taskSubject;

    /**
     * 父任务实例ID
     */
    private Long preTaskId;

    /**
     * 任务实例名称
     */
    private String taskName;

    /**
     * 任务开始时间
     */
    private Date receiveTime;

    /**
     * 计划完成时间
     */
    private Date expectTime;

    /**
     * 处理期限
     */
    private Long offsetDate;

    /**
     * 任务代理状态
     */
    private Long agentStatus;

    /**
     * 业务数据主键值
     */
    private Long businessId;

    /**
     * 处理页面地址ID
     */
    private Long nodeUrlId;

    /**
     * 节点定义名称
     */
    private String nodeDefName;

    /**
     * 流程实例名称
     */
    private String procInstName;

    /**
     * 任务创建的时间
     */
    private Date createTime;

    /**
     * 处理意见
     */
    private String comments;

    /**
     * 节点执行类型
     */
    private Integer operationType;

    /**
     * 任务状态
     */
    private Integer taskStatus;

    /**
     * 流程Code
     */
    private String procCode;

    public Long getTaskRunId() {
        return taskRunId;
    }

    public void setTaskRunId(Long taskRunId) {
        this.taskRunId = taskRunId;
    }

    public Long getProcDefId() {
        return procDefId;
    }

    public void setProcDefId(Long procDefId) {
        this.procDefId = procDefId;
    }

    public String getProcDefVersion() {
        return procDefVersion;
    }

    public void setProcDefVersion(String procDefVersion) {
        this.procDefVersion = procDefVersion;
    }

    public Long getProcInstId() {
        return procInstId;
    }

    public void setProcInstId(Long procInstId) {
        this.procInstId = procInstId;
    }

    public Long getNodeDefId() {
        return nodeDefId;
    }

    public void setNodeDefId(Long nodeDefId) {
        this.nodeDefId = nodeDefId;
    }

    public String getTaskSubject() {
        return taskSubject;
    }

    public void setTaskSubject(String taskSubject) {
        this.taskSubject = taskSubject;
    }

    public Long getPreTaskId() {
        return preTaskId;
    }

    public void setPreTaskId(Long preTaskId) {
        this.preTaskId = preTaskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Date getExpectTime() {
        return expectTime;
    }

    public void setExpectTime(Date expectTime) {
        this.expectTime = expectTime;
    }

    public Long getOffsetDate() {
        return offsetDate;
    }

    public void setOffsetDate(Long offsetDate) {
        this.offsetDate = offsetDate;
    }

    public Long getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(Long agentStatus) {
        this.agentStatus = agentStatus;
    }

    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public Long getNodeUrlId() {
        return nodeUrlId;
    }

    public void setNodeUrlId(Long nodeUrlId) {
        this.nodeUrlId = nodeUrlId;
    }

    public String getNodeDefName() {
        return nodeDefName;
    }

    public void setNodeDefName(String nodeDefName) {
        this.nodeDefName = nodeDefName;
    }

    public String getProcInstName() {
        return procInstName;
    }

    public void setProcInstName(String procInstName) {
        this.procInstName = procInstName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getOperationType() {
        return operationType;
    }

    public void setOperationType(Integer operationType) {
        this.operationType = operationType;
    }

    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getProcCode() {
        return procCode;
    }

    public void setProcCode(String procCode) {
        this.procCode = procCode;
    }

}
