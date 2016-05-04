package com.han.demo.testAnnotation;

import com.han.demo.pojo.User;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * Created by hanhansongjiang on 16/5/3.
 */
public class Main{
public static void main(String args[]){
    try {
       Class c= Class.forName("com.han.demo.pojo.User");
     Annotation a=   c.getAnnotation(Table.class);
        Field field = c.getDeclaredField("id");
       filed  a2=field.getAnnotation(filed.class);

        System.out.println(a2.name()+a2.type());
    } catch (Exception e) {
        e.printStackTrace();
    }

    System.out.println("hello");
}
}
