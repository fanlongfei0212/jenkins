package com.fly.demo.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:Fly
 * @Date:Create in 2019/1/13 下午9:14
 * @Description: 根Controller
 * @Modified:
 */
@RequestMapping(value = "/")
public class RootController {

    /**
     *@Author:Fly Created in 2019/1/8 下午9:04
     *@Description: HelloWord
     */
    @GetMapping
    public String helloWord(){

        return "HelloWord:TestJenkins";
    }
}
