
package com.saic.ndms.sdi.common.po;


/**
*
* @author LiuJun
* @description ParameterPO
* @date 2019年4月22日
*/
public class ParameterPO {
    private Long parameterId;
    private String parameterCode;
    private String parameterValue;
    private String remark;
    private Long parameterType;
    
    /**
     * @return the parameterId
     */
    public Long getParameterId() {
        return parameterId;
    }
    
    /**
     * @param parameterId the parameterId to set
     */
    public void setParameterId(Long parameterId) {
        this.parameterId = parameterId;
    }
    
    /**
     * @return the parameterCode
     */
    public String getParameterCode() {
        return parameterCode;
    }
    
    /**
     * @param parameterCode the parameterCode to set
     */
    public void setParameterCode(String parameterCode) {
        this.parameterCode = parameterCode;
    }
    
    /**
     * @return the parameterValue
     */
    public String getParameterValue() {
        return parameterValue;
    }
    
    /**
     * @param parameterValue the parameterValue to set
     */
    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }
    
    /**
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }
    
    /**
     * @param remark the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    /**
     * @return the parameterType
     */
    public Long getParameterType() {
        return parameterType;
    }
    
    /**
     * @param parameterType the parameterType to set
     */
    public void setParameterType(Long parameterType) {
        this.parameterType = parameterType;
    }
    
    
    

}
