package com.practice.day1;

public class ArrayProgram1 {

	public static void main(String[] args) {
		
		String my="vijay";
		String a[][]= {{"Prajwal","Pramos","ajay","likith"},{"Umesh","veeresh","Srinivas","Adarsh"}};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[1].length;j++)
			{
				System.out.println(a[i][j]);
			}
		}
	}
}
