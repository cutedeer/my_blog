package com.sushuzhuang.blogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 商店
 *
 * @author shuzhuang.su
 * @date 2020-04-29 18:07
 */
@RequestMapping("/shop")
@Controller
public class ShopController {

    @RequestMapping("/center")
    public String shop(){
        return "index-shop";
    }
}
