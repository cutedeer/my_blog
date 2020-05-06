package com.sushuzhuang.blogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 文章相关
 *
 * @author shuzhuang.su
 * @date 2020-04-29 18:13
 */
@RequestMapping("/article")
@Controller
public class ArticleController {

    @RequestMapping("/informalEssay")
    public String informalEssay() {
        return "category-grid";
    }


    @RequestMapping("/technology")
    public String technology() {
        return "category-traditional";
    }

    @RequestMapping("/ancient")
    public String ancient() {
        return "single-post-fullwidth";
    }


    @RequestMapping("/english")
    public String english() {
        return "single-post-sidebar";
    }



}
