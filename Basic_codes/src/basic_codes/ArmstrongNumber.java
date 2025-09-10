/*
 * Problem Statement
 *Find Number is Armstrong or Not
 * 
Example
Input : 371
Output : It's an Armstrong Number.
Explanation: 371 = 3^3 + 7^3 + 1^3

 */
package basic_codes;

import java.util.Scanner;

public class ArmstrongNumber {
	
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
		System.out.println("Enter the number:"); // taking input
		Scanner scanner = new Scanner(System.in); // scanner object
		
		int num = scanner.nextInt()	; // storing input in variable
		
	   int sum =  ArmstrongNumberOrNot(num); // calling function
		
	   if (sum == num ) //cheking if sum and num same or not
	   {
		   System.out.println(num + " is Armstrong number.");
	   }
	   else
	   {
		   System.out.println(num + " is not a Armstrong number.");
	   }
		
		scanner.close(); // closing scanner class

	}

}
