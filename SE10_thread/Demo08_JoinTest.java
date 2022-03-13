package com.javase.SE10_thread;

public class Demo08_JoinTest {
    public static void main(String[] args) throws InterruptedException {
        T5 t5 = new T5();
        Thread thread = new Thread(t5);

        for (int i = 0; i < 10; i++) {
            System.out.println("hi " + i);
            Thread.sleep(1000);
            if (i == 5){
                thread.start();
                thread.join();
            }
        }
    }
}

class T5 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
