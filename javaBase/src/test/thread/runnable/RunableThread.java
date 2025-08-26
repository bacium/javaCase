package test.thread.runnable;

/**
 * @Author: bai12
 * @Date: 2025-08-26 下午10:05
 * @Description: ""
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class RunableThread implements Runnable {
    @Override
    public void run () {

        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "===>" + i);
        }
    }
}
