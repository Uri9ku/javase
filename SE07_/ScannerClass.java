package com.javase.SE07_;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        //判断用户有没有使用字符串
        if (sc1.hasNext()){
            String str = sc1.next(); //接收用户的输入
            System.out.println("next：" + str);  //空格后面的没了，以空格为结束符，有效字符前的空白内容会自动去掉
        }
        if (sc2.hasNextLine()){
            String str = sc2.nextLine();
            System.out.println("nextLine：" + str);  //空格后面的也有，以回车为结束符
        }
        //IO流的类不关闭的话会一直占用资源
        sc1.close(); //关闭
        sc2.close(); //关闭


    }
}
