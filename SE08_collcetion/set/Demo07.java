package com.javase.SE08_collcetion.set;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo07 {
    /*使用TreeSet集合实现字符串按照长度进行排序
    * Urik Krito Euo A
    * Comparator*/
    public static void main(String[] args)  {
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //1.比较长度,可能长度一样
                int n1 = o1.length() - o2.length();
                //2.长度一样的话就按照定义好的排序
                int n2 = o1.compareTo(o2);
                return n1==0?n2:n1;

            }
        });
        treeSet.add("Urik");
        treeSet.add("Krito");
        treeSet.add("Euo");
        treeSet.add("A");
        System.out.println("元素个数：" + treeSet.size());
        System.out.println(treeSet.toString()); //这个打印排序是有顺序的，是按照字母排序


    }
}