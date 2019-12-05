/*
Author: Alex Johnson
Date: 12-2-2019

Eliminates the duplicates from an array of 10 numbers entered by the user.
*/
import java.util.Scanner;

public class Exercise7_15 {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 10 numbers: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextInt();
		
		int[] distinct = eliminateDuplicates(numbers);
		
		System.out.print("The distinct numbers are: ");
		for (int i = 0; i < distinct.length; i++)
			System.out.print(distinct[i] + " ");
	}
	
	public static int[] eliminateDuplicates(int[] list) {
		int count = 1;
		
		for (int a = 1; a < list.length; a++) {
			for (int b = 0; b < a; b++) {
				if (list[a] == list[b]) {
					b = a;
					count--;
				}
				else if (count == b) {
					list[count] = list[a];
				}
			}
			count++;
		}
		
		int[] temp = new int[count];
		
		for (int i = 0; i < count; i++) {
			temp[i] = list[i];
		}
		
		return temp;
	}
}
