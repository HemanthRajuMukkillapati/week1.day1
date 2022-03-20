package week1.day1.assignment;

public class PoitiveOrNegativeNumber {

	public static void main(String[] args) {
	// Given number
	
		int n=35;
		
	// check whether number is positive or negative using nested if and else if
		
		if(n>0){
			System.out.println("Given Number is Positive : "+n);
			
		}
		else if(n<0)
		{
			System.out.println("Given Number is Negative : "+n);
		}
		else
		{
			System.out.println("Given Number is neither Positive nor Negative : "+n);
		}
	}

}
