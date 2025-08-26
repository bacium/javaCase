package test.thread.threadDemo;

/**
 * @Author: bai12
 * @Date: 2025-08-26 下午9:39
 * @Description: ""
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class MyThreadCase {
    public static void main (String[] args) {
        MyThread mt1=new MyThread("线程一");
        MyThread mt2=new MyThread("线程二");
//        mt1.setName("线程1");
//        mt2.setName("线程2");
        mt1.start();
        mt2.start();
    }
}
