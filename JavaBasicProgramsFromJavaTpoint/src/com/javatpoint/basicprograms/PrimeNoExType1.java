package com.javatpoint.basicprograms;

import java.util.Scanner;

public class PrimeNoExType1 {
	public static void checkPrime(int num) {
		boolean flag = false;
		// check negative no and to check if the no is 0 or 1
		if (num == 1 | num <= 0) {
			System.out.println(num + " is not a prime number.");
		}
		// check other numbers.
		else {
			for (int i = 2; i <= num / 2; i++) {

				if (num % i == 0) {
					System.out.println(num + " is not a prime number.");
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println(num + " is a prime number.");
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		System.out.println("You Entered: " + number);
		checkPrime(number);
	}

}
