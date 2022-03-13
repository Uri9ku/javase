package com.javase.SE04_method;
//递归，能不用递归就不用，费电脑
//递归就是自己调用自己，是为了减少代码量

/*
* 递归头：什么时候不调用自身的方法，如果没有头，将陷入死循环
* 递归尾：什么时候要调用自身的方法
* */
public class Recursion {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        System.out.println(f(10));
    }

    //阶乘
    //1! 1*1
    //2! 2*1
    //3! 3*2*1
    public static int f(int n){
        if (n==1){   //递归头
            return 1;
        }else {   //递归尾
            return n * f(n-1);
        }

    }

    //递归用了栈机制了，栈基址就是后进先出
    //边界条件：边界
    //前阶段；
    //返回阶段：
}
