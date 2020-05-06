package com.sushuzhuang.blogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 个人中心
 *
 * @author shuzhuang.su
 * @date 2020-04-29 17:44
 */
@RequestMapping("/personal")
@Controller
public class PersonalCenterController {


    @RequestMapping("resume")
    public String resume() {
        return "index-resume";
    }


}
