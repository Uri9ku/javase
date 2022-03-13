package com.javase.SE10_thread;
/*Thread类的创建三种方法
* 1.继承Thread
* 2.实现Runnable接口
* 3.实现Callable接口
* 线程开启不一定立即执行，有CPU调度执行*/

public class Demo01_ThreadCreate01 {
    public static void main(String[] args) throws InterruptedException {
        //1.创建一个Cat对象，可以当作线程使用
        Cat cat = new Cat();
        //2.启动线程
        cat.start();
        //start() -> start0 -> run()
        //start0是本地方法，JVM调用，底层是C/C++实现
        //真正实现多线程的的是start0()，而不是run()


        //如果直接cat.run的话就是调用了run方法，没有用到子线程，这个run还是主线程调用了run方法而已
        //当main线程启动了子线程，主线程不会阻塞，会继续执行
        //主线程和子线程是交替执行的，可以说是多线程
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程：" + i + " 主线程名字：" + Thread.currentThread().getName());
            //让主线程休眠
            Thread.sleep(1000);
        }
    }
}

//1.继承Thread方法，该类就可以当作线程使用
//2.重写run方法，写上自己的业务代码
//3.run Thread类 实现了 Runnable 接口的run方法
/*
*    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }
* */
class Cat extends Thread{
    @Override
    public void run() {
        super.run();
        //重写run方法，写上自己的业务逻辑
        //每隔一秒输出
        int count = 1;

        while (true) {

            System.out.println(count + " 笑一笑，停一秒" + " 线程名：" + currentThread().getName());
            count++;
            try {
                //让该线程休眠一秒
                Thread.sleep(1000); //毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (count == 80){
                break; //当count到8时，退出while，线程也结束了
            }
        }
    }
}