package com.practice.day1;

public class Calculator {
	int age;
	String Name;
	String Work;

	public void yoyo(int f, String g) {
		this.age=f;
		this.Name=g;
		System.out.println(age +" "+ Name);
	}

	public Calculator(int z,int y)
	{
		int x=z*y;
		System.out.println(x);
	}

	

	public void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public void subtract(int a, int b) {
		int c = a - b;
		System.out.println(c);
	}

	public void display() {
		System.out.println(age + " " + Name);
	}

}
