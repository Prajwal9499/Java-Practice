package com.practice.day1;

public class Palindrome1 {

    public static void main(String[] args) {
        String name = "madam"; // Change this to test with different strings
        
        char[] ch = name.toCharArray();
        int length = name.length();
        boolean isPalindrome = true; // Flag to determine if it's a palindrome
        
        for (int i = 0; i < length / 2; i++) { // Only iterate up to half the length
            if (ch[i] != ch[length - 1 - i]) { // Compare characters from start and end
                isPalindrome = false; // Not a palindrome
                System.out.println(name + " is not a palindrome.");
                break;
            }
        }
        
        if (isPalindrome==true) {
            System.out.println(name + " is a palindrome.");
        }
    }
}