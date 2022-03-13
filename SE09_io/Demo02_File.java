package com.javase.SE09_io;

import org.junit.jupiter.api.Test;

import java.io.File;

public class Demo02_File {
    /*文件的操作*/
    public static void main(String[] args) {

    }

    @Test
    //获取文件信息
    public void info(){
        //创建文件对象
        File file = new File("C:\\Users\\Uriku\\Desktop\\new.txt");
        //文件名
        System.out.println("文件名：" + file.getName());

        //绝对路径
        System.out.println("文件绝对路径：" + file.getAbsoluteFile());

        //文件父目录
        System.out.println("文件父目录：" + file.getParent());

        //文件大小（字节统计）
        System.out.println("文件大小（字节）：" + file.length());

        //是不是文件
        System.out.println("是不是文件:" + file.isFile());

        //是不是目录
        System.out.println("是不是目录：" + file.isDirectory());

        //是否存在
        System.out.println("是否存在：" + file.exists());
    }
}
