package exercises;
import java.util.Scanner;

/**
 * <h1>Exercise6-3</h1>
 * This program determines whether or not the entered number is a palindrome.
 * 
 * <h2>Example:</h2>
 * <pre>{@code Enter a number:
 * 	12321
 * 	Your number is a palindrome
 * }</pre>
 * 
 * @since 11-28-2019
 * @author Alex Johnson
 */
public class ExerciseJD_3 {
	
	/**
	 * This method prompts the user for the number to be used in palindrome testing and reversing. Calls the isPalindrome method with the integer parameter of "number".
	 * 
	 * @param args The standard for basic main methods.
	 */
	public static void main(String[] args) {
		int number = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		number = input.nextInt();
		
		if (isPalindrome(number))
			System.out.println("Your number is a palindrome");
		else
			System.out.println("Your number isn't a palindrome");
	}
	
	/**
	 * This method takes an integer "number" and reverses it to be backwards. This new reversed number is returned.
	 * 
	 * <pre>Examples:
	 * {@code reverse(12321) turns into:
	 * 	12321
	 *  reverse(123) turns into:
	 * 	321
	 * }</pre>
	 * 
	 * @param number Is a number that will be reversed and returned.
	 * @return Returns the reversed version of the number received.
	 */
	public static int reverse(int number) {
		// ref = reference number, rev = reversed number
		String ref = Integer.toString(number);
		String rev = "";
		
		for (int a = 0; a < ref.length(); a++)
			rev += ref.charAt(Math.abs(a - ref.length() + 1));
		
		number = Integer.valueOf(rev);
		
		return number;
	}
	
	/**
	 * This method determines if the number received is a palindrome (the same backwards and forwards)
	 * 
	 * <pre>Examples:
	 * {@code isPalindrome(12321) outputs:
	 * 	true
	 *  isPalindrome(123) outputs:
	 * 	false
	 * }</pre>
	 * 
	 * @param number A number to be evaluated as a palindrome.
	 * @return Returns a boolean value based on the evaluation of the number.
	 */
	public static boolean isPalindrome(int number) {
		if (number == reverse(number))
			return true;
		else
			return false;
	}
}
