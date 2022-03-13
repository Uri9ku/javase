package com.javase.SE06_oop;

public class InnerClass {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();

        //通过这个外部类实例化内部类
        //outClass.new Inner();
        OutClass.Inner inner = outClass.new Inner();
        inner.in();
        inner.getID();
    }
}
