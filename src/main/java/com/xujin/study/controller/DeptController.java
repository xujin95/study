package com.xujin.study.controller;

import com.xujin.study.model.Dept;
import com.xujin.study.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    DeptService deptService;
    @Autowired
    StringRedisTemplate redisTemplate;
    @Autowired
    RedisConnectionFactory connectionFactory;

    @RequestMapping("/queryAll")
    @ResponseBody
    @Cacheable(value = "zzzzzzzz",key = "#aa")
    public List<Dept> queryAll(String aa) {
//        redisTemplate.setConnectionFactory(connectionFactory);
//        redisTemplate.opsForValue().set("hhhhh","test");
        List<Dept> list = deptService.queryAll();
        return list;
    }

    @RequestMapping("/hello")
    public String hello() {
        return "我是一个傻子哈哈哈哈";
    }


}
