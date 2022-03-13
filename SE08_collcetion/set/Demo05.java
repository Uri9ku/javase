package com.javase.SE08_collcetion.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Demo05 {
    /*TreeSet保存数据
    * 1.存储结构：红黑树
    * 2.是二叉查找树
    * 3.左边的节点比右边的节点小
    * 4.要求：元素必须实现Comparable接口，compareTo()方法返回值为0，认为是重复元素*/
    public static void main(String[] args) {
        //1.创建集合
        TreeSet<PersonDemo3> treeSet = new TreeSet<>();

        PersonDemo3 p1 = new PersonDemo3("Uriku",111);
        PersonDemo3 p2 = new PersonDemo3("Krito",111);
        PersonDemo3 p3 = new PersonDemo3("Eugeo",111);
        PersonDemo3 p4 = new PersonDemo3("Alice",111);
        PersonDemo3 p5 = new PersonDemo3("Alice",222);



        //出现类型转化异常ClassCastException,如果PersonDemo03不实现compareTo
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        treeSet.add(p4);
        treeSet.add(p5);
        System.out.println("元素个数：" + treeSet.size());
        System.out.println(treeSet.toString());

        //2.删除元素
        //treeSet.remove(p5);
        //这个可以删除，因为是实现了Compare接口，一样的就删掉了
        treeSet.remove(new PersonDemo3("Alice",222));
        System.out.println("元素个数：" + treeSet.size());

        //3.遍历
        //3.1增强for
        for (PersonDemo3 o :treeSet
             ) {
            System.out.println(o);
        }

        //3.2迭代器遍历
        System.out.println("迭代器遍历");
        Iterator<PersonDemo3> it = treeSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //4.判断
        System.out.println(treeSet.contains(new PersonDemo3("Alice",111)));

    }
}
