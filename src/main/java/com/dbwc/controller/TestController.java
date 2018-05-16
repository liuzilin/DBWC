package com.dbwc.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lzl on 2018/5/15.
 */

@RestController
public class TestController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/sayHello")
    public String login(){
        return "hello lzl";
    }

    @RequestMapping("/getUser")
    public String getUser(){
        String sql = "select name from user";
        List<String> list = jdbcTemplate.queryForList(sql,String.class);
        return JSON.toJSONString(list);
    }
}
