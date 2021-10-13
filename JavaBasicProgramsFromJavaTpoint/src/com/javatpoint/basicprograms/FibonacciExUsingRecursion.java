package com.javatpoint.basicprograms;

public class FibonacciExUsingRecursion {
	static int n1=0;
	static int n2=1;
	static int n3;
	static int count = 10;
	private static void printFibonacci(int count) {
		if(count>0) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			printFibonacci(count-1);
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Printing fibonacci series using recursion:");
		System.out.print(n1+" "+n2);
		printFibonacci(count-2);
	}
	

}