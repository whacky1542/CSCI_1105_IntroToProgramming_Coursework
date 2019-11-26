/*
Author: Alex Johnson
Date: 11-25-2019

This program requests information from the user and generates a 
pay roll.
*/
import java.util.Scanner;

public class Exercise4_23 {
	public static void main(String[] args) {
		// Declare variables and scanner
		String name = " ";
		double hours = 0.0;
		double pay = 0.0;
		double fed = 0.0;
		double state = 0.0;
		double gross = 0.0;
		double net = 0.0;
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for name, hours, pay, and taxes
		System.out.println("Enter empoyee's name: ");
		name = input.nextLine();
		System.out.println("Enter number of hours worked: ");
		hours = input.nextDouble();
		System.out.println("Enter hourly pay rate: ");
		pay = input.nextDouble();
		System.out.println("Enter federal tax rate: ");
		fed = input.nextDouble();
		System.out.println("Enter state tax rate: ");
		state = input.nextDouble();
		
		// Calculate gross pay
		gross = hours * pay;
		
		// Calculate net pay
		net = gross - gross * fed - gross * state;
		
		// Display the pay roll
		System.out.println("Employee name: " + name);
		System.out.println("Hours worked: " + hours);
		System.out.printf("Pay rate: $%.2f%n", pay);
		System.out.printf("Gross pay: $%.2f%n", gross);
		System.out.println("Deductions:");
		System.out.printf("\tFederal withholding (" + (fed * 100) + "%%): $%.2f%n", gross * fed);
		System.out.printf("\tState withholding (" + (state * 100) + "%%): $%.2f%n", gross * state);
		System.out.printf("\tTotal deduction: $%.2f%n", gross * fed + gross * state);
		System.out.printf("Net pay: $%.2f", net);
		
	}
}
