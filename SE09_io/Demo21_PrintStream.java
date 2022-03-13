package com.javase.SE09_io;

import java.io.IOException;
import java.io.PrintStream;

public class Demo21_PrintStream {
    /*PrintStream 打印字节流*/

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Uriku\\Desktop\\new5.txt";

        PrintStream printStream = System.out;

        //在默认情况下，PrintStream 输出的数据的位置是 标准输出，即显示器
        //可以更改打输出的位置
        printStream.print("filePath");  //输出到显示器,最后使用wirte方法

        //因为print底层使用的是write，可以用write进行打印/输出
        printStream.write("filePath".getBytes());//和上面一致

        //更改打印流的输出位置
        System.setOut(new PrintStream(filePath));
        System.out.println("sadadSDFSD");
        printStream.close();

    }
}
