package com.practice.day2;

//Base class
class Grandparent {
 void show() {
     System.out.println("Grandparent Method");
 }
}

//Intermediate class (Parent)
class Parent extends Grandparent {

 void show() {
     super.show(); // Calls Grandparent's method
     System.out.println("Parent Method");
 }
}

//Derived class (Child)
class Child extends Parent {

 void show() {
     super.show(); // Calls Parent's method
     System.out.println("Child Method");
 }
}

//Main class
public class MultilevelInheritanceDemo {
 public static void main(String[] args) {
     Child obj = new Child();
     obj.show();
 }
}