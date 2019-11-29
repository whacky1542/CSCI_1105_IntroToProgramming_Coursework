/*
Author: Alex Johnson
Date: 11-26-2019

Displays the number of vowels and consonants in a user entered string.
*/
import java.util.Scanner;

public class Exercise5_49 {
	public static void main(String[] args) {
		String s = " ";
		int vCount = 0;
		int cCount = 0;
		final String VOWELS = "AEIOU";
		final String CONSONANTS = "BCDFGHJKLMNPQRSTVWXYZ";
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter some words: ");
		s = input.nextLine();
		s = s.toUpperCase();
		
		for (int a = 0; a < s.length(); a++) {
			for (int b = 0; b < VOWELS.length(); b++) {
				if (s.charAt(a)  == VOWELS.charAt(b)) {
					vCount++;
				}
			}
			for (int b = 0; b < CONSONANTS.length(); b++) {
				if (s.charAt(a)  == CONSONANTS.charAt(b)) {
					cCount++;
				}
			}
		}
		
		System.out.println("Number of Vowels: " + vCount);
		System.out.println("Number of Consonants: " + cCount);
	}
}
