package com.jikexueyuan.string;

/**
 * Created by zmzp on 14-12-5.
 */
public class StringDemo05 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("jikexueyuan");
        for(int i=0;i<100;i++){
            str.append(i);
        }
        System.out.println(str.toString());
    }
}
