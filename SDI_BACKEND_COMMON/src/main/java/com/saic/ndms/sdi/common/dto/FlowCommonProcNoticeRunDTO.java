
package com.saic.ndms.sdi.common.dto;

import java.util.Date;

/**
*
* @author LiuJun
* @description 流程提醒实例DTO
* @date 2017年10月13日
*/
public class FlowCommonProcNoticeRunDTO extends BaseDTO{
    private static final long serialVersionUID = -4579105704690662322L;

    /**
     * 任务提醒ID
     */
    private Long taskNoticeRunId;

    /**
     * 提醒名称
     */
    private String alertName;

    /**
     * 提醒类型
     */
    private Long alertType;

    /**
     * 发送方式
     */
    private Long sendWay;

    /**
     * 计划发送时间
     */
    private Date planSendTime;

    /**
     * 实际发送时间
     */
    private Date realitySendTime;

    /**
     * 发送对象
     */
    private Long sendObject;

    /**
     * 提醒主题
     */
    private String alertTheme;

    /**
     * 提醒内容
     */
    private String alertContent;

    /**
     * 是否重复发送
     */
    private Long repeatSend;

    /**
     * 间隔时间
     */
    private Long intervalTime;

    /**
     * 提醒状态
     */
    private Integer alertState;

    /**
     * 任务实例ID
     */
    private Long taskRunId;

    public Long getTaskNoticeRunId() {
        return taskNoticeRunId;
    }

    public void setTaskNoticeRunId(Long taskNoticeRunId) {
        this.taskNoticeRunId = taskNoticeRunId;
    }

    public String getAlertName() {
        return alertName;
    }

    public void setAlertName(String alertName) {
        this.alertName = alertName;
    }

    public Long getAlertType() {
        return alertType;
    }

    public void setAlertType(Long alertType) {
        this.alertType = alertType;
    }

    public Long getSendWay() {
        return sendWay;
    }

    public void setSendWay(Long sendWay) {
        this.sendWay = sendWay;
    }

    public Date getPlanSendTime() {
        return planSendTime;
    }

    public void setPlanSendTime(Date planSendTime) {
        this.planSendTime = planSendTime;
    }

    public Date getRealitySendTime() {
        return realitySendTime;
    }

    public void setRealitySendTime(Date realitySendTime) {
        this.realitySendTime = realitySendTime;
    }

    public Long getSendObject() {
        return sendObject;
    }

    public void setSendObject(Long sendObject) {
        this.sendObject = sendObject;
    }

    public String getAlertTheme() {
        return alertTheme;
    }

    public void setAlertTheme(String alertTheme) {
        this.alertTheme = alertTheme;
    }

    public String getAlertContent() {
        return alertContent;
    }

    public void setAlertContent(String alertContent) {
        this.alertContent = alertContent;
    }

    public Long getRepeatSend() {
        return repeatSend;
    }

    public void setRepeatSend(Long repeatSend) {
        this.repeatSend = repeatSend;
    }

    public Long getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(Long intervalTime) {
        this.intervalTime = intervalTime;
    }

    public Integer getAlertState() {
        return alertState;
    }

    public void setAlertState(Integer alertState) {
        this.alertState = alertState;
    }

    public Long getTaskRunId() {
        return taskRunId;
    }

    public void setTaskRunId(Long taskRunId) {
        this.taskRunId = taskRunId;
    }

}
