package com.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControl {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test (){
        return "this is a normal String";
    }
}
