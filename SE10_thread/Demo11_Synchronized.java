package com.javase.SE10_thread;
/*使用同步锁解决售票问题
* synchronized*/
public class Demo11_Synchronized {
    public static void main(String[] args) {

        //SellTicket3 sellTicket3 = new SellTicket3();
        //new Thread(sellTicket3).start();
        //new Thread(sellTicket3).start();
        //new Thread(sellTicket3).start();

       //SellTicket4 sellTicket3 = new SellTicket4();
       //new Thread(sellTicket3).start();
       //new Thread(sellTicket3).start();
       //new Thread(sellTicket3).start();

        //对象锁
        SellTicket5 sellTicket3 = new SellTicket5();
        new Thread(sellTicket3).start();
        new Thread(sellTicket3).start();
        new Thread(sellTicket3).start();

        //.class的锁
    }
}


//方法一：使用同步synchronized，线程同步，在方法上加
class SellTicket3 implements Runnable{
    private int ticketnum = 100; //票数,只有一个线程，不用static
    private boolean loop = true; //控制run方法变量

    @Override
    public void run() {
        while (loop){
            sell(); //同步方法
        }
    }
    //这个就是一个同步方法
    //这个锁在this对象，即SellTicket3
    //也可以在代码块上加锁
    public synchronized void sell(){ //同步方法，在同一时刻，只有一个线程来执行sell方法
        if (ticketnum <= 0){
            System.out.println("票已售罄");
            loop = false;
            return; //停止售票
        }
        //休眠50毫秒,模拟
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("窗口：" + Thread.currentThread().getName() + " 售出了一张票，剩余票数" + (--ticketnum));
    }
}


//方法二：在代码块上加
class SellTicket4 implements Runnable{
    private int ticketnum = 100; //票数,只有一个线程，不用static
    private boolean loop = true; //控制run方法变量

    @Override
    public void run() {
        while (loop){
            sell(); //同步方法
        }
    }

    public  void sell(){ //同步方法，在同一时刻，只有一个线程来执行sell方法
    //这个互斥锁还是在this对象，SellTicket4
        synchronized (this) {
            if (ticketnum <= 0){
                System.out.println("票已售罄");
                loop = false;
                return; //停止售票
            }
            //休眠50毫秒,模拟
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口：" + Thread.currentThread().getName() + " 售出了一张票，剩余票数" + (--ticketnum));
        }
    }
}


//方法三：在对象上加锁
class SellTicket5 implements Runnable{
    private int ticketnum = 100; //票数,只有一个线程，不用static
    private boolean loop = true; //控制run方法变量
    Object obj = new Object();
    @Override
    public void run() {
        while (loop){
            sell(); //同步方法
        }
    }

    public  void sell(){ //同步方法，在同一时刻，只有一个线程来执行sell方法
        //这个互斥锁还是在this对象，SellTicket4
        synchronized (obj) {
            if (ticketnum <= 0){
                System.out.println("票已售罄");
                loop = false;
                return; //停止售票
            }
            //休眠50毫秒,模拟
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口：" + Thread.currentThread().getName() + " 售出了一张票，剩余票数" + (--ticketnum));
        }

    }

    //这个锁是加在SellTicket5.class
    public synchronized  static void m1(){
    }

    //如果在静态方法中，实现一个同步代码块
    public  static void m2(){
        synchronized (SellTicket5.class){
        }
    }
}