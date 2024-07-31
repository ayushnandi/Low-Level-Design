package TicTacToe;

import java.util.Scanner;

public class TicTacToe {
	
	boolean turn = true; 
	int [][] board = new int[3][3];
	
	public static void main(String[] args) {
		TicTacToe game = new TicTacToe();
		game.startGame();
	}
	
	public void startGame() {
		boolean noWinner = true;
		Scanner scanner = new Scanner(System.in);
		int moves = 0;
		System.out.println();
		printBoard();
		
		while (noWinner && moves < 9) {
			System.out.println("Player " + (turn ? "1 (X)" : "2 (O)") + "'s turn. Enter row and column (0, 1, or 2) separated by a comma: ");
			String s = scanner.nextLine();
            String[] values = s.split(",");
            int row = Integer.parseInt(values[0].trim());
            int col = Integer.parseInt(values[1].trim());

			
			if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != 0) {
				System.out.println("Invalid move, try again.");
				continue;
			}
			
			board[row][col] = turn ? 1 : 2;
			printBoard();
			moves++;
			
			if (Win(board, row, col, turn ? 1 : 2)) {
				System.out.println("Player " + (turn ? "1 (X)" : "2 (O)") + " wins!");
				noWinner = false;
			} else if (moves == 9) {
				System.out.println("It's a draw!");
			}
			
			turn = !turn;
		}
		scanner.close();
	}
	
	public boolean Win(int[][] board, int row, int col, int n) {
		boolean rowbool = true;
		boolean colbool = true;
		boolean diag = true;
		boolean antidiag = true;
		
		for (int i = 0; i < 3; i++) {
			if (board[row][i] != n) {
				rowbool = false;
			}
		}
		for (int i = 0; i < 3; i++) {
			if (board[i][col] != n) {
				colbool = false;
			}
		}
		for (int i = 0, j = 0; i < 3; i++, j++) {
			if (board[i][j] != n) {
				diag = false;
			}
		}
		for (int i = 0, j = 2; i < 3; i++, j--) {
			if (board[i][j] != n) {
				antidiag = false;
			}
		}
		
		return rowbool || colbool || diag || antidiag;
	}
	
	public void printBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				switch (board[i][j]) {
					case 0:
						System.out.print("_ ");
						break;
					case 1:
						System.out.print("X ");
						break;
					case 2:
						System.out.print("O ");
						break;
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}
