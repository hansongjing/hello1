package com.han.demo.pojo;

import com.han.demo.testAnnotation.Table;
import com.han.demo.testAnnotation.filed;

/**
 * Created by hanhansongjiang on 16/4/27.
 */
@Table(name="users")
public class User {

    @filed(name = "id" )
    private int id;

    @filed(name="name")
    private String name;
    @filed(name="age")
    private int age;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
