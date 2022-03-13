package com.javase.SE13_reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*通过反射 访问类的成员
* */
public class Demo10_ReflectAccessProperty {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //1.得到User2类对应的Class对象
        Class<?> aClass = Class.forName("com.javase.SE13_reflection.User2");
        //2.创建对象
        Object o = aClass.getDeclaredConstructor().newInstance();//运行类型是User2
        //System.out.println(o.getClass());
        //3.使用反射得到属性对象
        Field age = aClass.getField("age");
        //4.通过反射操作属性
        age.set(o,11111);
        System.out.println(age.get(o));
        System.out.println(o);


        Field name = aClass.getDeclaredField("name");
        //非法访问，name是private
        //暴破
        name.setAccessible(true);

        //name.set(o,"Uriku");
        //效果和上面一样，因为name是static属性，因为name在类加载过了
        name.set(null,"Uriku");
        System.out.println(o);
    }

}

class User2{
    public int age;
    private static String name;
    private int money;

    public User2() {
    }

    private User2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public User2(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{name=" + name +
                " age=" + age +
                ", money=" + money +
                '}';
    }
}
