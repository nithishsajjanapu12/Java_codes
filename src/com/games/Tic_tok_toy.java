package com.games;

//import java.util.Arrays;
import java.util.Scanner;

public class Tic_tok_toy {

	static char[][] a = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	static char player = 'X';

	public static void main(String[] args) {
//		System.out.println("welcome");
//		for (char[] a1 : a) {
//
//			System.out.println(Arrays.toString(a1));
//		}
		Scanner scn = new Scanner(System.in);
		while (true) {

			displayboard();
			System.out.println(player + " select the row ");
			int row = scn.nextInt();
			System.out.println(player + " select the col ");
			int col = scn.nextInt();
			if (row < 0 || row > 2 || col < 0 || col > 2 || a[row][col] != ' ') {
				System.out.println("invalid move !!!! ");
				continue;
			}
			a[row][col] = player;
			if (iswin()) {
				displayboard();
				System.out.println(player + " is won the game !!!!");
				break;
			}
			if (isdraw()) {
				displayboard();
				System.out.println("match is draw!!!!!!");
				break;
			}
			//player = player == 'X' ? 'O' : 'X';
			if(player=='X') {
				player='O';
			}else {
				player='X';
			}

		}
		scn.close();
	}

	public static void displayboard() {
		System.out.println("--------------");
		for (char[] a1 : a) {
			System.out.print("| ");
			for (char c : a1) {
				System.out.print(c + " | ");
			}
			System.out.println();
			System.out.println("--------------");
		}
	}

	public static boolean isdraw() {
		for (char[] a1 : a) {
			for (char c : a1) {
				if (c == ' ') {
					return false;
				}
			}

		}
		return true;
	}

	public static boolean iswin() {
		for (int i = 0; i <= 2; i++) {
			if (a[i][0] == player && a[i][1] == player && a[i][2] == player) {
				return true;
			}
		}
		for (int i = 0; i <= 2; i++) {
			if (a[0][i] == player && a[1][i] == player && a[2][i] == player) {
				return true;
			}
		}
		if (a[0][0] == player && a[1][1] == player && a[2][2] == player) {
			return true;
		}
		if (a[0][2] == player && a[1][1] == player && a[2][0] == player) {
			return true;
		}
		return false;
	}

}
