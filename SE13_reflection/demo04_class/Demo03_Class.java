package com.javase.SE13_reflection.demo04_class;

/*
* Class类的理解*/
public class Demo03_Class {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.

        //2.Class是系统创建的

        //2.1传统new对象，ClassLoader类，Debug
        Cat cat = new Cat();

        //2.2放射机制，ClassLoader类,Debug
        Class aClass1 = Class.forName("com.javase.SE13_reflection.demo04_class.Cat");

        //3.同一个类只有一个类的Class对象
        Class aClass2 = Class.forName("com.javase.SE13_reflection.demo04_class.Cat");
        System.out.println(aClass1.hashCode());
        System.out.println(aClass2.hashCode());
    }
}
