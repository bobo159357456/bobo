package com.jikexueyuan.pol;

/**
 * Created by zmzp on 14-12-5.
 */
class A1{
    public void tell1(){
        System.out.println("A--tell1");
    }
}
class B1 extends A1{
    public void tell2(){
        System.out.println("B--tell2");
    }
}
class C1 extends A1{
    public void tell3(){
        System.out.println("C--tell3");
    }
}
class D1 extends A1{

}
public class PolDemo02 {
    public static void main(String[] args) {
        say(new B1());
        say(new C1());
        say(new D1());
    }
    public static void say(A1 a){
        a.tell1();
    }
}
