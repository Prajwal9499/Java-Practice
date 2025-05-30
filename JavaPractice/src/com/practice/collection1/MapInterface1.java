package com.practice.collection1;

import java.util.HashMap;
import java.util.Map;

public class MapInterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Map<String, Integer> ageMap = new HashMap<>();
	        
	        ageMap.put("John", 25);
	        ageMap.put("Alice", 30);
	        ageMap.put("Bob", 28);
	        
	        System.out.println(ageMap.get("Alice")); // Output: 30
	        
	        // Iterating through entries
	        for(Map.Entry<String, Integer> entry : ageMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());

	}
	}
}
