package com.javase.SE08_collcetion.set;

import java.util.Objects;

public class PersonDemo3 implements Comparable<PersonDemo3> {
    private String name;
    private int age;

    public PersonDemo3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonDemo3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonDemo3 that = (PersonDemo3) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(PersonDemo3 o) {
        //1.对比姓名，比较规则自己定义
        int n1 = this.getName().compareTo(o.getName());
        //2.this大的话就是正的数
        int n2 = this.getAge()-o.getAge();
        //3.n1==0,说明名字一样
        //4.如果姓名不一样，返回n1,如果姓名一样就比年龄
        return n1==0?n2:n1;
    }
}
