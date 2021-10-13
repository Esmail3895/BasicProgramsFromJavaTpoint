package com.javatpoint.basicprograms;

public class LeftTriangleStarPattern {

	public static void main(String[] args) {
		//count of rows and columns
		int row = 5;
		//i for rows j for columns
		int i, j;
		//outer for loop works for rows
		for(i=0; i<row; i++) {
			
			//inner for loop works for space
			for(j=2*(row-i); j>=0; j--) {
				//prints space between two stars 
				System.out.print(" ");
			}
			
			//inner for loop for columns
			for(j=0; j<=i; j++) {
				//prints star
				System.out.print("* ");
			}
			//print new line
			System.out.println();
		}
		
	}

}
