package com.cloud.feign.user.service;

import com.cloud.feign.common.constant.FeignClientConstant;
import com.cloud.feign.user.service.impl.UserServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = FeignClientConstant.USER_CLIENT,fallback = UserServiceImpl.class)
public interface UserService {
    @GetMapping("/user/getUser")
    Object getUser();
    @GetMapping("/user/setUser")
    Object setUser();
}
