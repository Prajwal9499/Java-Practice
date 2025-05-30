package com.practice.day1;

public class While_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=1;
//		while(a<=10)
//		{
//			if(a%2==0)
//			{
//				System.out.println(" Even Number is "+ a);
//			}
//			else
//			{
//				System.out.println(" ODD numver"+ a);
//			}
//			a++;
//		}
		
		
	int[] arr= {10,20,500,60};
	int le=arr.length;
	
	for(int i=1;i<=le-1;i++)
	{
		if(arr[i]<arr[i+1])
		{
			int g=arr[i];
			System.out.println("Greater number"+ g );
			i++;
		}
	}

		
	}

}
