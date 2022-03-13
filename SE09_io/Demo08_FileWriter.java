package com.javase.SE09_io;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;


public class Demo08_FileWriter {
    /*FileWriter字符输出流*/

    public static void main(String[] args) {

    }


@Test
    //指定部分内容
    public void fileWrite02(){
        String filePath = "C:\\Users\\Uriku\\Desktop\\new2.txt";

        FileWriter fileWriter = null;

        char[] chars = {'a','b','c'};
        String str = "指定内容";

        try {
            fileWriter = new FileWriter(filePath,true);
            //1.写入一个字符
            fileWriter.write('a');
            //2.写入一个字符数组
            fileWriter.write(chars);
            //3.写入一个字符数组，指定内容，write(char[],off，len)
            fileWriter.write("HQEE",0,2);
            //4.写入一个在字符串
            fileWriter.write("你好JAVA");
            //5.指定字符串的某一部分
            fileWriter.write("伤害添加",0,2);
            // 在数据量大的情况下，可以用循环
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
