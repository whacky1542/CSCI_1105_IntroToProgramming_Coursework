/*
Author: Alex Johnson
Date: 11-25-2019

Takes the measurement from the center to a vertex in a pentagon
and finds the area with it using math functions.
*/
import java.util.Scanner;

public class Exercise4_1 {
	public static void main(String[] args) {
		// Declare variables and scanner
		double r = 0.0;
		double s = 0.0;
		double area = 0.0;
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for the r measurement
		System.out.println("Enter the measurement of r: ");
		r = input.nextDouble();
		
		// Assign s to its equation
		s = 2 * r * Math.sin(Math.PI / 5);
		
		// Assign the area to its equation
		area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
		
		// Display the area to the user
		System.out.printf("The area is: %.2f", area);
		
	}
}
