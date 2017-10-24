package ru.teamidea.agileqa.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.teamidea.agileqa.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Objects;

@Controller
public class MainController{

    @RequestMapping("/hello")
    public String hello() {
        return "index"; // this is view name
    }

    @RequestMapping(value="/",produces = "application/json")
    @ResponseBody
    public User helloBody() {
        User u = new User();
        u.setName("Vassa");
        u.setAge(9);
        return u;
    }

}

