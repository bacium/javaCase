package test.socket.base;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: bai12
 * @Date: 2025-08-29 下午10:00
 * @Description: ""
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class ServerCase {
    public static void main (String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("start server");
        Socket accept = serverSocket.accept();
        System.out.println("accept connection");
        InputStream inputStream = accept.getInputStream();
        int b;
        while ((b = inputStream.read()) != -1) {
            System.out.print((char) b);
        }
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        writer.write("你是哪位?");
        writer.close();
        serverSocket.close();
    }
}
