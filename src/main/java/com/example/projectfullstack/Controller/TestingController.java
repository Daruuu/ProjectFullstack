package com.example.projectfullstack.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestingController {


    @GetMapping(value = "/greeting")
    public String greeting(){
        return "Hello World from Springboot!";
    }

}
