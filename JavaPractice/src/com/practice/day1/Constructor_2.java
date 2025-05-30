package com.practice.day1;

public class Constructor_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car C=new Car("AUDi",678976,"white");
		C.info();
		
	}
}


class Car{
	String brand="maruthi";
	int price;
	String color;
	
	Car(String brand,int price,String color)
	{
		this.brand=brand;
		this.price=price;
		this.color=color;
		System.out.println();
	}
	void info()
	{
		//System.out.println("\" + price + "\"+ color);
		System.out.println(brand);
		System.out.println(price);
		System.out.println(color);
	}
}