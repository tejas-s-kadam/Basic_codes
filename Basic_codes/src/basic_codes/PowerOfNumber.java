/*
 * Problem Statement
Write a Java program to find power of a number

Example
Input : 2 3
Output : 8
Note: 2 x 2 x 2 = 8
 */
package basic_codes;

import java.util.Scanner;


public class PowerOfNumber {
	
	public static void PowerOfNumber(double num, double pow)
	{
		  double result = 1; 

		    // if power is positive
		    if (pow > 0) 
		    {
		        for (int i = 1; i <= pow; i++) 
		        {
		            result *= num;
		        }
		    }
		    // if power is negative
		    else if (pow < 0) 
		    {
		        for (int i = 1; i <= -pow; i++)
		        {
		            result *= num;
		        }
		        result = 1 / result;  // reciprocal for negative powers to get exact mathematical value 
		        
		    }
		    // if power is zero
		    else
		    {
		        result = 1;  // any number^0 = 1
		    }

		    System.out.println(num + "^" + pow + " = " + result);
		}
	

	public static void main(String[] args) {
		System.out.print("Enter the number:"); // taking input
		Scanner scanner = new Scanner(System.in); // scanner object
		double num = scanner.nextDouble()	; // storing number
		System.out.print("Enter the power:"); // taking input
		double pow = scanner.nextDouble() ; // storing power

		PowerOfNumber(num, pow);  // calling the function 

		System.out.println( "With in-bulit function : "+ Math.pow(num, pow)); // calling inbulit function
		
		scanner.close(); //closing scanner 
	}

}
