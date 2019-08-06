package com.cloud.user.controller;

import com.cloud.common.entity.AjaxResult;
import com.cloud.common.exception.MsgException;
import com.cloud.common.exception.MyControllerAdvice;
import com.cloud.common.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@RefreshScope
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired private RedisTemplate redisTemplate;
    @Value("${what}") String port;
    /**
     * aaa
     * @return
     */
    @RequestMapping("setUser")
    public AjaxResult setUser(){
        redisTemplate.opsForValue().set("A","AAAAAAAAAAAAAAAAAAAAAAA",10, TimeUnit.MINUTES);
        return ResultUtil.success((Object)port);
    }
    @RequestMapping("getUser")
    public AjaxResult getUser(){
        logger.error("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        logger.info("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
        logger.warn("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        logger.debug("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
        return ResultUtil.success(port,redisTemplate.opsForValue().get("A"));
    }
}
