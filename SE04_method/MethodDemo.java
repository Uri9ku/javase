package com.javase.SE04_method;

public class MethodDemo {
    public static void main(String[] args) {
//        MethodDemo md = new MethodDemo();
        System.out.println(add(122,2));
    }
    //加了static就是类方法，一个方法一个功能，就是方法的原子性
    public static int add(int a,int b){
        return a+b;
    }
    

    //方法名一样，参数类型不同是方法的重载


}
