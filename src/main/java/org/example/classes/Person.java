package org.example.classes;

import java.io.Serializable;

public class Person implements Serializable {
    private final String name;
    private final int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "This person's name is " + name + ", and their age is " + age;
    }
}