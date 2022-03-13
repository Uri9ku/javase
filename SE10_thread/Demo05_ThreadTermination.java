package com.javase.SE10_thread;
/*线程终止*/
public class Demo05_ThreadTermination {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();

        //如果希望main去控制t1，线程终止，必须可以修改loop变量
        //让t1 退出run方法，从而终止t1线程 -> 通知方式
        //让主线程休眠10秒再终止子线程
        Thread.sleep(10000);
        t.setLoop(false);
    }
}

class T extends Thread{
    //设置一个控制变量
    private boolean loop = true;
    public void run() {
        while(loop){
            System.out.println("T运行中");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
