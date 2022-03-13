package com.javase.SE13_reflection;

/*演示如何通过反射获取类的结构信息
* */

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@SuppressWarnings({"all"})
public class Demo08_ReflectionUtils {
    public static void main(String[] args) throws ClassNotFoundException {

    }

    //第一组：API
    @Test
    public void api01() throws ClassNotFoundException, NoSuchMethodException {
        //得到Class对象
        Class<?> personClass = Class.forName("com.javase.SE13_reflection.Person");
        //1.获取全类名
        System.out.println(personClass.getClass());
        //2.获取简单类目
        System.out.println(personClass.getSimpleName());
        //3.获取本类所有public的属性（包括父类）
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println("本类及父类的pubilce属性" + field.getName());
        }
        //4.获取本类所有属性，不包括父类
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }

        //5.获取本类的public修饰的方法，包括所有父类
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        //6.获取本类的所有方法 不包括父类
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("本类的所有方法" + declaredMethod.getName());
        }

        //7.获取所有public修饰的构造器，不包括父类
        Constructor<?>[] constructors = personClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("本类及父类的构造器：" + constructor.getName());
        }
        //8.获取本类的所有构造器
        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("本类的所有构造器：" + declaredConstructor.getName());
        }

        //9.得到包
        Package aPackage = personClass.getPackage();
        System.out.println("包名：" + aPackage);

        //10.以Class形式返回父类信息
        Class<?> superclass = personClass.getSuperclass();
        System.out.println("父类的：" + superclass);


        //11.得到接口
        Class<?>[] interfaces = personClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println("接口：" + anInterface);
        }

        //12.获取注解信息
        Annotation[] annotations = personClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }


    @Test
    public void api02() throws ClassNotFoundException {
        //得到Class对象
        Class<?> personClass = Class.forName("com.javase.SE13_reflection.Person");
        //1.获取全类名
        System.out.println(personClass.getClass());
        //2.获取简单类目
        System.out.println(personClass.getSimpleName());
        //3.获取本类所有属性
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("本类所有属性对象的修饰符的值" + declaredField.getName() + declaredField.getModifiers() +
                    "对应的属性类型：" + declaredField.getType());
        }
        //该属性对应的class对象
        //默认是0 public是1 prvate是2 protected是4 static是8 final是16


        //4.以Class形式获取返回值类型
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("本类的所有方法" + declaredMethod.getName() + "访问修饰符的值" + declaredMethod.getModifiers() +
                    "返回值类型：" + declaredMethod.getReturnType());
            //5.输出当前方法的形参数组情况
            for (Class<?> parameterType : declaredMethod.getParameterTypes()) {
                System.out.println("该方法的形参类型：" + parameterType);
            }


        }

        //6.获取本类的所有构造器
        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("本类的所有构造器：" + declaredConstructor.getName());
            Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("该构造器的形参类型：" + parameterType);
            }
        }




    }
}





class A{
    public String hobby;

    public void hi(){}

    public A() {
    }

    public A(String hobby) {
        this.hobby = hobby;
    }
}

interface IA{

}

interface IB{

}

@Deprecated
class Person extends A implements IA,IB{
    public String name;
    protected static int age;
    String job;//默认
    private double money;

    public Person(String name, int age, String job, double money) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.money = money;
    }

    private  Person(String name){

    }


    public void m1(String name,int age){

    }

    String  m2(){
        return "";
    }

    protected void m3(){

    }

    private void m4(){

    }

}
