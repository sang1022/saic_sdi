
package com.saic.ndms.sdi.common.config;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;


/**
*
* @author LiuJun
* @description OKHttpRestTemplate
* @date 2019年4月22日
*/
public class OKHttpRestTemplate {

    //    private static final Logger logger = LogManager.getLogger(OKHttpRestTemplate.class);

    private RestTemplate restTemplate;

    private static final String ENCODING="UTF-8";

    private RemoteServiceConfig remoteServiceConfig;


    public OKHttpRestTemplate(RemoteServiceConfig remoteServiceConfig) {
        this.remoteServiceConfig = remoteServiceConfig;
        initRestClient();
    }

    public RestTemplate getClient() {
        return restTemplate;
    }

    /**
     *@description 初始化配置底层通信使用okhttp
     */
    private void initRestClient() {
        OkHttp3ClientHttpRequestFactory clientHttpRequestFactory;
        clientHttpRequestFactory = new OkHttp3ClientHttpRequestFactory
                ( new OkHttpClient.Builder()
                        .connectTimeout(remoteServiceConfig.getConnectTimeout(), TimeUnit.MILLISECONDS)
                        .readTimeout(remoteServiceConfig.getReadTimeout(), TimeUnit.MILLISECONDS)
                        .writeTimeout(remoteServiceConfig.getWriteTimeout(),TimeUnit.MILLISECONDS)
                        .connectionPool(new ConnectionPool(remoteServiceConfig.getMaxIdleConnections(), remoteServiceConfig.getKeepAliveDuration(), TimeUnit.MILLISECONDS))
                        .build());

        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
        //设置编码
        messageConverters.add(new StringHttpMessageConverter(Charset.forName(ENCODING)));
        messageConverters.add(new FormHttpMessageConverter());
        //messageConverters.add(new MappingJackson2XmlHttpMessageConverter());
        messageConverters.add(new MappingJackson2HttpMessageConverter());
        restTemplate = new RestTemplate(messageConverters);

        restTemplate.setRequestFactory(clientHttpRequestFactory);
        //暂时无需扩展异常处理
        restTemplate.setErrorHandler(new DefaultResponseErrorHandler());

    }
}
