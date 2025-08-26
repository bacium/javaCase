package test.thread.threadDaemon;

/**
 * @Author: bai12
 * @Date: 2025-08-26 下午10:40
 * @Description: ""
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class Thread1 extends  Thread{
    @Override
    public void run () {
        for (int i = 0; i < 10; i++) {
            System.out.println( Thread.currentThread().getName()+"===>"+i);
        }
    }
}
