package com.gorvic.pm.mongodb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {

    @GetMapping("/showmedemo")
    public ModelAndView showMeDemo() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("pass");
        modelAndView.addObject("message", "Hello!!!");
        return modelAndView;
    }
}
