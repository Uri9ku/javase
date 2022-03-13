package com.javase.SE06_oop;

    // 这个是Java架构师常用的，是面向对象oop的精髓
public interface Interface {
    /*  1.只有规范，无法写方法，专业的约束
    *   2.约束和实现的分离：面向接口编程
    *   3.接口中的所有定义都是抽象的public abstract 默认
    *   4.接口都要有实现类
    *   5.接口中所有定义都是抽象的常量, 默认 final public static ,静态的常量*/

    /*
    *   作用
    *
    *   1.约束
    *   2.定义一些方法，让不用人的实现
    *   3.默认的方法都是 public abstract
    *   4.默认的常量都是 public final static
    *   5.接口和抽象类一样都是不能被实例化，没有构造方法
    *   6.implements可以实现多个接口
    *   7.实现接口必须要重写接口的方法
    */

    int AGE = 99;
    // public final int AGE = 99;很少用，很少用常量的

    void add(String name);
    void deleted(String name);
    void update(String name);
    void query(String name);
    //  public abstract void add(String name);



}
