package com.javase.SE09_io;

import org.junit.jupiter.api.Test;

import java.io.*;

public class Demo05_FileOutputStream {
    /*FileOutnputStream类的案例（字节输出流）*/
    public static void main(String[] args) {

    }

    @Test
    public void  write(){
        String filepath = "C:\\Users\\Uriku\\Desktop\\new2.txt";

        FileOutputStream fileoutputStream = null;

        try {
            fileoutputStream = new FileOutputStream(filepath);
            //写入一个字节
            //fileoutputStream.write('H');
            //写入一个字符串
            String str = "Hello,world";
            //把字符串转化为字节数组
            fileoutputStream.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileoutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void  write02(){
        String filepath = "C:\\Users\\Uriku\\Desktop\\new2.txt";

        FileOutputStream fileoutputStream = null;

        try {
            //1.new FileOutputStream(filepath); 创建方式，当写入的内容，会覆盖
            //2.new FileOutputStream(filepath,true);创建方式，当写入的内容是追加
            fileoutputStream = new FileOutputStream(filepath,true);
            //写入一个字节
            //fileoutputStream.write('H');
            //写入一个字符串
            String str = "Hjjjello,world";
            //把字符串转化为字节数组       (转化为字节数组，索引，长度)
            //fileoutputStream.write(str.getBytes(),0,str.length()); //全部长度
            fileoutputStream.write(str.getBytes(),4,1); //一个长度
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileoutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
