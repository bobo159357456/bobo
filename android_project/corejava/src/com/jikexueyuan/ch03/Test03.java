package com.jikexueyuan.ch03;

/**
 * Created by zmzp on 14-12-3.
 */
public class Test03 {
    public static void main(String[] args) {
        System.out.println("3.758保留小数点后2位"+pround(3.758,2));


    }
    static double pround(double value,int index){
        //步骤1,计算10的n次方
        double pow10=Math.pow(10,index);
        //步骤2,定义result变量保存计算结果
        double result=value*pow10;
        //步骤3,对index+1位进行四舍五入
        result=Math.round(result);
        //步骤4,环境value值
        result/=pow10;
        return result;
    }
}
