package com.jikexueyuan.ch03;

import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("java android sql:");
		int java = scanner.nextInt();
		int android = scanner.nextInt();
		int sql = scanner.nextInt();
		int maxScore=java;
		if(maxScore<android){
			maxScore=android;
		}
		if(maxScore<sql){
			maxScore=sql;
		}
		System.out.println("最高分:"+maxScore);
	}

}
