package com.javase.SE06_oop;

public class Reference {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);

        chang(person);
        System.out.println(person.name);

    }

    //引用传递
    public static void chang(Person person){
        person.name = "Uriku";
    }
}



class Person{
    String name;
}
