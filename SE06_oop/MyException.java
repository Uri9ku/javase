package com.javase.SE06_oop;

//自定义的异常
public class MyException extends java.lang.Exception {
    //传递数字>10；

    private int hh;

    public MyException(int hh) {
        this.hh = hh;
    }

    //异常的打印信息
    @Override
    public String toString() {
        return "MyException{" + "hh=" + hh + '}';
    }
}
