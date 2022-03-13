package com.javase.SE08_collcetion.list.generic;

public class Demo04 {
    /*泛型方法
    * 1.语法：放在方法的前面
    * <T>返回值类型*/
    public static void main(String[] args) {

    }

    //泛型方法
    public <T> T show(T t){
        System.out.println("泛型方法"+t);
        return  t;
    }
}
