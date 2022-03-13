package com.javase.SE09_io;

import java.io.*;

public class Demo15_ObjectOutputStream {
    /*演示ObjectOutputStream*/

    public static void main(String[] args) throws Exception {
        //序列化后，保存的文件格式不是纯文本，而是按照他的格式来保存
        String filePath = "C:\\Users\\Uriku\\Desktop\\obj.txt";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));

        //序列化数据到
        objectOutputStream.writeInt(100); // int -> Integer(实现了Serializable 接口)
        objectOutputStream.writeBoolean(true); //boolean -> Boolean实现了接口
        objectOutputStream.writeChar('a');//char -> Character
        objectOutputStream. writeDouble(2.3); //double ->Double
        objectOutputStream.writeUTF("Uriku"); //  String

        //保存一个对象
        objectOutputStream.writeObject(new Person("Uriku",12,"中国","白色"));
        //序列化的时候，包的位置已经固定了，如果反序列化的包的位置不一致会报错，要不就同一个包，要不就更改访问类型public class
        objectOutputStream.close();
        System.out.println("序列化形式保存成功");
    }

}

//如果需要序列化某个对象，要实现接口Serializable
class Person implements Serializable{

    private String name;
    private int age;

    //serialVersionUID 序列化的版本号，可以提高兼容性
    //例如添加了这个，会认为是Person的一个升级版
    //private String hobby;
    private static final long serialVersionUID = 1L;
    //static transient不会序列化，反序列化会null
    private static String nation;
    private transient String color;
    private Parent parent = new Parent();  //没有实现Serializable接口会报错的

    public Person(String name, int age,String nation,String color) {
        this.name = name;
        this.age = age;
        this.nation = nation;
        this.color = color;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nation='" + nation + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

 class Parent implements Serializable{
}
