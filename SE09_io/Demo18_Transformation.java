package com.javase.SE09_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo18_Transformation {
    /*转化
    * 1.中文乱码问题
    * 2.默认情况下，读取文件是按照utf-8编码读取，不是UTF-8的编码会乱码，因为没有指定读取编码方式
    * 3.使用字节流来指定编码之后转化成字符流，就不会乱码，字节流转化成字符流的流叫做转化流,看Demo19*/
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Uriku\\Desktop\\new3.txt";
        //字符流
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line;

        while((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }

        //关闭流
        bufferedReader.close();

    }
}
