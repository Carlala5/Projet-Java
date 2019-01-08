package testDomino;

import java.io.IOException;
import java.util.Scanner;
import testDomino.DominoCSVtoArrayList.Test;

/*
 * Cette fonction a pour but de demander au joueur des coordonées pour qu'il choisisse ou placer son domino
 */

public class PlacementDominoJoueur {
	    
	    
	public static void coordonnees_domino () {
		int tableauCoordonnees []= {0, 1, 2, 3 ,4};
		int i = 0;
		int x1;
		char reponse = ' ';
		char answer;
		
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("Veuillez entrer la ligne de la premiere case de votre domino");
		x1 = scan.nextInt();
		
		while (true) {
			for (i = 0 ;  i < tableauCoordonnees.length ; i++) {
				
				if (x1 == tableauCoordonnees[i]) {					
					System.out.println("Voulez vous placer votre domino horizontalement ou verticalement ? (H/V)");	
					reponse = scan.next().charAt(0);
				}			
			}
		break;	
		}
		 if (x1 != tableauCoordonnees[i]) {
			System.out.println("Ce que vous avez entré ne correspond pas à une case du tableau, voulez-vous réessayer ? (O/N)");
			answer = scan.next().charAt(0);
		}
	}	
			
		
		
//		do {
//			do {
//				i = 0;
//				System.out.println("Veuillez entrer la ligne de la premiere case de votre domino");
//				x1 = scan.nextInt();
//				while (i<tableauCoordonnees.length && x1 != tableauCoordonnees[i])
//			i++;
//			
//			if (i < tableauCoordonnees.length)
//				System.out.println(x1 + " est une coordonnée valide");
//			else
//				System.out.println(x1 + " n'est pas une coordonnée valide");
//		} while (i >= tableauCoordonnees.length);
//			
//			do {
//				System.out.println("Voulez-vous essayer à nouveau ? (O/N)");
//				reponse = scan.next().charAt(0);
//			}while (reponse != 'N' && reponse != 'O');
//		} while (reponse == 'O');
//				
//			}
		
			
//		
//		System.out.println("Veuillez entrer la colonne de la premiere case de votre domino");
//		int y1 = scan.nextInt();
//		
//		try {
//			if (y1 >= 0 && y1 <= 5) {
//		}
//			
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		} 
//		// suite a cela, on aura (x1, y1)
//		
//		
//		System.out.println("Veuillez entrer la ligne de la deuxième case de votre domino");
//		int x2 = scan.nextInt();
//		try {
//			if (x2 >= 0 && x2 <= 5) {
//		}
//			
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		} 
//		
//		System.out.println("Veuillez entrer la colonne de la deuxième case de votre domino");
//		int y2 = scan.nextInt();
//		try {
//			if (y2 >= 0 && y2 <= 5) {
//		}
//			
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		} 
		// suite a cela, on aura (x2,y2)
		
		
		/*
		 * Vérifier si ce qui a été rentré correspond bien à des coordonnées
		 * Et qu'elles soient bien entre 0 et 4 (Tableau de 5*5)
		 */
				
		
		/*
		 * Vérifier si ce qui a été rentrer correspond bien à des coordonnées
		 * Et qu'elles soient bien entre 0 et 8 ou 1 et 9 ???
		 */
//	}
	
	/*
	 * Vérifie si c'est bien un domino selon les coordonnées des case 1 et case 2 entrées par le joueur
	 */
	
//	public static void unicite_domino() {
//		if (i_1 == i_2) { //cases choisies sont sur la meme ligne
//			if (j_2 == j_1 + 1 || j_2 == j_1 - 1) {
//				
//				// condition vérifiée --> domino horizontal				
//			}
//		}
//		else if (j_1 == j_2) { //cases choisies sont sur la meme colonne
//			if (i_2 == i_1 + 1 || i_2 == i_1 -1) {
//				
//				// condition vérifiée --> domino vertical
//			}
//			
//		}
//	}

	public static void main(String[] args) {
		PlacementDominoJoueur.coordonnees_domino ();

	}
	
}


	
