package com.javatpoint.basicprograms;

public class RightTriangleStarPattern {

	public static void main(String[] args) {
		//count of row and column 
		int row = 5, column = 5;
		//first for loop for row use i for index
		for(int i=0; i<5; i++) {
			//second for loop for column use j for index operation
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			//print new line
			System.out.println();
		}
	}

}
