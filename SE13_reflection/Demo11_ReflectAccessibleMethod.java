package com.javase.SE13_reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*通过反射演示调用方法*/
public class Demo11_ReflectAccessibleMethod {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("com.javase.SE13_reflection.User3");
        Object o = aClass.getDeclaredConstructor().newInstance();

        //1.调用public有参参方法
        Method hi = aClass.getDeclaredMethod("hi",String.class);
        hi.invoke(o,"Uriku");

        //2.调用public无参方法
        Method hi1 = aClass.getDeclaredMethod("hi");
        hi1.invoke(o);

        //3.调用static public 方法
        Method h2 = aClass.getMethod("h2");
        h2.invoke(o);
        h2.invoke(null);

        //4.调用static private 方阿飞
        Method eugeo = aClass.getDeclaredMethod("hh1", String.class,int.class);
        //访问异常，是privat，要暴破
        eugeo.setAccessible(true);
        eugeo.invoke(o,"Eugeo",18);
        eugeo.invoke(null,"Eugeo",18);

        //5.反射中，如果方法有返回值，返回Object,但是运行类型和方法定义的返回值类型一致
        Object krito = eugeo.invoke(null, "krito", 18);
        System.out.println("kirito" +krito.getClass());
    }

}
class User3{
    private int age;
    private String name;
    public int money;

    public User3() {
    }

    private User3(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public User3(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void hi(){
        System.out.println("hi public");
    }

    public void hi(String name){
        System.out.println("hi public" + name);
    }

    public  static void h2(){
        System.out.println("h2 static  public");
    }

    private void hh(){
        System.out.println("private hh");
    }

    private static  String hh1(String name,int age){
        System.out.println("private static hh1" + name + age);
    return "";
    }
}