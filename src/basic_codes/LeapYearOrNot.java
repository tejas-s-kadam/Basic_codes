/*
 * Problem Statement
 * Find if year is Leap year or Not
 * 
 * // If the year satisfies either of the conditions, it's considered a leap year -
        // 1. The year must be divisible by 400.
        // 2. The year must be divisible by 4 but not 100.
 */

package basic_codes;

import java.util.Scanner;

public class LeapYearOrNot {
	
	public static void isLeap(int year) {
		
		if( (year % 400 == 0) || ((year % 100 != 0 ) &&  (year % 4 == 0)) ) // condition
		{
			System.out.println(year + " is a leap year.");
		}
		else
		{
			System.out.println(year + " is not a leap year.");
		}
		
	}
	
	

	public static void main(String[] args) {
		
		System.out.print("Enter the Year: "); // taking input
		Scanner scanner = new Scanner(System.in); // scanner object
		
		int year = scanner.nextInt()	; // storing input in variable
		
		isLeap(year); // calling the function
		
		scanner.close(); // closing scanner object
	}

}
