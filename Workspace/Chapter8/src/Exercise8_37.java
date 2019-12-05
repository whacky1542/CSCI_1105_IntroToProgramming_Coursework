/*
 * Author: Alex Johnson
 * Date: 12-4-2019
 * 
 * Goes through each of the 50 states of america and quizes 
 * the user on the name of their capitals.
 */
import java.util.Scanner;

public class Exercise8_37 {
	public static void main(String[] args) {
		String[][] stateCap = {
				{"alabama", "montgomery"},
				{"alaska", "juneau"},
				{"arizona", "phoenix"},
				{"arkansas", "little rock"},
				{"california", "sacramento"},
				{"colorado", "denver"},
				{"connecticut", "hartford"},
				{"delaware", "dover"},
				{"florida", "tallahassee"},
				{"georgia", "atlanta"}
				}; // That was fun!
		int correct = 0;
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < stateCap.length; i++) {
			System.out.print("What is the capital of " + stateCap[i][0] + "? ");
			
			if (input.nextLine().toLowerCase().equals(stateCap[i][1])) {
				correct++;
				System.out.println("Correct!");
			}
			else
				System.out.println("Incorrect...");
		};
		
		System.out.println("You got " + correct + " correct!");
	}
}
