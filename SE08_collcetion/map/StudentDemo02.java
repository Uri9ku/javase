package com.javase.SE08_collcetion.map;

import java.util.Objects;

public class StudentDemo02 implements Comparable<StudentDemo02>{
    private String name;
    private int age;
    private int id;

    public StudentDemo02(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "StudentDemo02{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDemo02 that = (StudentDemo02) o;
        return age == that.age && id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }

    @Override
    public int compareTo(StudentDemo02 o) {
        int n = this.id - o.getId();
        return n;
    }
}
