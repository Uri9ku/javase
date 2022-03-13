package com.javase.SE09_io;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;

public class Demo07_FileReader {
    /*字符流
     * FileReader 文件字符输入流
     * FileWriter 文件字符输出流*/
    public static void main(String[] args) {
        Demo07_FileReader demo07 = new Demo07_FileReader();
        demo07.wirte02();
    }

    @Test
    //FileReader 文件字符输入流
    //循环读取
    public void wirte() {
        String filePath = "C:\\Users\\Uriku\\Desktop\\new2.txt";
        FileReader fileReader = null;
        //读取的内容
        int data = ' ';

        try {
            //1.创建对象
             fileReader = new FileReader(filePath);

            //2.循环读取，使用read，单个字符读取,不会乱码
            while((data = fileReader.read()) != -1){
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test

    //FileReader 文件字符输入流
    //字符数组读取文件，这个效率高
    public void wirte02(){
        String filePath = "C:\\Users\\Uriku\\Desktop\\new2.txt";
        FileReader fileReader = null;
        //读取的内容，返回int就是读取到的内容的以二进制表现的，下面通过转化为字符串输出
        int readLen = 0;
        //一次性读取多少
        char[] buf = new char[8];

        try {
            //1.创建对象
            fileReader = new FileReader(filePath);

            //2.循环读取，使用read(buf)，返回的是实际读取的字符数
            //如果返回-1，说明文件结束
            while((readLen = fileReader.read(buf)) != -1){
                System.out.print(new String(buf,0,readLen));
                //buf，偏移量/索引，readlen
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
