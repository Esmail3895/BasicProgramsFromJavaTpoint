package com.javatpoint.basicprograms;

public class LeftTriangleStarPattern {

	public static void main(String[] args) {
		//count of rows and columns
		int row = 5;
		//first for loop for rows
		for(int i=0; i<row; i++) {
			//inner for loop for columns
			for(int j=i; j<=i; j++) {
				System.out.print("* ");
			}
			//print new line
			System.out.println();
		}
		
	}

}
