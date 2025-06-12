package com.practice.day1;

public class ConstructorPgm1 {
	String name;
	int age;
	String gmail;
	long phNuumber;
	
	ConstructorPgm1(String name1, int age1,String gmail1 ,long phNuumber1)
	{
		name=name1;
		age=age1;
		gmail=gmail1;
		phNuumber=phNuumber1;
	}
	
	 ConstructorPgm1(String name1, int age1,String gmail1) {
		
		name = name1;
		age = age1;
		gmail = gmail1;
	}
	 ConstructorPgm1(String name1, int age1,long phNuumber1) {
			
		name = name1;
		age = age1;
		phNuumber = phNuumber1;
	}

	 
//	 void display()
//	 {
//		 System.out.println("Name is :"+name1);
//		 System.out.println("agr is :"+age1);
//		 System.out.println("gmail is :"+gmail1);
//		 System.out.println("phone number is :"+phNuumber1);
//	 }	 

}
