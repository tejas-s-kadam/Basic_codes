/*
 * Problem Statement
Write a Java program to Reverse a number

Input: 123

Output: 321
 */

package basic_codes;

import java.util.Scanner;



public class ReverseNumber {
	
	static void revNum(int n) {
		
	int	rev = 0;
	
	while( n != 0 ) 
	{
		
		int temp = n % 10;  // gives last digit
		
		rev = (rev*10) + temp; // add last digits to rev
		
		n /= 10; // removes last digit
		
	}
	
	System.out.println("Reversed number is : " + rev);
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the number:"); // taking input
		Scanner scanner = new Scanner(System.in); // scanner object
		
		int num = scanner.nextInt()	; // storing input in variable
		
		revNum(num);  // calling function
		
		scanner.close(); // closing scanner class
		
	}

}
