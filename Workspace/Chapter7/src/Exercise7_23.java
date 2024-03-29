/*
Author: Alex Johnson
Date: 12-4-2019

Game: locker puzzle! A school has 100 lockers and 100 students. All lockers 
are closed on the first day of school. As the students enter, the first 
student, denoted S1, opens every locker. Then the second student, S2, begins 
with the second locker, denoted L2, and closes every other locker. 
Student S3 begins with the third locker and changes every third locker 
(closes it if it was open, and opens it if it was closed). Student S4 begins 
with locker L4 and changes every fourth locker. Student S5 starts with L5 
and changes every fifth locker, and so on, until student S100 changes L100.
*/
public class Exercise7_23 {
	public static void main(String[] args) {
		boolean[] lockers = new boolean[100];
		
		gameStart(lockers);
		printOpen(lockers);
	}
	
	public static void gameStart(boolean[] lockers) {
		// Students
		for (int a = 1; a <= 100; a++) {
			// Lockers
			for (int b = a; b <= 100; b += a) {
				if (lockers[b - 1])
					lockers[b - 1] = false;
				else
					lockers[b - 1] = true;
			}
		}
	}
	
	public static void printOpen(boolean[] lockers) {
		System.out.println("Number designations of lockers that are open (1-100): ");
		for (int i = 0; i < 100; i++) {
			if (lockers[i])
				System.out.print((i + 1) + " ");
		}
	}
}
