package com.javase.SE07_;

public class DataType {
    public static void main(String[] args) {
        /*  整数拓展
        *   二进制 0b
        *   八进制 0
        *   十六进制 0x
        */
        int i = 10;
        int i2 = 010;
        int i3 = 0x11A30;
        int i4 = 0b1;

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println("----------");

        /*  浮点数拓展
        *   银行业务怎么表示钱？
        *   用BigDecimal 数学工具类
        *   float 有限 离散 舍入误差 大约 接近但不等于
        *   double 最好使用浮点数进行比较
        */

        float f = 0.1f;
        double d = 1.0/10;
        System.out.println(f);
        System.out.println(d);
        System.out.println(f==d);  //flase

        float d1 = 23434331111f;
        float d2 = d1 + 1;
        System.out.println(d1==d2); //ture

        System.out.println("---------");

        /*  字符拓展
        *
        *
        * */
        char c1 = 'a';
        char c2 = '中';
        char c3 = '\u0061';  //a的unicode代码
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println((int)c1);
        System.out.println((int)c2);

        //转义字符
        /*  /t 制表符
        *   /n 换行
        * */

        System.out.println("---------");
        String sa = new String("hello world");
        String sb = new String("hello world");
        System.out.println(sa==sb);  //flase
        String sc = "hello world";
        String sd = "hello world";
        System.out.println(sc==sd);  //true

    }
}
