package com.practice.day2;



class Mass
{
	
	int a=1111;
	
	void number()
	{
		int b=this.a;
		int a=10001;
		System.out.println("global variable "+ this.a);
		System.out.println("Lical variable "+  a);
		
		System.out.println("ADDITION ="+ (a+b));
	}
	
}


public class This009 {

	public static void main(String[] args) {
	
		Mass obj1=new Mass();
		obj1.number();

	}

}
