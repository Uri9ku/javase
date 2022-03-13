package com.javase.SE13_reflection.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        //同下Class<?> aClass = Class.forName("com.javase.SE13_reflection.test.PrivateTest");
        Class<PrivateTest> privateTestClass = PrivateTest.class;

        Object o = privateTestClass.getConstructor().newInstance();

        Field name = privateTestClass.getDeclaredField("name");

        name.setAccessible(true);

        System.out.println(name.get(o));

        name.set(o,"Eugeo");

        Method getName = privateTestClass.getDeclaredMethod("getName");
        System.out.println(getName.invoke(o));
    }
}

class PrivateTest{
    private String name = "Uriku";

    public PrivateTest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PrivateTest{" +
                "name='" + name + '\'' +
                '}';
    }
}
