package com.Bridglabz.programs;

import java.util.Scanner;

public class TicTacTaoGame {
	Scanner scanner;
	static char[] board = new char[10];
	boolean empty = true;
	static String playername, computername, playersign, compsign;

	public TicTacTaoGame() {
		scanner = new Scanner(System.in);
	}
	
	public String getCharValue() {
		return scanner.next();
	}
	
	public void getSigntoPlay() {
		boolean sign = false;
		do {
			
			System.out.println("Select the Sign to play");
			System.out.println("1. x");
			System.out.println("2. O");
			String choice = getCharValue() ;
			if(choice == "1" || choice == "x") {
				playersign = "X";
				compsign = "O";
			}
			else if(choice == "2" || choice == "o") {
				playersign = "O";
				compsign = "x";
			}
			else {
				sign = true;
				System.out.println("Invalid Selection");
			}
		}while(sign);
	}
}
