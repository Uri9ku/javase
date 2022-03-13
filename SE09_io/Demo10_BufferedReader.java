package com.javase.SE09_io;

import java.io.BufferedReader;
import java.io.FileReader;

public class Demo10_BufferedReader {

    /*演示BufferedReader*/
    public static void main(String[] args) throws Exception {
        String filePath = "C:\\Users\\Uriku\\Desktop\\new2.txt";

        //1.创建对象
        //BufferedReader 包装了FileReader，实际用的是filereader类
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        //2.读取文件

        String line;
        //按行读取，效率高
        // 返回字符串，返回空时，文件读取完毕


        while((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }

        //关闭流
        bufferedReader.close();
    }
}
