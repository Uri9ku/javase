package com.javase.SE08_collcetion.set;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo06 {
    /*TreeSet集合的使用
    * Comparator 定制比较（比较器）
    * Comparable 可比较的（Demo05使用了）*/

    public static void main(String[] args) {
        //1.创建集合

        //用了这个方法就不用实现Comparable接口了
        TreeSet<PersonDemo3> treeSet = new TreeSet<>(new Comparator<PersonDemo3>() {
            @Override
            public int compare(PersonDemo3 o1, PersonDemo3 o2) {
                //先比较年龄
                int n1 = o1.getAge() - o2.getAge();
                int n2 = o1.getName().compareTo(o2.getName());
                return n1==0?n2:n1;
            }
        });

        PersonDemo3 p1 = new PersonDemo3("Uriku",111);
        PersonDemo3 p2 = new PersonDemo3("Krito",222);
        PersonDemo3 p3 = new PersonDemo3("Eugeo",333);
        PersonDemo3 p4 = new PersonDemo3("Alice",444);
        PersonDemo3 p5 = new PersonDemo3("Alice",555);



        //出现类型转化异常ClassCastException,如果PersonDemo03不实现compareTo
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        treeSet.add(p4);
        treeSet.add(p5);
        System.out.println("元素个数：" + treeSet.size());
        System.out.println(treeSet.toString());

    }
}
