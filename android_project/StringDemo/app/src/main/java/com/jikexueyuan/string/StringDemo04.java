package com.jikexueyuan.string;

/**
 * Created by zmzp on 14-12-5.
 */
public class StringDemo04 {
    public static void main(String[] args) {
        String str = "  jikexueyuan@163.com";
//        System.out.println(str.length());
//        char data[] = str.toCharArray();
//        for (int i=0;i<data.length;i++){
//            System.out.print(data[i]+" ");
//        }
//        System.out.println(str.charAt(7));
//        byte bytes[] = str.getBytes();
//        for(int i =0;i<bytes.length;i++){
//            System.out.println(new String(bytes)+"\t");
//        }
//        System.out.println(str.indexOf("@"));
        System.out.println(str.trim());
        System.out.println(str.toUpperCase());
        System.out.println(str.endsWith("a"));
        System.out.println(str.replace("u","o"));
    }
}
