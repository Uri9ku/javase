package com.javase.SE06_oop;

public class ValuePropagation {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("主方法的a：" + a);
        change(a);
        System.out.println("没有返回值的a：");
        change2(a);
        System.out.println("有返回值的a：" + change2(a));
    }

    //值传递
    public static void change(int a){
        a = 10;
    }

    public static int change2(int a){
        a = 10;
        return a;
    }


    //引用传递，这个本质还是值传递

}
