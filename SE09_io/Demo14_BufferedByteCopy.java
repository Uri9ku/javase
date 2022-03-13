package com.javase.SE09_io;

import java.io.*;

public class Demo14_BufferedByteCopy {
    /*演示使用BufferedInputStream OutpuStream复制*/
    //可复制任何一个文件，可以完成二进制文件复制
    //也可以复制文本文件，但是可能会乱码

    public static void main(String[] args) {
        String srcFilePath = "C:\\Users\\Uriku\\Desktop\\new2.txt";
        String destFilePath = "C:\\Users\\Uriku\\Desktop\\new\\new2.txt";

        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            //FileInputStream 是 InputStream 子类 ，BufferedInputStream 是 InputStream 包装类
            bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFilePath));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFilePath));

            //循环读取文件，
            byte[] buf = new byte[1024];
            int readLen = 0;

            while((readLen = bufferedInputStream.read(buf)) != -1){
                bufferedOutputStream.write(buf,0,readLen);

            }


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
