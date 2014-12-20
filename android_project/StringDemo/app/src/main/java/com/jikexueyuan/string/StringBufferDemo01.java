package com.jikexueyuan.string;

/**
 * Created by zmzp on 14-12-5.
 */
public class StringBufferDemo01 {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer();
        sbf.append("hello");
        sbf.insert(0, "i love");
        System.out.println(sbf.toString());
        sbf.replace(1,3,"wwwtliiu");
        System.out.println(sbf.toString());

    }

}
