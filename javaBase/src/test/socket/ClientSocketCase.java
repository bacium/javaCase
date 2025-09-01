package test.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientSocketCase {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("localhost",8888);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(100);
        outputStream.close();
        socket.close();
    }
}
