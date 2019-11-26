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
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string with only letters: ");
		s = input.nextLine();
		s = s.toUpperCase();
		
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'A':
				vCount++;
				break;
			case 'E':
				vCount++;
				break;
			case 'I':
				vCount++;
				break;
			case 'O':
				vCount++;
				break;
			case 'U':
				vCount++;
				break;
			default:
				cCount++;
			}
		}
		
		System.out.println("Number of Vowels: " + vCount);
		System.out.println("Number of Consonants: " + cCount);
	}
}
