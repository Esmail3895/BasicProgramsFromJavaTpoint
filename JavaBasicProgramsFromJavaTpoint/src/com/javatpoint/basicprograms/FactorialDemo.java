package com.javatpoint.basicprograms;

import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num:");
		int num = sc.nextInt();//4!=4*3*2*1
		int fact = 1;
		for(int i=1; i<=num; i++) {
			fact = fact*i;//1*1=1, 1*2=2, 2*3=6, 6*4=24
		}
		System.out.println("Factorial of "+num+" is : "+fact);

	}

}
