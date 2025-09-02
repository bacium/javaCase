package test.classLoader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author: bai12
 * @Date: 2025-09-02 21:00
 * @Description: ""
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class ClassLoaderDemo {
    public static void main(String[] args) throws IOException {
        ClassLoader classloader = ClassLoader.getSystemClassLoader();
        InputStream resourceAsStream = classloader.getResourceAsStream("prop.proptiers");

        Properties properties = new Properties();
        properties.load(resourceAsStream);
        System.out.println(properties);
        resourceAsStream.close();
    }
}
