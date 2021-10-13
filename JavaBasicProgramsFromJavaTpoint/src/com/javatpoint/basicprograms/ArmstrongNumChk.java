package com.javatpoint.basicprograms;

import java.util.Scanner;

public class ArmstrongNumChk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check armstrong: ");
		int num = sc.nextInt();
		if(isAmstrong(num))
			System.out.println(num+" is an armstrong num.");
		else
			System.out.println(num+" is not an armstrong num.");
	}

	private static boolean isAmstrong(int num) {
		int temp, digits = 0, lastDigit = 0, sum = 0;
		temp = num;
		//for counting digits
		while(temp>0) {
			temp = temp /10;
			digits++;
		}
		//main logic for armstrong 
		temp = num;
		while(temp>0) {
			lastDigit = temp%10;
			sum +=(Math.pow(lastDigit, digits));
			temp = temp/10;
		}
		//checking the num armstrong or not
		if(num==sum)
			return true;
		else
			return false;
	}

}
