/*
 * Problem Statement
Write a Java program to find factor of a number

Example
Input : 10
Output : 1, 2, 5

 */
package basic_codes;

import java.util.Scanner;

public class FactorOfNumber {
	
	public static void FactorsOfNumber(int num) 
	{
		for( int i = 1; i < num ; i++)
		{
			if( num % i == 0 )  // checking if divisible or not
			{
				System.out.print(i + ", ");
			}
		}
	}
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // scanner object
		
		System.out.print("Enter the number:"); // taking input
			
		int num = scanner.nextInt()	; // storing input in variable

		FactorsOfNumber(num);  // calling the function 

		scanner.close(); //closing scanner 


	}

}
