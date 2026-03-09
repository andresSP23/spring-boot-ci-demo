package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String  hello(){

        return  "Demo para practicar ci cd ya acabado pues paewegew";
    }
}
