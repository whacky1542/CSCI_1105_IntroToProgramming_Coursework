/*
Author: Alex Johnson
Date: 11-25-2019

Calculates and displays the perimeter as long as the dimensions given are valid
*/
import java.util.Scanner;

public class Exercise3_19 {
	public static void main(String[] args) {
		// Declare Variables
		double a = 0;
		double b = 0;
		double c = 0;
		double perimeter = 0;
		Scanner input = new Scanner(System.in);
		
		// Prompt user
		System.out.println("Enter the three sides of the triangle one at a time: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		// Calculate and display the perimeter unless given information is invalid
		if (!(a + b <= c) && !(a + c <= b) && !(b + c <= a)) {
			// Calculate
			perimeter = a + b + c;
			
			// Display
			System.out.println("The perimeter is: " + perimeter);
			
		} // Display if it is a line
		else if ((a + b == c) || (a + c == b) || (b + c == a)) {
			System.out.println("It appears that you have a line.");
			
		} // Display if the dimensions are impossible
		else {
			System.out.println("Invalid input. Dimensions are impossible.");
			
		}
	}
}
