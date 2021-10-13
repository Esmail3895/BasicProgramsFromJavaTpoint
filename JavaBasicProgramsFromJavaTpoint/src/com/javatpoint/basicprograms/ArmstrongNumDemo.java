package com.javatpoint.basicprograms;

import java.util.Scanner;

public class ArmstrongNumDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit: ");
		int limit = sc.nextInt();
		System.out.print("Amstrong number upto "+limit+" are: ");
		for(int i=0; i<=limit; i++) {
			if(isAmstrong(i))
				System.out.print(i+", ");
		}
	}
	//function to check if the number is Armstrong or not 
	private static boolean isAmstrong(int n) {
		int temp, digits=0, last=0, sum=0;
		//loop execute until getting the digits 
		temp=n;
		while(temp>0) {
			temp=temp/10;
			digits++;
		}
		temp=n;
		while(temp>0) {
			//determines the last digit from the number  
			last=temp%10;
			//calculates the power of a number up to digit times and add the resultant to the sum variable 
			sum+=(Math.pow(last, digits));
			//removes the last digit   
			temp=temp/10;
		}
		//compares the sum with n  
		if(n==sum)
			return true;
			else
			 return false;
	}

}
