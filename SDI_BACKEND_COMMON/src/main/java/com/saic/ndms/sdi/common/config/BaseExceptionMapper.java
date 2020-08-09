
package com.saic.ndms.sdi.common.config;

import javax.management.ServiceNotFoundException;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.saic.ndms.sdi.common.dto.ExMessageResultDTO;
import com.saic.ndms.sdi.common.exception.AuthException;
import com.saic.ndms.sdi.common.exception.CodeAuthException;
import com.saic.ndms.sdi.common.exception.ScsAppException;
import com.saic.ndms.sdi.common.exception.ScsBizException;
import com.saic.ndms.sdi.common.utils.StringUtils;

/**
*
* @author SANGDELIANG
* @description 公共异常处理类
* @date 2020年4月22日
*/
public class BaseExceptionMapper implements ExceptionMapper<Exception> {
    private Log logger= LogFactory.getLog(BaseExceptionMapper.class);
    private static final String APPLICATION_JSON_UTF8 ="application/json;charset=UTF-8";


    /**
    *
    * @author SANGDELIANG
    * @date 2020年4月22日
    * @param exception
    * @return
    * (non-Javadoc)
    * @see javax.ws.rs.ext.ExceptionMapper#toResponse(java.lang.Throwable)
    */
    @Override
    public Response toResponse(Exception exception) {
        this.processException(exception);
        ExMessageResultDTO dto = this.createExMessageResultDTO(exception);
        int status = dto == null ? Status.INTERNAL_SERVER_ERROR.getStatusCode() : dto.getStatus();
        return Response.status(status).entity(dto).type(APPLICATION_JSON_UTF8).build();
    }
    protected ExMessageResultDTO createExMessageResultDTO(Exception ex) {
        ExMessageResultDTO dto = null;
        if (ex instanceof JsonParseException) {
            dto = new ExMessageResultDTO(true,Status.BAD_REQUEST.getStatusCode(), "0",
                    this.getStackMessage(ex), ex);
        } else if (ex instanceof JsonMappingException) {
            dto = new ExMessageResultDTO(true,Status.BAD_REQUEST.getStatusCode(), "0",
                    this.getStackMessage(ex), ex);
        } else if (ex instanceof ScsBizException) {
            dto = new ExMessageResultDTO(true,Status.INTERNAL_SERVER_ERROR.getStatusCode(), "0",
                                         this.getStackMessage(ex), ex);
        } else if (ex instanceof ScsAppException) {
            dto = new ExMessageResultDTO(false,Status.BAD_REQUEST.getStatusCode(), "0",
                                         this.getStackMessage(ex), ex);
        } else if (ex instanceof AuthException) {
            dto = new ExMessageResultDTO(false,Status.UNAUTHORIZED.getStatusCode(), "0",
                                         this.getStackMessage(ex), ex);
        } else if (ex instanceof ServiceNotFoundException) {
            dto = new ExMessageResultDTO(true,Status.NOT_FOUND.getStatusCode(), "0",
                                         this.getStackMessage(ex), ex);
        } else if (ex instanceof CodeAuthException) {
            dto = new ExMessageResultDTO(true,Status.CONFLICT.getStatusCode(), "0",
                    this.getStackMessage(ex), ex);
        } else {
            if (ex instanceof ClientErrorException) {
                ClientErrorException e = (ClientErrorException) ex;
                dto = new ExMessageResultDTO(true,e.getResponse().getStatus(), "0",
                                             this.getStackMessage(ex), ex);
            } else {
                dto = new ExMessageResultDTO(true,Status.INTERNAL_SERVER_ERROR.getStatusCode(), "0",
                                             this.getStackMessage(ex), ex);
            }
        }
        return dto;
    }
    protected String getExceptionMessage(Exception ex) {
        if (ex == null) {
            return StringUtils.EMPTY_STRING;
        }
        return ex.getMessage();
    }
    protected String getStackMessage(Exception ex) {
        if (ex == null) {
            return StringUtils.EMPTY_STRING;
        }
        StringBuilder sb = new StringBuilder("Root Cause: ");
        sb.append(ex.getMessage());
        Throwable t1 = ex.getCause();
        if (t1 != null) {
            sb.append("; Cause By: ");
            sb.append(t1.getMessage());

            Throwable t2 = t1.getCause();
            if (t2 != null) {
                sb.append("; Cause By: ");
                sb.append(t2.getMessage());

                Throwable t3 = t2.getCause();
                if (t3 != null) {
                    sb.append("; Cause By: ");
                    sb.append(t3.getMessage());
                }
            }
        }
        return sb.toString();
    }
    
    protected void processException(Exception ex) {
        logger.error(ex);
        Throwable ex2 = ex.getCause();
        if (ex2 != null) {
            logger.error("; Cause By: ");
            logger.error(ex2.getMessage(), ex2);
            Throwable ex3 = ex2.getCause();
            if (ex3 != null) {
                logger.error("; Cause By: ");
                logger.error(ex3.getMessage(), ex3);
            }
        }
    }

}
