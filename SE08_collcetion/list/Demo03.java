package com.javase.SE08_collcetion.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo03 {
    /*List的接口使用
    * 1.有序
    * 2.有下标
    * 3.可重复*/
    public static void main(String[] args) {
        //<>是泛型，后面会讲
        //创建集合对象
        List list = new ArrayList<>();

        //添加元素
        list.add("苹果");
        list.add("香蕉");
        list.add("葡萄");
        list.add("榴莲");

        System.out.println("元素个数：" + list.size());
        System.out.println("元素打印：" + list.toString());
        System.out.println("元素打印：" + list);

        //删除元素
        //list.remove("苹果");
        //System.out.println("元素遍历：" + list.toString());
        list.remove(3); //index 0 开头
        System.out.println("元素遍历：" + list.toString());

        //遍历

        //for增强遍历
        System.out.println("for增强");
        for (Object x:list
             ) {
            System.out.println(x);
        }

        //for遍历
        System.out.println("for遍历");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //迭代器
        System.out.println("迭代器遍历");
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //列表迭代器
        //可以用这个迭代器进行添加add、替换set、删除remove
        //普通的迭代器并不能
        System.out.println("(系)列表迭代器");
        System.out.println("正向迭代");
        ListIterator lit =  list.listIterator();
        while (lit.hasNext()){
            System.out.println(lit.nextIndex() + ":" + lit.next());
        }

        System.out.println("逆向迭代");
        while(lit.hasPrevious()){
            System.out.println(lit.previousIndex() + ":" + lit.previous());
        }

        System.out.println("集合是否存在榴莲：" + list.contains("榴莲"));
        System.out.println("集合是否空:" + list.isEmpty());

        //获取位置
        System.out.println("苹果的位置：" + list.indexOf("苹果"));
    }
}
