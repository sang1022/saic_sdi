
package com.saic.ndms.sdi.common.dto;

/**
 * @author LiuJun 
 * @description 流程提醒定义DTO
 * @date 2017年10月13日
 */

public class FlowCommonTaskNoticeDefDTO extends BaseDTO {

    private static final long serialVersionUID = 6959798365496229210L;

    /**
     * 流程任务提醒定义ID
     */
    private Long taskNoticeDefId;

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
     * 偏移量
     */
    private Long offsetTime;

    /**
     * 是否重复发送
     */
    private Long repeatSend;

    /**
     * 间隔时间 单位小时
     */
    private Long intervalTime;

    /**
     * 提醒主题
     */
    private String alertTheme;

    /**
     * 提醒内容
     */
    private String alertContent;

    /**
     * 节点ID
     */
    private Long nodeDefId;

    public Long getTaskNoticeDefId() {
        return taskNoticeDefId;
    }

    public void setTaskNoticeDefId(Long taskNoticeDefId) {
        this.taskNoticeDefId = taskNoticeDefId;
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

    public Long getOffsetTime() {
        return offsetTime;
    }

    public void setOffsetTime(Long offsetTime) {
        this.offsetTime = offsetTime;
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

    public Long getNodeDefId() {
        return nodeDefId;
    }

    public void setNodeDefId(Long nodeDefId) {
        this.nodeDefId = nodeDefId;
    }

}
