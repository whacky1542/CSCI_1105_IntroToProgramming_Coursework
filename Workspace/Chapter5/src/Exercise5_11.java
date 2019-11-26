/*
Author: Alex Johnson
Date: 11-25-2019

Finds all numbers that are divisible by 5 and 6 but not both 
within the range of 100-200 and displays them in rows of 10.
*/
public class Exercise5_11 {
	public static void main(String[] args) {
		int number = 100;
		int count = 0;
		
		while (number < 201) {
			while ((count < 10) && (number < 201)) {
				if ((number % 5 == 0) ^ (number % 6 == 0)) {
					System.out.print(number + " ");
					count++;
				}
				number++;
			}
			count = 0;
			System.out.println();
		}
	}
}