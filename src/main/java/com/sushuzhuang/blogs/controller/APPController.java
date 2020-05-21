package com.sushuzhuang.blogs.controller;

import com.sushuzhuang.blogs.common.util.JacksonHandler;
import com.sushuzhuang.blogs.vo.Demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * app记录
 *
 * @author shuzhuang.su
 * @date 2020-04-30 14:15
 */
@Controller
@RequestMapping("/app")
public class APPController {

    @RequestMapping("/list")
    public String list() {
        return "index-app";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(@RequestBody @Valid Demo demo) {
        System.out.println(JacksonHandler.toSerialize(demo));
        return "dd";
    }
}
