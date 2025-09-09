package basic_codes;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
    	
    	
        Scanner sc = new Scanner(System.in);  //Scanner object

        System.out.print("Enter first number: "); // input 1
        int a = sc.nextInt();

        System.out.print("Enter second number: "); // input 2
        int b = sc.nextInt();

        System.out.print("Enter third number: "); // input 3
        int c = sc.nextInt();

        int greatest; // var to store result 

        //Solution 1:
        
        if (a >= b && a >= c)  
        {
            greatest = a;
        } 
        else if (b >= a && b >= c) 
        {
            greatest = b;
        } 
        else 
        {
            greatest = c;
        }
        System.out.println("Greatest number is: " + greatest);
        
        //Solution 2: 
        int greatest1 = Math.max(a, Math.max(b, c));  // using MAth function
        System.out.println("Greatest number is: " + greatest1);

        sc.close(); // closing scanner 
    }
}
