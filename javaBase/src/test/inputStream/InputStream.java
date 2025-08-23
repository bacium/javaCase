package test.inputStream;

import java.io.FileInputStream;
import java.io.IOException;


public class InputStream {
    public static void main (String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("javaBase\\outputStream.txt");
        int result = fis.read();
        System.out.println((char) result);
        fis.close();
    }
}
