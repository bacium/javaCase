package test.xml;


import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: bai12
 * @Date: 2025-09-04 21:36
 * @Description: ""
 * Copyright (c) 2025 bai12 All rights reserved.
 */
public class XmlParseDemo {
    public static void main (String[] args) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("D:\\java\\code\\javaCase\\javaBase\\src\\test\\xml\\student.xml"));
        // 获取根标签
        Element rootElement = document.getRootElement();
        // 根标签获取元素 ,返回值是一个元素list
        List<Element> elements = rootElement.elements("student");
        ArrayList<Student> students = new ArrayList<>();

        // 遍历元素list
        for (Element element : elements) {
            // 获取元素属性
            Attribute id = element.attribute("id");
            String id_value = id.getValue();
            // System.out.println(id_value);
            // 获取元素名称
            Element name = element.element("name");
            Element ageEl = element.element("age");
            // 获取元素内容
            String text = name.getText();
            int age =Integer.parseInt(ageEl.getText());
            Student student=new Student(text,age);
            students.add(student);
            // System.out.println(id_value+"========="+text);
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
