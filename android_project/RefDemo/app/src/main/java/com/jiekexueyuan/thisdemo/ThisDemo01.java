package com.jiekexueyuan.thisdemo;

/**
 * Created by zmzp on 14-12-4.
 */
class People{
    private String name;
    private int age;
    public People(String name,int age){
        this();
        this.name=name;

        this.age=age;
    }
    public People(){
        System.out.println("无参数构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void tell(){
        System.out.println("姓名:"+this.getName()+"    年龄:"+this.getAge());

    }
}
public class ThisDemo01 {
    public static void main(String[] args) {
        People  p =new People("张三",30);
        p.tell();

    }
}
