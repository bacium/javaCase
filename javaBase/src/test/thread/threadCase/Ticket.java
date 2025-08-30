package test.thread.threadCase;

/**
 * @Author: bai12
 * @Date: 2025-08-27 下午9:20
 * @Description: ""
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class Ticket implements Runnable{
        private int tickets=100;
        private Object obj=new Object();
    @Override
    public void run () {
        for (;;){
           synchronized (obj){
               if (tickets<=0){
                   System.out.println(Thread.currentThread().getName()+"卖完了,老铁");
                   break;
               }else {
                   try {
                       Thread.sleep(100);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
                   tickets--;
                   System.out.println(Thread.currentThread().getName()+"在售票,还剩:"+tickets);
               }
           }
        }
    }
}
