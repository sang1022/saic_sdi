
package com.saic.ndms.sdi.common.dto;


/**
*
* @author LiuJun
* @description 流程节点定义DTO
* @date 2019年7月19日
*/
public class FlowCommonNodeDefDTO extends BaseDTO{
    private static final long serialVersionUID = -625233688525024464L;

    /**
     * 节点定义ID
     */
    private Long nodeDefId;

    /**
     * 流程定义ID
     */
    private Long procDefId;

    /**
     * 节点名称
     */
    private String nodeDefName;

    /**
     * 节点编码，同一流程节点编码不能重复，为了规范化，所有流程节点编码都不要重复，而且节点编码设置要有意义
     */
    private String nodeCode;

    /**
     * 节点备注
     */
    private String nodeDefRemark;

    /**
     * 是否编辑
     */
    private Long isEditable;

    /**
     * 节点URL id
     */
    private Long nodeUrlId;

    /**
     * 前一节点ID
     */
    private Long preNodeId;

    /**
     * 偏移时间 单位：小时
     */
    private Long offsetTime;

    /**
     * 节点执行类型-独占还是会签
     */
    private Integer operationType;

    /**
     * 是否跳过
     */
    private Long isJump;
    
    private String preNodeIds;

    public Long getNodeDefId() {
        return nodeDefId;
    }

    public void setNodeDefId(Long nodeDefId) {
        this.nodeDefId = nodeDefId;
    }

    public Long getProcDefId() {
        return procDefId;
    }

    public void setProcDefId(Long procDefId) {
        this.procDefId = procDefId;
    }

    public String getNodeDefName() {
        return nodeDefName;
    }

    public void setNodeDefName(String nodeDefName) {
        this.nodeDefName = nodeDefName;
    }

    public String getNodeCode() {
        return nodeCode;
    }

    public void setNodeCode(String nodeCode) {
        this.nodeCode = nodeCode;
    }

    public String getNodeDefRemark() {
        return nodeDefRemark;
    }

    public void setNodeDefRemark(String nodeDefRemark) {
        this.nodeDefRemark = nodeDefRemark;
    }

    public Long getIsEditable() {
        return isEditable;
    }

    public void setIsEditable(Long isEditable) {
        this.isEditable = isEditable;
    }

    public Long getNodeUrlId() {
        return nodeUrlId;
    }

    public void setNodeUrlId(Long nodeUrlId) {
        this.nodeUrlId = nodeUrlId;
    }

    public Long getPreNodeId() {
        return preNodeId;
    }

    public void setPreNodeId(Long preNodeId) {
        this.preNodeId = preNodeId;
    }

    public Long getOffsetTime() {
        return offsetTime;
    }

    public void setOffsetTime(Long offsetTime) {
        this.offsetTime = offsetTime;
    }

    public Integer getOperationType() {
        return operationType;
    }

    public void setOperationType(Integer operationType) {
        this.operationType = operationType;
    }

    public Long getIsJump() {
        return isJump;
    }

    public void setIsJump(Long isJump) {
        this.isJump = isJump;
    }

    
    /**
     * @return the preNodeIds
     */
    public String getPreNodeIds() {
        return preNodeIds;
    }

    
    /**
     * @param preNodeIds the preNodeIds to set
     */
    public void setPreNodeIds(String preNodeIds) {
        this.preNodeIds = preNodeIds;
    }
    
    
}
