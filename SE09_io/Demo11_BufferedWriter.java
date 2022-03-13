package com.javase.SE09_io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo11_BufferedWriter {
    /*BufferedWriter演示*/

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Uriku\\Desktop\\new2.txt";

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));

        bufferedWriter.write("Hello");
        bufferedWriter.newLine();  //插入和系统相关的一个换行符
        bufferedWriter.write("Hello");

        bufferedWriter.close();
    }
}
