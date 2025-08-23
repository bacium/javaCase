package test.outputFileStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    public static void main (String[] args) {
        File file=new File("javaBase\\outputStream.txt");
        try {
            boolean newFile = file.createNewFile();
            if (newFile){
                FileOutputStream fos=new FileOutputStream("javaBase\\outputStream.txt");
                fos.write(99);
                fos.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }
}
