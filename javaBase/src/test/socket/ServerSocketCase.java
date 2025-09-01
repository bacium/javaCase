package test.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketCase {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(8888);
        System.out.println("socket创建^ - ^");
        Socket accept = ss.accept();
        System.out.println("socket收到来自"+accept.getInetAddress()+"信息");
        InputStream stream = accept.getInputStream();
        int b;
        while ((b=stream.read())!=-1){
            System.out.println((char) b);
        }
        stream.close();
        ss.close();
    }
}
