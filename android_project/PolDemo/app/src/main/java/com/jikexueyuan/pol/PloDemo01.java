package com.jikexueyuan.pol;

/**
 * Created by zmzp on 14-12-5.
 */
class A{
    public void tell1(){
        System.out.println("A--tell1");
    }
    public void tell2(){
        System.out.println("A--tell2");
    }
}
class B extends A{
    public void tell1(){
        System.out.println("B--tell1");
    }
    public void tell3(){
        System.out.println("B--tell3");
    }
}
public class PloDemo01 {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a instanceof A);
        System.out.println(a instanceof B);

        A a1 = new B();
        System.out.println(a1 instanceof A);
        System.out.println(a1 instanceof B);
    }
}
