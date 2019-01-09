package AnaisCarla;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class PlacementDominoJoueur {

/*
 * 
 * Création du plateau
 * 	
 */
	public enum Cell {O,C,CHA,FOR,MER,PRA,MIN,MON,Z}; 
	/* O for Empty, C for Castle, CHA for Champ, FOR for Foret, PRA for Prairie, MIN for Mine, MON for Montagne Z to test
	 * 
	 */
	
	
	private static Cell [][] board;	
	
	public static void GameBoard() {
		board = new Cell [5][5];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board [i][j] = Cell.O;
			}
		}		
	}
	
	public String toString() {
		String result = "";
		for (Cell[]row : board) { // a for for each loop
			for (Cell c : row) {
				result += c;
				result += " ";
			}
			result += "\n";
	}
		return result;
	}

	public static void setCell(int row, int col, Cell value) { //particular method to change a particular cell
		board[row][col] = value;		
	}

/*
 * 
 * Cette fonction a pour but de demander au joueur des coordonées pour qu'il choisisse ou placer son domino
 * 
 */
 
	public static void coordonnees_domino () {   //(int x1,int y1)
		List <Integer> liste = new ArrayList<>(Arrays.asList(0, 1, 2, 3 ,4));
		int i = 0;
		int x1 = 0;
		int y1 = 0;
		
		Scanner scan = new Scanner(System.in);	
		Scanner scan2 = new Scanner(System.in);
		
		Boolean running = true;
		Boolean running1 = true;
		while (running) {
			try {
				System.out.println("Veuillez entrer la ligne de la premiere case de votre domino (entre 0 et 4) ");
				x1 = scan.nextInt();
			}
			catch (Exception e) {
				System.out.println("Ce que vous avez entré ne correspond pas à une ligne du tableau.");
				break;
			}
			Iterator<Integer> iterator = liste.iterator();
			while (iterator.hasNext()){
				int value = iterator.next();
				if (x1 == value){
					
					while (running1) {
					try {						
						System.out.println("Veuillez entrer la colonne de la premiere case de votre domino (entre 0 et 4) ");
						y1 = scan.nextInt();
						
					}
					catch (Exception e) {
						System.out.println("Ce que vous avez entré ne correspond pas à une colonne du tableau.");
						break;
					}
					
					PlacementDominoJoueur b = new PlacementDominoJoueur();
					b.setCell(x1, y1, Cell.Z);
					System.out.println(b);
					
					Iterator<Integer> iterator2 = liste.iterator();
					while (iterator2.hasNext()) {
						int value2 = iterator2.next();
						if (y1 == value2) {
							Boolean running2 = true;
							while (running2) {
								System.out.println("Voulez vous placer votre domino horizontalement ou verticalement ? (H/V)");
								String reponse = scan2.nextLine();
								switch (reponse) {
								case "H":
									System.out.println("trop bien vous avez choisi le bon mode");
									b.setCell(x1, y1 + 1 , Cell.Z);
									System.out.println(b);
									
									running2 = false;
									break;
								case "V":
									System.out.println("trop bien vous avez choisi le bon mode");
									b.setCell(x1 + 1, y1, Cell.Z);
									System.out.println(b);
									running2 = false;
									break;
								default:
									System.out.println("faux");						
								}	
							}
						}	
					}	
					
					}
					running1 = false;
					running = false;					
				}
				
				}
		
			
		}			
	}

		 public static void main(String[] args) {
			PlacementDominoJoueur b = new PlacementDominoJoueur();
			
			
			GameBoard();
			
			 /* We put a C at the left corner, because at the beginning each castle of each player
			  * is placed at the left corner of the board
			  */
			
			 b.setCell(0, 0, Cell.C); // va de 0 à 8 (ligne,colonne)
			 System.out.print(b);

			//			 System.out.println("Veuillez entrer la ligne de la premiere case de votre domino (entre 0 et 4) ");
//			 Scanner scan = new Scanner(System.in);
//			 
//			 int x1 = scan.nextInt();
//			 System.out.println("Veuillez entrer la colonne de la premiere case de votre domino (entre 0 et 4) ");
//			 Scanner scan2 = new Scanner(System.in);
//			 int y1 = scan2.nextInt();
//			
//			 b.setCell(x1, y1, Cell.D);
//			 System.out.println(b);
		 
			PlacementDominoJoueur.coordonnees_domino();
		 }	
}