package com.hbc.dubbo.consumer.controller;

import cn.hbc.dubbo.remote.TestService;
import com.alibaba.dubbo.common.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by KevinCui on 2018/5/9.
 */
@Controller
public class TestController {
    @Autowired
    private TestService testService;

    @ResponseBody
    @RequestMapping("/test/{name}")
    public String testJson(@PathVariable("name") String name) {
        String testStr = testService.sayHello(name);
        return testStr;
    }

}
