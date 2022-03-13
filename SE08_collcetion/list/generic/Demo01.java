package com.javase.SE08_collcetion.list.generic;

public class Demo01<T> {
    /*泛型类
    * 语法：类目<T,K,W,A>
    * T是占位符，是一种引用类型，写多个的话用逗号隔开编译的时候会替换
    * /
     */

    //1.创建变量
    T t;

    //2.添加方法
    public void show(T t){
        //T t = new T(); 报错，不能实例化，不能保证这个构造方法能够用
        System.out.println(t);
    }

    //3.泛型作为方法的返回值
    public T getT(){
        return t;
    }
    public static void main(String[] args) {
        Demo01<Object> objectDemo01 = new Demo01<>();

    }
}
