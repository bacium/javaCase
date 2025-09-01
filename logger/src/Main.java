import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: bai12
 * @Date: 2025-09-01 22:37
 * @Description: ""
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class Main {
    // 获取日志对象
    private  static  final Logger LOGGER= LoggerFactory.getLogger(Main.class);
    public static void main (String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入姓名:");
        String name=scanner.nextLine();
        LOGGER.info("输入的姓名是"+name);
        System.out.println("请输入年龄:");
        String age=scanner.nextLine();
        try {
            int ageInt=Integer.parseInt(age);
            LOGGER.info("输入的年龄正确:"+age);
        } catch (java.lang.Exception e) {
            LOGGER.info("输入的年龄有误:"+age);
        }

    }
}