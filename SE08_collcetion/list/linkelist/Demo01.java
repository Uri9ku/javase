package com.javase.SE08_collcetion.list.linkelist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo01 {
    /*LinkedList的实现
    * 1.存储结构：双向链表*/

    public static void main(String[] args) {
        //1.创建集合
        LinkedList linkedList = new LinkedList<>();

        //2.添加元素
        StudentDemo01 s1 = new StudentDemo01("Uriku",13);
        StudentDemo01 s2 = new StudentDemo01("Kirito",13);
        StudentDemo01 s3 = new StudentDemo01("Eugeo",13);

        linkedList.add(s1);
        linkedList.add(s2);
        linkedList.add(s3);

        System.out.println(linkedList.toString());

        //3.删除

        //4.遍历
        //4.1for遍历
        System.out.println("for");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        //4.2增强for
        System.out.println("增强for");
        for (Object obj:linkedList) {
            System.out.println(obj.toString());
        }

        //4.3迭代器
        System.out.println("迭代器");
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            StudentDemo01 s = (StudentDemo01) it.next();
            System.out.println(s.toString());
        }

        //4.4列表迭代器
        System.out.println("链表迭代器");
        ListIterator lit = linkedList.listIterator();
        while (lit.hasNext()){
            StudentDemo01 s = (StudentDemo01) lit.next();
            System.out.println(s.toString());
        }

        //判断
        System.out.println("是否存在" + linkedList.contains(s1));

        //获取
        System.out.println(linkedList.indexOf(s1));
        System.out.println(linkedList.indexOf(s2));
        System.out.println(linkedList.indexOf(s3));

}}
