package com.practice.day1;

import java.io.*;

class Filereder{
    public static void main(String[] args) throws IOException {
//        try {
//            FileReader fr = new FileReader("D:\\Jmeter\\test.txt"); // Fixed file path
//            BufferedReader br = new BufferedReader(fr);
//            String line;
//
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//
//            br.close(); // Always close the reader
//        } catch (IOException e) {
//            System.out.println("Error reading the file: " + e.getMessage());
//        }
    	
    	FileWriter fw = new FileWriter("D:\\Jmeter\\test.txt");
    	fw.write("Hello, World!");
    	fw.close();
    }
}