package test.socket.base;

import java.io.IOException;
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
        out.close();
        socket.close();
    }
}
