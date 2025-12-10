package com.example.demo1210AwsDeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

   // @ResponseBody
    @GetMapping("/hello")
    public  String getData(){
        return  "hi  spring Data";
    }
}
