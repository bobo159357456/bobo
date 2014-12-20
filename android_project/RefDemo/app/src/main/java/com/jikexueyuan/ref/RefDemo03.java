package com.jikexueyuan.ref;

/**
 * Created by zmzp on 14-12-4.
 */
class Ref2{
    String temp="hello";
}
public class RefDemo03 {
    public static void main(String[] args) {
        Ref2 r1 =new Ref2();
        r1.temp="jike";
        System.out.println(r1.temp);
        tell(r1);
        System.out.println(r1.temp);
    }
    public  static void tell(Ref2 r2){
        r2.temp="xueyuan";
    }
}
