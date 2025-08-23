package test.outputFileStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class IoException {
    public static void main (String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("javaBase\\outputStream.txt");
            fos.write(100);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
