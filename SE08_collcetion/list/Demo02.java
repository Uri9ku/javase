package com.javase.SE08_collcetion.list;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02 {
    /*
    * 用Collection保存学生信息
    * collection
    * 1.无需
    * 2.无下标
    * 3.不可重复*/

    public static void main(String[] args) {
        //新建Collection对象,实例化ArrrayList
        Collection collection = new ArrayList();

        StudentDemo02 studentDemo02 = new StudentDemo02("Uriku",20);
        StudentDemo02 studentDemo03 = new StudentDemo02("Krito",10);
        StudentDemo02 studentDemo04 = new StudentDemo02("Eugeo",30);

        collection.add(studentDemo02);
        collection.add(studentDemo03);
        collection.add(studentDemo04);

        System.out.println("元素个数：" + collection.size());
        System.out.println("打印：" + collection.toString());

        //删除
        collection.remove(studentDemo02);
        System.out.println("删除后的个数：" + collection.size());
        System.out.println(collection.toString());

        System.out.println("=====");

        //删不掉的，因为这个new的对象是在另一个堆的存储位置
        collection.remove(new StudentDemo02("Krito",10));
        System.out.println(collection.toString());

        //清除
        //只是把集合里面的集合指针地址给删除了，这个对象还在堆里面
        //collection.clear();
        //System.out.println("清楚后的：" + collection.toString());
        System.out.println("========");
        //遍历
        for (Object x:collection
             ) {
            StudentDemo02 msg = (StudentDemo02) x;
            System.out.println(msg.toString());
        }

        System.out.println("========迭代器");

        Iterator it = collection.iterator();
        while(it.hasNext()){
            StudentDemo02 msg = (StudentDemo02)it.next();
            System.out.println(msg);
        }

        //判断
        System.out.println("判断是否存在Krito " + collection.contains(studentDemo03));
        System.out.println("判断是否存在Uriku " + collection.contains(studentDemo02));

        //没有，因为地址不一样
        System.out.println("有吗"+ collection.contains(new StudentDemo02("Krito",10)));
    }
}
