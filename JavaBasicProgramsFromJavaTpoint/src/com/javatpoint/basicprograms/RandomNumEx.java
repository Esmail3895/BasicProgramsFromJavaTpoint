package com.javatpoint.basicprograms;

public class RandomNumEx {

	public static void main(String[] args) {
		//printing random number between 0.0 to 1.0 using random() method 0.0 is included but 1.0 is excluded
		System.out.println("Random number1: "+Math.random());
		System.out.println("Random number2: "+Math.random());
		System.out.println("Random number3: "+Math.random());
		System.out.println("Random number4: "+Math.random());
		//printing random number between the specified range
		int min = 200;
		int max = 400;
		//printing in double value
		System.out.println("Random value of type double between "+min+" and "+max);
		double randomNum = (Math.random()*(max-min+1))+min;
		System.out.println(randomNum);
		System.out.println("Random value of type int between "+min+" and "+max);
		for(int i = min; i<=max; i++) {
		int randomNum1 = (int)(Math.random()*(max-min+1))+min;
		System.out.print(randomNum1+" ");
		}
	}

}
