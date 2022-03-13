package com.javase.SE04_method;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("请输入第一个数：");
            double num1 = scanner.nextDouble();
            System.out.print("请输入第二个数：");
            double num2 = scanner.nextDouble();
            System.out.print("你要进行的运算是：");
            scanner.nextLine();//用于接收前面的/n
            String operator = scanner.nextLine();

            switch (operator) {
                case "+":
                    calculator.add(num1, num2);
                    break;
                case "-":
                    calculator.sub(num1, num2);
                    break;
                case "*":
                    calculator.multiply(num1, num2);
                    break;
                case "/":
                    calculator.divide(num1, num2);
                    break;
                default:
                    System.out.println("请输入有效运算符");
            }
        }

    }

    public double add(double i, double j) {
        double result = i + j;
        System.out.println(i + "+" + j + "=" + result);
        return result;
    }

    public double sub(double i, double j) {
        double result = i - j;
        System.out.println(i + "-" + j + "=" + result);
        return result;
    }

    public double multiply(double i, double j) {
        double result = i * j;
        System.out.println(i + "*" + j + "=" + result);
        return result;
    }

    public double divide(double i, double j) {
        double result = i / j;
        System.out.println(i + "/" + j + "=" + result);
        return result;
    }
}
