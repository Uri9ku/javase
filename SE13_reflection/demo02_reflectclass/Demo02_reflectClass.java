package com.javase.SE13_reflection.demo02_reflectclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*反射的常用类*/
@SuppressWarnings({"all"})
public class Demo02_reflectClass {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //1.创建Properties对象
        Properties properties = new Properties();

        //2.读取properties配置文件
        String propertiesPath = "src/com/javase/SE13_reflection/demo02_reflectclass/re.properties";
        properties.load(new FileInputStream(propertiesPath));

        //3.读取class和method
        String className = properties.getProperty("classfullpath").toString();
        String methodName = properties.getProperty("method").toString();

        //4.创建Class对象
        Class aclass = Class.forName(className);
        //字符串   class com.javase.SE13_reflection.demo02_reflectclass.Person

        //5.通过aclass得到是实例化的对象（地址）
        Object o = aclass.getDeclaredConstructor().newInstance();
        //引用类型  com.javase.SE13_reflection.demo02_reflectclass.Person@568db2f2

        //6.获取实例化对象的方法（地址）
        Method method = aclass.getMethod(methodName);

        //7.调用实例化的方法
        method.invoke(o);

        //8.获取实例化对象的字段，getField不能获取私有的属性
        Field age = aclass.getField("age");
        //字符串   public int com.javase.SE13_reflection.demo02_reflectclass.Person.age

        //9.获取实例化对象的属性值
        System.out.println(age.get(o));

        //10.获取无参构造器，不写参数返回的是无参构造器
        Constructor constructor1 = aclass.getConstructor();
        //字符串   public com.javase.SE13_reflection.demo02_reflectclass.Person()

        //11.获取有参构造器，写参数返回的是有参构造器
        //参数写的是，要获取带参数构造器的参数类型
        Constructor constructor2 = aclass.getConstructor(int.class);
        //public com.javase.SE13_reflection.demo02_reflectclass.Person(int)



    }
}
