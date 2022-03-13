package com.javase.SE13_reflection.demo01_extractionreflection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*反射问题的引出
* */

//忽略警告信息
@SuppressWarnings({"all"})
public class Demo01_ExtractionReflection {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //根据配置文件re.指定信息，创建Cat对象并调用方法

        //法一：传统的方式，new对象 -> 调用方法
        //Cat cat = new Cat();
        //cat.hi();

        //使用Properties类，读取配置文件
        //1.
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/com/javase/SE13_reflection/demo01_extractionreflection/re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
        System.out.println("classfullpath=" + classfullpath);
        System.out.println("method=" + method);

        //2.创建对象
        //Cat cat = new com.javase.SE13_reflection.demo01_extractionreflection.Cat();//new classfullpath();是无效的，classfullpath是字符串
        //传统的方法解决不了，要用反射机制

        //使用反射机制解决
        //1.加载类，返回Class类型的对象，Class是一个类，这个类就是Class类
        Class aClass = Class.forName(classfullpath);
        //2.通过aClass对象，得到加载的类com.javase.SE13_reflection.demo01_extractionreflection.Cat的对象实例
        Object cat = aClass.getDeclaredConstructor().newInstance();
        System.out.println("cat的运行类型：" + cat.getClass());
        //3.通过aClass得到加载的类com.javase.SE13_reflection.demo01_extractionreflection.Cat的method（hi）的方法对象
        //即在反射中，可以把方法视为对象（万物皆对象）
        Method method1 = aClass.getMethod(method);
        //4.通过method01调用方法，即通过方法对象调用方法
        //方法.invoke(对象)
        method1.invoke(cat);
    }
}
