package com.javase.SE08_collcetion.list.vector;

import java.util.Enumeration;
import java.util.Vector;

public class Demo01 {
    /*Vector集合的使用
    * 存储结构：数组*/
    public static void main(String[] args) {
        //1.创建集合
        Vector vector = new Vector();
        vector.add("Uriku");
        vector.add("Krito");
        vector.add("Eugeo");
        System.out.println("元素个数：" + vector.size());

        //遍历
        //枚举器遍历
        Enumeration en = vector.elements();
        while(en.hasMoreElements()){
            Object obj = en.nextElement();
            System.out.println(obj);
        }
        //判断
        //查找
        //Vector其他方法
        //vector.firstElement();
        //vector.lastElement();
        //vector.elementAt();
    }
}
