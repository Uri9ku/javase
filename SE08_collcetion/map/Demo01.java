package com.javase.SE08_collcetion.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01 {
    /*Map接口的使用
    * 1.存储键值对
    * 2.键不能重复
    * 3.值可以重复*/

    public static void main(String[] args) {
        //1.创建Map集合
        Map<String,String> map = new HashMap<>();

        //2.添加元素
        map.put("uriku","Uriku");
        map.put("eugeo","Eugeo");
        map.put("krito","Krito");

        map.put("alice","Alice");
        map.put("alice","HIAHIA"); //添加进去了，不过HIAHIA替换了Alice

        System.out.println("元素个数：" + map.size());
        System.out.println(map.toString());

        //3.删除
        map.remove("alice");
        System.out.println("元素个数：" + map.size());

        //4.遍历
        //4.1 增强for
        System.out.println("增强for遍历");
        Set<String> keyset = map.keySet();
        //先获取key的集合
        for (String key:keyset
             ) {
            //这个输出的是key，System.out.println(x);
            System.out.println(key + ":" + map.get(key));
        }

        //4.2 entrySet(),得到的是<K,V>集合
        //Map的内部接口
        System.out.println("entry遍历");
        Set<Map.Entry<String,String>> entries = map.entrySet();
        for (Map.Entry<String,String> entry:entries
             ) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
