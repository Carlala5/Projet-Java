package AnaisCarla;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Plateau {

	private String[][] plateau;

	public Plateau() {
		constructionPlateau();
	}

	public void constructionPlateau() {
		plateau = new String[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				plateau[i][j] = "0";
			}
		}
		plateau[0][0] = "C";
	}

	public void afficherPlateau() {
		for (int i = 0; i < plateau.length; i++) {
			for (int j = 0; j < plateau.length; j++) {
				System.out.print(plateau[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void placerDomino(Domino domino, int typeTour) {
		Scanner scan = new Scanner(System.in);
		String face1 = domino.getType1();
		String face2 = domino.getType2();
		int x1;
		int y1;
		boolean condition;
		do {
			condition = false;
			if (typeTour == 1) {
				System.out.println("\nVeuillez entrer la ligne de la premiere case de votre domino (entre 0 et 4) ");
				System.out.println("Celle-ci doit se trouver à côté de votre château.");
			} else {
				System.out.println("\nVeuillez entrer la ligne de la premiere case de votre domino (entre 0 et 4) ");
			}
			x1 = scan.nextInt();
			System.out.println("\nVeuillez entrer la colonne de la premiere case de votre domino (entre 0 et 4) ");
			System.out.println("Elle ne doit pas se trouver sur le château !");
			y1 = scan.nextInt();
			if ((x1 < 0) || (x1 > 4) || (y1 < 0) || (y1 > 4)) {
				System.out.println("Une ou les coordonnées entrées ne sont pas valides, recommencez.");
				condition = false;
			} else {
				if (typeTour == 1) {
						if (x1 == 0 && y1 == 0) {
							System.out.println(
									"Vous devez placer votre premier domino à côté de votre château, et non dessus ! Recommencez.");
							condition = false;
						} else if (Math.abs(0 - x1) + Math.abs(0 - y1) == 1) {
							this.plateau[x1][y1] = face1;
							condition = true;
						} else {
							System.out.println("Ces coordonnées ne sont pas valides, recommencez !");
							condition = false;
						}

				} else if (typeTour == 2) {
					this.plateau[x1][y1] = face1;
					condition = true;
				}
			}
		}while(condition == false);
		afficherPlateau();
		System.out.println("\nVeuillez entrer la ligne de la deuxième case de votre domino (entre 0 et 4) ");
		int x2 = scan.nextInt();
		System.out.println("\nVeuillez entrer la colonne de la deuxième case de votre domino (entre 0 et 4) ");
		int y2 = scan.nextInt();
		boolean cond2;
		do {
			if ((x2 < 0) || (x2 > 4) || (y2 < 0) || (y2 > 4)) {
				System.out.println("Une ou les coordonnées entrées ne sont pas valides, recommencez.");
				cond2 = false;
			} else {
				boolean cond3;
				do {
					if (Math.abs(x1 - x2) + Math.abs(y1 - y2) == 1) {
						this.plateau[x2][y2] = face2;
						cond3 = true;
					} else {
						System.out.println("Les cases doivent être adjacentes, veuillez recommencer.");
						cond3 = false;
					}
				} while (cond3 = false);
			}
			cond2 = true;
		} while (cond2 = false);
	}
	// }
	//
	//
	//
	//
	// public enum Cell {O,C,J,P,F,B,M,G,Z, A};
	// /* O for Empty, C for Castle, CHA for Champ, FOR for Foret, PRA for Prairie,
	// MIN for Mine, MON for Montagne Z to test
	// *
	// */
	//
	// private static Cell [][] board;
	//
	// /*public Plateau(int taille, int ligne, int colonne) {
	// this.taille = taille;
	// this.ligne = ligne;
	// this.colonne = colonne;
	// }
	//
	// public void setTaille (int taille) {
	// this.taille = taille;
	//
	// }
	// public int getTaille() {
	// return taille;
	// }
	//
	// public void setLigne (int ligne) {
	// this.ligne = ligne;
	//
	// }
	//
	// public int getLigne() {
	// return ligne;
	// }
	// public void setColonne (int colonne) {
	// this.colonne = colonne;
	//
	// }
	// public int getColonne() {
	// return colonne;
	// }
	//
	// /*
	// *
	// * Création du plateau
	// *
	// */
	//
	//
	//
	// public static void GameBoard() {
	// board = new Cell [5][5];
	// for (int i = 0; i < board.length; i++) {
	// for (int j = 0; j < board[i].length; j++) {
	// board [i][j] = Cell.O;
	// }
	// }
	// }
	//
	// public String toString() {
	// String result = "";
	// for (Cell[]row : board) { // a for for each loop
	// for (Cell c : row) {
	// result += c;
	// result += " ";
	// }
	// result += "\n";
	// }
	// return result;
	// }
	//
	// public static void setCell(int row, int col, Cell value) { //particular
	// method to change a particular cell
	// board[row][col] = value;
	// }
	//
	// /*
	// *
	// * Cette fonction a pour but de demander au joueur des coordonées pour qu'il
	// choisisse ou placer son domino
	// *
	// */
	//
	// public static ArrayList<Integer> coordonnees_domino () { //(int x1,int y1)
	// ArrayList<Integer> coordonnes = new ArrayList<Integer>();
	// List<Integer> liste = new ArrayList<Integer>();
	// liste.add(0);
	// liste.add(1);
	// liste.add(2);
	// liste.add(3);
	// liste.add(4);
	//
	// int i = 0;
	// int x1 = 0;
	// int y1 = 0;
	// int x2 = 0;
	// int y2 = 0;
	//
	// Scanner scan = new Scanner(System.in);
	//
	// /*
	// * X1
	// */
	//
	// Boolean running = true;
	// while (running) {
	// try {
	// System.out.println("\nVeuillez entrer la ligne de la premiere case de votre
	// domino (entre 0 et 4) ");
	// x1 = scan.nextInt();
	//
	// for(i = 0; i < liste.size(); i++) {
	// int num = liste.get(i);
	// if (x1 == num) {
	// running = false;
	// }
	// else if(x1<0 || x1>5) {
	// System.out.println("Ce que vous avez entré ne correspond pas à une ligne du
	// tableau.");
	// break;
	// }
	// }
	//
	// }
	// catch (Exception e) {
	// System.out.println("Ce que vous avez entré ne correspond pas à une ligne du
	// tableau.");
	// scan.nextLine();
	// }
	// }
	//
	//
	// /*
	// * Y1
	// */
	//
	// Boolean running1 = true;
	// while (running1) {
	// try {
	// System.out.println("Veuillez entrer la colonne de la premiere case de votre
	// domino (entre 0 et 4) ");
	// y1 = scan.nextInt();
	//
	// for (i = 0; i < liste.size(); i++) {
	// int num1 = liste.get(i);
	// if (y1 == num1) {
	// running1 = false;
	// }
	// else if(y1<0 || y1>5) {
	// System.out.println("Ce que vous avez entré ne correspond pas à une colonne du
	// tableau.");
	// break;
	// }
	// }
	// }
	// catch (Exception e) {
	// System.out.println("Ce que vous avez entré ne correspond pas à une colonne du
	// tableau.");
	// scan.nextLine();
	// }
	// }
	//
	// Plateau b = new Plateau();
	// b.setCell(x1, y1, Cell.Z);
	// System.out.println(b);
	//
	// /*
	// * X2
	// */
	//
	// Boolean running2 = true;
	// while (running2) {
	// try {
	// System.out.println("Veuillez entrer la ligne de la deuxième case de votre
	// domino (entre 0 et 4) ");
	// x2 = scan.nextInt();
	//
	// for (i = 0; i < liste.size(); i++) {
	// int num2 = liste.get(i);
	// if (x2 == num2) {
	// running2 = false;
	// }
	// else if(x2<0 || x2>5) {
	// System.out.println("Ce que vous avez entré ne correspond pas à une ligne du
	// tableau.");
	// break;
	// }
	// }
	//
	// }
	// catch (Exception e) {
	// System.out.println("Ce que vous avez entré ne correspond pas à une ligne du
	// tableau.");
	// scan.nextLine();
	//
	// }
	// }
	//
	// /*
	// * Y2
	// */
	//
	// Boolean running3 = true;
	// while (running3) {
	// try {
	// System.out.println("Veuillez entrer la colonne de la deuxième case de votre
	// domino (entre 0 et 4) ");
	// y2 = scan.nextInt();
	// for (i = 0; i < liste.size(); i++) {
	// int num3 = liste.get(i);
	// if (y2 == num3) {
	// running3 = false;
	// }
	// else if (y2<0 || y2>5) {
	// System.out.println("Ce que vous avez entré ne correspond pas à une colonne du
	// tableau.");
	// break;
	// }
	// }
	// }
	// catch (Exception e) {
	// System.out.println("Ce que vous avez entré ne correspond pas à une colonne du
	// tableau.");
	// scan.nextLine();
	//
	// }
	// }
	//
	// if (Math.abs(x1 - x2) + Math.abs(y1 - y2) == 1) {
	// Plateau b1 = new Plateau();
	// b1.setCell(x2, y2, Cell.A);
	// System.out.println(b1);
	// }
	// else if (Math.abs(x1 - x2) + Math.abs(y1 - y2) != 1) {
	// System.out.println("Vous devez entrer deux cases adjacentes");
	// }
	// return coordonnees;
	// }

	public static void main(String[] args) {

		Plateau board = new Plateau();
		board.afficherPlateau();
		// Plateau b = new Plateau();
		// System.out.println("Le C corrrespond au chateau \nLe J correspond aux champs
		// \nLe P correspond à la prairie \nLe F correspond à la forêt \nLe B correpond
		// à la mer \nLe M correspond à la montagne \nLe G correspond aux mines ");
		// System.out.println("\nVoici votre plateau : \n");
		// GameBoard();
		//
		// /* We put a C at the left corner, because at the beginning each castle of
		// each player
		// * is placed at the left corner of the board
		// */
		//
		// b.setCell(0, 0, Cell.C); // va de 0 à 8 (ligne,colonne)
		// System.out.print(b);
		//
		// //System.out.println("Veuillez entrer la ligne de la premiere case de votre
		// domino (entre 0 et 4) ");
		//// Scanner scan = new Scanner(System.in);
		////
		//// int x1 = scan.nextInt();
		//// System.out.println("Veuillez entrer la colonne de la premiere case de votre
		// domino (entre 0 et 4) ");
		//// Scanner scan2 = new Scanner(System.in);
		//// int y1 = scan2.nextInt();
		////
		//// b.setCell(x1, y1, Cell.D);
		//// System.out.println(b);
		//
		// Plateau.coordonnees_domino();
	}

}
