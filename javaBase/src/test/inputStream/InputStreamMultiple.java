package test.inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: bai12
 * @Date: 2025-08-24 下午8:17
 * @Description: Copyright (c) 2025 bai12 All rights reserved.
 */
public class InputStreamMultiple {
    public static void main (String[] args) throws IOException {
        //        创建并写入文件内容
        File egFile = new File("javaBase\\input.txt");
        boolean inputFlag = egFile.createNewFile();
        if (inputFlag) {
            FileOutputStream input = new FileOutputStream("javaBase\\input.txt");
            byte[] buffer = {97, 98, 99, 100};
            input.write(buffer);
            input.close();
        }
        /*
         *  读取创建的文件内容并通过变量b输出
         * 此处输出逻辑是从文件中读取数据,如果读不到数据则返回-1,因此文件没有内容通过-1判断,并将读取的数据赋值给变量b
         * */
        FileInputStream getFile = new FileInputStream("javaBase\\input.txt");
        int b;
        while ((b = getFile.read()) != -1) {
            System.out.println((char) b);
        }
        getFile.close();

    }
}
