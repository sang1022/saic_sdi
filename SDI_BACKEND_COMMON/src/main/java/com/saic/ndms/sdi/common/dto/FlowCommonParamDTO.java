

package com.saic.ndms.sdi.common.dto;

import java.util.List;

/**
 *
 * @author LiuJun 
 * @description 流程调用参数DTO
 * @date 2017年10月16日
 */
public class FlowCommonParamDTO {

    /**
     * 当前用户-调用者必须传递的参数-必填
     */
    private FLowCommonUserDTO currentUser;

    /**
     * 流程实例标题-非必填
     */
    private String title;

    /**
     * 流程任务提醒标题-非必填
     */
    private String noticeTitle;

    /**
     * 页面URL-非必填
     */
    private String taskUrl;

    /**
     * 审核意见-非必填
     */
    private String comments;

    /**
     * 下一任务接受人员,如设置了该参数，userList为下一任务接收人员，若没有设置，则根据节点角色寻找下一任务人员-非必填
     */
    private List<FLowCommonUserDTO> userList;

    /**
     * 操作类型 1已处理 2 驳回-非必填，默认为1
     */
    private Integer operatorType;

    private Long nextNodeDefId;// 下一个节点ID，手动设置下一个节点使用

    private int taskRunStatus;// taskRun状态

    private int procInstRunStatus;// 流程实例状态

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getTaskUrl() {
        return taskUrl;
    }

    public void setTaskUrl(String taskUrl) {
        this.taskUrl = taskUrl;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public List<FLowCommonUserDTO> getUserList() {
        return userList;
    }

    public void setUserList(List<FLowCommonUserDTO> userList) {
        this.userList = userList;
    }

    public FLowCommonUserDTO getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(FLowCommonUserDTO currentUser) {
        this.currentUser = currentUser;
    }

    public Integer getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    public Long getNextNodeDefId() {
        return nextNodeDefId;
    }

    public void setNextNodeDefId(Long nextNodeDefId) {
        this.nextNodeDefId = nextNodeDefId;
    }

    public int getTaskRunStatus() {
        return taskRunStatus;
    }

    public void setTaskRunStatus(int taskRunStatus) {
        this.taskRunStatus = taskRunStatus;
    }

    public int getProcInstRunStatus() {
        return procInstRunStatus;
    }

    public void setProcInstRunStatus(int procInstRunStatus) {
        this.procInstRunStatus = procInstRunStatus;
    }

}
