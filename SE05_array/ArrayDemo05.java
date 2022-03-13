package com.javase.SE05_array;

import java.util.Arrays;

public class ArrayDemo05 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,456,6756,2,455};
        System.out.println(Arrays.toString(arr)); //遍历数组

        ArrayDemo3 arrayDemo3 = new ArrayDemo3(); //自己写的遍历数组
        arrayDemo3.printArray(arr);

        Arrays.sort(arr);
        System.out.println("\n" + Arrays.toString(arr));  //数组排序

        Arrays.fill(arr,0);
        System.out.println(Arrays.toString(arr));  //数组排序


    }
}
