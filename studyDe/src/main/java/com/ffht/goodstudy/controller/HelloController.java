package com.ffht.goodstudy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

        @RequestMapping("/hi")
        public String hello(){
            return "Hello word";
        }
}
