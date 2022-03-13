package com.javase.SE06_oop;

public class PersonStatic {
    {
        //代码块（匿名代码块），通常用于赋初始值
        System.out.println("匿名代码块");    //  2
    }

    static{
        //静态代码块，只执行一次（第一次 才执行）
        System.out.println("静态代码块");    //  1
    }

    public PersonStatic() {
        System.out.println("构造方法");      //  3
    }

    public static void main(String[] args) {
        PersonStatic personStatic = new PersonStatic();
        System.out.println("====");
        PersonStatic personStatic1 = new PersonStatic();
    }
}
