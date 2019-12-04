/*
 * Author: Alex Johnson
 * Date: 12-4-2019
 * 
 * 
 */
import java.util.Scanner;

public class Exercise8_9 {
	public static void main(String[] args) {
		String[][] board = new String[3][3];
		Scanner input = new Scanner(System.in);
		
		// Setup board
		for (int a = 0; a < board.length; a++)
			for (int b = 0; b < board[a].length; b++)
				board[a][b] = " ";
		
		// Play the game
		while (checkForWinner(board) == 0) {
			printBoard(board);
			playerPromptX(board, input);
			if (checkForWinner(board) == 0) {
				printBoard(board);
				playerPromptO(board, input);
			}
		}
		
		printBoard(board);
		System.out.println("The game has ended");
		
		// Display who won (WIP)
//		if (checkForWinner(board) == 1) {
//			printBoard(board);
//			System.out.println("Tie!");
//		}
//		else if(checkForWinner(board) == 2) {
//			printBoard(board);
//			System.out.println("X wins!");
//		}
//		else {
//			printBoard(board);
//			System.out.println("O wins!");
//		}
	}
	
	public static void printBoard(String[][] board) {
		for (int a = 0; a < board.length; a++) {
			System.out.print("-------------\n");
			for (int b = 0; b < board[a].length; b++) {
				System.out.print("| " + board[a][b] + " ");
			}
			System.out.print("|\n");
		}
		System.out.println("-------------");
	}
	
	public static void playerPromptX(String[][] board, Scanner input) {
		int x = 0;
		int y = 0;
		
		do {
			System.out.print("Player X, enter coordinate x: ");
			x = input.nextInt();
			System.out.print("Player X, enter coordinate y: ");
			y = input.nextInt();
			if (board[y][x].equals("x") || board[y][x].equals("o"))
				System.out.println("Coordinates taken.");
		} while (board[y][x].equals("x") || board[y][x].equals("o"));
		
		board[y][x] = "x";
	}
	
	public static void playerPromptO(String[][] board, Scanner input) {
		int x = 0;
		int y = 0;
		
		do {
			System.out.print("Player O, enter coordinate x: ");
			x = input.nextInt();
			System.out.print("Player O, enter coordinate y: ");
			y = input.nextInt();
			if (board[y][x].equals("x") || board[y][x].equals("o"))
				System.out.println("Coordinates taken.");
		} while (board[y][x].equals("x") || board[y][x].equals("o"));
		
		board[y][x] = "o";
	}
	
	public static int checkForWinner(String[][] board) {
		if (board[0][0] != " " &&
			board[0][1] != " " &&
			board[0][2] != " " &&
			board[1][0] != " " &&
			board[1][1] != " " &&
			board[1][2] != " " &&
			board[2][0] != " " &&
			board[2][1] != " " &&
			board[2][2] != " ") {
			return 1;
		}
		else
			return 0;
	}
}
