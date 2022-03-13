package com.javase.SE10_thread;

/*线程的生命周期*/
public class Demo10_Life {
    public static void main(String[] args) throws InterruptedException {
        T6 t6 = new T6();
        System.out.println(t6.getName() + " 状态：" + t6.getState());
        t6.start();
        while (Thread.State.TERMINATED != t6.getState()){
            System.out.println(t6.getName() + " 状态：" + t6.getState());
            Thread.sleep(1000);
        }

        System.out.println(t6.getName() + " 状态：" + t6.getState());

    }
}

class T6 extends Thread{
    @Override
    public void run() {
        while(true){
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi " + i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            break;
        }
    }
}