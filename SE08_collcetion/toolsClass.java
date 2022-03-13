package com.javase.SE08_collcetion;

import java.util.*;

public class toolsClass {
    /*Collections工具类的使用说明*/
    public static void main(String[] args) {
        List<Integer> objects = new ArrayList<>();

        objects.add(20);
        objects.add(1);
        objects.add(33);
        objects.add(45);
        objects.add(2);

        //sort 排序
        Collections.sort(objects);
        System.out.println("sort排序：" + objects.toString());

        //binarySearch 二分查找,一定要排序好的才能用
        int i = Collections.binarySearch(objects,1);
        int i2 = Collections.binarySearch(objects,20);
        System.out.println(i);
        System.out.println(i2);



        //copy 复制
        List<Integer> dest = new ArrayList<>();
        for (int k = 0; k < objects.size(); k++) {
            dest.add(0);
        }
        Collections.copy(dest,objects); //数组下标越界异常
        System.out.println(dest.toString());

        //reverse 反转
        Collections.reverse(dest);
        System.out.println(dest.toString());

        //shuffle 打乱
        Collections.shuffle(dest);
        System.out.println(dest.toString());

        //补充： list转数组
        Integer[] arr = objects.toArray(new Integer[objects.size()]);
        System.out.println(Arrays.toString(arr));

        //数组转list
        String[] name = {"Uriku","Krito","Eugeo"};
        List<String> list2 = Arrays.asList(name);
        //转化后的数组不能增删，长度固定，是一个受限集合
        System.out.println(list2);
    }
}
