package com.javase.SE08_collcetion.list.generic;


public class Demo02 {

    public static void main(String[] args) {
        /*使用泛型创建对象
        * 1.泛型只能是引用类型
        * 2.不同泛型类型对象之间不能相互赋值*/
        Demo01<String> d = new Demo01<String>();
        d.t = "Hello";
        d.show("大家好");
        String str = d.getT();
        System.out.println(str);

        Demo01<Integer> i = new Demo01<Integer>();
        i.t = 111;
        i.show(22);
        int str2 = i.getT();
        System.out.println(str2);

        IMDemo03 imDemo03 = new IMDemo03();
        imDemo03.server("xxxxx");

        IMDemo04<Integer> imDemo04 = new IMDemo04<Integer>();
        System.out.println(1111);
    }
}
