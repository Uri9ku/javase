package com.javase.SE07_;

import java.util.Scanner;

public class ScannerClass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int i = sc.nextInt();
            System.out.println("整数数据：" + i);
        }else {
            System.out.println("不是整数数据");
        }

        //输入多个数字，并且求总和与平均数，一个数字回车就确认，输入非数字回车后就执行结果
        Scanner sc2 = new Scanner(System.in);

        //总数
        double sum = 0;

        //个数
        int i = 0;

        while(sc2.hasNextDouble()){
            double num = sc2.nextDouble();
            sum += num;
            i++;
            System.out.println("求的和：" + sum);

        }
        System.out.println("输入的个数：" + i);
        System.out.println("求的平均数：" + sum/i);

        sc2.close();

        Scanner sc3 = new Scanner(System.in);
        String str = sc3.nextLine();
        //equals判断字符串是否一样
        if (str.equals("Hello")){
            System.out.println("是的");
        }
        sc3.close();
    }
}
