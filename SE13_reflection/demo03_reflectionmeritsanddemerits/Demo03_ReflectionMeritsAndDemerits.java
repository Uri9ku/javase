package com.javase.SE13_reflection.demo03_reflectionmeritsanddemerits;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*反射机制的优缺点*/
public class Demo03_ReflectionMeritsAndDemerits {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        hi();
        hi1();
        hi2();
    }


    //传统方法调用
    public static void hi(){
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();

        System.out.println("传统调用：" + (end - start));
    }

    //反射机制调用
    public static void hi1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class aClass = Class.forName("com.javase.SE13_reflection.demo03_reflectionmeritsanddemerits.Cat");
        Object o = aClass.getDeclaredConstructor().newInstance();

        Method hi = aClass.getMethod("hi");

        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();

        System.out.println("反射机制：" + (end - start));
    }

    //反射优化：关闭访问检测
    public static void hi2() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class aClass = Class.forName("com.javase.SE13_reflection.demo03_reflectionmeritsanddemerits.Cat");
        Object o = aClass.getDeclaredConstructor().newInstance();

        Method hi = aClass.getMethod("hi");

        //取消方法调用时进行的检测，提高效率
        hi.setAccessible(true);


        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();

        System.out.println("反射机制：" + (end - start));
    }
}
