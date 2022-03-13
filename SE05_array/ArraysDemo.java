package com.javase.SE05_array;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5}; //静态初始化
        int[] arr2 = new int[10]; //动态初始化
        // 默认值为0
         int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
            sum +=  arr2[i];
            System.out.println(arr2[i]);
            System.out.println(sum);
        }

    }
}
