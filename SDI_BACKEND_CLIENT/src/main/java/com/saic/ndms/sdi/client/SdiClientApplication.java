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

package com.saic.ndms.sdi.client;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

/**
 * @author SANGDELIANG 
 * @description FlagAgentApplication
 * @date 2020年4月22日
 */
@SpringBootApplication
@MapperScan(basePackages = { "com.saic.ndms.sdi.client.dao", "com.saic.ndms.sdi.client.dao" })
@EnableTransactionManagement
@EnableDiscoveryClient	//打开注册服务发现
@EnableFeignClients //打开Feigin
public class SdiClientApplication extends SpringBootServletInitializer {
    
    public static final String APP="sdi4client";

    public static final String PORTAL="https://dp.saic.com/dp";


    public static void main(String[] args) {
        SpringApplication.run(SdiClientApplication.class, args);
    }

    @Bean("txm")
    public PlatformTransactionManager transactionManager(DataSource datasource) {
        return new DataSourceTransactionManager(datasource);
    }

    @Bean
    public RestTemplate restTemplate() {
    	return new RestTemplate();
    }

}
