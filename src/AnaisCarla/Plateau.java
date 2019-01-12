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

	/*
	 * La fonction constructionPlateau permet de creer un plateau 2D de 5*5
	 */
	public void constructionPlateau() {
		plateau = new String[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				plateau[i][j] = "0"; //chaque case du plateau va être initialisee à 0 pour commencer la partie
			}
		}
		/*
		 * La case de coordonnees (0,0) est forcee a etre egale à C pour Chateau car au debut de la partie
		 * chaque joueur positionne son plateau en haut à gauche
		 */
		plateau[0][0] = "C"; 
	}
	
	
	/*
	 * La fonction afficherPlateau permet d afficher le plateau en console
	 */
	public void afficherPlateau() {
		for (int i = 0; i < plateau.length; i++) {
			for (int j = 0; j < plateau.length; j++) {
				System.out.print(plateau[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	/*
	 * La fonction placerDomino permet au joueur de placer le domino qu il a pioche sur son plateau
	 */
	public void placerDomino(Domino domino, int typeTour) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		 * Le domino est decoupe en deux faces : face1 et face2
		 */
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
			if ((x2 < 0) || (x2 > 4) || (y2 < 0) || (y2 > 4)) { // on verifie que la deuxieme face soit bien dans les limites du plateau
				System.out.println("Une ou les coordonnées entrées ne sont pas valides, recommencez.");
				cond2 = false;
			} else {
				boolean cond3;
				do {
					if (Math.abs(x1 - x2) + Math.abs(y1 - y2) == 1) { // on verifie que les deux faces sont bien adjacentes et non superposees
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
}
