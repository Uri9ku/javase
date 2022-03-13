package com.javase.SE06_oop;

public class Person02 {

    protected String name = "Uriku";
    private int money = 1_0000_0000;
    public void say(){
        System.out.println("说了一句话");
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Person02() {
        System.out.println("Person02无参构造器执行了");
    }

    //私有的不能被继承
    public void print(){
        System.out.println("Person02");
    }
}
