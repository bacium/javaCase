package test.filecopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: bai12
 * @Date: 2025-08-24 下午9:03
 * @Description: 复制文件的多字节处理方法,可以有效提升复制文件时的性能和速度.
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class CopyFile1 {
    public static void main (String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("javaBase\\avatar.png");
        FileOutputStream fos=new FileOutputStream("javaBase\\src\\test\\filecopy\\avatar.png");
        byte[] buffer=new byte[1024];
        int len;
        while ((len= fis.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }
        fis.close();
        fos.close();

    }
}
