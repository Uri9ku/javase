package com.javase.SE06_oop;
//一个项目只能有一个main方法
public class Application {
    public static void main(String[] args) {
        //类的实例化，类是抽象的，需要实例化
        //类实例化后，会返回一个自己的对象
        //uriku就是Student的具体实例
//        Student uriku = new Student();
//        uriku.name = "uriku";
//        uriku.age = 20;
//        System.out.println(uriku.name);
//        System.out.println(uriku.age);
//        uriku.study();

//        Student02 student02 = new Student02("Uriku");
//        System.out.println(student02.name);

        Student02 student02 = new Student02();
        student02.setName("Uriku");
        //没有直接操作属性
        System.out.println(student02.getName());
        student02.setAge(1022);
        System.out.println(student02.getAge());

        Extends anExtends = new Extends();
        anExtends.test("哈哈哈");
        //方法的调用，只和定义的数据类型有关
        A a = new A();
        a.test();


        //多态的体现为：↓↓↓↓↓↓↓↓
        //父类的引用变量B可以指向子类A
        //b是Anew出来的对象，调用了A是的方法
        //父类B的引用，指向了子类A
        B b = new A(); //子类重写了父类的方法
        b.test();

        //重名的属性，用父类
        //重名的方法，用子类
        //重写只能是public

        //静态方法和非静态方法区别很大
        //静态方法是类的方法，非静态方法是对象的方法
        //有static的时候，b调用了B类的方法，因为b是用B类定义的
        //没有static的时候，b调用的对象的方法，而b用A类new的
    }
}
