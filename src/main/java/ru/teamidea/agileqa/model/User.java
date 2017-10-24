package ru.teamidea.agileqa.model;

import javax.persistence.*;

/**
 * Created by max on 14.10.2017.
 */
@Entity
@Table(name = "person")
public class User {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name="age")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
