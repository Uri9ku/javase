package com.javase.SE06_oop;

//父类也叫基类，子类也叫派生类
//Java类只能继承一个父类，一个父类可以有多个子类
//接口可以有多个父类，一个父类可以有多个接口`

/*1.super调用父类的构造方法，必须在构造方法的第一个
* 2.super必须只能出现在子类的方法或者构造柱方法
* 3.super和this不能同时调用构造方法
*
* 有final修饰的类不能继承了
*
* this和super
*
* 代表的对象：
*   this：本身调用者的对象
*   super：代表父类对象的应用
*
* 前提
*   this：没有继承也可以使用
*   suoer：只能在继承的条件才可以使用
*
* 构造方法
*   this()：本类的构造
*   super：父类的构造
*
*
* 重写：需要继承关系，子类重写父类的方法
*   1.方法名必须相同
*   2.参数列表必须相同
*   3.修饰符：范围可以扩大但是不能缩小： public>profected>default>private
*   4.抛出的异常：范围可以缩小，但是不能扩大:*/
public class Extends extends Person02 {
    private String name = "Eugeo";

    public void print(){
        System.out.println("Exdends");
    }

    public Extends() {
        super();
        System.out.println("Extends无参构造执行了");
    }

    public void test1(){
        print(); //Extends
        this.print();//Extends
        super.print();//Person02
    }

    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
