/**
* Copyright 2019 SAIC General Motors Corporation Ltd. All Rights Reserved.
*
* This software is published under the terms of the SGM Software
* License version 1.0, a copy of which has been included with this
* distribution in the LICENSE.txt file.
*
* @Project Name : flag-agent
*
* @File name : FlagAgentApplication.java
*
* @Author : LiuJun
*
* @Date : 2019年4月22日
*
----------------------------------------------------------------------------------
*     Date       Who       Version     Comments
* 1. 2019年4月22日    LiuJun    1.0
*
*
*
*
----------------------------------------------------------------------------------
*/

package com.saic.ndms.sdi.admin;

import javax.sql.DataSource;

import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.saic.ndms.sdi.admin.config.JerseyResourceConfig;
import com.saic.ndms.sdi.common.config.OKHttpRestTemplate;
import com.saic.ndms.sdi.common.config.RemoteServiceConfig;

/**
 * @author LiuJun 
 * @description FlagAgentApplication
 * @date 2019年4月22日
 */
@SpringBootApplication
@MapperScan(basePackages = { "com.saic.ndms.sdi.admin.dao", "com.saic.ndms.sdi.common.dao" })
@EnableTransactionManagement
public class ScsAdminApplication extends SpringBootServletInitializer {
    
    public static final String APP="sdi4admin";

    public static final String PORTAL="https://dp.saic.com/dp";


    public static void main(String[] args) {
        SpringApplication.run(ScsAdminApplication.class, args);
    }

    @Bean("txm")
    public PlatformTransactionManager transactionManager(DataSource datasource) {
        return new DataSourceTransactionManager(datasource);
    }
    
    
//    @Bean
//    public FilterRegistrationBean fitlerRegistration() {
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//        
//        registration.addInitParameter(AuthConstant.PORTAL_INDEX,PORTAL);
//        registration.addInitParameter(AuthConstant.APP_ID, APP);
//        
//        registration.setFilter(new DefaultAccessServletFilter());
//        registration.addUrlPatterns("/rest/*");
//        return registration;
//    }



    @Bean
    public ServletRegistrationBean jerseyServlet() {
        String[] parmaRestAttr = {"/rest/*","/api/*"};
        ServletRegistrationBean registration = new ServletRegistrationBean(new ServletContainer(), parmaRestAttr) ;
        // our rest resources will be available in the path /jersey/*
        registration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, JerseyResourceConfig.class.getName());
        return registration;
    }
//
//    @Bean
//    public OKHttpRestTemplate OKHttpRestTemplate(RemoteServiceConfig remoteServiceConfig) {
//        return new OKHttpRestTemplate(remoteServiceConfig);
//    }

}
