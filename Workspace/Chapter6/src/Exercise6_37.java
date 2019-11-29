/*
Author: Alex Johnson
Date: 11-28-2019

Outputs a formatted string based on a base number and width 
entered by the user.
*/
import java.util.Scanner;

public class Exercise6_37 {
	public static void main(String[] args) {
		int number = 0;
		int width = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		number = input.nextInt();
		System.out.println("Enter a width: ");
		width = input.nextInt();
		
		System.out.println("The format is: " + format(number, width));
	}
	
	public static String format(int number, int width) {
		String format = "";
		
		for (int a = 0; a < width - Integer.toString(number).length(); a++)
			format += "0";
		
		format += Integer.toString(number);
		
		return format;
	}
}
