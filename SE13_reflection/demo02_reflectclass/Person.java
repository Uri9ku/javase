package com.javase.SE13_reflection.demo02_reflectclass;

public class Person {
    private String name = "Uriku";
    public int age = 18;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void study(){
        System.out.println(name + "在学习");
    }

    public void play(){
        System.out.println(name + "打游戏");
    }
}
