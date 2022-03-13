package com.javase.SE06_oop;

public abstract class Abstract {

    //抽象类
    /* 类只能单继承，接口可以多继承
    *   1.不能new这个抽象类，只能靠子类去实现
    *   2.抽象方法一定写在抽象方法，抽象类可以写普通方法
    *   3.抽象的抽象：约束~
    * */

    //约束~有人帮我们实现
    //里面不用写方法的实现了
    //抽象方法只有方法名

    //抽象类的子类，子类必须实现这个抽象方法，子类也是抽象的话，就要子子类实现
    public abstract void hhh();

}
