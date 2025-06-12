package com.practice.day2;

 class A
{
	int a=20;
	void dis()
	{
		System.out.println("Parent");
	}
}
 class B extends A
{
	int a=30;
	void dis()
	{
		System.out.println(super.a); //20
		super.dis(); //Parent
		System.out.println("Child class ");
	}
	void praj()
	{
		System.out.println("Testingggggg");
	}
}
 class C extends B
 {
	 int a=50;
 }

public class Super001 {

	public static void main(String[] args) {
		
		C obj=new C();
		System.out.println(obj.a);  //50
		obj.dis(); 
		obj.praj();
	}

}
