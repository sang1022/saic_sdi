package com.saic.ndms.sdi.gateway.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.apache.commons.lang3.StringUtils;
import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

/**
 * sang,自定义一个测试的过滤器，判断参数中的一个参数 是否为空
 * @author Administrator
 *
 */
@Component
public class DemoRoutePredicateFactory  extends AbstractRoutePredicateFactory<DemoRoutePredicateFactory.Config> {

    //构造函数
    public DemoRoutePredicateFactory() {
        super(DemoRoutePredicateFactory.Config.class);
    }

    //读取配置文件的中参数值 给他赋值到配置类中的属性上
    public List<String> shortcutFieldOrder() {
        //这个位置的顺序必须跟配置文件中的值的顺序对应
        return Arrays.asList("minAge", "maxAge");
    }

    //断言逻辑
    public Predicate<ServerWebExchange> apply(DemoRoutePredicateFactory.Config config) {
        return new Predicate<ServerWebExchange>() {
            @Override
            public boolean test(ServerWebExchange serverWebExchange) {
                //1 接收前台传入的age参数
                String ageStr = serverWebExchange.getRequest().getQueryParams().getFirst("wangwenfeixxx");

                //2 先判断是否为空
                if (StringUtils.isNotEmpty(ageStr)) {
                	return false;
                }
                return true;
            }
        };
    }

    //配置类,用于接收配置文件中的对应参数
    public static class Config {
        private int minAge;//18
        private int maxAge;//60
		public int getMinAge() {
			return minAge;
		}
		public void setMinAge(int minAge) {
			this.minAge = minAge;
		}
		public int getMaxAge() {
			return maxAge;
		}
		public void setMaxAge(int maxAge) {
			this.maxAge = maxAge;
		}
        
    }
}