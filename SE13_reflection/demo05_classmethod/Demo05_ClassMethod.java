package com.javase.SE13_reflection.demo05_classmethod;

/*Class类的方法*/

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

@SuppressWarnings({"all"})
public class Demo05_ClassMethod {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        String classAllpath ="com.javase.SE13_reflection.demo05_classmethod.Car";

        //1.获取Car类对应的Class对象
        //<?>表示不确定的Java类型，是泛型，到时候会转化对应类型
        Class<?> aClass = Class.forName(classAllpath);

        //2.输出class，是aClass对象是哪个类的对象
        System.out.println(aClass);
        //class com.javase.SE13_reflection.demo05_classmethod.Car


        System.out.println("运行类型："+ aClass.getClass());
        //class java.lang.Class

        //3.得到包名
        System.out.println(aClass.getPackage().getName());

        //4.得到全类名
        System.out.println(aClass.getName());

        //5.通过aClass创建对象实例
        Car car = (Car)aClass.getConstructor().newInstance();
        System.out.println(car);
        //cat.toString

        //6.通过反射获取属性
        Field price = aClass.getField("price");
        System.out.println(price);
        System.out.println(price.get(car));

        //7.通过反射给字段赋值
        price.setInt(car,1);
        System.out.println(price.get(car));

        //8.遍历所有字段
        Field[] fields = aClass.getFields();
        for (Field f: fields
             ) {
            System.out.print(f.get(car) + "\t" + f.getName() + "\t");
        }


    }
}
