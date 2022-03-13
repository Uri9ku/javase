package com.javase.SE05_array;

public class Bubble {
    public static void main(String[] args) {
//1,3,4,1455,6,7
        ArrayDemo3 arrayDemo3 = new ArrayDemo3();
        int[] arr = {1,34,67657,122,4};
        bubble(arr);
        arrayDemo3.printArray(arr);
    }

    //冒泡排序
    /*
    * 1.比较数组中，两个相邻的元素，如果第一个数比第二个数大，我们就交换位置
    * 2.每一次比较，产生一次最大
    * 3.下一轮测可以减少一次排序
    * 4.依次循环，直到结束
    * */

    public static int[] bubble(int[] arr){
        int temp = 0;

        //外层循坏，判断这个走多少次
        for (int i = 0; i < arr.length-1; i++) {
            //内层循环，比较两个数，如果第一个数比第二个数大则交换位置
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    //临时变量
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
