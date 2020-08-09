
package com.saic.ndms.sdi.admin.config;

import com.saic.ndms.sdi.common.config.JacksonObjectMapperProvider;
import com.saic.ndms.sdi.common.resource.CommonModuleResource;

/**
 * @author SANGDELIANG 
 * @description JerseyResourceConfig
 * @date 2020年4月22日
 */
public class JerseyResourceConfig extends JerseyApplication {

    /**
     * @author SANGDELIANG
     * @date 2020年4月22日 (non-Javadoc)
     * @see com.saic.ndms.sdi.admin.config.JerseyApplication#registerResource()
     */
    @Override
    public void registerResource() {
        packages("com.saic.ndms.sdi.admin.resource");
        register(CommonModuleResource.class);
        register(JacksonObjectMapperProvider.class);

    }

}
