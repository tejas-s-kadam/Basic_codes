/*
 * Problem Statement
 * Find Prime numbers in a given range
 * 
 *-> A prime number is greater than 1 and has no divisors except 1 and itself.
 *
 * Example
	Input : 2 10
	Output : 2 3 5 7
 * 
 * */

package basic_codes;

import java.util.Scanner;

public class PrimeNumberWithGivenRange {
	
	public static boolean isPrime(int n){  // function to find prime numbers
		
		if (n <= 1) return false;   // 0,1 not prime
		
		if(n <= 3) return true;  // 2,3 are prime
		
		if (n % 2 == 0 || n % 3 == 0) return false; // eliminate multiples of 2 & 3
		
		 // Only check numbers of form 6k ± 1  ( 6k + 1 or 6k + 5 == 6k - 1)
	     for (int i = 5; i * i <= n; i += 6) 
	     {
	        	if((n % i == 0 ) || n % (i + 2) == 0 ) {  // check for 5,7 or 11, 13...
	        		return false;
	        	}

	     }
		return true;
 		
	}
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // scanner object
		
		System.out.print("Enter the starting Number: "); // taking input 1
		int start = scanner.nextInt()	; // storing input in variable
		
		System.out.print("Enter the Ending Number: "); // taking input 2
		int end = scanner.nextInt()	; // storing input in variable
		
		System.out.println();
		System.out.println("Prime numbers between " + start + " and " + end + ":");

	        for (int i = start; i <= end; i++)  // run all numbers from start to end 
	        {  
	            if (isPrime(i)) // calling the function
	            { 
	                System.out.print(i + ", "); // printing the numbers
	            }
	        }
		
		scanner.close(); // closing scanner class

	}

}
