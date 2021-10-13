package com.javatpoint.basicprograms;

import java.util.Scanner;

public class PalindromExUsingMethod {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		/*
		 * Scanner closed. otherwise user will get the warning like Scanner is not
		 * closed there may be leakage of data in the Scannner reference variable
		 */
		scanner.close();
		if(isPalindrome(num)) {
			System.out.println("Number is palindrome...");
		}else
			System.out.println("Number is not palindrome...");
		
	}

	private static boolean isPalindrome(int num) {
		int temp = num;
		int reverseNo = 0;
		while(num>0) {
			reverseNo = num%10+10*reverseNo;
			num=num/10;
		}
		System.out.println("Reverse number is: "+reverseNo);
		if(temp == reverseNo) {
			return true;
		}else
			return false;
	}

}
