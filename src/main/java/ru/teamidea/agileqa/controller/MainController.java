package ru.teamidea.agileqa.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController{

    @RequestMapping("/hello")
    public String hello() {

        return "<h2>HELLO FROM CLASS</h2>";
    }
}