package com.javase.SE06_oop;


//instanceof 判断数据类型
public class InstanceOf {
    public static void main(String[] args) {
        //x instacneof y
        //只有y继承了x，就不会报错，没继承就报错

        //Object > PersonIF  > StudentIF
        //       > String
        //       > TeacherIF
        Object object = new StudentIF();
        System.out.println(object instanceof StudentIF);  //true
        System.out.println(object instanceof Object);  //true
        System.out.println(object instanceof PersonIF); //true
        System.out.println(object instanceof TeacherIF); //false
        System.out.println(object instanceof String); //flase

        System.out.println("=================");

        //Object > PersonIF  > StudentIF
        //       > String
        //       > TeacherIF
        PersonIF person = new StudentIF();
        System.out.println(person instanceof StudentIF);  //true
        System.out.println(person instanceof PersonIF);  //true
        //System.out.println(person instanceof TeacherIF); //报错
        System.out.println(person instanceof Object);  //true
        //System.out.println(person instanceof String); //报错

        System.out.println("=================");

        //Object > PersonIF  > StudentIF
        //       > String
        //       > TeacherIF
        StudentIF student = new StudentIF();
        System.out.println(student instanceof StudentIF);  //true
        System.out.println(student instanceof Object);  //true
        System.out.println(student instanceof PersonIF);  //true
        //System.out.println(student instanceof TeacherIF); //报错
        //System.out.println(student instanceof String); //报错

        System.out.println("=================");

        //父类引用指向子类对象为向上转型
        //编译看左边，运行看右边
        //类型之间的转化：基本类型的转换， 高低 64 32  父是高的 子是低的
        //低转高不需要强制转化，这个是向上转型

        //向上转型就是把子类对象直接赋给父类引用，
        // 不用强制转换。
        // 使用向上转型可以调用父类类型中的所有成员，
        // 不能调用子类类型中特有成员，
        // 最终运行效果看子类的具体实现。
        //高                 低
        PersonIF student1 = new StudentIF();
        student1.run();

        //子类转换为父类，可能丢失自己本来的方法
        StudentIF person1 =  (StudentIF) new PersonIF();
        person1.go();

    }
}
