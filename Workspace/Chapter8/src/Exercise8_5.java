/*
 * Author: Alex Johnson
 * Date: 12-4-2019
 * 
 * 
 */
import java.util.Scanner;

public class Exercise8_5 {
	public static void main(String[] args) {
		double[][] m1 = new double[3][3];
		double[][] m2 = new double[3][3];
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first matrix: ");
		for (int a = 0; a < m1.length; a++) {
			for (int b = 0; b < m1[a].length; b++) {
				m1[a][b] = input.nextDouble();
			}
		}
		
		System.out.println("Enter the second matrix: ");
		for (int a = 0; a < m2.length; a++) {
			for (int b = 0; b < m2[a].length; b++) {
				m2[a][b] = input.nextDouble();
			}
		}
		
		double[][] m3 = addMatrix(m1, m2);
		
		System.out.println("The sum of the two matrices is: ");
		for (int a = 0; a < m3.length; a++) {
			for (int b = 0; b < m3[a].length; b++) {
				System.out.print(m3[a][b] + " ");
			}
			System.out.println();
		}
	}
	
	public static double[][] addMatrix(double[][] m1, double[][] m2) {
		double[][] m3 = new double[3][3];
		
		for (int a = 0; a < m3.length; a++) {
			for (int b = 0; b < m3[a].length; b++) {
				m3[a][b] = m1[a][b] + m2[a][b];
			}
		}
		
		return m3;
	}
}
