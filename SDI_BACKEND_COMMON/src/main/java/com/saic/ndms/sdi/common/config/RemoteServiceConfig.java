
package com.saic.ndms.sdi.common.config;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
*
* @author SANGDELIANG
* @description RemoteServiceConfig
* @date 2020年4月22日
*/
@Component
@ConfigurationProperties(prefix="okhttp3")
public class RemoteServiceConfig {

    private int connectTimeout;

    private int readTimeout;

    private int writeTimeout;

    private int maxIdleConnections;

    private int keepAliveDuration;

    public int getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public int getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    public int getWriteTimeout() {
        return writeTimeout;
    }

    public void setWriteTimeout(int writeTimeout) {
        this.writeTimeout = writeTimeout;
    }

    public int getMaxIdleConnections() {
        return maxIdleConnections;
    }

    public void setMaxIdleConnections(int maxIdleConnections) {
        this.maxIdleConnections = maxIdleConnections;
    }

    public int getKeepAliveDuration() {
        return keepAliveDuration;
    }

    public void setKeepAliveDuration(int keepAliveDuration) {
        this.keepAliveDuration = keepAliveDuration;
    }

    @Override
    public String toString() {
        return "RemoteServiceConfig{" +
                "connectTimeout=" + connectTimeout +
                ", readTimeout=" + readTimeout +
                ", writeTimeout=" + writeTimeout +
                ", maxIdleConnections=" + maxIdleConnections +
                ", keepAliveDuration=" + keepAliveDuration +
                '}';
    }

}
