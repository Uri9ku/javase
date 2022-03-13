package com.javase.SE08_collcetion.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo01 {
    /*测试Set接口的使用
    * 特点：
    * 1.无序、无下标
    * 2.不能重复*/
    public static void main(String[] args) {
        //1.创建集合
        //HashSet来实现Set接口
        Set<String> set = new HashSet<>();
        set.add("Uriku");
        set.add("Kirito");
        set.add("Eugeo");
        set.add("Eugeo");//重复的元素不会加进去
        System.out.println("元素个数：" + set.size());
        System.out.println(set.toString());

        //2.删除集合
        System.out.println("====删除====");
        set.remove("Uriku");
        System.out.println("元素个数：" + set.size());
        System.out.println(set.toString());

        //3，遍历
        //3.1增强for
        for (String x: set) {
            System.out.println(x);
        }

        //3.2迭代器
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //4.判断
        System.out.println(set.contains("Uriku"));
        System.out.println(set.isEmpty());
    }
}
