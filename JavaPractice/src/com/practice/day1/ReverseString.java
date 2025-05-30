package com.practice.day1;

public class ReverseString {

    public static void main(String[] args) {
    	ReverseString1();
    	reverseString();
    	
    }

public static void ReverseString1() {
        String name = "prajwal";
        StringBuilder reverse = new StringBuilder(name);
        reverse.reverse(); // Reverse the string using StringBuilder

        System.out.println("Original String: " + name);
        System.out.println("Reversed String: " + reverse);
    }

public static void reverseString()
{
    String name = "Sample";
    String reverse = "";
    int length = name.length();
    System.out.println("Length of the string: " + length);

    // Reverse the string using a loop
    for (int i = 5; i >= 0; i--) {
        reverse += name.charAt(i); // Append characters in reverse order
    }

    System.out.println("Original String: " + name);
    System.out.println("Reversed String: " + reverse);
}

}