package test.thread.callable;

import java.util.concurrent.FutureTask;

/**
 * @Author: bai12
 * @Date: 2025-08-26 下午10:22
 * @Description: ""
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class CallableThreadCase {
    public static void main (String[] args) {
        CallableThread ct = new CallableThread();
        // 线程中间件
        FutureTask ft = new FutureTask(ct);
        // 调用线程构造
        Thread t1 = new Thread(ft);
        t1.start();
    }
}
