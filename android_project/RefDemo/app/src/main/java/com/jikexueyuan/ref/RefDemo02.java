package com.jikexueyuan.ref;

/**
 * Created by zmzp on 14-12-4.
 */
public class RefDemo02 {
    public static void main(String[] args) {
        String str1="Hello";
        System.out.println(str1);
        tell(str1);
        System.out.println(str1);
    }
    public static void tell(String str2){
        str2="jike";

    }
}
