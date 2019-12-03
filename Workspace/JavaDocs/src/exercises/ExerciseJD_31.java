package exercises;

/*
Credit card numbers follow certain patterns. A credit card number must have between 13 and 16 digits. It must start with:
  ■	4 for Visa cards 
  ■	5 for Master cards 
  ■	37 for American Express cards 
  ■	6 for Discover cards
In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card numbers. The algorithm is useful to determine whether a card number is entered correctly or whether a credit card is scanned correctly by a scanner. Credit card numbers are generated following this validity check, commonly known as the Luhn check or the Mod 10 check, which can be described as follows (for illustra- tion, consider the card number 4388576018402626):

1. Double every second digit from right to left. If doubling of a digit results in a two-digit number, add up the two digits to get a single-digit number.
2. Now add all single-digit numbers from Step 1. 4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37
3. Add all digits in the odd places from right to left in the card number. 6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38
4. Sum the results from Step 2 and Step 3. 37 + 38 = 75
5.	If the result from Step 4 is divisible by 10, the card number is valid; otherwise, it is invalid. For example, the number 4388576018402626 is invalid, but the number 4388576018410707 is valid.
*/

import java.util.Scanner;

/**
 * <h1>Exercise6-31</h1>
 * This program checks if the entered credit card number is valid.
 * 
 * <h2>Example:</h2>
 * <pre>{@code Enter a credit card number as a long integer:
 * 	4388576018402626
 * 	4388576018402626 is invalid
 * }</pre>
 * 
 * @since 12-3-2019
 * @author Alex Johnson
 *
 */
public class ExerciseJD_31 {
	
	/**
	 * This method gets a credit card number from the user and uses isValid to check if it's valid.
	 * 
	 * @param args Standard parameter for basic methods.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a credit card number as a long integer: ");
		long number = input.nextLong();

		if (isValid(number))
			System.out.println(number + " is valid");
		else
			System.out.println(number + " is invalid");
	}

	/**
	 * This method takes the long "number" and determines if it is valid by running it through some rules.
	 * 
	 * <pre>Example:
	 * {@code isValid(4388576018402626) returns:
	 * 	false
	 * }</pre>
	 * 
	 * @param number Is a credit card number in the form of a long to be validated.
	 * @return Returns true or false depending on the validility of the credit card number.
	 */
	public static boolean isValid(long number) {
		return (getSize(number) >= 13) && (getSize(number) <= 16)
				&& (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 6)
						|| prefixMatched(number, 37))
				&& (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0;
	}

	/**
	 * This method finds the sum of double of every second digit from right to left. If doubling of a digit results in a two-digit number, add up the two digits to get a single-digit number.
	 * 
	 * <pre>Example:
	 * {@code sumOfDoubleEvenPlace(12345678912345) equals:
	 * 	34
	 * }</pre>
	 * 
	 * @param number Is a credit card number in the form of a long to be summed.
	 * @return Returns the sum based on the equation used.
	 */
	public static int sumOfDoubleEvenPlace(long number) {
		int result = 0;

		number = number / 10; // Starting from the second digit from left
		while (number != 0) {
			result += getDigit((int) ((number % 10) * 2));
			number = number / 100; // Move to the next even place
		}

		return result;
	}

	/**
	 * This method returns this number if it is a single digit, otherwise, return the sum of the two digits.
	 * 
	 * <pre>Example:
	 * {@code getDigit(12) returns:
	 * 	3
	 * }</pre>
	 * 
	 * @param number Is a digit to be returned or added together and then returned.
	 * @return Returns a digit in single digit integer form.
	 */
	public static int getDigit(int number) {
		return number % 10 + (number / 10);
	}

	/**
	 * This method finds the sum of every other digit in the long "number" starting with the first digit on the right working left.
	 * 
	 * <pre>Example:
	 * {@code sumOfOddPlace(12345678912345) equals:
	 * 	31
	 * }</pre>
	 * 
	 * @param number Is a credit card number in the form of a long to be summed.
	 * @return Returns the sum based on the equation used.
	 */
	public static int sumOfOddPlace(long number) {
		int result = 0;

		while (number != 0) {
			result += (int) (number % 10);
			number = number / 100; // Move two positions to the left
		}

		return result;
	}

	/**
	 * This method returns true if the prefix is the prefix for the number.
	 * 
	 * <pre>Example:
	 * {@code prefixMatched(12345678912345, 37)
	 * 	false
	 * }</pre>
	 * 
	 * @param number Is a credit card number in the form of a long to be checked.
	 * @param d Is the prefix to be matched.
	 * @return Returns true if the prefix matches.
	 */
	public static boolean prefixMatched(long number, int d) {
		return getPrefix(number, getSize(d)) == d;
	}

	/**
	 * This method finds the number of digits in the long "number".
	 * 
	 * <pre>Example:
	 * {@code getSize(12) returns:
	 * 	2
	 * }</pre>
	 * 
	 * @param d Is ultimately a prefix number such as 37.
	 * @return Returns the number of digits as an integer.
	 */
	public static int getSize(long d) {
		int numberOfDigits = 0;

		while (d != 0) {
			numberOfDigits++;
			d = d / 10;
		}

		return numberOfDigits;
	}

	/**
	 * This method gets the value of the prefix.
	 * 
	 * <pre>Example:
	 * {@code getPrefix(371234567890) returns:
	 * 	37
	 * }</pre>
	 * 
	 * @param number Is a credit card number in the form of a long to be checked for a prefix.
	 * @param k Is the number of digits that the prefix takes in the credit card number.
	 * @return Returns the prefix of the credit card number.
	 */
	public static long getPrefix(long number, int k) {
		long result = number;

		for (int i = 0; i < getSize(number) - k; i++)
			result /= 10;

		return result;
	}
}
