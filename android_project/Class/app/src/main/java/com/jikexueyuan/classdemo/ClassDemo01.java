package com.jikexueyuan.classdemo;

class Person{
    String name;
    int age;
    public void tell(){
        System.out.println("姓名:"+name+"     "+"性别:"+age);
    }
}
/**
 * Created by zmzp on 14-12-4.
 */
public class ClassDemo01 {
    public static void main(String[] args) {
        /**
         * 创建对象
         * 赋值
         * 对象.属性
         * 对象.方法
         */
        Person per =null; //声明
//        per = new Person();//实例化操作
//        Person per = new Person();//声明并实例化
        per.name="张三";
        per.age=30;
        per.tell();
        /*
         *Exception in thread "main" java.lang.NullPointerException
         * 空指针异常
         *
         */

    }
}
