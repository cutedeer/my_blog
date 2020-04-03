package com.sushuzhuang.blogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
