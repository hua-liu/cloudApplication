package com.cloud.feign;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
//启用分布式客户端
@EnableEurekaClient
//启用发现其它客户端
@EnableDiscoveryClient
//启用集群负载
@EnableFeignClients
@SpringBootApplication
public class FeignServerApplication extends SpringBootServletInitializer implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(FeignServerApplication.class, args);
    }

    @Override
    public void run(String... args){
        System.out.println("服务启动完成");
    }
}
