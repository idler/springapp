package ru.teamidea.agileqa.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.teamidea.agileqa.model.User;

@Controller
public class MainController{

//    @Resource(name = "dataSource")
//    private DataSource dataSource;

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

