package com.javase.SE09_io;

import org.junit.jupiter.api.Test;

import java.io.*;

public class Demo13_BufferedInputStream {
    /*BufferedInputStream演示
    * 1.缓冲字节输入流*/

    public static void main(String[] args) throws IOException {


    }
    @Test
    public void bufferedInputStream01() throws IOException {
        String filePathc = "C:\\Users\\Uriku\\Desktop\\new2.txt";

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePathc));

        int readData = 0;
        while((readData = bufferedInputStream.read()) != -1){
            System.out.print((char) readData);
        }

        bufferedInputStream.close();
    }

    @Test
    public void bufferedInputStream02() throws IOException {
        String filePath = "C:\\Users\\Uriku\\Desktop\\new2.txt";

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));

        byte[] buf = new byte[1024];
        int readData = 0;
        
        while ((readData = bufferedInputStream.read(buf)) !=1){
            System.out.println(new String(buf,0,readData));
        }
        
        bufferedInputStream.close();
    }
}
