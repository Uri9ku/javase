package com.javase.SE08_collcetion.list.generic;

public interface Demo03<T> {
    /*泛型接口
    * 1.不能创建静态泛型常量*/
    String name = "Uriku";
    T server(T t);
}
