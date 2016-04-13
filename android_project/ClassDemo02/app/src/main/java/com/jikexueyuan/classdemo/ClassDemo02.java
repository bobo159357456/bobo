package com.jikexueyuan.classdemo;

/**
 * Created by zmzp on 14-12-4.
 */
class People{
    //构造方法
    int age;
    String name;
    public People(int a,String n ){
        age=a;
        name=n;
        System.out.println("姓名:"+name+"        "+"年龄:"+age);
    }
    public People(int a){
        age=a;
        System.out.println("年龄:"+age);
    }
}
public class ClassDemo02 {
    public static void main(String[] args) {
        People per = new People(30,"张三");

    }
}
