package com.javase.SE08_collcetion.map;

import java.util.Map;
import java.util.TreeMap;

public class Demo03 {
    /*TreeMap的使用
     * 1.存储结构：红黑树 都要实现Comparable
     */

    public static void main(String[] args) {
        //1.集合的创建
        TreeMap<StudentDemo02, String> treeMap = new TreeMap<>();

        //2.添加元素
        StudentDemo02 uriku = new StudentDemo02("Uriku", 11, 112);
        StudentDemo02 krito = new StudentDemo02("Krito", 11, 113);
        StudentDemo02 eugeo = new StudentDemo02("Eugeo", 11, 114);

        treeMap.put(uriku,"RW");
        treeMap.put(krito,"SAO");
        treeMap.put(eugeo,"UW");

        //重写了comprable方法，对比年龄一样，就是Key一样，key不替换，value换掉了
        treeMap.put(new StudentDemo02("Uriku", 11, 112),"WWW");

        System.out.println("元素个数：" + treeMap.size());
        System.out.println(treeMap.toString()); //类型转化异常,要实现Comparable接口

        //3.删除元素
        treeMap.remove(uriku);
        System.out.println("删除后的： " + treeMap.size());

        //4.遍历
        //4.1 使用keySet
        for (StudentDemo02 key: treeMap.keySet()
             ) {
            System.out.println(key + ":" + treeMap.get(key));
        }

        //4.2 entrySet
        System.out.println("entry");
        for (Map.Entry<StudentDemo02,String> entry:treeMap.entrySet()
             ) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //5.判断
        System.out.println(treeMap.containsValue("UW"));
    }

}
