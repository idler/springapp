package ru.teamidea.agileqa.controller;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.teamidea.agileqa.model.User;

@Controller
public class MainController{

//    @Resource(name = "dataSource")
//    private DataSource dataSource;
@Autowired
private SessionFactory sessionFactory;

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


        Session session;

        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }

session.save(u);
        return u;
    }

}

