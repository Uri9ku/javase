package com.javase.SE06_oop;

public class InnerClass2 {

    public void method(){
        //局部内部类
        class Inner{
            public void in(){

            }
        }
    }

    public static void main(String[] args) {

        //没有名字的初始化类，就是匿名内部类
        //不用将实例保存到变量中
        new ABB().eat();
    }


}

//这个也是内部类
class ABB{
    public void eat(){
        System.out.println("1");
    }
}

interface ABBBB{

}


