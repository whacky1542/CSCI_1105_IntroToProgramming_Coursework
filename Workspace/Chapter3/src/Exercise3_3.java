/*
Author: Alex Johnson
Date: 11-25-2019

This program uses Cramer's rule to find x and y
*/
import java.util.Scanner;

public class Exercise3_3 {
	public static void main(String[] args) {
		// Declare variables
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double e = 0;
		double f = 0;
		double x = 0;
		double y = 0;
		Scanner input = new Scanner(System.in);
		
		// Prompt user for everything except x and y
		System.out.println("Enter a, then enter b, then c, d, e, and f: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();
		
		// Calculate and display the results as long as ad - bc doesn't equal 0 (no solution)
		if (a * d - b * c == 0) {
			System.out.println("I'm sorry, but there was no solution because 0 ended up as a denominator");
		}
		else {
			// Calculate
			x = (e * d - b * f) / (a * d - b * c);
			y = (a * f - e * c) / (a * d - b * c);
			
			// Display
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}
	}
}
