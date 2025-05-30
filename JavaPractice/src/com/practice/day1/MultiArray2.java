package com.practice.day1;

public class MultiArray2 {

	public static void main(String[] args) {
		
		
		int x[][]= {{ 4 , 5,6,9},{10,11,12},{30,30,40,50}};
		
		System.out.println(x[0][3]);
		System.out.println(x[2][3]);
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length;j++)
			{
				System.out.println("x[" + i + "] = " + x[i][0] + "    x[" + j + "] = " + x[0][j]);
			}
		}
	}

}
