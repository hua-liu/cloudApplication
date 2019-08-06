package com.cloud.config.controller;

import com.cloud.config.entity.Response;
import com.cloud.config.util.HttpClientUtil;
import com.netflix.discovery.shared.Application;
import com.netflix.discovery.shared.Applications;
import com.netflix.eureka.EurekaServerContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {
    @Autowired private EurekaServerContext eurekaServerContext;
    /**
     * 刷新客户端配置
     * @return
     */
    @GetMapping("/refresh")
    @ResponseBody
    public Object refreshClientConfig(){
        List<Response> result = new ArrayList<>();
        Applications applications = eurekaServerContext.getRegistry().getApplications();
        if(applications.size()>0){
            List<Application> registeredApplications = applications.getRegisteredApplications();
            registeredApplications.forEach(e-> e.getInstances().forEach(ins ->{
                String url = ins.getStatusPageUrl().replace("actuator/info","actuatorConfig/refresh");
                String res = HttpClientUtil.execute(url);
                result.add(new Response(url, res));
            }));
        }
        return result;
    }
}
