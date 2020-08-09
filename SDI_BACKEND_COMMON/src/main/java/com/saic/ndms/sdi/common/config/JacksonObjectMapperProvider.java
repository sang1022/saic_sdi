package com.saic.ndms.sdi.common.config;

import java.text.SimpleDateFormat;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
*
* @author SANGDELIANG
* @description JacksonObjectMapperProvider
* @date 2020年4月22日
*/
@Provider
public class JacksonObjectMapperProvider implements ContextResolver<ObjectMapper> {

    @Override
    public ObjectMapper getContext(Class<?> type) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper;
    }

}
