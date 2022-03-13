package com.javase.SE10_thread;
/*Thread常用方法*/
public class Demo06_ThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        T3 t3 = new T3();
        t3.setName("Uriku"); //设置线程名
        t3.setPriority(Thread.MIN_PRIORITY);//设置线程优先级
        t3.start();

        //主线程打印5个hi就中断子线程的休眠

        for (int i = 0;i<1;i++) {
            System.out.println("hi");
            Thread.sleep(30);
            t3.interrupt();
        }

        System.out.println(t3.getName() + "的优先级：" + t3.getPriority());

    }
}

class T3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + " 正在吃包子 " + i);
            try {
                System.out.println(Thread.currentThread().getName() + "正在休眠 ");
                Thread.sleep(20000); //20秒
            } catch (InterruptedException e) {
                //当该线程执行到一个interrupt方法时，就会catch一个异常，看加入自己的业务代码
                //InterruptedException 是捕获到一个中断异常
                System.out.println(Thread.currentThread().getName() + " 被interrupt");
            }
        }
    }
}
