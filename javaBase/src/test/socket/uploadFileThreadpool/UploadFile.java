package test.socket.uploadFileThreadpool;

import java.io.*;
import java.net.Socket;

/**
 * @Author: bai12
 * @Date: 2025-08-30 下午8:52
 * @Description: "文件上传客户端"
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class UploadFile {
    public static void main (String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",10000);
        // 读取文件中的流
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("javaBase\\src\\test\\socket\\uploadFileThreadpool\\file\\avatar.png"));

        // 网络流
        OutputStream outputStream = socket.getOutputStream();
        BufferedOutputStream bos=new BufferedOutputStream(outputStream);
        int b;
        while((b=bis.read())!=-1){
            // 写入网络中的流
            bos.write(b);
        }
        socket.shutdownOutput();
        outputStream.flush();

        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }

        br.close();
        bis.close();
        socket.close();
    }
}
