package test.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: bai12
 * @Date: 2025-09-02 23:28
 * @Description: ""
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class ReflectMethod {
    public static void main (String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class aClass = Class.forName("test.reflect.Student");
        // 1获取类中所有的方法,包括继承的
        //getMethodsFor_getMethods(aClass);
        // 2获取类中所有的方法,不包括继承的
        //getDeclaredMethodsFor_getDeclaredMethods(aClass);
        Student instance = (Student) aClass.newInstance();
        Method function2 = aClass.getMethod("function2");
        System.out.println(function2);
        function2.setAccessible(true);
        function2.invoke(instance);

    }

    private static void getDeclaredMethodsFor_getDeclaredMethods (Class aClass) {
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
    }

    private static void getMethodsFor_getMethods (Class aClass) {
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
