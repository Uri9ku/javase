package com.javase.SE10_thread;
/*线程的礼让和线程的插队*/
public class Demo07_yeildandjoin {
    public static void main(String[] args) throws InterruptedException {
        T4 t4 = new T4();
        t4.start();

        for (int i = 0; i <= 20; i++) {
            System.out.println(Thread.currentThread().getName() + " 正在吃包子 " + i);
            try {
                Thread.sleep(1000); //1秒
            } catch (InterruptedException e) {

            }
            if (i == 5){
                System.out.println("主线程吃了5个，让子线程先吃，吃完再吃");
                //t4.join(); //相当于让t4线程先执行完毕
                Thread.yield(); //资源丰富，就不会礼让
                System.out.println("子线程吃完了，现在主线程吃");
            }
        }
    }

}

class T4 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println(Thread.currentThread().getName() + " 正在吃包子 " + i);
            try {
                Thread.sleep(1000); //1秒
            } catch (InterruptedException e) {

            }
        }
    }
}
