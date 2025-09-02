package test.reflect;

import java.lang.reflect.Constructor;

/**
 * @Author: bai12
 * @Date: 2025-09-02 23:00
 * @Description: ""
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class ReflectConstruct {
    public static void main (String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class clazz = Class.forName("test.reflect.Student");
        // 1使用getConstructors获取所有public 构造方法
         getConstructFor_getConstructors(clazz);

        // 2 使用getDeclaredConstructors 获取所有构造方法
         getDeclaredConstructorsFor_getDeclaredConstructors(clazz);


        // 3使用getConstructor获取特定的构造方法
         getConstructorFor_getConstructor(clazz);

        // 4使用getDeclaredConstructor获取特定的构造方法
        getDeclaredConstructorFor_getDeclaredConstructor(clazz);
    }

    private static void getDeclaredConstructorFor_getDeclaredConstructor (Class clazz) throws NoSuchMethodException {
        Constructor declaredConstructor = clazz.getDeclaredConstructor();
        System.out.println(declaredConstructor);
    }

    private static void getConstructorFor_getConstructor (Class clazz) throws NoSuchMethodException {
        Constructor constructor = clazz.getConstructor(String.class, int.class, String.class);
        System.out.println(constructor);
    }

    private static void getDeclaredConstructorsFor_getDeclaredConstructors (Class clazz) {
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
    }

    private static void getConstructFor_getConstructors (Class clazz) {
        // 使用getConstructors获取所有public 构造方法
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
    }
}
