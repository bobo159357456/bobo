package com.jikexueyuan.extendsdemo;

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
//    public void tell(){
//        System.out.println("姓名: "+ getName()+"  年齡:"+getAge());
//    }
}
class Student extends Person{
//    private int age;
//    private String name;
    private int score;
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public void say(){
        System.out.println("成績: "+getScore()+getName()+getAge());
    }
}
public class ExtendsDemo01 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(20);
        s.setName("張三");
        s.setScore(100);
//        s.tell();
        s.say();
    }
}
