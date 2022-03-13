package com.javase.SE06_oop;

public class Exception {
    /*
    * 1.*/

    static int a = 1;
    static int b = 0;

    public static void main(String[] args) {

        //  假设需要不捕获多个异常，从小到大
        // ctrl + alt + t

        try {  //监控区域
            System.out.println(a / b);
        } catch (java.lang.ArithmeticException e) { //捕获异常
            System.out.println("程序出现异常，变量b不能为0");
        }finally { //处理善后工作，就算有异常也会执行
            System.out.println("finally");
        }

        try {
            new Exception().a();
        } catch (java.lang.StackOverflowError e) { //捕获异常
            System.out.println("程序出现异常，禁止套娃");
        }finally { //处理善后工作，就算有异常也会执行
            System.out.println("finally");
        }


    }//finally可以不用用，假设有IO资源关闭，Scanner,要关闭

    public void a(){
        b();
    }
    public void b(){
        a();
    }
}
