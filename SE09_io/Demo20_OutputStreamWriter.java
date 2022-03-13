package com.javase.SE09_io;

import java.io.*;

public class Demo20_OutputStreamWriter {
    /*使用OutputStreamWriter转化流
     * 将字节流 FileInputStream转化成字符流,指定编码*/

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Uriku\\Desktop\\new4.txt";

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(filePath),"gbk");
        outputStreamWriter.write("发个邮件和而输入法");

        outputStreamWriter.close();
    }
}
