package com.log.loggingServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin2.server.internal.EnableZipkinServer;
@EnableDiscoveryClient
@EnableZipkinServer
@SpringBootApplication
public class LoggingCenterServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoggingCenterServerApplication.class, args);
    }

}
