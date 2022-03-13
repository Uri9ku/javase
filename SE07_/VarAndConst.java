package com.javase.SE07_;

public class VarAndConst {
    /*  类变量
    *   实例变量
    *   局部变量
    */
    //类变量 static
    static double salary = 2500;
    //常量,其中static final 为修饰符,位置随意
    static final double PI_CONST = 3.14;

    //实例变量 也叫全局变量  :从属于对象,如果不初始化的话,会自动使用类型的默认值
    String name;
    int age;
    float money;
    boolean flag;
    char hh;
    //除了基本类型,其余默认的都是null

    public static void main(String[] args) {
        //type varName [= value]
        //局部变量,必须初始化
        int i = 10;
        System.out.println(i);
        VarAndConst varAndConst = new VarAndConst();
        System.out.println(varAndConst.name);
        System.out.println(varAndConst.flag);
        System.out.println(varAndConst.hh);
        System.out.println(varAndConst.money);
        System.out.println(varAndConst.age);
        System.out.println(salary);

        System.out.println(PI_CONST);
    }

    //其他方法
    public void add(){
        //System.out.println(i);  //用不了main的i
    }

}
