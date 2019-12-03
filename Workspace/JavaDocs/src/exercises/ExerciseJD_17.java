package exercises;
import java.util.Scanner;

/**
 * <h1>Exercise6-17</h1>
 * This program utilizes a method to display a matrix to the console. A dimension is designated by the user and the matrix is populated with random 1s and 0s.
 * 
 * <h2>Example:</h2>
 * <pre>{@code Enter a dimension:
 * 	5
 * Output:
 * 	0 1 0 1 1
 * 	1 0 1 1 1
 * 	1 1 0 0 1
 * 	0 0 0 1 1
 * 	1 0 0 1 0
 * }</pre>
 * 
 * @since 11-26-2019
 * 
 * @author Alex Johnson
 */
public class ExerciseJD_17 {
	
	/**
	 * This method requests input from the user and calls the printMatrix method.
	 * 
	 * <pre>Example:
	 * {@code Enter a dimension:
	 * 	5
	 * 	Sends 5 to printMatrix
	 * }</pre>
	 * 
	 * @param args I'm not sure what this parameter is for, but I think it's unused.
	 */
	public static void main(String[] args) {
		int n = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a dimension: ");
		n = input.nextInt();
		
		printMatrix(n);
	}
	
	/**
	 * This method accepts an integer "n" and creates then prints a matrix with random 1s and 0s.
	 * 
	 * <pre>Example:
	 * {@code printMatrix(5) prints:
	 * 	0 1 0 1 1
	 * 	1 0 1 1 1
	 * 	1 1 0 0 1
	 * 	0 0 0 1 1
	 * 	1 0 0 1 0
	 * }</pre>
	 * @param n An integer meant to be the dimensions of the matrix
	 */
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
