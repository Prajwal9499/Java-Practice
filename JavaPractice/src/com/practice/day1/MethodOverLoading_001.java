package com.practice.day1;

public class MethodOverLoading_001 {

	public static void main(String[] args) {
		Praj d=new Praj();
		System.out.println("PS--------------------->");
		System.out.println(d.test(3,3));
		Praj d1=new Praj();
		System.out.println(d1.test(3,6));
	}
}
	class Praj{
		
	
	void test(int x)
	{
		System.out.println("Running int x test(0) method");
		System.out.println("x value is "+ x);
	}

	void test(double arg2)
	{
		System.out.println("Running double  x test(0) method");
		System.out.println("arg2 value is "+ arg2);
	}
	
	void test(int x, double arg2)
	{
		System.out.println("running int,double test()");
		System.out.println("x value is "+ x);
		System.out.println("arg2 value is "+ arg2);
	}
	int test(int x,int y)
	{
		System.out.println(x +" "+ y);
		int c=x+y;
		return c;
	}
	}

