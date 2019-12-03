package exercises;
import java.util.Scanner;

/**
 * <h1>Exercise6-37</h1>
 * This program prints a formatted string from a base number and width entered by the user.
 * 
 * <h2>Example:</h2>
 * <pre>{@code Enter a number:
 * 	12
 *  Enter a width:
 * 	4
 *  The format is:
 * 	0012
 * }</pre>
 * 
 * @since 11-28-2019
 * @author Alex Johnson
 */
public class ExerciseJD_37 {
	
	/**
	 * This method takes the base number and width from the user and sends it to the method "format" to then have the returned value be printed to the console.
	 * 
	 * @param args Standard parameter for a basic main method.
	 */
	public static void main(String[] args) {
		int number = 0;
		int width = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		number = input.nextInt();
		System.out.println("Enter a width: ");
		width = input.nextInt();
		
		System.out.println("The format is: " + format(number, width));
	}
	
	/**
	 * This method takes a base number and a width and formats them together. It returns the formatted number.
	 * 
	 * <pre>Examples:
	 * {@code format(12, 4) turns into:
	 * 	0012
	 *  format(12, 1) turns into:
	 * 	12
	 * }</pre>
	 * 
	 * @param number Is the base number.
	 * @param width Is the size of the formatted number.
	 * @return Returns the formatted number.
	 */
	public static String format(int number, int width) {
		String format = "";
		
		for (int a = 0; a < width - Integer.toString(number).length(); a++)
			format += "0";
		
		format += Integer.toString(number);
		
		return format;
	}
}
