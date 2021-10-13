package com.javatpoint.basicprograms;

import java.util.Scanner;

public class PrimeNoExType2 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num = scanner.nextInt();
	boolean flag = isPrime(num);
	if(flag) {
		System.out.println(num+" is prime");
	}else
		System.out.println(num+" is not prime");

	}

	private static boolean isPrime(int n) {
		boolean flag = true;
		//check negative number, 0 and 1
		if(n<=1) {
			flag = false;
		}
		//check other number
		else {
			for(int i =2; i<=n/2; i++) {
				if(n%i==0) {
					flag = false;
				
				}
			}
			
		}
		return flag;
	}

}
