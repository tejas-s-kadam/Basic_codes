/*
 * Problem Statement
 * Find sum of digits of a number
 *Example
	Input : 1234
	Output : 1 + 2 + 3 + 4 = 10
	
	
	1234 / 10 == 123
	1234 % 10 == 4
 * 
*/
package basic_codes;

import java.util.Scanner;

public class SumOfDigitsOfNUmber {
	
	
	
	static public int SumDigits(int num)
	{
		int sum = 0;
		
		long n = Math.abs((long)(num)); // to handle negative values
		while(n > 0)
		{
			sum += (int)(n % 10); // give last digit and add to sum  // again long to int
			//System.out.println("sum : " + sum);  
			
			n /= 10; // removes last digit from num  
			//System.out.println("num: " + num);
		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		
		System.out.print("Enter the Number: "); // taking input
		Scanner scanner = new Scanner(System.in); // scanner object
		
		int input = scanner.nextInt()	; // storing input in variable
		
		int result  = SumDigits(input); //calling function
		System.out.println(result);
	  

	}

}
