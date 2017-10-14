package ru.teamidea.agileqa.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController{

    @RequestMapping("/hello")
    public String hello() {
        return "index"; // this is view name
    }

    @RequestMapping("/hello-body")
    @ResponseBody
    public String helloBody() {
        return "<h2>HELLO FROM CLASS</h2>";
    }
}