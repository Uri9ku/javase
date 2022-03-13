package com.javase.SE06_oop;

public class OutClass {
    //在类中定义一个类
    //内部类
    /*
    *   1。外部类：Outer*/


    private int id = 10;
    public void out(){
        System.out.println("这个是外部类的方法");
    }

    class Inner{
        public  void in(){
            System.out.println("这个是内部类的房啊");
        }

        //内部类可以获取外部类的私有属性
        public void getID(){
            System.out.println(id);
        }
    }
}
