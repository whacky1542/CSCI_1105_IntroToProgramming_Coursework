/*
Author: Alex Johnson
Date: 12-2-2019

Finds the smallest element of ten numbers entered by the user.
*/
import java.util.Scanner;

public class Exercise7_9 {
	public static void main(String[] args) {
		double[] numbers = new double[10];
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 10 numbers: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextDouble();
		
		System.out.println("The minimum number is: " + min(numbers));
	}
	
	public static double min(double[] array) {
		double min = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min)
				min = array[i];
		}
		
		return min;
	}
}
