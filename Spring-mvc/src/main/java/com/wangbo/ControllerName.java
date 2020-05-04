package com.wangbo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerName {

    @RequestMapping("/hello.do")
    public ModelAndView sava(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name","狗狗");
        mv.setViewName("ViewHello");
        return mv;
    }
}
