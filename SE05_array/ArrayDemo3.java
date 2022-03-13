package com.javase.SE05_array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        arr = reverseArray(arr);
        printArray(arr);

    }

    //打印数组元素
    public static void printArray(int[] arrays){
        for (int x:arrays) {
            System.out.print(x + " ");
        }
    }

    //反转数组
    public static int[] reverseArray(int[] arrays){
        int[] temp = new int[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            temp[temp.length-1-i] = arrays[i];
        }
        return temp;
    }
}
