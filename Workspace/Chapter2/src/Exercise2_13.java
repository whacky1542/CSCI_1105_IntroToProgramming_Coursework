/*
Author: Alex Johnson
Date: 11-21-2019

Displays the account value of a monthly saving amount from the 
user based off the monthly interest rate of 0.05 / 12.
*/
import java.util.Scanner;

public class Exercise2_13 {
	public static void main(String[] args) {
		// Declare variables
		Scanner input = new Scanner(System.in);
		double mSavings = 0.0;
		final double MRATE = 0.05 / 12;
		double aValue = 0.0;
		
		// Prompt user for monthly savings
		System.out.println("Enter monthly savings: ");
		mSavings = input.nextDouble();
		
		// Calculate the account value after the sixth month
		aValue = mSavings * (1 + MRATE); // 1
		aValue = (aValue + mSavings) * (1 + MRATE); // 2
		aValue = (aValue + mSavings) * (1 + MRATE); // 3
		aValue = (aValue + mSavings) * (1 + MRATE); // 4
		aValue = (aValue + mSavings) * (1 + MRATE); // 5
		aValue = (aValue + mSavings) * (1 + MRATE); // 6
		
		// Display the account value after the sixth month
		System.out.println("The account value after the sixth month is: " + aValue);
		
	}
}
