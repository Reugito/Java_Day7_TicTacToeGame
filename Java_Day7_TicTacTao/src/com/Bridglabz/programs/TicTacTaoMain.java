package com.Bridglabz.programs;

public class TicTacTaoMain {

	public static void main(String[] args) {

		TicTacTaoGame game = new TicTacTaoGame();
		game.addElementInBoard();
		game.getSigntoPlay();
		game.showBoard();
		game.makeMove();
		game.makeMove();
		game.showBoard();

	}

}
