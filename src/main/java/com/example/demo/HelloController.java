package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fengy on 2017/10/1.
 */
@RestController
public class HelloController {
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello(){
        return "hi";
    }
}
