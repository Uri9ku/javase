package com.javase.SE08_collcetion.set;

import java.util.HashSet;
import java.util.Iterator;

public class Demo03 {
   /*HashSet的使用
   * 存储结构：哈希表
   * 存储过程：根据HashCode，计算保存的位置，如果保存位置为空，则直接保存，如果不为空，则执行第二步
   * 再执行equals方法，如果equals为true，则认为是重复，否则形成链表
   * */
   public static void main(String[] args) {
       //1.创建集合
      HashSet<PersonDemo3> hashSet = new HashSet<>();

      //2.添加元素
      PersonDemo3 p1 = new PersonDemo3("Uriku",111);
      PersonDemo3 p2 = new PersonDemo3("Kirito",111);
      PersonDemo3 p3 = new PersonDemo3("Eugeo",111);
      PersonDemo3 p4 = new PersonDemo3("Alice",111);

      hashSet.add(p1);
      hashSet.add(p2);
      hashSet.add(p3);
      hashSet.add(p4);
      //hashSet.add(p3);  //添加不进去,这个p3在堆里面，new在堆，赋值在栈
      hashSet.add(new PersonDemo3("Eugeo",111)); //这个new是匿名对象，不和p3重复，可以加进去，如果不想加进去就得重写equals和hashcode方法
      System.out.println("元素个数：" + hashSet.size());
      System.out.println(hashSet.toString());

      //3.删除元素
      System.out.println("删除后的");
      hashSet.remove(p1);
      hashSet.remove(new PersonDemo3("Eugeo",111)); //如果没有重写hashcode方法和euqsl方法的话就删不掉
      System.out.println("元素个数：" + hashSet.size());

      //4.遍历
      //4.1增强for
      for (PersonDemo3 x:hashSet
           ) {
         System.out.println(x);
      }
      //4.2迭代器，没有使用泛型，有点多
      System.out.println("没有使用泛型的迭代器");
      Iterator it = hashSet.iterator();
      while (it.hasNext()){
         PersonDemo3 personDemo3 = (PersonDemo3) it.next();
         System.out.println(personDemo3);
      }

      //4.3使用泛型的迭代器,和ES6的解构赋值很像
      System.out.println("泛型的迭代器");
      Iterator<PersonDemo3> personDemo3Iterator = hashSet.iterator();
      while (personDemo3Iterator.hasNext()){
         System.out.println(personDemo3Iterator.next());
      }

      //5.判断
      //6.
   }
}
