package com.how2java.springboot.web;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class HelloController {
 private int bum=12;
    @RequestMapping("/hello")
    public String hello(Model m) {
    	m.addAttribute("name", "thymeleaf");
        return "hello";
    }
}