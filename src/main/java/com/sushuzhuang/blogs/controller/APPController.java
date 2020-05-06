package com.sushuzhuang.blogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String list(){
        return "index-app";
    }
}
