/*
 * Problem Statement
 *Find Number is Armstrong or Not
 * 
Example 
Input : 10 1000
Output : 153  370  371  407

Input : 371
Output : It's an Armstrong Number.
Explanation: 371 = 3^3 + 7^3 + 1^3

 */

package basic_codes;

import java.util.Scanner;

public class ArmstrongRange {
	
	public static  int ArmstrongNumberOrNot(int num) {
		
		String s = String.valueOf(num);  //  convert int to string
		int power = s.length(); // return length of string 371 ==> 3
		int sum = 0; // to store value of sums
		
		while(num != 0)
		{
			
		int	digit = num % 10; // get last digit
			
			sum = sum + (int)(Math.pow(digit, power)); //  //3^3, + 7^3, + 1^3
			
			num /= 10; //remove last digit
			
		}

		return sum; // return sum 371
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // scanner object
		System.out.println("Enter starting number:"); // taking input
		int num1 = scanner.nextInt()	; // storing input in variable
		
		System.out.println("Enter Ending number:"); // taking input
		int num2 = scanner.nextInt()	; // storing input in variable
		
		
		for (int i = num1; i <= num2 ; i++) {
			
			int val = ArmstrongNumberOrNot(i); // calling function
			if( val == i) {
				System.out.print(val + ", ");
			}
		}
	     
		scanner.close(); // close scanner class

	}

}
