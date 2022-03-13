package com.javase.SE13_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
* 通过反射机制创建实例
*
* */
public class Demo09_ReflectCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.获取User类的Class对象
        Class<?> userClass = Class.forName("com.javase.SE13_reflection.User");
        //2.通过public无参构造器创建实例
        Object o = userClass.getDeclaredConstructor().newInstance();
        System.out.println(o);
        //3.通过public有参构造器创建实例


        //先得到对应的构造器
        Constructor<?> constructor = userClass.getConstructor(String.class);
        /*这个constructor，为

        *     public User(String name) {
        this.name = name;
    }

        */
        //创建实例，并传入形参
        Object uriku = constructor.newInstance("Uriku");
        System.out.println(uriku);

        //4，通过非public的有参构造器创建实例
        //返回的是public的构造器，会报错
        //Constructor<?> constructor1 = userClass.getConstructor(int.class, String.class);

        Constructor<?> declaredConstructor = userClass.getDeclaredConstructor(int.class, String.class);

        //会报错，declaredConstructor是私有的
        //declaredConstructor.newInstance(111,"Eugeo");
        declaredConstructor.setAccessible(true);//暴破【暴力破解】，使用反射可以访问私有的构造器、方法、属性等
        //反射面前都是纸老虎
        Object eugeo = declaredConstructor.newInstance(111, "Eugeo");
        System.out.println(eugeo);

    }
}

class User{
    private int age;
    private String name;
    public int money;

    public User() {
    }

    private User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
