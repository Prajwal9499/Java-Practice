package com.practice.day1;


class ThisDemo
{
	//int a=10;
	int a=500;
	
	void display()
	{
		int a=200;
		System.out.println(a);  //200
		System.out.println(this.a); 	//500
	}
}





public class ThisFunctionality {

	public static void main(String[] args) {
		ThisDemo obj=new ThisDemo();
		obj.display();
				

	}

}
