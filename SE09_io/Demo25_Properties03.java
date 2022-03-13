package com.javase.SE09_io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo25_Properties03 {
    //使用Properties类来创建、修改配置文件
    /*Properties类父类是Hashtable，底层是Hashtable核心方法*/

    public static void main(String[] args) throws IOException {
        //1.创建对象
        Properties properties = new Properties();

        //2.创建配置文件
        properties.setProperty("chareat","utf8");
        properties.setProperty("username","尤吉欧"); //中文保存的是unicode码
        properties.setProperty("password","12345");

        //3.将k-v存储到文件中
        String filePath = "src/com/javase/io/mysql2.properties";
        properties.store(new FileOutputStream(filePath),"这个是注释"); //comment是注释

        //4.修改k-v,不存在的k会创建，有则会覆盖
        properties.setProperty("age","11");
        properties.store(new FileOutputStream(filePath),"这个是注释"); //comment是注释

    }
}
