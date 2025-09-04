package test.xml;

/**
 * @Author: bai12
 * @Date: 2025-09-04 22:01
 * @Description: ""
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class Student {
    private String name;
    private int age;

    public Student () {
    }

    public Student (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    @Override
    public String toString () {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
