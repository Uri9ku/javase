package com.javase.SE07_;

public class DoWhileWhileFor {
    public static void main(String[] args) {

        for (int m = 1; m < 1000; m++) {
            if (m % 5 == 0){
                System.out.print(m + "\t");
            }
            if (m % 15 == 0){
                System.out.println("");
            }
        }
    }
}