package test.thread.threadDaemon;

/**
 * @Author: bai12
 * @Date: 2025-08-26 下午10:42
 * @Description: ""
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class DaemonThread {
    public static void main (String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        t1.setName("线程1");
        t2.setName("线程2");
        t2.setDaemon(true);
        t1.start();
        t2.start();
    }
}
