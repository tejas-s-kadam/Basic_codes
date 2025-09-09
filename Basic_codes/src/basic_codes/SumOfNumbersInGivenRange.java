
/*
 * Problem Statement:
 * Find the Sum of the Numbers in a Given Range in Java
 * 
Example
Input : Number1 = 12 , Number2 = 15
Output : 54

*/
package basic_codes;

import java.util.Scanner;

public class SumOfNumbersInGivenRange {
	
	public static void SumOfNUmbersRange(int n1, int n2) {
		
		int sum = 0; // variable to store sum
		
		for( int i = n1 ; i <= n2 ; i++) { // loop to iterate and add number to sum from n1 to n2

		    sum += i; // Start: sum = 0
				/*
				i = 12 → sum = 0 + 12 = 12
				i = 13 → sum = 12 + 13 = 25
				i = 14 → sum = 25 + 14 = 39
				i = 15 → sum = 39 + 15 = 54
				*/

		}
		System.out.println("Sum 1: " + sum);
	}
	

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in); // scanner object
		
		System.out.println("Enter the 1st Number: "); // taking input 1
		int num1 = scanner.nextInt()	; // storing input in variable
		
		System.out.println("Enter the 2nd Number: "); // taking input 2
		int num2 = scanner.nextInt()	; // storing input in variable
		
		
		//Solution 1: 
		// O(n) 
		SumOfNUmbersRange(num1, num2);
		
		
		//Solution 2: 
		// O(1) 
		int sum2 = (num2 * (num2 + 1)) / 2 - ((num1 - 1) * num1) / 2;
		System.out.println("Sum2 = " + sum2);

		
		scanner.close();  // closing scanner 
	}

}
