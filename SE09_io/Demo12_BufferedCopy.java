package com.javase.SE09_io;

import java.io.*;

public class Demo12_BufferedCopy {
    /*使用BufferedReader和BufferedWriter复制文件
    * 1.BufferedReader和BufferedWriter是按照字符操作
    * 2.如果操作二进制文件，可能会损坏文件，例如复制音频、视频等等会损坏*/

    public static void main(String[] args) throws Exception {
        String srcfilePath = "C:\\Users\\Uriku\\Desktop\\new2.txt";
        String destcfilePath = "C:\\Users\\Uriku\\Desktop\\new\\new2.txt";


        BufferedReader bufferedReader = new BufferedReader(new FileReader(srcfilePath));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destcfilePath));


        String line;
        while ((line = bufferedReader.readLine()) != null) {
            //每读取一行，就写入文件
            bufferedWriter.write(line);
            //插入一个换行
            bufferedWriter.newLine();
        }

        if (bufferedReader != null) {
            bufferedReader.close();
            bufferedWriter.close();
        }


    }
}
