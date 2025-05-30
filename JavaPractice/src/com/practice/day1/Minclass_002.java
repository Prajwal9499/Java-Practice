package com.practice.day1;

public class Minclass_002 {

	public static void main(String[] args) {
		Sample s1=new Sample();
		System.out.println(s1.d1);
		System.out.println(s1.d1.x);
		System.out.println(s1.d1.y);
		s1.d1.test();
		s1.d1.x=100;
		System.out.println(s1.d1.x);
		
		Sample s2=new Sample();
		System.out.println(s2.d1.x);
		System.out.println("value of x;"+s1.d1.x);
	}

}

class Demo
{
	int x=10;
	int y=20;
	
	void test()
	{
		System.out.println("test method run");
	}
}
 class Sample
 {
	 Demo d1=new Demo();
 }