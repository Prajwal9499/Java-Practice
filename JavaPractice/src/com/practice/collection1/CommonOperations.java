package com.practice.collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonOperations {
    public static void main(String[] args) {
      ArrayList<String>  colors = new ArrayList<>();
        Set<String> set1 = new HashSet<>();
       set1.add("A");
       set1.add("B");
       set1.add("B");
       System.out.println(set1);
        
        // Adding elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        
        // Checking size
        System.out.println("Size: " + colors.size());
        
        // Checking if empty
        System.out.println("Is empty? " + colors.isEmpty());
        
        // Checking if contains element
        System.out.println("Contains Red? " + colors.contains("Red"));
        
        // Removing element
        colors.remove("Green");
        
        // Sorting
        Collections.sort(colors);
        
        // Converting to array
        String[] colorsArray = colors.toArray(new String[0]);
    }
}