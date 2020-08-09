
package com.saic.ndms.sdi.common.dto;


/**
*
* @author SANGDELIANG
* @description CodeDTO
* @date 2020年8月20日
*/
public class CodeDTO {
    
    private Long codeId;
    private Integer type;
    private String typeName;
    private String codeEnName;
    private String codeCnName;
    private String value;
    
    /**
     * @return the codeId
     */
    public Long getCodeId() {
        return codeId;
    }
    
    /**
     * @param codeId the codeId to set
     */
    public void setCodeId(Long codeId) {
        this.codeId = codeId;
    }
    
    /**
     * @return the type
     */
    public Integer getType() {
        return type;
    }
    
    /**
     * @param type the type to set
     */
    public void setType(Integer type) {
        this.type = type;
    }
    
    /**
     * @return the typeName
     */
    public String getTypeName() {
        return typeName;
    }
    
    /**
     * @param typeName the typeName to set
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    
    /**
     * @return the codeEnName
     */
    public String getCodeEnName() {
        return codeEnName;
    }
    
    /**
     * @param codeEnName the codeEnName to set
     */
    public void setCodeEnName(String codeEnName) {
        this.codeEnName = codeEnName;
    }
    
    /**
     * @return the codeCnName
     */
    public String getCodeCnName() {
        return codeCnName;
    }
    
    /**
     * @param codeCnName the codeCnName to set
     */
    public void setCodeCnName(String codeCnName) {
        this.codeCnName = codeCnName;
    }
    
    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }
    
    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    

}
