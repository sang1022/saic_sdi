
package com.saic.ndms.sdi.common.dto;


/**
*
* @author LiuJun
* @description 流程节点url定义DTO
* @date 2019年7月19日
*/
public class FlowCommonNodeUrlDTO extends BaseDTO{
    private static final long serialVersionUID = -7063961051678994444L;

    /**
     * 节点URL ID
     */
    private Long nodeUrlId;

    /**
     * 节点URL编码
     */
    private String nodeUrlCode;

    /**
     * 节点URL名称
     */
    private String nodeUrlName;

    /**
     * 节点URL路径
     */
    private String nodeUrlValue;

    public Long getNodeUrlId() {
        return nodeUrlId;
    }

    public void setNodeUrlId(Long nodeUrlId) {
        this.nodeUrlId = nodeUrlId;
    }

    public String getNodeUrlCode() {
        return nodeUrlCode;
    }

    public void setNodeUrlCode(String nodeUrlCode) {
        this.nodeUrlCode = nodeUrlCode;
    }

    public String getNodeUrlName() {
        return nodeUrlName;
    }

    public void setNodeUrlName(String nodeUrlName) {
        this.nodeUrlName = nodeUrlName;
    }

    public String getNodeUrlValue() {
        return nodeUrlValue;
    }

    public void setNodeUrlValue(String nodeUrlValue) {
        this.nodeUrlValue = nodeUrlValue;
    }
}
