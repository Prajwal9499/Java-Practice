package com.practice.day1;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Prompt the user for various types of input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
      
        System.out.println("Enter your age");
        String age = scanner.nextLine();
        
        System.out.println("Enter your compsny name");
        String companyNmae= scanner.nextLine();
        
        System.out.println(name);
        System.out.println(age);
        System.out.println(companyNmae);
	}

}
