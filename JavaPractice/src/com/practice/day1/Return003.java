package com.practice.day1;

class Abc
{
	
	public int add()
	{
		int z=2+13;
		return z;
	}
	
	public int sub()
	{
		int x=10-5;
		return x;	
	}
	
	public int add(int a,int b)
	{
		int c=a*b;
		System.out.println(c);
		return c;
	}
	
	public void prajju()
	{
		int loool=add()+sub();
	   int pool=sub()+add(2,4);
		System.out.println(loool);
		System.out.println(pool);
	}
}

public class Return003 {

	public static void main(String[] args) {
		
		Abc a=new Abc();
		a.prajju();
	}

}
