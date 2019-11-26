/*
Author: Alex Johnson
Date: 11-26-2019

Uses a method to print a matrix with dimensions designated by the user.
The matrix has random 1s and 0s.
*/
import java.util.Scanner;

public class Exercise6_17 {
	public static void main(String[] args) {
		int n = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a dimension: ");
		n = input.nextInt();
		
		printMatrix(n);
	}
	
	public static void printMatrix(int n) {
		int rCount = 0;
		int cCount = 0;
		
		while (rCount < n) {
			while (cCount < n) {
				System.out.print((int)(Math.round(Math.random())) + " ");
				cCount++;
			}
			System.out.println();
			cCount = 0;
			rCount++;
		}
	}
}
