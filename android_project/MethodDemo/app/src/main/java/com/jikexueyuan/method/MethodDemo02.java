package com.jikexueyuan.method;

/**
 * Created by zmzp on 14-12-3.
 */
public class MethodDemo02 {
    public static void main(String[] args) {
        tell(10,20);
        tell(10,20,30);

    }
    public static void tell(int i,int j){
        i=10;
        j=20;
        System.out.println(i+j);

    }
    public static void tell(int i,int j,int n){
        i=10;
        j=20;
        n=30;
        System.out.println(i+j+n);

    }
//    public int tell(){
//
//    }
//    public String tell(){
//
//    }
}
