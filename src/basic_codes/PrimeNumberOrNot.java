/*
 * Problem Statement
 * Find Prime number or not
 * 
 *-> A prime number is greater than 1 and has no divisors except 1 and itself.
 * 
 * */

package basic_codes;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		
		System.out.print("Enter the Number: "); // taking input
		Scanner scanner = new Scanner(System.in); // scanner object
		
		int num = scanner.nextInt()	; // storing input in variable
		
		boolean isPrime = num > 1; // returns false if number is 0 or 1  else return true 
		
		for ( int i =2 ; i*i <= num ; i++) // starts from 2 smallest prime number ; i*i = n  ; increase the numbers
		//"check only up to √num” (since if n has a factor larger than √n, the complementary factor is smaller than √n).
		//e.g  2 x 3 = 6 => √6 = √2 x √2 x √3 x √3	
		{
			if(num % i == 0) {
				isPrime = false;
			}

		}
		
		System.out.println(num + (isPrime ? " is Prime number" : " is not a Prime number"));
		// ternary operator ( condition ? "if true" : "if false")
		scanner.close(); // closing scanner object
	}
/*
	Loop execution for number 23

	Condition: for (int i = 2; i * i <= n && isPrime; i++)

	Iteration 1:

	i = 2

	i * i = 4 ≤ 23 → true

	23 % 2 = 1 → not divisible → continue

	Iteration 2:

	i = 3

	i * i = 9 ≤ 23 → true

	23 % 3 = 2 → not divisible → continue

	Iteration 3:

	i = 4

	i * i = 16 ≤ 23 → true

	23 % 4 = 3 → not divisible → continue

	Iteration 4:

	i = 5

	i * i = 25 ≤ 23 → false

	Loop stops here 🚫
*/	
	
	
}
