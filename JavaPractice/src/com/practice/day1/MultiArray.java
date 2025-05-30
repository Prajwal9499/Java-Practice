package com.practice.day1;

public class MultiArray {

    public static void main(String[] args) {
        
        int a[][] = { {1, 2}, {4, 5}, {7, 8} };
        
      
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("Element at a[" + i + "][" + j + "] = " + a[i][j]);
            }
        }
    }
}
