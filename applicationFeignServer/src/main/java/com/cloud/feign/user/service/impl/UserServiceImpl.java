package com.cloud.feign.user.service.impl;

import com.cloud.feign.common.util.ResultUtil;
import com.cloud.feign.user.service.UserService;
import org.springframework.stereotype.Component;

/**
 * 远程调用会进入到这里(断路器)
 */
@Component
public class UserServiceImpl implements UserService {

    @Override
    public Object getUser() {
        return ResultUtil.serverError();
    }

    @Override
    public Object setUser() {
        return ResultUtil.serverError();
    }
}
