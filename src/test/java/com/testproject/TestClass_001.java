package com.testproject;

public class TestClass_001 {

	public static void main(String[] args) {

		TestClass_001 myObj = new TestClass_001();
		myObj.print();
		myObj.add(10, 13);
		
		
	}
	
	void print() {
		
		System.out.println("This is a print method calling");
	}
	
	void add(int a, int b) {
		System.out.println("Sum of a and b is :: " + (a+b));
	}

}
