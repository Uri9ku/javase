package com.javase.SE08_collcetion.list.linkelist;

public class StudentDemo01 {
    private String name;
    private int age;


    public StudentDemo01(String name, int age) {
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
        return "StudentDemo02{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        //判断是不是同一个对象
        if (this==obj){
            return true;
        }
        //判断是否为空
        if (obj==null){
            return false;
        }
        //判断是否为Student类型
        if (obj instanceof StudentDemo01){
            StudentDemo01 s = (StudentDemo01) obj;
            //比较属性
            if (this.name.equals(s.getName())&&this.age==s.getAge()){
                return true;
            }
        }
        //不满足条件返回flase
        return false;
    }
}
