

package com.saic.ndms.sdi.app.config;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import com.saic.ndms.sdi.common.config.BaseExceptionMapper;

/**
 * @author SANGDELIANG 
 * @description JerseyApplication
 * @date 2020年4月22日
 */
public abstract class JerseyApplication extends ResourceConfig {

    public JerseyApplication(){
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
        property(ServerProperties.BV_DISABLE_VALIDATE_ON_EXECUTABLE_OVERRIDE_CHECK, true);
        register(JacksonFeature.class);
        register(BaseExceptionMapper.class);
        //
        registerResource();
    }

    public abstract void registerResource();

}
