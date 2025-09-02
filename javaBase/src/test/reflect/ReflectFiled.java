package test.reflect;

import java.lang.reflect.Field;

/**
 * @Author: bai12
 * @Date: 2025-09-02 23:17
 * @Description: ""
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class ReflectFiled {
    public static void main (String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class aClass = Class.forName("test.reflect.Student");
        // 1 使用getFields获取类中的公共属性
        getFieldsFor_getFields(aClass);
        // 2 使用getDeclaredFields获取类中的所有属性
        getDeclaredFieldsFor_getDeclaredFields(aClass);
        // 3 使用getField获取类中的公共属性
        getFieldFor_getField(aClass);
        // 3 使用getDeclaredField获取类中的特定属性
        getDeclaredFieldFor_getDeclaredField(aClass);

    }

    private static void getDeclaredFieldFor_getDeclaredField (Class aClass) throws NoSuchFieldException {
        Field name = aClass.getDeclaredField("name");
        System.out.println(name);
    }

    private static void getFieldFor_getField (Class aClass) throws NoSuchFieldException {
        Field field = aClass.getField("test");
        System.out.println(field);
    }

    private static void getDeclaredFieldsFor_getDeclaredFields (Class aClass) {
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
    }

    private static void getFieldsFor_getFields (Class aClass) {
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }
}
