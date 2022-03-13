package com.javase.SE13_reflection;

import java.io.Serializable;

/*演示哪些类有Class对象*/
public class Demo07_AllTypeClass {
    public static void main(String[] args) {

        //外部类
        Class<String> stringClass = String.class;
        //接口
        Class<Serializable> serializableClass = Serializable.class;
        //数组
        Class<Integer[]> aClass = Integer[].class;
        //二维数组
        Class<Integer[][]> aClass1 = Integer[][].class;
        //注解
        Class<Deprecated> deprecatedClass = Deprecated.class;
        //枚举
        Class<Thread.State> stateClass = Thread.State.class;
        //基本数据类型
        Class<Long> longClass = long.class;
        //void
        Class<Void> voidClass = void.class;
        //class
        Class<Class> classClass = Class.class;

        System.out.println(stringClass);
        System.out.println(serializableClass);
        System.out.println(aClass);
        System.out.println(aClass1);
        System.out.println(deprecatedClass);
        System.out.println(stateClass);
        System.out.println(voidClass);
        System.out.println(classClass);

    }
}
