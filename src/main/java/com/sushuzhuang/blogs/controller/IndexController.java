package com.sushuzhuang.blogs.controller;

import com.sushuzhuang.blogs.common.util.JacksonHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 初始化
 *
 * @author shuzhuang.su
 * @date 2020-04-03 19:03
 */
@RequestMapping("/")
@Controller
public class IndexController {

    @RequestMapping("")
    public String init(){
        return "index";
    }


    @RequestMapping("/get")
    public void test(HttpServletRequest request){

        System.out.println(request.getRequestURI());

        System.out.println(JacksonHandler.toSerialize(request.getParameterMap()));
    }
}
