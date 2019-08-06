package com.cloud.common.redis;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.redis")
@RefreshScope
public class RedisProperties {
    private String host;
    private Integer port;
    private Integer database;
    private String password;
    private Integer timeout;
    private Integer jedisPoolMaxIdle;
    private Integer jedisPoolMaxTotal;
    private Integer jedisPoolMaxWait;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getDatabase() {
        return database;
    }

    public void setDatabase(Integer database) {
        this.database = database;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getJedisPoolMaxIdle() {
        return jedisPoolMaxIdle;
    }

    public void setJedisPoolMaxIdle(Integer jedisPoolMaxIdle) {
        this.jedisPoolMaxIdle = jedisPoolMaxIdle;
    }

    public Integer getJedisPoolMaxTotal() {
        return jedisPoolMaxTotal;
    }

    public void setJedisPoolMaxTotal(Integer jedisPoolMaxTotal) {
        this.jedisPoolMaxTotal = jedisPoolMaxTotal;
    }

    public Integer getJedisPoolMaxWait() {
        return jedisPoolMaxWait;
    }

    public void setJedisPoolMaxWait(Integer jedisPoolMaxWait) {
        this.jedisPoolMaxWait = jedisPoolMaxWait;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }
}
