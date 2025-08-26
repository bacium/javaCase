package test.buffer;

import java.io.*;
import java.util.Arrays;

/**
 * @Author: bai12
 * @Date: 2025-08-25 下午9:15
 * @Description: "读取sort文件中的数据,然后排序再写入到文件sort2中"
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class BufferCase {
    public static void main (String[] args) throws IOException {
//        读取文件数据
        BufferedReader br = new BufferedReader(new FileReader("javaBase\\src\\test\\buffer\\sort.txt"));
        String str = br.readLine();
//        读取结果处理
        String[] strings = str.split(" ");
        int[] numList = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            String smallStr=strings[i];
            int number = Integer.parseInt(smallStr);
            numList[i] = number;
        }
        br.close();
//        排序
        Arrays.sort(numList);
        System.out.println(Arrays.toString(numList));
//        写入数据
        BufferedWriter bw=new BufferedWriter(new FileWriter("javaBase\\src\\test\\buffer\\sort2.txt"));
        for (int i : numList) {
            bw.write(i+" ");
            bw.flush();
        }
        bw.close();
    }
}
