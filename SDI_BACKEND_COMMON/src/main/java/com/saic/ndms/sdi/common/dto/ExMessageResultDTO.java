
package com.saic.ndms.sdi.common.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

/*
*
* @author SANGDELIANG
* 返回消息封装对象
* @date 2016年3月1日
*/

public class ExMessageResultDTO {

    // 状态
    private int status;

    private String state;

    // 错误信息
    private String message;

    // detail shown flag
    private boolean showDetail;

    /**
     * @return the showDetail
     */
    public boolean isShowDetail() {
        return showDetail;
    }

    /**
     * @param showDetail the showDetail to set
     */
    public void setShowDetail(boolean showDetail) {
        this.showDetail = showDetail;
    }

    @JsonIgnore
    private Exception ex;

    public ExMessageResultDTO(){

    }

    

    public ExMessageResultDTO(boolean showDetail,int status, String state, String message,  Exception ex){
        super();
        this.status = status;
        this.state = state;
        this.message = message;
        this.showDetail = showDetail;
        this.ex = ex;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }


    
    public String getState() {
        return state;
    }

    
    public String getMessage() {
        return message;
    }

    /**
     * @return the ex
     */
    public Exception getEx() {
        return ex;
    }

}
