package com.abc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public ModelAndView hello(@RequestParam String content, ModelAndView mv){
        mv.addObject("result","hello"+content);
        mv.setViewName("index");
        return mv;
    }
}
