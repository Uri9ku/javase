package com.javase.SE10_thread.Test;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;
import java.util.TreeSet;

public class Test01 {
    public static void main(String[] args) {
        printMath printMath = new printMath();
        Scanner_ scanner_ = new Scanner_(printMath);
        Thread thread1 = new Thread(printMath);
        Thread thread2 = new Thread(scanner_);
        thread1.start();
        thread2.start();
    }
}


class printMath implements Runnable {
    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            System.out.println((int)(Math.random() * 100 + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}

class Scanner_ implements Runnable{
    private String str;
    private printMath pm;

    //在构造器中传入printMath对象
    public Scanner_(printMath pm) {
        this.pm = pm;
    }

    @Override
    public void run() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();
            if (str.equals("Q")){
                pm.setLoop(false);
                break;
            }
        }
    }
}
