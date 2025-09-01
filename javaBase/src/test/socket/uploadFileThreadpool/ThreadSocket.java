package test.socket.uploadFileThreadpool;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

/**
 * @Author: bai12
 * @Date: 2025-09-01 下午9:09
 * @Description: ""
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class ThreadSocket implements Runnable {
    private   Socket socket;

    public ThreadSocket (Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run () {
        BufferedReader br = null;
        BufferedOutputStream bos=null;
        try {
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            UUID uuid = UUID.fromString(UUID.randomUUID().toString());

             bos = new BufferedOutputStream(new FileOutputStream("javaBase\\src\\test\\socket\\uploadFileThreadpool\\file\\"+ uuid +".png"));
            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }

            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
             br = new BufferedReader(isr);

            OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write("上传成功");
            bw.newLine();
            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(bos!=null){
                try {
                    bos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
