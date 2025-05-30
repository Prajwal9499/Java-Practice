package com.practice.day1;



class Demo3
{
	int x=100;
	
//	void disp0()
//	{
//	System.out.println("local variable x value =" + super.x);
//	}
}

class Demo4 extends Demo3
{
	int x=200;
	
	void disp()
	{
		int x=300;
		System.out.println("local variable x value =" + x);
		System.out.println("Curent class variable x value =" + this.x);
		System.out.println("Super class member variable x value =" + super.x);
	}
}







public class Inheritance_002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4 d4=new Demo4();
		d4.disp();
	}

}
