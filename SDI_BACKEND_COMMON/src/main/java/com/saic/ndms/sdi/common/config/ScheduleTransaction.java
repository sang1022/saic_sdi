
package com.saic.ndms.sdi.common.config;


/**
*
* @author LiuJun
* @description ScheduleTransaction
* @date 2018年11月14日
*/
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Transactional(value = "txm",propagation = Propagation.REQUIRED,timeout = 1200) //20分钟=1200秒
public @interface ScheduleTransaction {

}
