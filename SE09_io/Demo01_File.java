package com.javase.SE09_io;

import java.io.File;
import java.io.IOException;

public class Demo01_File {
    /*文件创建
    * */

    public static void main(String[] args) {
        Demo01_File demo01 = new Demo01_File();
        demo01.createFile();
        demo01.createFile02();
        demo01.createFile03();
    }

    //根据路径创建File文件
    public void createFile(){
        //1.创建文件路径
        String fliePath = "c:\\Users\\Uriku\\Desktop\\new.txt";

        File file = new File(fliePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

     //根据父路径文件+子路径构建
    public void createFile02(){
        File parentPath = new File("c:\\\\Users\\Uriku\\Desktop\\");
        String fileName = "new2.txt";
        File file = new File(parentPath,fileName);  //保存在堆里面，在内存
        try {
            file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //根据
    public void createFile03(){
        String parentFath = "c:\\Users\\Uriku\\Desktop\\";
        String filePath = "new3.txt";
        File file = new File(parentFath,filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
