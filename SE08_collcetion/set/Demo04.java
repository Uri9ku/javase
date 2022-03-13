package com.javase.SE08_collcetion.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Demo04 {
    /*TreeSet的使用
    * 存储结构：红黑树*/
    public static void main(String[] args) {
        //1.集合的创建
        TreeSet<String> treeSet = new TreeSet<>();

        //2.添加元素
        treeSet.add("Uriku");
        treeSet.add("Krito");
        treeSet.add("Eugeo");
        treeSet.add("Alice");
        treeSet.add("Alice");//重复，没有添加
        System.out.println("元素个数：" + treeSet.size());
        System.out.println(treeSet.toString()); //这个打印排序是有顺序的，是按照字母排序

        //2.删除元素
        treeSet.remove("Uriku");
        System.out.println("元素个数：" + treeSet.size());

        //3.遍历
        //3.1for增强
        System.out.println("for增强");
        for (String x:treeSet
             ) {
            System.out.println(x);
        }

        //3.2迭代器遍历

        System.out.println("迭代器遍历");
        Iterator<String> it = treeSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //4.判断
        System.out.println(treeSet.contains("Uriku"));


    }
}
