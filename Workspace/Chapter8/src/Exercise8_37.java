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
				{"georgia", "atlanta"},
				{"hawaii", "honolulu"},
				{"idaho", "boise"},
				{"illinois", "springfield"},
				{"indiana", "indianapolis"},
				{"iowa", "desmoines"},
				{"kansas", "topeka"},
				{"kentucky", "frankfort"},
				{"louisiana", "baton rouge"},
				{"maine", "augusta"},
				{"maryland", "annapolis"},
				{"massachusetts", "boston"},
				{"michigan", "lansing"},
				{"minnesota", "st. paul"},
				{"mississippi", "jackson"},
				{"missouri", "jefferson"},
				{"montana", "helena"},
				{"nebraska", "lincoln"},
				{"nevada", "carson city"},
				{"new hampshire", "concord"},
				{"new jersey", "trenton"},
				{"new mexico", "santa fe"},
				{"new york", "albany"},
				{"north carolina", "raleigh"},
				{"north dakota", "bismarck"},
				{"ohio", "columbus"},
				{"oklahoma", "oklahoma city"},
				{"oregon", "salem"},
				{"pennsylvania", "harrisburg"},
				{"rhode island", "providence"},
				{"south carolina", "columbia"},
				{"south dakota", "pierre"},
				{"tennessee", "nashville"},
				{"texas", "austin"},
				{"utah", "salt lake city"},
				{"vermont", "montpelier"},
				{"virginia", "richmond"},
				{"washington", "olympia"},
				{"west virginia", "charleston"},
				{"wisconsin", "madison"},
				{"wyoming", "cheyenne"}
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
