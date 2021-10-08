package com.springframework.di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class DiController {

    public String getHelloMessage(){
        return "Hello World!!!";
    }
}
