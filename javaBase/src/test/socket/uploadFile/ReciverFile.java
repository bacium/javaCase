package test.socket.uploadFile;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

/**
 * @Author: bai12
 * @Date: 2025-08-30 下午8:53
 * @Description: "文件上传服务端"
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class ReciverFile {
    public static void main (String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);

        System.out.println("Waiting for a client ...");
        while (true) {
            Socket socket = serverSocket.accept();
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            UUID uuid = UUID.fromString(UUID.randomUUID().toString());

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("javaBase\\src\\test\\socket\\uploadFile\\file\\"+ uuid +".png"));
            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }

            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            BufferedReader br = new BufferedReader(isr);

            OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write("上传成功");
            bw.newLine();
            bw.flush();

            bw.close();
            br.close();
            socket.close();
        }
        // serverSocket.close();
    }
}
