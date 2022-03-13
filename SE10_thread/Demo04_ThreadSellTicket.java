package com.javase.SE10_thread;
/*使用多线程，模拟三个窗口售票，引出问题
**/
public class Demo04_ThreadSellTicket {
    public static void main(String[] args) {
        SellTicket sellTicket01 = new SellTicket();
        SellTicket sellTicket02 = new SellTicket();
        SellTicket sellTicket03 = new SellTicket();

        //出现票数负数，因为当票到1的时候，由于休眠的50ms间线，另外两个线程会运行，导致if判断出错
        //sellTicket01.start();
        //sellTicket02.start();
        //sellTicket03.start();

        //也会负数
        SellTicket02 sellTicket21 = new SellTicket02();
        new Thread(sellTicket21).start();
        new Thread(sellTicket21).start();
        new Thread(sellTicket21).start();

    }
}

//继承Thread类
class SellTicket extends Thread{
    private static int ticketnum = 100; //票数，让多个线程共享，用static

    @Override
    public void run() {
        while (true){
            if (ticketnum <= 0){
                System.out.println("票已售罄");
                break; //停止售票
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

//实现接口
class SellTicket02 implements Runnable{
    private int ticketnum = 100; //票数,只有一个线程，不用static

    @Override
    public void run() {
        while (true){
            if (ticketnum <= 0){
                System.out.println("票已售罄");
                break; //停止售票
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
