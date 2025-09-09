/*
 * Problem Statement
Write a Java program to check whether a given number is Even or Odd.

Input: 2

Output: Even
 */

package basic_codes;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the whole number:"); // taking input
		Scanner scanner = new Scanner(System.in); // scanner object
		
		int num = scanner.nextInt()	; // storing input in variable
		
		
		// Solution 1
		System.out.println();
		System.out.println("Solution 1: ");
		if(num % 2 == 0)  // % returns -> Remainder
		{
			System.out.println(num + " is a Even number.");
		}
		else
		{
			System.out.println(num + " is a Odd number.");
		}
		
		
		
		// Solution 2: Bitwise approach
		/*
		Every integer is stored in binary form (0s and 1s).

		Even numbers always end with 0 in binary.

		Odd numbers always end with 1 in binary. 
		*/
		
		System.out.println();
		System.out.println("Solution 2: ");
		if((num & 0) == 0) {
			System.out.println(num + " is a Even number.");
		}
		else
		{
			System.out.println(num + " is a Odd number.");
		}
		
		scanner.close(); // closing scanner object

	}

}
