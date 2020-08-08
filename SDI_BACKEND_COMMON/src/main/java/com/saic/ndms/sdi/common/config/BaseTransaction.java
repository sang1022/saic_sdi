	
package com.saic.ndms.sdi.common.config;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
*
* @author LiuJun
* @description 事务配置annotation
* @date 2019年4月22日
*/
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Transactional(value = "txm",propagation = Propagation.REQUIRED,timeout = 30 * 10   )  //5分钟
public @interface BaseTransaction {
}
