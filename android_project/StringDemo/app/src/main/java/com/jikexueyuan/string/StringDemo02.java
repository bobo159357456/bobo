package com.jikexueyuan.string;

/**
 * Created by zmzp on 14-12-5.
 */
public class StringDemo02 {
    public static void main(String[] args) {
//        int a =10;
//        int b=10;
//        System.out.println(a==b);
        String str = "hello";
        String str1 = new String("hello");
        System.out.println(str.equals(str1));
        //"=="比较的是地址
        //"equals"比较的是内容
    }
}
