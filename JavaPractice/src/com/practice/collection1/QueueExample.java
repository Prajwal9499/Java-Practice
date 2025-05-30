package com.practice.collection1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        
        System.out.println(queue.poll()); // Output: First (removes it)
        System.out.println(queue.peek()); // Output: Second (doesn't remove)
    }
}