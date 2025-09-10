/*
 * Problem Statement
 *Find Number is Palindrome or Not
 * 
Example
Input : 121
Output : Palindrome
 */

package basic_codes;

import java.util.Scanner;

public class Palindrome {
	
	
	public static int PalindormeOrNot(int n) {
		
		int rev = 0;
		
		while(n != 0) {  // run till n is zero
			
			int digit =  n % 10;  //gives the last digit
			
			rev = (rev*10) + digit; // will revesre the num
			
			n /= 10; // removes the last digit
			
		}
		
		return rev;
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the number:"); // taking input
		Scanner scanner = new Scanner(System.in); // scanner object
		
		int num = scanner.nextInt()	; // storing input in variable
		
		int rev = PalindormeOrNot(num);  // calling function
		
		if(rev == num)
		{
			System.out.println(num + " is a Palindrome number.");
		}
		else
		{
			System.out.println(num + " is not a Palindrome number.");
		}
		
		
		scanner.close(); // closing scanner class

	}

}
