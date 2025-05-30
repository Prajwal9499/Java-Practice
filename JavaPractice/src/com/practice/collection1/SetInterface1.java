package com.practice.collection1;

import java.util.HashSet;
import java.util.Set;

public class SetInterface1 {
	//not allow duplicates
	public static Set<Integer> add() {
	 Set<Integer> numbers = new HashSet<>();
     numbers.add(1);
     numbers.add(2);
     numbers.add(3);
     numbers.add(3);
     System.out.println(numbers.size());
     return numbers;
	}
	
	public static void main(String[] args) {
		
		System.out.println(add());
	}

}
