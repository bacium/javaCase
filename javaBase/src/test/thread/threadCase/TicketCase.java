package test.thread.threadCase;

/**
 * @Author: bai12
 * @Date: 2025-08-27 下午9:23
 * @Description: ""
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class TicketCase {
    public static void main (String[] args) {
        Ticket ticket = new Ticket();
        Thread thread1 = new Thread(ticket);
        Thread thread2 = new Thread(ticket);
        Thread thread3 = new Thread(ticket);
        thread1.setName("老大");
        thread2.setName("老二");
        thread3.setName("老三");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
