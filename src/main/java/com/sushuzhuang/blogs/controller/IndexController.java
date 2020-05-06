package com.sushuzhuang.blogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页 页面初始化
 * <p>
 * 不允许直接访问静态资源
 *
 * @author shuzhuang.su
 * @date 2020-04-03 19:03
 */
@RequestMapping("/")
@Controller
public class IndexController {

    @RequestMapping({"", "index"})
    public String init() {
        return "index";
    }



}
