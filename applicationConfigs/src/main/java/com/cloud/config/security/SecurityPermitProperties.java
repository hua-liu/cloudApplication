package com.cloud.config.security;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "spring.security.permit")
public class SecurityPermitProperties {
    private List<String> url;

    public List<String> getUrl() {
        return url;
    }

    public void setUrl(List<String> url) {
        this.url = url;
    }

    public String[] toArray() {
        String[] array=new String[]{};
        if(CollectionUtils.isEmpty(url)){
            return array;
        }else{
            return url.toArray(array);
        }
    }
}
