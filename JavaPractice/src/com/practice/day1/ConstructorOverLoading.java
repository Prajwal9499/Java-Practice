package com.practice.day1;


class A
{
	A()
	{
		System.out.println("Constructor");
	}
	A(int x)
	{
		System.out.println(" Constructor load with parameters");
	}
	
	public void add()
	{
		System.out.println(" Addition");
	}
}


public class ConstructorOverLoading {

	public static void main(String[] args) {
		A obj=new A(10);
		obj.add();
		

	}

}
