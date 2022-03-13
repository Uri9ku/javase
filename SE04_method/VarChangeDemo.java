package com.javase.SE04_method;


//排序方法
public class VarChangeDemo {
    public static void main(String[] args) {
        printMax(12.3,13,45,777);
        printMax(new double[] {12.3,13,45});
    }

    public static void printMax(double... numbers){
        if (numbers.length == 0){
            System.out.println("没有长度");
            return;
        }

        double result = numbers[0];

        //排序
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > result){
                result = numbers[i];
            }
        }
        System.out.println("数组最大：" + result);
    }


}
