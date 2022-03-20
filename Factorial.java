package week1.day1.assignment;

public class Factorial {

		
			/*
			 * Goal: Find the Factorial of a given number
			 * 
			 * input: 5
			 * output: 5*4*3*2*1 = 120
			 * 
			 * Shortcuts:
			 * 1) Print : type: syso, followed by: ctrl + space + enter
			 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
			 *   
			 * What are my learnings from this code?
			 * 1) more deep dive into for loop
			 * 2) factorial logic
			 * 
			 * 
			 */	
			
			public static void main(String[] args) {

				
				int a =5;     // intialize a and given number as 5
				
				System.out.println("the given number is " + " " + a);   // printing given number
			    
				for (int i=1;i<5;i++)                                  // for loop to start from 1
				{
					a=i*a;											// multiplying fact (a) with iterator  value
										
					
				}
				System.out.println("the factorial of given number is " + " : " + a  ); // printing fact value at after loop ends
				
			
			}

		
	}


