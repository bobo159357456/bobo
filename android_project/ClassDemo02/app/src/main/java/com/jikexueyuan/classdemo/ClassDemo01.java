package com.jikexueyuan.classdemo;

/**
 * Created by zmzp on 14-12-4.
 */
class Person{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void tell(){
        //get是得到
        System.out.println("年龄:" + getAge()+"  "+"姓名: "+getName());
    }
}
public class ClassDemo01 {
    public static void main(String[] args) {
        Person per = new Person();
//        per.age=-30;
//        per.name="张三";
        per.setAge(30);
        per.setName("张三");
        per.tell();

    }
}
