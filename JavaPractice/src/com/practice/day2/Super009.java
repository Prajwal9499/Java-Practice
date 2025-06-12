package com.practice.day2;

 class A1
{

	 void add1()
	 {
		 System.out.println("ABCD");
	 }
}
 class A2 extends A1
 {
	 void add()
	 {
		// super.add();
		 System.out.println("ZXV");
	 }
	 
	 void mul()
	 {
		 System.out.println("MULTIPLICATION");
	 } 
 }

public class Super009 {

	public static void main(String[] args) {
	
		A2 obj=new A2();
		//A1 ojb2=new A1();
		obj.add();
		obj.add1();
		//ojb2.add();
	}
}
