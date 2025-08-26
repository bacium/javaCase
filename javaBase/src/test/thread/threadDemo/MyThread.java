package test.thread.threadDemo;

/**
 * @Author: bai12
 * @Date: 2025-08-26 下午9:38
 * @Description: ""
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class MyThread extends Thread {
    public MyThread () {
    }

    public MyThread (String name) {
        super(name);
    }

    @Override
    public void run () {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName() +"_____________"+ i);
        }
    }
}
