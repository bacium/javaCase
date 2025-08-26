package test.thread.runnable;

/**
 * @Author: bai12
 * @Date: 2025-08-26 下午10:06
 * @Description: ""
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class RunnableThreadCase {
    public static void main (String[] args) {
        Runnable rt=new RunableThread();
        Thread thread=new Thread(rt);
        thread.start();
    }
}
