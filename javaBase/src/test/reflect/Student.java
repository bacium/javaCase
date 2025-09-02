package test.reflect;

/**
 * @Author: bai12
 * @Date: 2025-09-02 22:54
 * @Description: ""
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class Student {
    private String name;
    private int age;
    private String gender;
    public String test;

    public Student () {
    }

    public Student (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getGender () {
        return gender;
    }

    public void setGender (String gender) {
        this.gender = gender;
    }

    @Override
    public String toString () {
        return "Student{" +
                "name=" + name +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
    private void function () {
        System.out.println("自定义的private===>Function");
    }
    public void function1 () {
        System.out.println("自定义的public===>Function1");
    }
    private String function2 () {
        System.out.println("自定义的private===>Function2===>带Return");
        return  "function2";
    }

    public int function3 () {
        System.out.println("自定义的public===>Function3===>带return");
        return  123;
    }
}
