package com.example.mycv.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "Index";
    }

    @PostMapping("/")
    public String confirm(){
        return "redirect:info";
    }


    @GetMapping("/Index/info")
    public String info(){
        return "info";
    }

}
