/*
Author: Alex Johnson
Date: 11-20-2019

Solves for x and y using Cramer's rule.
The given equation is:
3.4x + 50.2y = 44.5
2.1x + 0.55y = 5.9
*/
public class Exercise1_13 {
	public static void main(String[] args) {
		System.out.println("x = ");
		System.out.println((44.5 * 0.55 - 50.2 * 5.9) / (3.4 * 0.55 - 50.2 * 2.1));
		System.out.println("y = ");
		System.out.println((3.4 * 5.9 - 44.5 * 2.1) / (3.4 * 0.55 - 50.2 * 2.1));
	}
}
