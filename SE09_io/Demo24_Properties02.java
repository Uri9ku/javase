package com.javase.SE09_io;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Demo24_Properties02 {
    //使用Properties类来读取mysql.properties文件
    public static void main(String[] args) throws IOException {
        //1.创建Properties对象
        Properties properties = new Properties();

        //2.加载指定配置文件
        String filePath = "src/com/javase/io/mysql.properties";
        properties.load(new FileReader(filePath));

        //3.把键值对k-v显示到控制台
        properties.list(System.out);

        //4.根据k获取对应的值
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");

        System.out.println("\n用户名：" + user + "\n密码：" + pwd);
    }
}
