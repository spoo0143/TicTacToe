package tic_tac_toe;

public class TicTacToeGame {

	static void startGame() { // Creation Of static method named startGame
		char[] boardOfChar = new char[10];

		for (int i = 1; i < boardOfChar.length; i++) {
			boardOfChar[i] = ' ';
		}
		
		System.out.println(boardOfChar);
	}

	public static void main(String[] args) {

		TicTacToeGame.startGame(); // Calling the method by using classname
	}

}
		
	
	