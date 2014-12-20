package com.jikexueyuan.pol;

/**
 * Created by zmzp on 14-12-5.
 */
abstract class Person{
    private int age;
    private String name;
    public Person(int age,String name){
        this.age =age;
        this.name = name;

    }

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

    public abstract void want();
}

class Student extends Person{
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(int age,String name,int score){
        super(age,name);
    }
    public void want(){
        System.out.println("姓名:"+getName()+"    年龄:"+getAge()+" 成绩:"+getScore());
    }
}
class Worker extends Person{
    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Worker(int age, String name,int money) {
        super(age, name);
        this.money=money;
    }

    @Override
    public void want() {
        System.out.println("姓名:"+getName()+"    年龄:"+getAge()+" 工资:"+getMoney());

    }
}
public class AbsDemo01 {
    public static void main(String[] args) {
        Student s = new Student(10,"小明",100);
        s.want();
        Worker w = new Worker(30,"大明",1000);
        w.want();

    }
}
