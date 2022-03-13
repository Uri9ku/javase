package com.javase.SE04_method;

public class VarChange {
    public static void main(String[] args) {
        //可变参数，不定向参数
        VarChange vc = new VarChange();
        vc.add(1,2,3,4,5,6,7,8);

    }

    //可变参数,本质就是数组
    /*1.一个方法只能有一个可变参数
    * 2.可变参数必须放在最后一个
    * */

    public void add(int... i){
        System.out.println(i[0]);
    }
}
