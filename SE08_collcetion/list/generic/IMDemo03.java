package com.javase.SE08_collcetion.list.generic;

public class IMDemo03 implements Demo03<String>{
    @Override
    public String server(String s) {
        System.out.println(s);
        return null;
    }
}
