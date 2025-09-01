package test.socket.uploadFileThreadpool;

import test.socket.uploadFileThreadpool.ThreadSocket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.*;

/**
 * @Author: bai12
 * @Date: 2025-08-30 下午8:53
 * @Description: "文件上传服务端"
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class ReciverFile {
    public static void main (String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);
        ThreadPoolExecutor pool=new ThreadPoolExecutor(
                3,
                10,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                new ThreadPoolExecutor.AbortPolicy()
        );
        System.out.println("Waiting for a client ...");
        while (true) {
            Socket socket = serverSocket.accept();
           ThreadSocket ts=new ThreadSocket(socket);
           // new Thread(ts).start();
            pool.submit(ts);
        }
    }
}
