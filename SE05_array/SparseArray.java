package com.javase.SE05_array;

public class SparseArray {
    //1.创建一个二位数组 11*11  0:没有棋子 1:黑棋 2:白棋

    public static void main(String[] args) {
        int[][] arr = new int[11][11];
        arr[1][2] = 1;
        arr[2][3] = 1;
        System.out.println("输出的原始数组：");

        for (int[]x:arr) {
            for (int y:x) {
                System.out.print(y + "\t");
            }
            System.out.println();
        }

        //转化为稀疏数组
        //获取有效的个数

        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (arr[i][j]!=0){
                    sum++;
                }
            }
        }
        System.out.println("======");
        System.out.println("有效的个数：" + sum);

        //2.创建一个稀疏数组的数组
        int[][] arr2 = new int[sum+1][3];
        arr2[0][0] = 11;
        arr2[0][1] = 11;
        arr2[0][2] = sum;

        //遍历二维数组，将非零的值，存放在稀疏数组中
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]!=0){
                    count++;
                    arr2[count][0] = i;
                    arr2[count][1] = j;
                    arr2[count][2] = arr[i][j];
                }
            }
        }

        //输出稀疏数组
        System.out.println("输出稀疏数组");

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(
                    arr2[i][0]+"\t" +
                    arr2[i][1]+"\t" +
                    arr2[i][2]+"\t");
        }

        //还原稀疏数组

        System.out.println("还原稀疏数组");
        //读取稀疏数组的值
        int[][] arr3 = new int[arr2[0][0]][arr2[0][1]];
        //给其中的元素还原值
        for (int i = 1; i < arr2.length; i++) {
            arr3[arr2[i][0]][arr2[i][1]] = arr2[i][2];
        }
        //打印
        for (int[]x:arr3) {
            for (int y:x) {
                System.out.print(y + "\t");
            }
            System.out.println();
        }

    }


}