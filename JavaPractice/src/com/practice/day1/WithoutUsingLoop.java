package com.practice.day1;

public class WithoutUsingLoop {
	
	static void printNumber(int a)
	{
		System.out.println(a);
		a++;
		if(a<=10);
		printNumber(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PROGRAM STARTED");
		printNumber(1);
		System.out.println("PROGRAM ENDED");
	}

}
