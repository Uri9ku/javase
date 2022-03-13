package com.javase.SE06_oop;

public class StudentStatic {
    //static 是成员
    //static + 属性 就是类属性，成员属性，static+方法就是成员方法

    private static int age; //静态变量
    private double score; //非静态变量

    public void run(){
        System.out.println("run");
    }

    public static void go(){
        System.out.println("go");
    }

    public static void main(String[] args) {

        //静态变量，推荐使用类的方式使用


        StudentStatic studentStatic = new StudentStatic();
        System.out.println(studentStatic.age);   //对象
        System.out.println(studentStatic.score); //对象
        //System.out.println(StudentStatic.score); //类
        System.out.println(StudentStatic.age);   //类  √√√√

        go();
      //  run();
        StudentStatic.go();
      //  StudentStatic.run();
        studentStatic.run();
        studentStatic.go();
    }
}
