/*
Author: Alex Johnson
Date: 11-28-2019

Determines whether or not the entered number is a palindrome.
*/
package ch42_03;

import java.util.Scanner;

public class Exercise6_3 {
	public static void main(String[] args) {
		int number = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		number = input.nextInt();
		
		if (isPalindrome(number))
			System.out.println("Your number is a palindrome");
		else
			System.out.println("Your number isn't a palindrome");
	}
	
	public static int reverse(int number) {
		// ref = reference number, rev = reversed number
		String ref = Integer.toString(number);
		String rev = "";
		
		for (int a = 0; a < ref.length(); a++)
			rev += ref.charAt(Math.abs(a - ref.length() + 1));
		
		number = Integer.valueOf(rev);
		
		return number;
	}
	
	public static boolean isPalindrome(int ref) {
		// again, ref = reference number, rev = reversed number
		if (ref == reverse(ref))
			return true;
		else
			return false;
	}
}
