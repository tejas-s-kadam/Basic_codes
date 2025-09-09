/*
 * Problem Statement
 * Find sum of first N natural numbers
 * 
Example
Input : num = 5
Output : 15

Where first 5 number is 1, 2, 3, 4, 5
Sum of numbers = 1 + 2 + 3 + 4 + 5 = 15
 */

package basic_codes;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
	
	
	
	public static void Sum(int num) {
		
		int sum = 0; // variable to store sum 
		
		for(int i=1 ; i <= num ; i++)  // loop to iterate and add number to sum 
		{
			sum +=  i; // logic [ 0 = 0+ 1 ; 1 = 1 + 2 ; ..so on ]	
			//System.out.println(sum);  // to check the logic
		}
		System.out.println("Sum: " +  sum);
	}
	
	
	

	public static void main(String[] args) {
		
		System.out.println("Enter the whole number:"); // taking input
		Scanner scanner = new Scanner(System.in); // scanner object
		
		int num = scanner.nextInt()	; // storing input in variable
		
		//Solution 1: 
		//O(n) time complexity
		
		Sum(num); // calling the function
		
		
		//Solution 2: formula 
		//O(1) time complexity
		System.out.println();
		
		int sum2 = (num * (num + 1)) / 2;
		System.out.println("Sum2: " + sum2);
		
		scanner.close();  // closing scanner 
		
	}

}
