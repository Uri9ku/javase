package com.javase.SE09_io;

import java.io.*;

public class Demo19_InputStreamReader {
    /*使用InputStreamReader转化流解决中文乱码问题
    * 将字节流 FileInputStream转化成字符流,指定编码*/

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Uriku\\Desktop\\new3.txt";

        //1.把FileInputStream 转成 InputStreamReader
        //2.指定编码 gbk
        //InputStreamReader inputStreamReader =  new InputStreamReader(new FileInputStream(filePath),"gbk");
        //3.把 InputStreamReader 传入 BufferedReader

        //BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        //合并后的写法，套娃
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"gbk"));

        String line;


        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();


    }
}
