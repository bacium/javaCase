package test.thread.callable;

import java.util.concurrent.Callable;

/**
 * @Author: bai12
 * @Date: 2025-08-26 下午10:20
 * @Description: ""
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class CallableThread implements Callable<String> {


    @Override
    public String call () throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("callable thread " + i);
        }
        return "测试线程";
    }
}
