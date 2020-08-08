package com.saic.ndms.sdi.common.dto;

public class ScsClaimTagDTO extends BaseDTO{
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Long fiftyClaimTagId;

    private Long fiftyClaimId;

    private String tag;


    private Integer tagType;

    
    public Long getFiftyClaimTagId() {
        return fiftyClaimTagId;
    }

    
    public void setFiftyClaimTagId(Long fiftyClaimTagId) {
        this.fiftyClaimTagId = fiftyClaimTagId;
    }

    
    public Long getFiftyClaimId() {
        return fiftyClaimId;
    }

    
    public void setFiftyClaimId(Long fiftyClaimId) {
        this.fiftyClaimId = fiftyClaimId;
    }

    
    public String getTag() {
        return tag;
    }

    
    public void setTag(String tag) {
        this.tag = tag;
    }

    

    
    public Integer getTagType() {
        return tagType;
    }

    
    public void setTagType(Integer tagType) {
        this.tagType = tagType;
    }
    
    

}
