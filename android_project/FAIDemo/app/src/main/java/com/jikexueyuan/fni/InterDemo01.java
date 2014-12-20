package com.jikexueyuan.fni;

/**
 * Created by zmzp on 14-12-5.
 */
interface Inter1{
    public static final int AGE=100;
    public abstract void tell();
}
interface Inter2{
    public abstract void say();
}
abstract  class Abs1{
    public abstract void print();
}
class A extends Abs1 implements Inter1,Inter2{
    @Override
    public void tell() {

    }

    @Override
    public void say() {

    }

    @Override
    public void print() {

    }
}
interface Inter3 extends Inter1,Inter2{

}
public class InterDemo01 {
    public static void main(String[] args) {
//        Inter i = new new();Inter
        A a = new A();
        a.tell();
        System.out.println(Inter1.AGE);
        a.say();
        a.print();

    }
}
