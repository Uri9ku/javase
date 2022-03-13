package com.javase.SE09_io;

import java.util.Scanner;

public class Demo17_InputAndOutput {
    /**/

    public static void main(String[] args) {
        //System类的public final static InputStream in = null;
        //System.in  编译类型 InputStream ，可以理解为数据类型
        //System.in 运行类型 BufferedInputSteam
        //表示的标准输入 键盘
        System.out.println(System.in.getClass());

        //1.public static final PrintStream out = null;
        //2.System.out 编译类型 PrintStream
        //3.System.out 运行类型 PrintStream
        //4.表示标准输出 显示器
        System.out.println(System.out.getClass());

        //输出到显示器
        System.out.println("Uriku");

        //给扫描器传入了System.in,即InputStream，键盘输入，所以Scanner用完要关闭
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
    }
}
