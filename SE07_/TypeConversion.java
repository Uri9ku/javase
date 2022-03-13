package com.javase.SE07_;

public class TypeConversion {
    public static void main(String[] args) {
        int i = 129;
        byte b = (byte)i;  //内存溢出
        /*  强制转换  (类型)变量名
            由高到低
            byte,short,char->int->long->float->double
        */
        System.out.println(i);
        System.out.println(b);

        /*  自动转换
        *   由低到高
        */
        double c = i;
        System.out.println(c);

        /*注意：
        * 1.不能对布尔值进行转换
        * 2.不能把对象类型转换为不相干的类型
        * 3.低容量转换为高容量的时候会自动转换
        * 4.高容量转换为低容量的时候要强制转换
        * 5.强制转换的时候可能会出现内存溢出或者精度问题*/

        System.out.println((int)43232.12f); //精度问题

        System.out.println("=====");

        char a = 'a';
        int  d = a + 1;
        System.out.println(a);  //a
        System.out.println((int)a); //97
        System.out.println(d); // 98
        System.out.println((char)d);

        System.out.println("===================================");
        //操作比较大的数的时候，注意溢出的问题
        //JDK7的新特性,数字之间可以用下划线分割
        int money = 10_0000_0000;
        int years = 20;
        int total = money * years;  //计算的时候溢出了
        long total2 = money * years;  //默认是int,转换之前已经溢出了

        long total3 = (long)money * years; //先把一个数转换为long
        System.out.println(total3);

    }
}
