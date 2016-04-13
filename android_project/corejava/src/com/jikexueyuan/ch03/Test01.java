package com.jikexueyuan.ch03;

import java.util.Scanner;

/**
 * Created by zmzp on 14-12-3.
 */
public class Test01 {
    static String name;
    static char sex;
    static short age;
    static float height;
    static String type;

    public static void main(String[] args) {
        //输入一个的数据
        input();

        System.out.print("嗨，大家好，我叫：" + name);
        System.out.print(",今年：" + age + "岁");
        System.out.print(",身高：" + height + "米");
        System.out.println(",我是一个" + type + "的男士");
        //给第二个人输入数据
        input();
        System.out.print("嗨，大家好，我叫：" + name);
        System.out.print(",今年：" + age + "岁");
        System.out.print(",身高：" + height + "米");
        System.out.println(",我是一个" + type + "的男士");

    }
    static void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("姓名：");
        name = scanner.next();
        System.out.println("性别：");
        sex = scanner.next().charAt(0);
        System.out.println("年龄：");
        age = scanner.nextShort();
        System.out.println("身高：");
        height = scanner.nextFloat();
        System.out.println("性格：");
        type = scanner.next();
    }
}
