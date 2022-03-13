package com.javase.SE06_oop;

public class MyExceptionTest {
    //可能会存在异常的方法
    static void test(int a) throws MyException {
        System.out.println("传递的参数：" +a);
        if(a>10){
            throw new MyException(a);
        }

        System.out.println("ok");
    }

    public static void main(String[] args) throws MyException {
        try {
            test(11);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
