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
		for (int i = 0; i < distinct[10]; i++)
			System.out.print(distinct[i] + " ");
	}
	
	public static int[] eliminateDuplicates(int[] list) {
		int[] temp = new int[11];
		int count = 1;
		
		for (int a = 0; a < list.length; a++)
			temp[a] = list[a];
		
		for (int a = 1; a < temp.length; a++) {
			for (int b = 0; b < a; b++) {
				if (temp[a] == temp[b]) {
					b = a;
					count--;
				}
				else if (count == b) {
					temp[count] = temp[a];
				}
			}
			count++;
		}
		
		temp[10] = count - 1;
		
		return temp;
	}
}
