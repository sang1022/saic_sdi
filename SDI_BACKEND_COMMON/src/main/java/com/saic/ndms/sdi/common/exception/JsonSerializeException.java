
package com.saic.ndms.sdi.common.exception;

/**
*
* @author 
* @description JsonSerializeException
* @date 
*/

public class JsonSerializeException extends RuntimeException {
    
    private static final long serialVersionUID = 7807894278848938989L;


    /**
     * @author  
     * @description JsonSerializeException
     * @date 
     * @param e
     */
    public JsonSerializeException(Exception e){
        super(e);
    }


}
