package com.gorvic.pm.mongodb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CardController {
    @RequestMapping("/card")
    public String getCard() {
        return "pass";
    }
}
