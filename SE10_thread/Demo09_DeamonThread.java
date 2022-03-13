package com.javase.SE10_thread;

public class Demo09_DeamonThread {
    public static void main(String[] args) {
        DeamonThread deamonThread = new DeamonThread();
        //当主线程结束后，守护线程不管有没有完成，会强制结束
        //设置守护线程,设置要比启动前
        deamonThread.setDaemon(true);
        deamonThread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("工作线程 " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//守护线程
class DeamonThread extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("守护线程");
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
