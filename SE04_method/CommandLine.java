package com.javase.SE04_method;

public class CommandLine {
    public static void main(String[] args) {
        //命令行传参
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]" + args[i]);
        }
        //cmd命令行

    }
}
