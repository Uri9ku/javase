package com.javase.SE13_reflection.test;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> fileClass = Class.forName("java.io.File");
        Constructor<?>[] declaredConstructors = fileClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        Object o = fileClass.getDeclaredConstructor(String.class).newInstance("C:\\Users\\Uriku\\Desktop\\Resources\\aaa.md");
        Method createNewFile = fileClass.getDeclaredMethod("createNewFile");
        createNewFile.invoke(o);

    }
}
