package com.javase.SE08_collcetion.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01 {

    /*Collection接口的使用，实例用ArrayList
    * 1.添加元素
    * 2.删除元素
    * 3.遍历元素
    * 4.判断*/

    public static void main(String[] args) {
        //创建集合
        Collection collection = new ArrayList();

        //添加元素
        collection.add("苹果");
        collection.add("香蕉");
        collection.add("榴莲");
        collection.add("葡萄");

        //元素个数
        System.out.println("元素个数：" + collection.size());

        //打印元素
        System.out.println(collection);
        System.out.println(collection.toString());

        //删除元素
        collection.remove("香蕉");
        System.out.println("删除之后：" + collection);

        //清空元素
        //collection.clear();
        //System.out.println("清空之后：" + collection.size());

        //遍历元素 ！！！！！！！！！！！！
        //for增强语句遍历
        for (Object x:collection) {
            System.out.println(x);
        }

        System.out.println("======");
        //使用迭代器遍历
        /*迭代器遍历的方式
        * 1.hasNext()
        * 2.next()
        * 3.remove()*/
        Iterator it = collection.iterator();
        while (it.hasNext()){
            String str = (String) it.next();
            System.out.println(str);
            //迭代器不允许删除，因为占用了，就会出现并发修改异常可以用下面那个
            //collection.remove(str);
            //it.remove(); //迭代器删除的正确操作,全部删除
        }
        //System.out.println("迭代器删除后的元素：" + collection.size());

        //判断
        System.out.println("苹果是否存在：" + collection.contains("苹果"));
        System.out.println("香蕉是否存在：" + collection.contains("香蕉"));
    }
}
