package com.javase.SE10_thread;
/*Thread类的创建
 * 1.
 * 2.实现Runnable接口,开发线程,底层使用了设计模式（代理模式，静态的代理）
 * 3.
 * */
public class Demo02_ThreadCreate02{
    public static void main(String[] args) {
        Dog dog = new Dog();
        //实现了Runnable接口没有dog.start();
        //1.创建Thread对象，把dog对象（已经实现了Runnable），放入了Thread
        Thread thread = new Thread(dog);
        thread.start();

        //
        Tiger tiger = new Tiger();//实现了Runnable
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        thread.start();
    }
}

class Dog implements Runnable{

    int count = 0;
    @Override
    public void run() {
        while (true){
            System.out.println("线程叫了：" + ++count + " 线程名：" + Thread.currentThread().getName());
            //休眠一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10){
                break;
            }
        }
    }
}

class Animal{}
//Tiger类继承了Animal类就不能再继承Thread类了，Java是单继承，因此只能实现Runnable接口来实现多线程
class Tiger extends Animal implements Runnable{
    @Override
    public void run() {

    }
}

//线程代理类，模拟了一个极简的Thread类
class ThreadProxy implements Runnable{

    private Runnable target = null;
    @Override
    public void run() {
        if (target != null) {
            //动态绑定（运行类型Tiger）
            target.run();//因为target是Runnable类型，所以可以调用run方法
        }
    }

    public ThreadProxy(Runnable tagret){
        this.target = tagret;
    }

    public void start(){
        start0();//真正实现多线程的方法
    }

    public void start0(){
        run();
    }
}
