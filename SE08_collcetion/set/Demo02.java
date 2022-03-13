package com.javase.SE08_collcetion.set;


import java.util.HashSet;
import java.util.Iterator;

public class Demo02 {
    /*HashSet集合的使用
    * 存储结构：哈希表（数组+链表+红黑树）*/
    public static void main(String[] args) {
        //1.新建集合
        HashSet<String> hashSet = new HashSet<String>(); //后面版本的后面的泛型可以不写

        //2.添加元素
        hashSet.add("Uriku");
        hashSet.add("Krito");
        hashSet.add("Eugeo");
        hashSet.add("Eugeo");

        System.out.println("元素个数：" + hashSet.size());
        System.out.println(hashSet.toString());

        //3.删除数据
        hashSet.remove("Uriku");
        System.out.println(hashSet.toString());

        //4.遍历

        //4.1增强for
        for (String x:hashSet
             ) {
            System.out.println(x);
        }

        //4.2迭代器
        //没有列表迭代器
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
