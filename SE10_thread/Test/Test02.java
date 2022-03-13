package com.javase.SE10_thread.Test;

public class Test02 {
    public static void main(String[] args) {
        MonkeyGet monkeyGet = new MonkeyGet();
        Thread thread1 = new Thread(monkeyGet);
        thread1.setName("哥哥");
        Thread thread2 = new Thread(monkeyGet);
        thread2.setName("弟弟");
        thread1.start();
        thread2.start();
    }
}

class MonkeyGet implements Runnable{
    private static int monkey = 100000;

    @Override
    public void run() {

            while (true){
                synchronized (this) {
                    if (monkey < 1000){
                        System.out.println("银行卡余额：" + monkey + "元，不足1000元，无法取钱");
                        break;
                    }
                    monkey -= 1000;
                    System.out.println(Thread.currentThread().getName() + "取了1000元，余额：" + monkey + "元");
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }

    }
}
