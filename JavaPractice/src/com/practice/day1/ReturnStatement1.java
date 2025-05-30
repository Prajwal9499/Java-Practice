package com.practice.day1;

public class ReturnStatement1 {
	
	 static int sum(int a)
	{
		int total=a+a;
		return total;
				
	}
	 
	 static int square(int x,int y)
	 {
		 int result=x*y;
		 return result;
	 }
	
	public static void main(String[] args) {
		
		System.out.println("PROGRAM STARTED");
		System.out.println(sum(2));
		System.out.println(sum(4));
		
		//System.out.println("Square number of "+ x +"and"+ y +"is"+ square(10,10));
		System.out.println(square(10,10));
	}
		
	}
	


