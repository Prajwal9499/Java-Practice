package com.practice.day1;

public class ReturnStatement2 {
	
	static int square(int num)
	{
		int res=num*num;
		return res;
	}
	public static void main(String[] args) {
	System.out.println("Program started");
	System.out.println(	square(6));
	int x=square(6);
	
	System.out.println(square(8));
	int y=square(8);
	
	int z=x+y;
	System.out.println(z);


	}

}
