package com.ziyu.ziyu;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public  String hello(){
        return "Hello ziyu!";
    }

    @GetMapping(value = "/test")
    public  String test(){
        return "Hello ziyu!";
    }
}
