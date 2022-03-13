package com.javase.SE06_oop;

public class Student02 {

    /*
    * 封装的意义
    * 1.提高程序的安全性，保护数据
    * 2.隐藏代码的实现细节
    * 3.统一接口
    * 4.提高系统的可维护性*/
    //private只能在同类使用
    private String name;
    private int age;
    private int id;
    private char sex;

    public Student02(String name, int age, int id, char sex) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.sex = sex;
    }

    //get/set方法,给外部使用内部的属性
    //get获取数据
    //set设置值
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
        if (age>120||age<0){
            this.age = 3;
        }else {
            this.age = age;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    //实例化初始值
    /*1.使用new关键字，必须要有构造器，本质是调用构造器
    * 2.用来初始化值
    * */
    //无参构造器
    public Student02(){
        //this.name指的是这个Student02类的name
        //this.name ="Uriku";
    }

    //有参构造器,重载了无参构造器
//    public Student02(String name){
//        this.name = name;
//    }



    //alt+insert生成构造器
}
