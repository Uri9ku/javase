package com.javase.SE05_array;


/*Java内存分析
*
* 堆 对象在堆
* 1.存放new的对象和数组
* 2.可以给所有的线程共享，不会存放别的对象引用
*
*
* 栈 赋值在栈
* 1.存放基本变量类型（会包括这个基本类型的具体数值）
* 2.引用对象的变量（会存放这个引用在堆里面的具体地址）
*
* 方法区
* 1.可以被所有线程共享
* 2.包含了所有class和static变量
* */
public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //打印所有元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("=++++===");
        //求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(sum+=arr[i]);
        }

        //查找最大元素
        System.out.println("=++++===");
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
