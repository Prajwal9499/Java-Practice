package com.practice.day2;

class Sample
{
	int x=10;
	
	void display()
	{
		int x=100;
	//	System.out.println(x);
		
		System.out.println(this.x);
	}
}



public class ThisKey001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s=new Sample();
		s.display();
	}

}
