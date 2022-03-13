package com.javase.SE09_io;

import org.junit.jupiter.api.Test;

import java.io.*;

public class Demo03_FileTest {
    public static void main(String[] args) {

    }

    @Test
    //判断文件是否存在，存在就删除
    //在Java编程中，目录也被当作文件，也可以删掉目录
    public void  mi(){
        String fileName = "C:\\Users\\Uriku\\Desktop\\hhh";
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
            System.out.println("删除成功");
        }else {
            System.out.println("文件不存在");
        }
    }

    @Test
    //判断目录是否存在，不存在就创建
    public void  mi2(){
        String fileName = "C:\\Users\\Uriku\\Desktop\\newDir";
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("存在");
        }else {
            file.mkdirs(); //创建多级目录
            //file.mkdir() 这个是创建一级目录
            System.out.println("目录创建成功");
        }
    }

}
