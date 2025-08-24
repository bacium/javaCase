package test.filecopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: bai12
 * @Date: 2025-08-24 下午8:44
 * @Description: 文件复制功能demo,将D盘下的avatar.png复制到项目里面的avatar.png.
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class CopyFile {
    public static void main (String[] args) throws IOException {
        FileInputStream fis= new FileInputStream("D:\\BaiduNetdiskDownload\\avatar.png");
        FileOutputStream fos = new FileOutputStream("javaBase\\avatar.png");
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        fos.close();
        fis.close();
    }
}
