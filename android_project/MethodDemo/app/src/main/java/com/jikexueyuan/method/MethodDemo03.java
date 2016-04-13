package com.jikexueyuan.method;

/**
 * Created by zmzp on 14-12-4.
 */
public class MethodDemo03 {
    public static void main(String[] args) {
        System.out.println(addNum(100));
    }

    /**
     * 从1+100,100+99+98+97+..+1
     * @param num
     * @return
     */
    public static int addNum(int num){
        if (num==1){//程序出口
            return 1;
        }else {
            return num+addNum(num-1);
        }
    }
}
