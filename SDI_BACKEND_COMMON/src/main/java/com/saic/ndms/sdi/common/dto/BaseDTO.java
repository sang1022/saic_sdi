
package com.saic.ndms.sdi.common.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
*
* @author LiuJun
* BaseDTO
* @date 2018年3月29日
*/
public class BaseDTO implements Serializable{
    
    private static final long serialVersionUID = -1097406838985895255L;
    
    private String createBy;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;

    private String updateBy;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateDate;
    
    //分页：每页多少条记录,默认10
	private int pageSize = 10;
	//分页:页号，默认1
	private int pageNum = 1;
	//分页:从第几行开始
    private int beginNo;
    //分页：从第几行结束
    private int endNo;
    
    public void generatePageInfo() {
    	setBeginNo(getBeginNo());
    	setEndNo(getEndNo());
    }
    
    public int getBeginNo() {
    	beginNo = (getPageNum()-1)*getPageSize();
		return beginNo;
	}
	public void setBeginNo(int beginNo) {
		this.beginNo = beginNo;
	}
	public int getEndNo() {
		endNo = getPageNum()*getPageSize()+1;
		return endNo;
	}
	public void setEndNo(int endNo) {
		this.endNo = endNo;
	}
	
    /**
     * @return the createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    
    /**
     * @param createBy the createBy to set
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    
    /**
     * @return the createDate
     */
    public Date getCreateDate() {
        return createDate;
    }

    
    /**
     * @param createDate the createDate to set
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    
    /**
     * @return the updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    
    /**
     * @param updateBy the updateBy to set
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    
    /**
     * @return the updateDate
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    
    /**
     * @param updateDate the updateDate to set
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }


	public int getPageSize() {
		return pageSize;
	}


	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}


	public int getPageNum() {
		return pageNum;
	}


	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

    

    
    
    




}
