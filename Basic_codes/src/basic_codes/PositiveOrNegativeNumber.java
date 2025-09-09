/*
Problem Statement:

Check whether a given number is positive, negative, or zero.

Example:
Input: 10 
Output: Positive

Input: -5.123
Output: Negative

Input: 0
Output: Zero


*/

package basic_codes;

import java.util.Scanner;  

public class PositiveOrNegativeNumber {

	public static void main(String[] args) {

		System.out.println("Enter a number: ");  // asking user to enter number
		Scanner scanner = new Scanner(System.in);  // scanner class object to take input 

		try  // to catch invalid entry
		{
			
		float num = scanner.nextFloat();  //  taking float method 
		
		if (num > 0) // condition for positive number 
		{
			System.out.println(num + " is postive number.");
		}
		else if (num < 0) // condition for negative number 
		{
			System.out.println(num + " is a negative number.");
		}
		else                // if its not positive or negative its a zero or invalid 
		{
			System.out.println("number is zero");
		}
		}
		catch (Exception e)   // catching for invalid entry 
		{
			System.out.println("Invalid Input");
			//e.printStackTrace();
		}
		finally
		{
			scanner.close();  // closing scanner class
		}
		
		

	}

}
