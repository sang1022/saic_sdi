package com.saic.ndms.sdi.dealer.gateway.filters;

import java.util.Arrays;
import java.util.List;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

//自定义局部过滤器
@Component
public class LogGatewayFilterFactory
        extends AbstractGatewayFilterFactory<LogGatewayFilterFactory.Config> {

    //构造函数
    public LogGatewayFilterFactory() {
        super(LogGatewayFilterFactory.Config.class);
    }

    //读取配置文件中的参数 赋值到 配置类中
    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList("consoleLog", "cacheLog");
    }

    //过滤器逻辑
    @Override
    public GatewayFilter apply(LogGatewayFilterFactory.Config config) {
        return new GatewayFilter() {
            @Override
            public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
                if (config.isCacheLog()) {
                    System.out.println("cacheLog已经开启了....");
                }
                if (config.isConsoleLog()) {
                    System.out.println("consoleLog已经开启了....");
                }

                return chain.filter(exchange);
            }
        };
    }

    //配置类 接收配置参数
    public static class Config {
        private boolean consoleLog;
        private boolean cacheLog;
		public boolean isConsoleLog() {
			return consoleLog;
		}
		public void setConsoleLog(boolean consoleLog) {
			this.consoleLog = consoleLog;
		}
		public boolean isCacheLog() {
			return cacheLog;
		}
		public void setCacheLog(boolean cacheLog) {
			this.cacheLog = cacheLog;
		}
        
        
    }
}