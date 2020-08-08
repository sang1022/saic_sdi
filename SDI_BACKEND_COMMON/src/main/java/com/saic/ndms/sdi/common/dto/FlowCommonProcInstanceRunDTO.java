
package com.saic.ndms.sdi.common.dto;

import java.util.Date;

/**
*
* @author LiuJun
* @description 流程定义运行实例DTO
* @date 2017年10月13日
*/
public class FlowCommonProcInstanceRunDTO extends BaseDTO{
    private static final long serialVersionUID = 8265712267713011798L;

    /**
     * 流程实例ID
     */
    private Long procInstRunId;

    /**
     * 流程实例主题
     */
    private String procSubject;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 业务数据主键值
     */
    private Long businessId;

    /**
     * 流程发起人
     */
    private String initiatorId;

    /**
     * 是否暂停
     */
    private Integer isSuspended;

    /**
     * 流程定义主键
     */
    private Long procDefId;

    /**
     * 流程发起人姓名
     */
    private String initiatorName;

    /**
     * 流程状态
     */
    private Integer procStatus;

    public Long getProcInstRunId() {
        return procInstRunId;
    }

    public void setProcInstRunId(Long procInstRunId) {
        this.procInstRunId = procInstRunId;
    }

    public String getProcSubject() {
        return procSubject;
    }

    public void setProcSubject(String procSubject) {
        this.procSubject = procSubject;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public String getInitiatorId() {
        return initiatorId;
    }

    public void setInitiatorId(String initiatorId) {
        this.initiatorId = initiatorId;
    }

    public Integer getIsSuspended() {
        return isSuspended;
    }

    public void setIsSuspended(Integer isSuspended) {
        this.isSuspended = isSuspended;
    }

    public Long getProcDefId() {
        return procDefId;
    }

    public void setProcDefId(Long procDefId) {
        this.procDefId = procDefId;
    }

    public String getInitiatorName() {
        return initiatorName;
    }

    public void setInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
    }

    public Integer getProcStatus() {
        return procStatus;
    }

    public void setProcStatus(Integer procStatus) {
        this.procStatus = procStatus;
    }


}
