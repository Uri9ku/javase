package com.javase.SE05_array;

//多维数组 multidimensional array
public class ArrayDemo4 {
    public static void main(String[] args) {
        /* 1,2
           1,3,4,5
           4,5,6,7
         */

        int[][] multiarr = {{1,2},{1,3,4,5},{4,5,6,7}};

        for (int i = 0; i < multiarr.length; i++) {
            for (int x:multiarr[i]) {
                System.out.print(x + " ");
            }
        }

    }
}
