package com.javase.SE08_collcetion.map;




import java.util.HashMap;
import java.util.Map;

public class Demo02 {
    /*HashMap集合的使用
    * 1.存储结构：数组+链表+红黑树
    * 2.使用hashCode和equals作为重复*/
    public static void main(String[] args) {
        //1.创建集合
        HashMap<StudentDemo02,String> student = new HashMap<StudentDemo02,String>();

        StudentDemo02 s1 = new StudentDemo02("Uriku",11,232);
        StudentDemo02 s2 = new StudentDemo02("Krito",11,233);
        StudentDemo02 s3 = new StudentDemo02("Eugeo",11,234);
        //2.添加元素
        student.put(s1,"RW");
        student.put(s2,"UW");
        student.put(s3,"UW");
        student.put(s2,"UR");  //key不变，value被替换

        student.put(new StudentDemo02("Uriku",11,232),"UW"); //一模一样可以添加上去，因为内存地址不一样,得重写才不能添加
        System.out.println("元素个数：" + student.size());
        System.out.println(student.toString());

        //3.删除
        student.remove(s2);
        System.out.println("删除之后：" + student.size());

        //4.遍历
        //4.1keySet()
        for (StudentDemo02 key: student.keySet()
             ) {
            System.out.println(key + ":" + student.get(key));
        }

        //4.2 enTry()
        System.out.println("entrySet");
        for (Map.Entry<StudentDemo02,String> entry : student.entrySet()
        ) {
            System.out.println(entry.getKey() + "：" + entry.getValue()
            );
        }

        //5.判断
        System.out.println(student.containsValue("UW"));
    }
}
