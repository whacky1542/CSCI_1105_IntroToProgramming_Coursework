/*
Author: Alex Johnson
Date: 11-21-2019

Prompts the user for car information then displays the cost of driving.
*/
import java.util.Scanner;

public class Exercise2_23 {
	public static void main(String[] args) {
		// Declare variables
		Scanner input = new Scanner(System.in);
		double distance = 0.0;
		double mpg = 0.0;
		double ppg = 0.0;
		double cost = 0.0;
		
		// Prompt user
		System.out.println("Enter driving trip distance: ");
		distance = input.nextDouble();
		System.out.println("Enter miles per gallon: ");
		mpg = input.nextDouble();
		System.out.println("Enter price per gallon: ");
		ppg = input.nextDouble();
		
		// Calculate cost
		cost = (int)(100 * (distance / mpg * ppg)) / 100.0;
		
		// Display cost
		System.out.println("The cost of the driving trip is: " + cost);
		
	}
}
