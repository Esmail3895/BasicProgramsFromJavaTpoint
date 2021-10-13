package com.javatpoint.basicprograms;

import java.util.Scanner;

public class ListOfPrimeNoInBetweenTwoNo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int start = scanner.nextInt();
		System.out.println("Enter second number: ");
		int end = scanner.nextInt();
		System.out.print("List of prime numbers between "+start+" and "+end);
		System.out.println();
		for(int i=start; i<=end; i++)
		if(isPrime(i)) {
			System.out.print(i+" ");
		}
	}

	private static boolean isPrime(int n) {
		//check the negative numbers, 0 and 1
		if(n<=1)
			return false;
		//check other numbers
		else {
			for(int i=2; i<=Math.sqrt(n); i++) {
				if(n%i==0) {
					return false;
				}
			}
		}
		return true;
	}

}
