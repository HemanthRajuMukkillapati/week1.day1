package week1.day1.assignment;

public class FibonacciSeries {
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	
	 * 
	 * What are my learnings from this code? 
	 * 1) For loop
	 * 2)  
	 * 3)
	 * 
	 */

	public static void main(String[] args) {

		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		
			int a=0,b=1,sum;
			
		for (int i=1;i<=8;i++)
		{
			System.out.println(a); // printing then output starting from 0
			sum = a+b;             // adding first two numbers and assigning to sum
			a=b;				   // assigning second number to first number	
			b=sum;			       // assigning sum to second number
		 
			
		} 							//end of loop

				
 
	}

}

