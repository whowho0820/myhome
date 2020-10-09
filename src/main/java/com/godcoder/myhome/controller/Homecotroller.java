package com.godcoder.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homecotroller {

    @GetMapping
    public String index() {
        return "index";
    }
}
