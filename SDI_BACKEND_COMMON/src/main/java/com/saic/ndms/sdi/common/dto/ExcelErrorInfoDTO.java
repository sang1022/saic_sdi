
package com.saic.ndms.sdi.common.dto;


/**
*
* @author LiuJun
* @description 记录导入时校验的错误提示信息
* @date 2019年8月16日
*/
public class ExcelErrorInfoDTO {
    public  ExcelErrorInfoDTO(){}
    public  ExcelErrorInfoDTO(String errorSeat,String errorContent){
        this.errorSeat=errorSeat;
        this.errorContent=errorContent;
    }
    private String errorSeat;//错误位置
    
    private String errorContent;//错误内容

    
    /**
     * @return the errorSeat
     */
    public String getErrorSeat() {
        return errorSeat;
    }
    
    /**
     * @param errorSeat the errorSeat to set
     */
    public void setErrorSeat(String errorSeat) {
        this.errorSeat = errorSeat;
    }
    
    /**
     * @return the errorContent
     */
    public String getErrorContent() {
        return errorContent;
    }
    
    /**
     * @param errorContent the errorContent to set
     */
    public void setErrorContent(String errorContent) {
        this.errorContent = errorContent;
    }
    
    

}
