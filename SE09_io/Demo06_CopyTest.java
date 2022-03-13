package com.javase.SE09_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo06_CopyTest {
    /*文件拷贝
    * 运用文件的字节输入输出流进行文件拷贝*/
    public static void main(String[] args) {
        //将桌面new2复制到桌面\新建文件夹 ,什么文件都行
        //思路
        //1.创建文件的输入流，将文件写入到程序
        //2.创建文件的输出流，将文件读取到文件数据到指定的文件

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        //源文件路径
        String srcFilePath = "C:\\Users\\Uriku\\Desktop\\new2.txt";

        //目标文件路径
        String destFilePath = "C:\\Users\\Uriku\\Desktop\\new\\new2.txt";
        try {
            //文件输入流
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);
            //字节数字一次性读取，效率高
            //定义一个字节数组，一次读取1021个字节
            byte[] buf = new byte[1024];
            //读取的内容长度
            int readLen = 0;
            while((readLen = fileInputStream.read(buf)) != -1){
                //读取到后，就写入到文件，通过fileOutStream
                //即，一边读一边写
                fileOutputStream.write(buf,0,readLen); //一定要这个方法
            }
            System.out.println("复制成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {

                    fileInputStream.close();
                }

                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
