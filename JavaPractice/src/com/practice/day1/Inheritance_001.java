package com.practice.day1;

public class Inheritance_001 {

	public static void main(String[] args) {
		Demo2 d=new Demo2();
		System.out.println(d.x);
		System.out.println(d.y);
d.test();
d.disp();

	}

}

class Demo1
{
	int x=10;
	void test()
	{
		System.out.println("running test() is executed");
	}
}

class Demo2 extends Demo1
{
	int y=200;
	
	void disp()
	{
		System.out.println("RUNNING Disp(0) is Executed");
	}
}