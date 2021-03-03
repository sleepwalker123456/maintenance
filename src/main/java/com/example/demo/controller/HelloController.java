package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liusj
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){return "Hello World!!!";}


}
