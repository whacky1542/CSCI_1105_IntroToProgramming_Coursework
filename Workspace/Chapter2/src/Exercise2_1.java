/*
Author: Alex Johnson
Date: 11-21-2019

Converts Celsius into Fehrenheit in double form from user input.
*/
import java.util.Scanner;

public class Exercise2_1 {
	public static void main(String[] args) {
		// Add scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user
		System.out.println("Enter a temperature in Celsius: ");
		double celsius = input.nextDouble();
		
		//Calculate and display user input as Fehrenheit
		System.out.println("Conversion to Ferhrenheit: " + ((9.0 / 5) * celsius + 32));
		
	}
}
