package com.javase.SE07_;

public class Operator {
    public static void main(String[] args) {
        //运算符的优先级是先括号,然后一元,二元,三元

        //数据类型运算会由低转向高
        int a = 10;
        int b = 25;
        int c = 30;
        int d = 40;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b); //0.4
        System.out.println(a/(double)b); //0.4
        System.out.println((double)a/b); //0.4

        long e = 1111111L;
        int f = 134;
        short g = 11;
        byte h = 1;
        System.out.println(e+f+g+h);  //long,有long就为long,不然全为int
        System.out.println(f+g+h);  //int
        System.out.println(g+h);  //int

        double i = 222.3;
        float j = 11.0f;
        System.out.println(i+j);
        System.out.println(j+h);

        //关系运算符

        int k = 11;
        int l = 22;
        System.out.println(k==l);

        System.out.println("=========================");
        //自增自减运算符,一元运算符
        int n = 3;
        System.out.println("n:" + n);
        System.out.print("\n");

        int m = n++;  //先用后+  n = n + 1;
        System.out.println("n:" + n);
        System.out.println("m:" + m);
        System.out.print("\n");

        int o = ++n;  //先+再用
        System.out.println("n:" + n);
        System.out.println("o:" + o);

        //幂运算
        System.out.println(Math.pow(2,3));

        //逻辑运算符
        boolean p = true;
        boolean q = false;
        System.out.println(p&&q); //逻辑与运算,两个变量为真才为真,如果第一个为假,则后面就不会运算了
        System.out.println(p||q);
        System.out.println(!(p||q));

        //短路运算  !!!!重点,因为qqq里面的qq为flase,所以(pq++  < 4) 不执行
        int pq = 1;
        boolean qq  = (pq < 1);
        System.out.println("qq:" + qq);
        boolean qqq = qq && (pq++ <4);
        System.out.println(qqq);
        System.out.println(pq);

        //位运算,通常用于算法
        /*
        A = 0011 1100
        B = 0000 1101

        与   A & B = 0000 1100
        或   A | B = 0011 1101
        异或 A^B = 0011 0001   //相同为0,不同为1
        非   ~A = 1100 0011

        2 * 8 = 16
        2 * 2 * 2 * 2

        0000 0000   0
        0000 0001   1
        0000 0010   2
        0000 0011   3
        0000 0100   4
        0000 1000   8
        0001 0000   16

        左移 <<x  十进制 * 2^x
        右移 >>x  十进制 / 2^x
        */
        System.out.println(14<<1); //14*2^1


        int r = 10;
        int s = 20;

        //r+=s; //a= a + b;
        //r-=s; //a= a - b;
        System.out.println(r+s + "");
        System.out.println("" + r+s);
        System.out.println("" + (r+s));

        //三元运算符
        //x ? y : z
        System.out.println(false?"真":"假");

        boolean t = true;
        boolean u = false;
        System.out.println(  (u || !t) ? "先医院":"后二元");
    }
}
