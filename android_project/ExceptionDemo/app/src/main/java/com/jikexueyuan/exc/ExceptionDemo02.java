package com.jikexueyuan.exc;

/**
 * Created by zmzp on 14-12-5.
 */
public class ExceptionDemo02 {
    public static void main(String[] args) throws Exception{
        tell(10,10);
    }
    public static void tell(int i,int j)throws ArithmeticException{
        int temp=0;
        temp = i/j;
        System.out.println(temp);
    }
}
