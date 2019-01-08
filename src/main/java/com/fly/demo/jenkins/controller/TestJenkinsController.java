package com.fly.demo.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:Fly
 * @Date:Create in 2019/1/8 下午9:03
 * @Description: 测试JenkinsController
 * @Modified:
 */
@RestController
@RequestMapping(value = "/jenkins")
public class TestJenkinsController {

    /**
     *@Author:Fly Created in 2019/1/8 下午9:04
     *@Description: HelloWord
     */
    @GetMapping(value = "/hello/word")
    public String helloWord(){

        return "HelloWord:TestJenkins";
    }
}
