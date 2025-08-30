package test.socket.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author: bai12
 * @Date: 2025-08-29 下午10:00
 * @Description: ""
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class ClientCase {
    public static void main (String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream out = socket.getOutputStream();
        out.write("hello".getBytes());
        socket.shutdownOutput();
        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line=br.readLine()) != null) {
            System.out.print(line);
        };
        br.close();
        socket.close();
    }
}
