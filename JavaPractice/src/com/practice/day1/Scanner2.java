package com.practice.day1;

import java.util.Scanner;

public class Scanner2 {
	
	public static int addtion()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" Enter first integer");
		int a=sc.nextInt();
		
		System.out.println(" Enter second integer");
		int b=sc.nextInt();
		
		int c=a+b;
		return c;
	
	}

	public static void main(String[] args) {
		
	int x=addtion();
	int y=addtion();
	System.out.println(x+y);
	}

}
