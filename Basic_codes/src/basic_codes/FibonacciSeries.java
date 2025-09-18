/*
 * Problem Statement
Find the Fibonacci Series up to Nth Term in Java

Example
Input : 4
Output : 0 1 1 2

note:
General Formula to find the Nth term of a Series 
F0 = 0 and F1 = 1 be the seed values
The Nth term of a Fibonacci series is given as Fn = Fn-1 + Fn-2 .
Example, 
Input : 5
Fibonacci Series : 0 1 1 2 3
Explanation:
For 3rd term it's 2nd term + 1st term.
For 4th term it's 3rd term + 2nd term.
for 5th term it's 4th term + 3rd term.
 */

package basic_codes;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void printFibonacciSeries(int n) {
		
		int first = 0, second =1;  // first and second are fixed 
		
		System.out.print("Fibonacci Series up to " + n + " terms: ");
		
		for (int i = 0 ; i<n ; i++) 
		{
				System.out.print(first + " ");
				int next = first + second ; /// adding first + second to get next term  
				/// 0+1 = 1; 1+1 = 2; 1+2 = 3; 2+3 = 5

				first = second ; /// first term becomes second term /// 0 ==> 1
				
				second = next; /// second becomes next /// 1==> 1 ///
			
		}

	}

	public static void main(String[] args) {
		System.out.println("Enter the number:"); // taking input
		Scanner scanner = new Scanner(System.in); // scanner object
		
		int num = scanner.nextInt()	; // storing input in variable

		printFibonacciSeries(num);  // calling the function 

		scanner.close(); //closing scanner 
	}

}
