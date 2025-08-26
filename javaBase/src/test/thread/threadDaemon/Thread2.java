package test.thread.threadDaemon;

/**
 * @Author: bai12
 * @Date: 2025-08-26 下午10:41
 * @Description: ""
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class Thread2 extends Thread{
    @Override
    public void run () {
        super.run();
        for (int i = 0; i < 100; i++) {
            System.out.println( Thread.currentThread().getName()+"===>"+i);
        }
    }
}
