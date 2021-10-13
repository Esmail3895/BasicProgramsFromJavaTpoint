package com.javatpoint.basicprograms;

import java.util.Scanner;

public class FactorialUsingRecursion {
	static int fact = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num = sc.nextInt();//5
		fact = factorial(num);
		System.out.println("factorial of "+num+" is: "+fact);

	}

	private static int factorial(int n) {
		if(n==0) 
			return 1;
		else
			return(n*factorial(n-1));
}

}
