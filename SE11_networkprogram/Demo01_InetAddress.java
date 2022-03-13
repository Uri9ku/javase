package com.javase.SE11_networkprogram;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo01_InetAddress {
    /*InetAddress类的使用*/
    public static void main(String[] args) throws UnknownHostException {
        //1.获取本机的InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//DESKTOP-DEG9M32/192.168.28.1

        //2.根据指定主机名获取InetAddress对象
        InetAddress byName = InetAddress.getByName("DESKTOP-DEG9M32");
        System.out.println(byName);//DESKTOP-DEG9M32/192.168.28.1

        //3.根据域名返回InetAddress对象
        InetAddress byName1 = InetAddress.getByName("www.baidu.com");
        System.out.println(byName1);//www.baidu.com/183.232.231.172,可能会改变

        //4.根据InetAddress对象获取对应的IP地址
        System.out.println(byName1.getHostAddress());//183.232.231.172

        //5.通过InetAddress对象获取主机名或者域名
        System.out.println(byName1.getHostName());
    }
}
