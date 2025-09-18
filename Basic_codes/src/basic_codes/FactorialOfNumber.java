/*
 * Problem Statement
Find Factorial of a Number in Java

Input: 5

Output: 120

factorial of n (n!) = 1 * 2 * 3 * 4....n
Note : 0! = 1 and 1! = 1
Example : 
5! = 1 * 2 * 3 * 4 * 5 = 120
 */

package basic_codes;

import java.util.Scanner;

public class FactorialOfNumber {
	
	public static void factorial(int n)
	{

		  int fact = 1;   
			
			for (int i = 1 ; i<=n ; i++)
			{
				 fact = fact * i;  // using factorial formula 
			}
			
			System.out.println("Factorial of " + n + " is " + fact );  // printing output
	
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the number:"); // taking input
		Scanner scanner = new Scanner(System.in); // scanner object
		
		int num = scanner.nextInt()	; // storing input in variable

		factorial(num);  // calling the function 

		scanner.close(); //closing scanner 
	}

}
