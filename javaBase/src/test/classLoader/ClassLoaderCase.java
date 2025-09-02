package test.classLoader;

/**
 * @Author: bai12
 * @Date: 2025-09-02 20:54
 * @Description: ""
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class ClassLoaderCase {
    public static void main (String[] args) {
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        ClassLoader clParent = cl.getParent();
        ClassLoader clParentParent = clParent.getParent();

        System.out.println(cl+"---------->cl");
        System.out.println(clParent+"---------->clParent");
        System.out.println(clParentParent+"---------->clParentParent");
    }
}
