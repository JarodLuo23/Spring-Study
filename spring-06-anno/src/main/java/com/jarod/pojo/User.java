package com.jarod.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class User {
//    相当于<property name="name" value="Jarod"/>
//    @Value("Jarod")
    public String name;

    @Value("Jarod2")
    public void setName(String name) {
        this.name = name;
    }
}
