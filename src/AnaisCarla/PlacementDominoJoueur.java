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
	
	public enum Cell {O,C,CHA,FOR,MER,PRA,MIN,MON,Z, A}; 
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
		List<Integer> liste = new ArrayList<Integer>();
		liste.add(0);
		liste.add(1);
		liste.add(2);
		liste.add(3);
		liste.add(4);
		
		int i = 0;
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		
		Scanner scan = new Scanner(System.in);	
		
	/*
	 * X1
	 */
		
		Boolean running = true;
		while (running) {
			try {
				System.out.println("Veuillez entrer la ligne de la premiere case de votre domino (entre 0 et 4) ");
				x1 = scan.nextInt();
				
				for(i = 0; i < liste.size(); i++) {
				int num = liste.get(i);
				if (x1 == num) {
					running = false;
				}
				else if(x1<0 || x1>5) {
					System.out.println("Ce que vous avez entré ne correspond pas à une ligne du tableau.");
					break;	
				}
				}
				
			}
			catch (Exception e) {
				System.out.println("Ce que vous avez entré ne correspond pas à une ligne du tableau.");
				scan.nextLine();	
			}			
		}
		
			
			/*
			 * Y1
			 */
		
		Boolean running1 = true;		
		while (running1) {
			try {
				System.out.println("Veuillez entrer la colonne de la premiere case de votre domino (entre 0 et 4) ");
				y1 = scan.nextInt();
				
				for (i = 0; i < liste.size(); i++) {
					int num1 = liste.get(i);
					if (y1 == num1) {
						running1 = false;
					}
					else if(y1<0 || y1>5) {
						System.out.println("Ce que vous avez entré ne correspond pas à une colonne du tableau.");
						break;	
					}
				}				
			}
			catch (Exception e) {
				System.out.println("Ce que vous avez entré ne correspond pas à une colonne du tableau.");
				scan.nextLine();	
			}
		}
		
		PlacementDominoJoueur b = new PlacementDominoJoueur();
		b.setCell(x1, y1, Cell.Z);
		System.out.println(b);
			
		/*
		 * X2	
		 */
		
		Boolean running2 = true;
		while (running2) {
			try {
				System.out.println("Veuillez entrer la ligne de la deuxième case de votre domino (entre 0 et 4) ");
				x2 = scan.nextInt();
				
				for (i = 0; i < liste.size(); i++) {
					int num2 = liste.get(i);
					if (x2 == num2) {
						running2 = false;	
					}
					else if(x2<0 || x2>5) {
						System.out.println("Ce que vous avez entré ne correspond pas à une ligne du tableau.");
						break;	
					}
				}
				
			}
			catch (Exception e) {
				System.out.println("Ce que vous avez entré ne correspond pas à une ligne du tableau.");
				scan.nextLine();
	
			}
		}			
		
		/*
		 * Y2
		 */
		
			Boolean running3 = true;		
			while (running3) {
				try {
					System.out.println("Veuillez entrer la colonne de la deuxième case de votre domino (entre 0 et 4) ");
					y2 = scan.nextInt();
					for (i = 0; i < liste.size(); i++) {
						int num3 = liste.get(i);
						if (y2 == num3) {
							running3 = false;							
						}
						else if (y2<0 || y2>5) {
							System.out.println("Ce que vous avez entré ne correspond pas à une colonne du tableau.");
							break;	
						}
					}				
				}
				catch (Exception e) {
					System.out.println("Ce que vous avez entré ne correspond pas à une colonne du tableau.");
					scan.nextLine();
		
				}
			}
			
			if (Math.abs(x1 - x2) + Math.abs(y1 - y2) == 1) {
			PlacementDominoJoueur b1 = new PlacementDominoJoueur();
			b1.setCell(x2, y2, Cell.A);
			System.out.println(b1);
			}
				else if (Math.abs(x1 - x2) + Math.abs(y1 - y2) != 1) {
				System.out.println("Vous devez entrer deux cases adjacentes");
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