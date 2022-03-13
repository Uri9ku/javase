package com.javase.SE09_io;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;

public class Demo04_FileInputStream {
    /*FileInputStream类的案例（字节输入流）*/
    public static void main(String[] args) {

    }

    @Test
    public void readFile01(){
        int readData = 0;
        File filePath = new File("C:\\Users\\Uriku\\Desktop\\new2.txt");
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            //fileInputStream.read(); //如果返回-1，则表示读取完毕。这个方法读取的是一个字节一个字节的内容
            while ((readData = fileInputStream.read())!=-1){
                System.out.print((char) readData); //将读取的内容转化为char;中文就得字符流，不然会乱码
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //IO流文件读取完成之后要关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    //使用read(byte[] b) 效率更高
    public void readFile02(){
        //字节数组
        byte[] buf = new byte[8]; //一次读取8个字节
        File filePath = new File("C:\\Users\\Uriku\\Desktop\\new2.txt");
        FileInputStream fileInputStream = null;
        int readLen = 0; //读取长度
        try {
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取最多len字节的数据为字节数组。 如果len不为零，
            //该方法将阻塞，直到某些输入可用; 否则，不会读取字节，并返回0 。
            //如果返回-1，则表示读取完毕。
            //如果读取正常，返回实际读取的字节数
            while ((readLen = fileInputStream.read(buf))!=-1){
                System.out.print(new String(buf,0,readLen)); //将读取的内容转化为char;中文就得字符流，不然会乱码
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //IO流文件读取完成之后要关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
