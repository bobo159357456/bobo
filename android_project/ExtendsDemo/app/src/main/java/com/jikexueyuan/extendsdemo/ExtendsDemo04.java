package com.jikexueyuan.extendsdemo;

/**
 * Created by zmzp on 14-12-4.
 */

class A {
    public void tell(){
        System.out.println("我是tell方法");

    }
    void print(){

    }
}
class B extends A{
    public void tell(){
        super.tell();
        System.out.println("我重写了tell方法");
    }
}
public class ExtendsDemo04 {
    public static void main(String[] args) {
        B b= new B();
        b.tell();

    }
    void print(){

    }
}
