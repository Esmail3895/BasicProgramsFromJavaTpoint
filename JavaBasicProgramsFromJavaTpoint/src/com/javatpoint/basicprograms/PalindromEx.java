package com.javatpoint.basicprograms;

import java.util.Scanner;

public class PalindromEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int tempVar = num;
		int reverseNo = 0;
		//Logic to check the palindrome.
		while(num>=1) {
		reverseNo = num%10+10*reverseNo;//5+10*0=5,4+50=54, 5+540=545
		num=num/10;//54,5,
		}
		//Printing the reverse no.
		System.out.println("The reverse no is: "+reverseNo);
		if (tempVar == reverseNo) {
			System.out.println("Num is palindrome...");
		}else 
			System.out.println("Num is not paindrome...");
		
	}

}
