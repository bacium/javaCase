package test.outputFileStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamByte {
    public static void main (String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("javaBase\\outputStream.txt");
        byte[] bytes={97,98,99,100,101,102,103,104,105};
        fos.write(bytes,0,bytes.length);
        fos.close();

    }
}
