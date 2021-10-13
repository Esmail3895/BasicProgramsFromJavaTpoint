package com.javatpoint.basicprograms;

public class PalindromInRange {

	public static void main(String[] args) {
		
		for(int i=0; i<=1000; i++){
			int sum = 0;
		int temp = i;
		while(i>0){
		sum = (sum*10)+i%10;
		i=i/10;

		}
		if(temp==sum){
		System.out.print(sum+" ");
		//sum=0;
		}

		}


	}

}
