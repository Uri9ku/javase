package com.javase.SE13_reflection.demo06_getclass;

/*获取Class对象的6种方法
* */

@SuppressWarnings({"all"})
public class demo06_getclass {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.Class.forName
        String classAllpath ="com.javase.SE13_reflection.demo06_getclass.Car";
        Class<?> aClass1 = Class.forName(classAllpath);
        System.out.println(aClass1);

        //2.类名.class，应用场景：用于参数传递
        Class aClass2 = Car.class;
        System.out.println(aClass2);

        //3.对象.getClass()，应用场景：有对象实例
        Car car = new Car();
        Class<? extends Car> aClass3 = car.getClass();
        System.out.println(aClass3);

        //4.通过类加载器（有四个）来获取类的Class对象
        //4.1先得到类加载器 car
        ClassLoader classLoader = car.getClass().getClassLoader();
        //4.2通过类加载器得到Class对象
        Class<?> aClass4 = classLoader.loadClass(classAllpath);
        System.out.println(aClass4);

        //aClass1 2 3 4 是用一个对象
        System.out.println(aClass1.hashCode());
        System.out.println(aClass2.hashCode());
        System.out.println(aClass3.hashCode());
        System.out.println(aClass4.hashCode());

        //5.基本数据类型
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        System.out.println(integerClass);

        //
        Class<Integer> type = Integer.TYPE;
        System.out.println(type);
        System.out.println(type.hashCode());
        System.out.println(integerClass.hashCode());
    }
}
