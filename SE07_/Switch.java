package com.javase.SE07_;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        //不写break就会case穿透
        switch (i) {
            case "Uriku":
                System.out.println("是王五");
                break;
            case "eugeo":
                System.out.println("是王五0");
                break;
            case "krito":
                System.out.println("是王五00");
                break;
            case "hihia":
                System.out.println("是王五000");
                break;
            default:
                System.out.println("不知道");
        }
    }
}
