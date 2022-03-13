package com.javase.SE08_collcetion.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo04 {
    /*ArrayList的使用
    存储结构：数组，查找遍历速度快、增删速度慢
     * 1.有序
     * 2.有下标
     * 3.可重复*/
    public static void main(String[] args) {
        //创建集合，容量为0
        ArrayList arrayList = new ArrayList<>();
        StudentDemo02 uriku = new StudentDemo02("Uriku",20);
        StudentDemo02 kirito = new StudentDemo02("kirito",20);
        StudentDemo02 eugeo = new StudentDemo02("eugeo",20);

        //添加元素
        arrayList.add(uriku);
        arrayList.add(kirito);
        arrayList.add(eugeo);

        System.out.println("元素个数：" + arrayList.size());
        System.out.println("打印元素：" + arrayList.toString());

        //删除元素
        //arrayList.remove(uriku);
        //arrayList.remove(new StudentDemo02("Uriku",20));
        //System.out.println("删除后的个数：" + arrayList.size());

        //遍历元素！！！！
        Iterator it = arrayList.iterator();
        while(it.hasNext()){
            StudentDemo02 s = (StudentDemo02) it.next();
            System.out.println(s.toString());
        }
        //列表迭代器
        //正向
        ListIterator lit = arrayList.listIterator();
        System.out.println("=====正向列表迭代器");
        while(lit.hasNext()){
            StudentDemo02 s = (StudentDemo02) lit.next();
            System.out.println(s.toString());
        }
        //逆向
        System.out.println("===逆向====");
        while (lit.hasPrevious()){
            StudentDemo02 s = (StudentDemo02) lit.previous();
            System.out.println(s.toString());
        }
        //判断元素

        //查找元素
        System.out.println("查找元素位置");
        System.out.println();
    }
}
