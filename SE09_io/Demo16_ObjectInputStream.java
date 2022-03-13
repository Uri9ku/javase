package com.javase.SE09_io;

import java.io.*;

public class Demo16_ObjectInputStream {
    public static void main(String[] args) throws Exception {
        //指定反序列化的文件
        String filePath = "C:\\Users\\Uriku\\Desktop\\obj.txt";

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
        //读取的顺序一定要和保存的顺序一致
        System.out.println(objectInputStream.readInt());
        System.out.println(objectInputStream.readBoolean());
        System.out.println(objectInputStream.readChar());
        System.out.println(objectInputStream.readDouble());
        System.out.println(objectInputStream.readUTF());

        //person的编译类型是Object，person的运行类型是Person
        Object person = objectInputStream.readObject();
        System.out.println("运行类型：" + person.getClass());
        System.out.println("person信息：" + person);
        //System.out.println(objectInputStream.readObject()); //底层Objcet -> Person

        /*重要的细节：
        * 1.如果希望调用Person的方法，需要向下转型
        * 2.需要把Person类的定义，复制到可以引用的位置（Person和Demo16是在同一个包）*/
        Person person1 = (Person)person;
        System.out.println(person1.getName());
        //person. 没有person的方法


        objectInputStream.close();
    }
}
