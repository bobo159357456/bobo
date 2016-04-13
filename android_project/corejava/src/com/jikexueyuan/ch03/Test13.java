package com.jikexueyuan.ch03;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入分数:");
		int score = scanner.nextInt();
		if(score>=60){
			System.out.println(score+"及格");
		}
		
	}

}
