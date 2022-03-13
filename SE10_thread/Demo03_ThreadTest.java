package com.javase.SE10_thread;

/*main线程执行两个子线程*/
public class Demo03_ThreadTest {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
        //主线程启动了两个线程的，直接退出了
    }
}

class T1 implements Runnable{

    @Override
    public void run() {
        //每隔一秒钟输出，输出十次结束
        int count = 0;
        while (true) {
            System.out.println("T1：" + ++count);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 20){
                break;
            }
        }
    }
}

class T2 implements Runnable{

    @Override
    public void run() {
        //每隔一秒钟输出，输出五次结束
        int count = 0;
        while (true) {
            System.out.println("T2：" + ++count);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 50){
                break;
            }
        }
    }
}