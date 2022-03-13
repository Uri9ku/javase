package com.javase.SE07_;

public class BreakAndContinue {
    public static void main(String[] args) {
        int i = 0;

        while(i<30){
            i++;
            System.out.println(i);
            if (i==20){
                break;
            }
        }

        System.out.println("break是终止循环，并不是结束程序");

        //continue是终止某次循环

        int a = 0;
        while(a<100){
            a++;
            System.out.println(a);
            if(a == 30){
                System.out.println("");
                continue;
            }
            System.out.println("continue是终止某次的执行");
        }

    }
}
