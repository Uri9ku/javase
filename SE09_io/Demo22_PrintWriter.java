package com.javase.SE09_io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo22_PrintWriter {
    /*PrintWriter 打印字符流*/
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.print("飒飒水水");
        String filePath = "C:\\Users\\Uriku\\Desktop\\new6.txt";

        //更改输出位置
        PrintWriter printWriter1 = new PrintWriter(new FileWriter(filePath));
       printWriter1.print("呃呃呃呃呃");

        printWriter1.close();
        printWriter.close();
    }
}
