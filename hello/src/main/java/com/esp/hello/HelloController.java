package com.esp.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping ("/hello")
    public String hello() {
        return "Hello";
    }
    
    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping("/helloworld")
    public String helloWorld() {
        return helloWorldService.getHelloWorld();
    }
}
