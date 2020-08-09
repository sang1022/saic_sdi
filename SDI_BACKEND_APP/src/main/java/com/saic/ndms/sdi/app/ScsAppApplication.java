/**
* Copyright 2019 SAIC General Motors Corporation Ltd. All Rights Reserved.
*
* This software is published under the terms of the SGM Software
* License version 1.0, a copy of which has been included with this
* distribution in the LICENSE.txt file.
*
* @Project Name : flag-agent
* 用来为将来的管理员管理，计划任务执行，MQ接入
* @File name : FlagAgentApplication.java
*
* @Author : sangdeliang
*
* @Date : 2020年8月9日
*
----------------------------------------------------------------------------------
*     Date       Who       Version     Comments
* 1. 2020年8月9日    SANGDELIANG    1.0
*
*
*
*
----------------------------------------------------------------------------------
*/

package com.saic.ndms.sdi.app;

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

import com.saic.ndms.sdi.app.config.JerseyResourceConfig;

/**
 * @author SANGDELIANG 
 * @description FlagAgentApplication
 * @date 2020年4月22日
 */
@SpringBootApplication
@MapperScan(basePackages = { "com.saic.ndms.sdi.app.dao", "com.saic.ndms.sdi.app.dao" })
@EnableTransactionManagement
public class ScsAppApplication extends SpringBootServletInitializer {
    
    public static final String APP="sdi4app";

    public static final String PORTAL="https://dp.saic.com/dp";


    public static void main(String[] args) {
        SpringApplication.run(ScsAppApplication.class, args);
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
